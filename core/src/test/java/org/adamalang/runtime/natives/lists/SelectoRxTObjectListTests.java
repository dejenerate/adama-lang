/* The Adama Programming Language For Board Games!
 *    See http://www.adama-lang.org/ for more information.
 * (c) copyright 2020 Jeffrey M. Barber (http://jeffrey.io) */
package org.adamalang.runtime.natives.lists;

import java.util.Random;
import org.adamalang.runtime.contracts.IndexQuerySet;
import org.adamalang.runtime.contracts.WhereClause;
import org.adamalang.runtime.json.JsonStreamReader;
import org.adamalang.runtime.json.JsonStreamWriter;
import org.adamalang.runtime.mocks.MockLivingDocument;
import org.adamalang.runtime.mocks.MockRecord;
import org.adamalang.runtime.natives.NtList;
import org.adamalang.runtime.ops.SilentDocumentMonitor;
import org.adamalang.runtime.reactives.RxLazy;
import org.adamalang.runtime.reactives.RxTable;
import org.junit.Assert;
import org.junit.Test;

public class SelectoRxTObjectListTests {
  @Test
  public void flow() {
    final var document = new MockLivingDocument();
    new RxTable<>(document, document, "me", MockRecord::new, 0);
  }

  @Test
  public void table_iterate_basics() {
    final var document = new MockLivingDocument();
    final var table = new RxTable<>(document, document, "name", MockRecord::new, 1);
    table.__insert(new JsonStreamReader("{\"auto_key\":7,\"rows\":{\"4\":{\"index\":13},\"5\":{\"index\":13},\"6\":{\"index\":13}}}"));
    table.iterate(true).toArray(n -> new MockRecord[n]);
    var count = 0;
    for (final MockRecord mr : table.iterate(true)) {
      count++;
    }
    Assert.assertEquals(3, count);
  }

  @Test
  public void table_iterate_delete() {
    final var document = new MockLivingDocument();
    final var table = new RxTable<>(document, document, "name", MockRecord::new, 1);
    table.__insert(new JsonStreamReader("{\"auto_key\":7,\"rows\":{\"4\":{\"index\":13},\"5\":{\"index\":13},\"6\":{\"index\":13}}}"));
    table.iterate(true).__delete();
    final var writer = new JsonStreamWriter();
    final var reverse = new JsonStreamWriter();
    table.__commit("t", writer, reverse);
    Assert.assertEquals("\"t\":{\"auto_key\":7,\"rows\":{\"4\":null,\"5\":null,\"6\":null}}", writer.toString());
    Assert.assertEquals("\"t\":{\"auto_key\":7,\"rows\":{\"4\":{\"data\":\"\",\"index\":13},\"5\":{\"data\":\"\",\"index\":13},\"6\":{\"data\":\"\",\"index\":13}}}", reverse.toString());
  }

  @Test
  public void table_iterate_limit() {
    final var document = new MockLivingDocument();
    final var table = new RxTable<>(document, document, "name", MockRecord::new, 1);
    table.__insert(new JsonStreamReader("{\"auto_key\":7,\"rows\":{\"4\":{\"index\":13},\"5\":{\"index\":12},\"6\":{\"index\":13}}}"));
    new Random(0);
    final var list = table.iterate(false).skipAndLimit(true, 0, 1);
    Assert.assertEquals(4, list.lookup(0).get().__id());
  }

  @Test
  public void table_iterate_lookup() {
    final var document = new MockLivingDocument();
    final var table = new RxTable<>(document, document, "name", MockRecord::new, 1);
    table.__insert(new JsonStreamReader("{\"auto_key\":8,\"rows\":{\"4\":{\"index\":13},\"5\":{\"index\":12},\"6\":{\"index\":13},\"7\":{\"index\":5}}}}"));
    table.getById(7).__delete();
    Assert.assertEquals(4, table.iterate(true).get().lookup(0).get().__id());
  }

  @Test
  public void table_iterate_map() {
    final var document = new MockLivingDocument();
    final var table = new RxTable<>(document, document, "name", MockRecord::new, 1);
    table.__insert(new JsonStreamReader("{\"auto_key\":7,\"rows\":{\"4\":{\"index\":13},\"5\":{\"index\":13},\"6\":{\"index\":13}}}"));
    table.iterate(true).map(mr -> mr.data.set("cake"));
    final var writer = new JsonStreamWriter();
    final var reverse = new JsonStreamWriter();
    table.__commit("t", writer, reverse);
    Assert.assertEquals("\"t\":{\"auto_key\":7,\"rows\":{\"4\":{\"data\":\"cake\"},\"5\":{\"data\":\"cake\"},\"6\":{\"data\":\"cake\"}}}", writer.toString());
    Assert.assertEquals("\"t\":{\"auto_key\":7,\"rows\":{\"4\":{\"data\":\"\"},\"5\":{\"data\":\"\"},\"6\":{\"data\":\"\"}}}", reverse.toString());
  }

  @Test
  public void table_iterate_reduce() {
    final var document = new MockLivingDocument();
    final var table = new RxTable<>(document, document, "name", MockRecord::new, 1);
    table.__insert(new JsonStreamReader("{\"auto_key\":7,\"rows\":{\"4\":{\"index\":13},\"5\":{\"index\":13},\"6\":{\"index\":13}}}"));
    final var map = table.iterate(false).reduce(mr -> mr.index.get(), NtList::size);
    Assert.assertEquals(1, map.size());
    Assert.assertEquals(3, (int) map.lookup(13).get());
  }

  @Test
  public void table_iterate_shuffle() {
    final var document = new MockLivingDocument();
    final var table = new RxTable<>(document, document, "name", MockRecord::new, 1);
    table.__insert(new JsonStreamReader("{\"auto_key\":7,\"rows\":{\"4\":{\"index\":13},\"5\":{\"index\":12},\"6\":{\"index\":13}}}"));
    final var rng = new Random(0);
    final var list = table.iterate(false).shuffle(true, rng);
    Assert.assertEquals(5, list.lookup(0).get().__id());
    Assert.assertEquals(6, list.lookup(1).get().__id());
    Assert.assertEquals(4, list.lookup(2).get().__id());
  }

  @Test
  public void table_iterate_shuffle_then_order() {
    final var document = new MockLivingDocument();
    final var table = new RxTable<>(document, document, "name", MockRecord::new, 1);
    table.__insert(new JsonStreamReader("{\"auto_key\":7,\"rows\":{\"4\":{\"index\":13},\"5\":{\"index\":12},\"6\":{\"index\":13}}}"));
    final var list = table.iterate(false).orderBy(true, (a, b) -> -Integer.compare(a.id, b.id));
    Assert.assertEquals(6, list.lookup(0).get().__id());
    Assert.assertEquals(5, list.lookup(1).get().__id());
    Assert.assertEquals(4, list.lookup(2).get().__id());
  }

  @Test
  public void table_iterate_size() {
    final var document = new MockLivingDocument();
    final var table = new RxTable<>(document, document, "name", MockRecord::new, 1);
    table.__insert(new JsonStreamReader("{\"auto_key\":7,\"rows\":{\"4\":{\"index\":13},\"5\":{\"index\":13},\"6\":{\"index\":13}}}"));
    Assert.assertEquals(3, table.iterate(false).size());
  }

  @Test
  public void table_iterate_transform() {
    final var document = new MockLivingDocument();
    final var table = new RxTable<>(document, document, "name", MockRecord::new, 1);
    table.__insert(new JsonStreamReader("{\"auto_key\":7,\"rows\":{\"4\":{\"index\":13},\"5\":{\"index\":13},\"6\":{\"index\":13}}}"));
    table.iterate(true).transform(mr -> mr.index.bumpUpPost());
    final var writer = new JsonStreamWriter();
    final var reverse = new JsonStreamWriter();
    table.__commit("t", writer, reverse);
    Assert.assertEquals("\"t\":{\"auto_key\":7,\"rows\":{\"4\":{\"index\":14},\"5\":{\"index\":14},\"6\":{\"index\":14}}}", writer.toString());
    Assert.assertEquals("\"t\":{\"auto_key\":7,\"rows\":{\"4\":{\"index\":13},\"5\":{\"index\":13},\"6\":{\"index\":13}}}", reverse.toString());
  }

  @Test
  public void table_iterate_where_brute_force() {
    final var document = new MockLivingDocument();
    final var table = new RxTable<>(document, document, "name", MockRecord::new, 1);
    table.__insert(new JsonStreamReader("{\"auto_key\":8,\"rows\":{\"4\":{\"index\":13},\"5\":{\"index\":12},\"6\":{\"index\":13},\"7\":{\"index\":5}}}}"));
    table.getById(7).__delete();
    final WhereClause<MockRecord> where = new WhereClause<>() {
      @Override
      public int[] getIndices() {
        throw new UnsupportedOperationException();
      }

      @Override
      public Integer getPrimaryKey() {
        return null;
      }

      @Override
      public void scopeByIndicies(final IndexQuerySet __set) {
      }

      @Override
      public boolean test(final MockRecord item) {
        return item.__id() == 5;
      }
    };
    Assert.assertEquals(5, table.iterate(true).get().where(true, where).lookup(0).get().__id());
  }

  @Test
  public void table_iterate_where_pkey_lookup() {
    final var document = new MockLivingDocument();
    final var table = new RxTable<>(document, document, "name", MockRecord::new, 1);
    table.__insert(new JsonStreamReader("{\"auto_key\":7,\"rows\":{\"4\":{\"index\":13},\"5\":{\"index\":12},\"6\":{\"index\":13}}}"));
    final WhereClause<MockRecord> where = new WhereClause<>() {
      @Override
      public int[] getIndices() {
        throw new UnsupportedOperationException();
      }

      @Override
      public Integer getPrimaryKey() {
        return 5;
      }

      @Override
      public void scopeByIndicies(final IndexQuerySet __set) {
        throw new UnsupportedOperationException();
      }

      @Override
      public boolean test(final MockRecord item) {
        return true;
      }
    };
    Assert.assertEquals(5, table.iterate(true).get().where(true, where).lookup(0).get().__id());
  }

  @Test
  public void table_iterate_where_pkey_lookup_dead() {
    final var document = new MockLivingDocument();
    new RxLazy<>(null, () -> 42);
    final var table = new RxTable<>(document, document, "name", MockRecord::new, 1);
    table.__insert(new JsonStreamReader("{\"auto_key\":7,\"rows\":{\"4\":{\"index\":13},\"5\":{\"index\":12},\"6\":{\"index\":13}}}"));
    table.getById(5).__delete();
    final WhereClause<MockRecord> where = new WhereClause<>() {
      @Override
      public int[] getIndices() {
        throw new UnsupportedOperationException();
      }

      @Override
      public Integer getPrimaryKey() {
        return 5;
      }

      @Override
      public void scopeByIndicies(final IndexQuerySet __set) {
        throw new UnsupportedOperationException();
      }

      @Override
      public boolean test(final MockRecord item) {
        return true;
      }
    };
    final var list = table.iterate(false).get().where(true, where);
    Assert.assertEquals(0, list.size());
    Assert.assertEquals(false, list.lookup(0).has());
  }

  @Test
  public void table_where_effectiveness() {
    final var document = new MockLivingDocument(new SilentDocumentMonitor() {
      @Override
      public boolean shouldMeasureTableColumnIndexEffectiveness() {
        return true;
      }
    });
    final var table = new RxTable<>(document, document, "name", MockRecord::new, 1);
    table.__insert(new JsonStreamReader("{\"auto_key\":8,\"rows\":{\"4\":{\"index\":13},\"5\":{\"index\":2},\"6\":{\"index\":5},\"7\":{\"index\":5}}}}"));
    table.getById(7).__delete();
    final var list = table.iterate(false).where(false, new WhereClause<MockRecord>() {
      @Override
      public int[] getIndices() {
        return new int[] { 0, 13 };
      }

      @Override
      public Integer getPrimaryKey() {
        return null;
      }

      @Override
      public void scopeByIndicies(final IndexQuerySet __set) {
      }

      @Override
      public boolean test(final MockRecord item) {
        return item.index.get() == 13;
      }
    });
    Assert.assertEquals(1, list.size());
  }
}
