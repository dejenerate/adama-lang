/* The Adama Programming Language For Board Games!
 *    See http://www.adama-lang.org/ for more information.
 * (c) copyright 2020 Jeffrey M. Barber (http://jeffrey.io) */
package org.adamalang.translator;

import org.junit.Test;

public class GeneratedParserTests extends GeneratedBase {
  private String cached_Assignments_1 = null;
  private String get_Assignments_1() {
    if (cached_Assignments_1 != null) {
      return cached_Assignments_1;
    }
    cached_Assignments_1 = generateTestOutput(true, "Assignments_1", "./test_code/Parser_Assignments_success.a");
    return cached_Assignments_1;
  }

  @Test
  public void testAssignmentsEmission() {
    assertEmissionGood(get_Assignments_1());
  }

  @Test
  public void testAssignmentsSuccess() {
    assertLivePass(get_Assignments_1());
  }

  @Test
  public void testAssignmentsGoodWillHappy() {
    assertGoodWillHappy(get_Assignments_1());
  }

  @Test
  public void testAssignmentsExceptionFree() {
    assertExceptionFree(get_Assignments_1());
  }

  @Test
  public void testAssignmentsTODOFree() {
    assertTODOFree(get_Assignments_1());
  }

  @Test
  public void stable_Assignments_1() {
    String live = get_Assignments_1();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_Assignments_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class Assignments_1 extends LivingDocument {");
    gold.append("\n  public Assignments_1(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaAssignments_1 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaAssignments_1() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(Assignments_1 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    Assignments_1 __self = this;");
    gold.append("\n    DeltaAssignments_1 __state = new DeltaAssignments_1();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 10;");
    gold.append("\n    __track(0);");
    gold.append("\n    int x = 1;");
    gold.append("\n    __track(1);");
    gold.append("\n    x += 2;");
    gold.append("\n    __track(2);");
    gold.append("\n    int z = 0;");
    gold.append("\n    __track(3);");
    gold.append("\n    z = 4;");
    gold.append("\n    __track(4);");
    gold.append("\n    z *= 7;");
    gold.append("\n    __track(5);");
    gold.append("\n    z++;");
    gold.append("\n    __track(6);");
    gold.append("\n    z--;");
    gold.append("\n    __track(7);");
    gold.append("\n    ++z;");
    gold.append("\n    __track(8);");
    gold.append("\n    --z;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":10,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":10,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_AtomicsBadArrayEOS1_2 = null;
  private String get_AtomicsBadArrayEOS1_2() {
    if (cached_AtomicsBadArrayEOS1_2 != null) {
      return cached_AtomicsBadArrayEOS1_2;
    }
    cached_AtomicsBadArrayEOS1_2 = generateTestOutput(false, "AtomicsBadArrayEOS1_2", "./test_code/Parser_AtomicsBadArrayEOS1_failure.a");
    return cached_AtomicsBadArrayEOS1_2;
  }

  @Test
  public void testAtomicsBadArrayEOS1Failure() {
    assertLiveFail(get_AtomicsBadArrayEOS1_2());
  }

  @Test
  public void testAtomicsBadArrayEOS1NotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_AtomicsBadArrayEOS1_2());
  }

  @Test
  public void testAtomicsBadArrayEOS1ExceptionFree() {
    assertExceptionFree(get_AtomicsBadArrayEOS1_2());
  }

  @Test
  public void testAtomicsBadArrayEOS1TODOFree() {
    assertTODOFree(get_AtomicsBadArrayEOS1_2());
  }

  @Test
  public void stable_AtomicsBadArrayEOS1_2() {
    String live = get_AtomicsBadArrayEOS1_2();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_AtomicsBadArrayEOS1_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 10");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_AtomicsBadArrayEOS1_failure.a' failed to parse: Parser expected a `]`, but instead got end of stream. {Token: `[` @ (2,10) -> (2,11): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser expected a `]`, but instead got end of stream. {Token: `[` @ (2,10) -> (2,11): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_AtomicsBadArrayEOS2_3 = null;
  private String get_AtomicsBadArrayEOS2_3() {
    if (cached_AtomicsBadArrayEOS2_3 != null) {
      return cached_AtomicsBadArrayEOS2_3;
    }
    cached_AtomicsBadArrayEOS2_3 = generateTestOutput(false, "AtomicsBadArrayEOS2_3", "./test_code/Parser_AtomicsBadArrayEOS2_failure.a");
    return cached_AtomicsBadArrayEOS2_3;
  }

  @Test
  public void testAtomicsBadArrayEOS2Failure() {
    assertLiveFail(get_AtomicsBadArrayEOS2_3());
  }

  @Test
  public void testAtomicsBadArrayEOS2NotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_AtomicsBadArrayEOS2_3());
  }

  @Test
  public void testAtomicsBadArrayEOS2ExceptionFree() {
    assertExceptionFree(get_AtomicsBadArrayEOS2_3());
  }

  @Test
  public void testAtomicsBadArrayEOS2TODOFree() {
    assertTODOFree(get_AtomicsBadArrayEOS2_3());
  }

  @Test
  public void stable_AtomicsBadArrayEOS2_3() {
    String live = get_AtomicsBadArrayEOS2_3();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_AtomicsBadArrayEOS2_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 10");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_AtomicsBadArrayEOS2_failure.a' failed to parse: Parser expected a `]`, but instead got end of stream. {Token: `[` @ (2,10) -> (2,11): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser expected a `]`, but instead got end of stream. {Token: `[` @ (2,10) -> (2,11): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_AtomicsBadDouble_4 = null;
  private String get_AtomicsBadDouble_4() {
    if (cached_AtomicsBadDouble_4 != null) {
      return cached_AtomicsBadDouble_4;
    }
    cached_AtomicsBadDouble_4 = generateTestOutput(false, "AtomicsBadDouble_4", "./test_code/Parser_AtomicsBadDouble_failure.a");
    return cached_AtomicsBadDouble_4;
  }

  @Test
  public void testAtomicsBadDoubleFailure() {
    assertLiveFail(get_AtomicsBadDouble_4());
  }

  @Test
  public void testAtomicsBadDoubleNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_AtomicsBadDouble_4());
  }

  @Test
  public void testAtomicsBadDoubleExceptionFree() {
    assertExceptionFree(get_AtomicsBadDouble_4());
  }

  @Test
  public void testAtomicsBadDoubleTODOFree() {
    assertTODOFree(get_AtomicsBadDouble_4());
  }

  @Test
  public void stable_AtomicsBadDouble_4() {
    String live = get_AtomicsBadDouble_4();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_AtomicsBadDouble_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 10");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 17");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_AtomicsBadDouble_failure.a' failed to parse: Parser was unable to parse `1.2.3e1` as a double. {Token: `1.2.3e1` @ (2,10) -> (2,17): NumberLiteral:NumberIsDouble} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was unable to parse `1.2.3e1` as a double. {Token: `1.2.3e1` @ (2,10) -> (2,17): NumberLiteral:NumberIsDouble} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_AtomicsBadEnumSymbol_5 = null;
  private String get_AtomicsBadEnumSymbol_5() {
    if (cached_AtomicsBadEnumSymbol_5 != null) {
      return cached_AtomicsBadEnumSymbol_5;
    }
    cached_AtomicsBadEnumSymbol_5 = generateTestOutput(false, "AtomicsBadEnumSymbol_5", "./test_code/Parser_AtomicsBadEnumSymbol_failure.a");
    return cached_AtomicsBadEnumSymbol_5;
  }

  @Test
  public void testAtomicsBadEnumSymbolFailure() {
    assertLiveFail(get_AtomicsBadEnumSymbol_5());
  }

  @Test
  public void testAtomicsBadEnumSymbolNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_AtomicsBadEnumSymbol_5());
  }

  @Test
  public void testAtomicsBadEnumSymbolExceptionFree() {
    assertExceptionFree(get_AtomicsBadEnumSymbol_5());
  }

  @Test
  public void testAtomicsBadEnumSymbolTODOFree() {
    assertTODOFree(get_AtomicsBadEnumSymbol_5());
  }

  @Test
  public void stable_AtomicsBadEnumSymbol_5() {
    String live = get_AtomicsBadEnumSymbol_5();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_AtomicsBadEnumSymbol_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 13");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_AtomicsBadEnumSymbol_failure.a' failed to parse: Parser was expecting either an identifier or an `*` after `::`, but got `+` instead. {Token: `::` @ (3,11) -> (3,13): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting either an identifier or an `*` after `::`, but got `+` instead. {Token: `::` @ (3,11) -> (3,13): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_AtomicsBadEnumValueEOS_6 = null;
  private String get_AtomicsBadEnumValueEOS_6() {
    if (cached_AtomicsBadEnumValueEOS_6 != null) {
      return cached_AtomicsBadEnumValueEOS_6;
    }
    cached_AtomicsBadEnumValueEOS_6 = generateTestOutput(false, "AtomicsBadEnumValueEOS_6", "./test_code/Parser_AtomicsBadEnumValueEOS_failure.a");
    return cached_AtomicsBadEnumValueEOS_6;
  }

  @Test
  public void testAtomicsBadEnumValueEOSFailure() {
    assertLiveFail(get_AtomicsBadEnumValueEOS_6());
  }

  @Test
  public void testAtomicsBadEnumValueEOSNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_AtomicsBadEnumValueEOS_6());
  }

  @Test
  public void testAtomicsBadEnumValueEOSExceptionFree() {
    assertExceptionFree(get_AtomicsBadEnumValueEOS_6());
  }

  @Test
  public void testAtomicsBadEnumValueEOSTODOFree() {
    assertTODOFree(get_AtomicsBadEnumValueEOS_6());
  }

  @Test
  public void stable_AtomicsBadEnumValueEOS_6() {
    String live = get_AtomicsBadEnumValueEOS_6();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_AtomicsBadEnumValueEOS_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 13");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_AtomicsBadEnumValueEOS_failure.a' failed to parse: Parser was expecting either an identifier or an `*` after `::`, but got end of stream instead. {Token: `::` @ (3,11) -> (3,13): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting either an identifier or an `*` after `::`, but got end of stream instead. {Token: `::` @ (3,11) -> (3,13): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_AtomicsBadHex_7 = null;
  private String get_AtomicsBadHex_7() {
    if (cached_AtomicsBadHex_7 != null) {
      return cached_AtomicsBadHex_7;
    }
    cached_AtomicsBadHex_7 = generateTestOutput(false, "AtomicsBadHex_7", "./test_code/Parser_AtomicsBadHex_failure.a");
    return cached_AtomicsBadHex_7;
  }

  @Test
  public void testAtomicsBadHexFailure() {
    assertLiveFail(get_AtomicsBadHex_7());
  }

  @Test
  public void testAtomicsBadHexNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_AtomicsBadHex_7());
  }

  @Test
  public void testAtomicsBadHexExceptionFree() {
    assertExceptionFree(get_AtomicsBadHex_7());
  }

  @Test
  public void testAtomicsBadHexTODOFree() {
    assertTODOFree(get_AtomicsBadHex_7());
  }

  @Test
  public void stable_AtomicsBadHex_7() {
    String live = get_AtomicsBadHex_7();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_AtomicsBadHex_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 10");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 18");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_AtomicsBadHex_failure.a' failed to parse: Parser was expecting a valid numeric sequence, but got a '0x123x12' instead. {Token: `0x123x12` @ (2,10) -> (2,18): NumberLiteral:NumberIsInteger} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting a valid numeric sequence, but got a '0x123x12' instead. {Token: `0x123x12` @ (2,10) -> (2,18): NumberLiteral:NumberIsInteger} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_AtomicsBadObjectEOS1_8 = null;
  private String get_AtomicsBadObjectEOS1_8() {
    if (cached_AtomicsBadObjectEOS1_8 != null) {
      return cached_AtomicsBadObjectEOS1_8;
    }
    cached_AtomicsBadObjectEOS1_8 = generateTestOutput(false, "AtomicsBadObjectEOS1_8", "./test_code/Parser_AtomicsBadObjectEOS1_failure.a");
    return cached_AtomicsBadObjectEOS1_8;
  }

  @Test
  public void testAtomicsBadObjectEOS1Failure() {
    assertLiveFail(get_AtomicsBadObjectEOS1_8());
  }

  @Test
  public void testAtomicsBadObjectEOS1NotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_AtomicsBadObjectEOS1_8());
  }

  @Test
  public void testAtomicsBadObjectEOS1ExceptionFree() {
    assertExceptionFree(get_AtomicsBadObjectEOS1_8());
  }

  @Test
  public void testAtomicsBadObjectEOS1TODOFree() {
    assertTODOFree(get_AtomicsBadObjectEOS1_8());
  }

  @Test
  public void stable_AtomicsBadObjectEOS1_8() {
    String live = get_AtomicsBadObjectEOS1_8();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_AtomicsBadObjectEOS1_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 10");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_AtomicsBadObjectEOS1_failure.a' failed to parse: Parser expected a `}`, but instead got end of stream. {Token: `{` @ (2,10) -> (2,11): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser expected a `}`, but instead got end of stream. {Token: `{` @ (2,10) -> (2,11): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_AtomicsBadObjectEOS2_9 = null;
  private String get_AtomicsBadObjectEOS2_9() {
    if (cached_AtomicsBadObjectEOS2_9 != null) {
      return cached_AtomicsBadObjectEOS2_9;
    }
    cached_AtomicsBadObjectEOS2_9 = generateTestOutput(false, "AtomicsBadObjectEOS2_9", "./test_code/Parser_AtomicsBadObjectEOS2_failure.a");
    return cached_AtomicsBadObjectEOS2_9;
  }

  @Test
  public void testAtomicsBadObjectEOS2Failure() {
    assertLiveFail(get_AtomicsBadObjectEOS2_9());
  }

  @Test
  public void testAtomicsBadObjectEOS2NotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_AtomicsBadObjectEOS2_9());
  }

  @Test
  public void testAtomicsBadObjectEOS2ExceptionFree() {
    assertExceptionFree(get_AtomicsBadObjectEOS2_9());
  }

  @Test
  public void testAtomicsBadObjectEOS2TODOFree() {
    assertTODOFree(get_AtomicsBadObjectEOS2_9());
  }

  @Test
  public void stable_AtomicsBadObjectEOS2_9() {
    String live = get_AtomicsBadObjectEOS2_9();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_AtomicsBadObjectEOS2_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 13");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 16");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_AtomicsBadObjectEOS2_failure.a' failed to parse: Parser expected a `}` or `,`, but instead got end of stream. {Token: `123` @ (2,13) -> (2,16): NumberLiteral:NumberIsInteger} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser expected a `}` or `,`, but instead got end of stream. {Token: `123` @ (2,13) -> (2,16): NumberLiteral:NumberIsInteger} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_AtomicsBadParenthesisEOS_10 = null;
  private String get_AtomicsBadParenthesisEOS_10() {
    if (cached_AtomicsBadParenthesisEOS_10 != null) {
      return cached_AtomicsBadParenthesisEOS_10;
    }
    cached_AtomicsBadParenthesisEOS_10 = generateTestOutput(false, "AtomicsBadParenthesisEOS_10", "./test_code/Parser_AtomicsBadParenthesisEOS_failure.a");
    return cached_AtomicsBadParenthesisEOS_10;
  }

  @Test
  public void testAtomicsBadParenthesisEOSFailure() {
    assertLiveFail(get_AtomicsBadParenthesisEOS_10());
  }

  @Test
  public void testAtomicsBadParenthesisEOSNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_AtomicsBadParenthesisEOS_10());
  }

  @Test
  public void testAtomicsBadParenthesisEOSExceptionFree() {
    assertExceptionFree(get_AtomicsBadParenthesisEOS_10());
  }

  @Test
  public void testAtomicsBadParenthesisEOSTODOFree() {
    assertTODOFree(get_AtomicsBadParenthesisEOS_10());
  }

  @Test
  public void stable_AtomicsBadParenthesisEOS_10() {
    String live = get_AtomicsBadParenthesisEOS_10();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_AtomicsBadParenthesisEOS_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 10");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_AtomicsBadParenthesisEOS_failure.a' failed to parse: Parser was expecting an atomic expression, but got end of stream instead. {Token: `(` @ (2,10) -> (2,11): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting an atomic expression, but got end of stream instead. {Token: `(` @ (2,10) -> (2,11): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_AtomicsBadParenthesisUnmatched_11 = null;
  private String get_AtomicsBadParenthesisUnmatched_11() {
    if (cached_AtomicsBadParenthesisUnmatched_11 != null) {
      return cached_AtomicsBadParenthesisUnmatched_11;
    }
    cached_AtomicsBadParenthesisUnmatched_11 = generateTestOutput(false, "AtomicsBadParenthesisUnmatched_11", "./test_code/Parser_AtomicsBadParenthesisUnmatched_failure.a");
    return cached_AtomicsBadParenthesisUnmatched_11;
  }

  @Test
  public void testAtomicsBadParenthesisUnmatchedFailure() {
    assertLiveFail(get_AtomicsBadParenthesisUnmatched_11());
  }

  @Test
  public void testAtomicsBadParenthesisUnmatchedNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_AtomicsBadParenthesisUnmatched_11());
  }

  @Test
  public void testAtomicsBadParenthesisUnmatchedExceptionFree() {
    assertExceptionFree(get_AtomicsBadParenthesisUnmatched_11());
  }

  @Test
  public void testAtomicsBadParenthesisUnmatchedTODOFree() {
    assertTODOFree(get_AtomicsBadParenthesisUnmatched_11());
  }

  @Test
  public void stable_AtomicsBadParenthesisUnmatched_11() {
    String live = get_AtomicsBadParenthesisUnmatched_11();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_AtomicsBadParenthesisUnmatched_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 14");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 15");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_AtomicsBadParenthesisUnmatched_failure.a' failed to parse: Parser expected a ), but instead got an `]` {Token: `]` @ (2,14) -> (2,15): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser expected a ), but instead got an `]` {Token: `]` @ (2,14) -> (2,15): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_AtomicsBadThing_12 = null;
  private String get_AtomicsBadThing_12() {
    if (cached_AtomicsBadThing_12 != null) {
      return cached_AtomicsBadThing_12;
    }
    cached_AtomicsBadThing_12 = generateTestOutput(false, "AtomicsBadThing_12", "./test_code/Parser_AtomicsBadThing_failure.a");
    return cached_AtomicsBadThing_12;
  }

  @Test
  public void testAtomicsBadThingFailure() {
    assertLiveFail(get_AtomicsBadThing_12());
  }

  @Test
  public void testAtomicsBadThingNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_AtomicsBadThing_12());
  }

  @Test
  public void testAtomicsBadThingExceptionFree() {
    assertExceptionFree(get_AtomicsBadThing_12());
  }

  @Test
  public void testAtomicsBadThingTODOFree() {
    assertTODOFree(get_AtomicsBadThing_12());
  }

  @Test
  public void stable_AtomicsBadThing_12() {
    String live = get_AtomicsBadThing_12();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_AtomicsBadThing_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 16");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 17");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_AtomicsBadThing_failure.a' failed to parse: Parser expected an atomic, but instead got `)` {Token: `)` @ (2,16) -> (2,17): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser expected an atomic, but instead got `)` {Token: `)` @ (2,16) -> (2,17): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_AtomicsEmptyArray_13 = null;
  private String get_AtomicsEmptyArray_13() {
    if (cached_AtomicsEmptyArray_13 != null) {
      return cached_AtomicsEmptyArray_13;
    }
    cached_AtomicsEmptyArray_13 = generateTestOutput(true, "AtomicsEmptyArray_13", "./test_code/Parser_AtomicsEmptyArray_success.a");
    return cached_AtomicsEmptyArray_13;
  }

  @Test
  public void testAtomicsEmptyArrayEmission() {
    assertEmissionGood(get_AtomicsEmptyArray_13());
  }

  @Test
  public void testAtomicsEmptyArraySuccess() {
    assertLivePass(get_AtomicsEmptyArray_13());
  }

  @Test
  public void testAtomicsEmptyArrayGoodWillHappy() {
    assertGoodWillHappy(get_AtomicsEmptyArray_13());
  }

  @Test
  public void testAtomicsEmptyArrayExceptionFree() {
    assertExceptionFree(get_AtomicsEmptyArray_13());
  }

  @Test
  public void testAtomicsEmptyArrayTODOFree() {
    assertTODOFree(get_AtomicsEmptyArray_13());
  }

  @Test
  public void stable_AtomicsEmptyArray_13() {
    String live = get_AtomicsEmptyArray_13();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_AtomicsEmptyArray_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class AtomicsEmptyArray_13 extends LivingDocument {");
    gold.append("\n  public AtomicsEmptyArray_13(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaAtomicsEmptyArray_13 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaAtomicsEmptyArray_13() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(AtomicsEmptyArray_13 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    AtomicsEmptyArray_13 __self = this;");
    gold.append("\n    DeltaAtomicsEmptyArray_13 __state = new DeltaAtomicsEmptyArray_13();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static class RTxFoo implements NtMessageBase {");
    gold.append("\n    private int x = 0;");
    gold.append("\n    private RTxFoo(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              this.x = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      __writer.writeInteger(x);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxFoo() {}");
    gold.append("\n    private RTxFoo(int x) {");
    gold.append("\n      this.x = x;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxFoo {");
    gold.append("\n    private DInt32 __dx;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxFoo() {");
    gold.append("\n      __dx = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxFoo __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __dx.show(__item.x, __obj.planField(\"x\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    RTxFoo[] arr = new RTxFoo[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":2,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":2,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_Atomics_14 = null;
  private String get_Atomics_14() {
    if (cached_Atomics_14 != null) {
      return cached_Atomics_14;
    }
    cached_Atomics_14 = generateTestOutput(true, "Atomics_14", "./test_code/Parser_Atomics_success.a");
    return cached_Atomics_14;
  }

  @Test
  public void testAtomicsEmission() {
    assertEmissionGood(get_Atomics_14());
  }

  @Test
  public void testAtomicsSuccess() {
    assertLivePass(get_Atomics_14());
  }

  @Test
  public void testAtomicsGoodWillHappy() {
    assertGoodWillHappy(get_Atomics_14());
  }

  @Test
  public void testAtomicsExceptionFree() {
    assertExceptionFree(get_Atomics_14());
  }

  @Test
  public void testAtomicsTODOFree() {
    assertTODOFree(get_Atomics_14());
  }

  @Test
  public void stable_Atomics_14() {
    String live = get_Atomics_14();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_Atomics_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class Atomics_14 extends LivingDocument {");
    gold.append("\n  public Atomics_14(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaAtomics_14 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaAtomics_14() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(Atomics_14 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    Atomics_14 __self = this;");
    gold.append("\n    DeltaAtomics_14 __state = new DeltaAtomics_14();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static final int [] __ALL_VALUES_E = new int[] {42};");
    gold.append("\n  private static class RTx_AnonObjConvert_0 implements NtMessageBase {");
    gold.append("\n    private int x = 0;");
    gold.append("\n    private RTx_AnonObjConvert_0(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              this.x = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      __writer.writeInteger(x);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTx_AnonObjConvert_0() {}");
    gold.append("\n    private RTx_AnonObjConvert_0(int x) {");
    gold.append("\n      this.x = x;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTx_AnonObjConvert_0 {");
    gold.append("\n    private DInt32 __dx;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTx_AnonObjConvert_0() {");
    gold.append("\n      __dx = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTx_AnonObjConvert_0 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __dx.show(__item.x, __obj.planField(\"x\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private static class RTxAutoMaxRecord6 implements NtMessageBase {");
    gold.append("\n    private int x = 0;");
    gold.append("\n    private int y = 0;");
    gold.append("\n    private RTxAutoMaxRecord6(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              this.x = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            case \"y\":");
    gold.append("\n              this.y = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      __writer.writeInteger(x);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"y\");");
    gold.append("\n      __writer.writeInteger(y);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxAutoMaxRecord6() {}");
    gold.append("\n    private RTxAutoMaxRecord6(int x, int y) {");
    gold.append("\n      this.x = x;");
    gold.append("\n      this.y = y;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxAutoMaxRecord6 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxAutoMaxRecord6() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxAutoMaxRecord6 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private static class RTxAutoMaxRecord9 implements NtMessageBase {");
    gold.append("\n    private boolean a0 = false;");
    gold.append("\n    private String a1 = \"\";");
    gold.append("\n    private boolean a2 = false;");
    gold.append("\n    private int x = 0;");
    gold.append("\n    private RTxAutoMaxRecord9(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"a0\":");
    gold.append("\n              this.a0 = __reader.readBoolean();");
    gold.append("\n              break;");
    gold.append("\n            case \"a1\":");
    gold.append("\n              this.a1 = __reader.readString();");
    gold.append("\n              break;");
    gold.append("\n            case \"a2\":");
    gold.append("\n              this.a2 = __reader.readBoolean();");
    gold.append("\n              break;");
    gold.append("\n            case \"x\":");
    gold.append("\n              this.x = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"a0\");");
    gold.append("\n      __writer.writeBoolean(a0);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"a1\");");
    gold.append("\n      __writer.writeFastString(a1);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"a2\");");
    gold.append("\n      __writer.writeBoolean(a2);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      __writer.writeInteger(x);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxAutoMaxRecord9() {}");
    gold.append("\n    private RTxAutoMaxRecord9(boolean a0, String a1, boolean a2, int x) {");
    gold.append("\n      this.a0 = a0;");
    gold.append("\n      this.a1 = a1;");
    gold.append("\n      this.a2 = a2;");
    gold.append("\n      this.x = x;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxAutoMaxRecord9 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxAutoMaxRecord9() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxAutoMaxRecord9 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  private void __step_foo() {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {");
    gold.append("\n    switch(__new_state) {");
    gold.append("\n      case \"foo\":");
    gold.append("\n        __step_foo();");
    gold.append("\n        return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  public void __test_PrimaryTest(TestReportBuilder report) {");
    gold.append("\n    report.begin(\"PrimaryTest\");");
    gold.append("\n    {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(0);");
    gold.append("\n      __assert_truth(true, 31, 2, 31, 14);");
    gold.append("\n    }");
    gold.append("\n    report.end(getAndResetAssertions());");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {\"PrimaryTest\"};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {");
    gold.append("\n    switch(testName) {");
    gold.append("\n      case \"PrimaryTest\":");
    gold.append("\n          __test_PrimaryTest(report);");
    gold.append("\n          return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 21;");
    gold.append("\n    __track(1);");
    gold.append("\n    final boolean a0 = (!__state.has());");
    gold.append("\n    __track(2);");
    gold.append("\n    final String a1 = \"foo\";");
    gold.append("\n    __track(3);");
    gold.append("\n    final boolean a2 = true;");
    gold.append("\n    __track(4);");
    gold.append("\n    final boolean a3 = false;");
    gold.append("\n    __track(5);");
    gold.append("\n    final int a4 = 123;");
    gold.append("\n    __track(6);");
    gold.append("\n    final int a5 = 255;");
    gold.append("\n    __track(7);");
    gold.append("\n    final NtClient a6 = NtClient.NO_ONE;");
    gold.append("\n    __track(8);");
    gold.append("\n    final boolean a7 = __blocked.get();");
    gold.append("\n    __track(9);");
    gold.append("\n    final int a8 = 42;");
    gold.append("\n    __track(10);");
    gold.append("\n    final int[] a9 = __ALL_VALUES_E;");
    gold.append("\n    __track(11);");
    gold.append("\n    final double a10 = 1.23;");
    gold.append("\n    __track(12);");
    gold.append("\n    final double a11 = 1.23E8;");
    gold.append("\n    __track(13);");
    gold.append("\n    final double a12 = 1.23E91;");
    gold.append("\n    __track(14);");
    gold.append("\n    final double a13 = -0.12;");
    gold.append("\n    __track(15);");
    gold.append("\n    final RTx_AnonObjConvert_0 a14 = new RTx_AnonObjConvert_0(42);");
    gold.append("\n    __track(16);");
    gold.append("\n    final RTx_AnonObjConvert_0[] a15 = new RTx_AnonObjConvert_0[] {new RTx_AnonObjConvert_0(1)};");
    gold.append("\n    __track(17);");
    gold.append("\n    final RTxAutoMaxRecord6[] a16 = new RTxAutoMaxRecord6[] {new RTxAutoMaxRecord6(1, 2)};");
    gold.append("\n    __track(18);");
    gold.append("\n    final int a17 = (123);");
    gold.append("\n    __track(19);");
    gold.append("\n    final RTxAutoMaxRecord9[] a18 = new RTxAutoMaxRecord9[] {new RTxAutoMaxRecord9(a0, a1, a2, 1)};");
    gold.append("\n    __track(20);");
    gold.append("\n    final RTx_AnonObjConvert_0[] a19 = new RTx_AnonObjConvert_0[] {new RTx_AnonObjConvert_0(1), new RTx_AnonObjConvert_0(2)};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":21,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":21,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\nTEST[PrimaryTest] = 100.0%");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_BadChannelHandlerEOS1_15 = null;
  private String get_BadChannelHandlerEOS1_15() {
    if (cached_BadChannelHandlerEOS1_15 != null) {
      return cached_BadChannelHandlerEOS1_15;
    }
    cached_BadChannelHandlerEOS1_15 = generateTestOutput(false, "BadChannelHandlerEOS1_15", "./test_code/Parser_BadChannelHandlerEOS1_failure.a");
    return cached_BadChannelHandlerEOS1_15;
  }

  @Test
  public void testBadChannelHandlerEOS1Failure() {
    assertLiveFail(get_BadChannelHandlerEOS1_15());
  }

  @Test
  public void testBadChannelHandlerEOS1NotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_BadChannelHandlerEOS1_15());
  }

  @Test
  public void testBadChannelHandlerEOS1ExceptionFree() {
    assertExceptionFree(get_BadChannelHandlerEOS1_15());
  }

  @Test
  public void testBadChannelHandlerEOS1TODOFree() {
    assertTODOFree(get_BadChannelHandlerEOS1_15());
  }

  @Test
  public void stable_BadChannelHandlerEOS1_15() {
    String live = get_BadChannelHandlerEOS1_15();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_BadChannelHandlerEOS1_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 8");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_BadChannelHandlerEOS1_failure.a' failed to parse: Parser was expecting a Symbol=`(`; instead, the parser got an end of stream. {Token: `foo` @ (3,8) -> (3,11): Identifer} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting a Symbol=`(`; instead, the parser got an end of stream. {Token: `foo` @ (3,8) -> (3,11): Identifer} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_BadChannelHandlerEOS2_16 = null;
  private String get_BadChannelHandlerEOS2_16() {
    if (cached_BadChannelHandlerEOS2_16 != null) {
      return cached_BadChannelHandlerEOS2_16;
    }
    cached_BadChannelHandlerEOS2_16 = generateTestOutput(false, "BadChannelHandlerEOS2_16", "./test_code/Parser_BadChannelHandlerEOS2_failure.a");
    return cached_BadChannelHandlerEOS2_16;
  }

  @Test
  public void testBadChannelHandlerEOS2Failure() {
    assertLiveFail(get_BadChannelHandlerEOS2_16());
  }

  @Test
  public void testBadChannelHandlerEOS2NotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_BadChannelHandlerEOS2_16());
  }

  @Test
  public void testBadChannelHandlerEOS2ExceptionFree() {
    assertExceptionFree(get_BadChannelHandlerEOS2_16());
  }

  @Test
  public void testBadChannelHandlerEOS2TODOFree() {
    assertTODOFree(get_BadChannelHandlerEOS2_16());
  }

  @Test
  public void stable_BadChannelHandlerEOS2_16() {
    String live = get_BadChannelHandlerEOS2_16();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_BadChannelHandlerEOS2_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 19");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 20");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_BadChannelHandlerEOS2_failure.a' failed to parse: Parser was expecting a Symbol=`,`; instead, the parser got an end of stream. {Token: `c` @ (3,19) -> (3,20): Identifer} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting a Symbol=`,`; instead, the parser got an end of stream. {Token: `c` @ (3,19) -> (3,20): Identifer} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_BadChannelHandlerEOS3_17 = null;
  private String get_BadChannelHandlerEOS3_17() {
    if (cached_BadChannelHandlerEOS3_17 != null) {
      return cached_BadChannelHandlerEOS3_17;
    }
    cached_BadChannelHandlerEOS3_17 = generateTestOutput(false, "BadChannelHandlerEOS3_17", "./test_code/Parser_BadChannelHandlerEOS3_failure.a");
    return cached_BadChannelHandlerEOS3_17;
  }

  @Test
  public void testBadChannelHandlerEOS3Failure() {
    assertLiveFail(get_BadChannelHandlerEOS3_17());
  }

  @Test
  public void testBadChannelHandlerEOS3NotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_BadChannelHandlerEOS3_17());
  }

  @Test
  public void testBadChannelHandlerEOS3ExceptionFree() {
    assertExceptionFree(get_BadChannelHandlerEOS3_17());
  }

  @Test
  public void testBadChannelHandlerEOS3TODOFree() {
    assertTODOFree(get_BadChannelHandlerEOS3_17());
  }

  @Test
  public void stable_BadChannelHandlerEOS3_17() {
    String live = get_BadChannelHandlerEOS3_17();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_BadChannelHandlerEOS3_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 24");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 25");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_BadChannelHandlerEOS3_failure.a' failed to parse: Parser was expecting a Symbol=`)`; instead, the parser got an end of stream. {Token: `m` @ (3,24) -> (3,25): Identifer} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting a Symbol=`)`; instead, the parser got an end of stream. {Token: `m` @ (3,24) -> (3,25): Identifer} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_BadChannelHandlerEOS4_18 = null;
  private String get_BadChannelHandlerEOS4_18() {
    if (cached_BadChannelHandlerEOS4_18 != null) {
      return cached_BadChannelHandlerEOS4_18;
    }
    cached_BadChannelHandlerEOS4_18 = generateTestOutput(false, "BadChannelHandlerEOS4_18", "./test_code/Parser_BadChannelHandlerEOS4_failure.a");
    return cached_BadChannelHandlerEOS4_18;
  }

  @Test
  public void testBadChannelHandlerEOS4Failure() {
    assertLiveFail(get_BadChannelHandlerEOS4_18());
  }

  @Test
  public void testBadChannelHandlerEOS4NotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_BadChannelHandlerEOS4_18());
  }

  @Test
  public void testBadChannelHandlerEOS4ExceptionFree() {
    assertExceptionFree(get_BadChannelHandlerEOS4_18());
  }

  @Test
  public void testBadChannelHandlerEOS4TODOFree() {
    assertTODOFree(get_BadChannelHandlerEOS4_18());
  }

  @Test
  public void stable_BadChannelHandlerEOS4_18() {
    String live = get_BadChannelHandlerEOS4_18();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_BadChannelHandlerEOS4_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 14");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 15");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_BadChannelHandlerEOS4_failure.a' failed to parse: Parser was expecting a Symbol=`)`; instead, the parser got an end of stream. {Token: `m` @ (3,14) -> (3,15): Identifer} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting a Symbol=`)`; instead, the parser got an end of stream. {Token: `m` @ (3,14) -> (3,15): Identifer} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_BadChannelHandlerUnexpected1_19 = null;
  private String get_BadChannelHandlerUnexpected1_19() {
    if (cached_BadChannelHandlerUnexpected1_19 != null) {
      return cached_BadChannelHandlerUnexpected1_19;
    }
    cached_BadChannelHandlerUnexpected1_19 = generateTestOutput(false, "BadChannelHandlerUnexpected1_19", "./test_code/Parser_BadChannelHandlerUnexpected1_failure.a");
    return cached_BadChannelHandlerUnexpected1_19;
  }

  @Test
  public void testBadChannelHandlerUnexpected1Failure() {
    assertLiveFail(get_BadChannelHandlerUnexpected1_19());
  }

  @Test
  public void testBadChannelHandlerUnexpected1NotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_BadChannelHandlerUnexpected1_19());
  }

  @Test
  public void testBadChannelHandlerUnexpected1ExceptionFree() {
    assertExceptionFree(get_BadChannelHandlerUnexpected1_19());
  }

  @Test
  public void testBadChannelHandlerUnexpected1TODOFree() {
    assertTODOFree(get_BadChannelHandlerUnexpected1_19());
  }

  @Test
  public void stable_BadChannelHandlerUnexpected1_19() {
    String live = get_BadChannelHandlerUnexpected1_19();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_BadChannelHandlerUnexpected1_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 20");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 21");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_BadChannelHandlerUnexpected1_failure.a' failed to parse: Parser was expecting a Symbol=`,`; instead, the parse got Symbol:+. {Token: `+` @ (3,20) -> (3,21): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting a Symbol=`,`; instead, the parse got Symbol:+. {Token: `+` @ (3,20) -> (3,21): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_BadChannelHandlerUnexpected2_20 = null;
  private String get_BadChannelHandlerUnexpected2_20() {
    if (cached_BadChannelHandlerUnexpected2_20 != null) {
      return cached_BadChannelHandlerUnexpected2_20;
    }
    cached_BadChannelHandlerUnexpected2_20 = generateTestOutput(false, "BadChannelHandlerUnexpected2_20", "./test_code/Parser_BadChannelHandlerUnexpected2_failure.a");
    return cached_BadChannelHandlerUnexpected2_20;
  }

  @Test
  public void testBadChannelHandlerUnexpected2Failure() {
    assertLiveFail(get_BadChannelHandlerUnexpected2_20());
  }

  @Test
  public void testBadChannelHandlerUnexpected2NotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_BadChannelHandlerUnexpected2_20());
  }

  @Test
  public void testBadChannelHandlerUnexpected2ExceptionFree() {
    assertExceptionFree(get_BadChannelHandlerUnexpected2_20());
  }

  @Test
  public void testBadChannelHandlerUnexpected2TODOFree() {
    assertTODOFree(get_BadChannelHandlerUnexpected2_20());
  }

  @Test
  public void stable_BadChannelHandlerUnexpected2_20() {
    String live = get_BadChannelHandlerUnexpected2_20();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_BadChannelHandlerUnexpected2_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 25");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 26");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_BadChannelHandlerUnexpected2_failure.a' failed to parse: Parser was expecting a Symbol=`)`; instead, the parse got Symbol:+. {Token: `+` @ (3,25) -> (3,26): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting a Symbol=`)`; instead, the parse got Symbol:+. {Token: `+` @ (3,25) -> (3,26): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_BadChannelHandlerUnexpected3_21 = null;
  private String get_BadChannelHandlerUnexpected3_21() {
    if (cached_BadChannelHandlerUnexpected3_21 != null) {
      return cached_BadChannelHandlerUnexpected3_21;
    }
    cached_BadChannelHandlerUnexpected3_21 = generateTestOutput(false, "BadChannelHandlerUnexpected3_21", "./test_code/Parser_BadChannelHandlerUnexpected3_failure.a");
    return cached_BadChannelHandlerUnexpected3_21;
  }

  @Test
  public void testBadChannelHandlerUnexpected3Failure() {
    assertLiveFail(get_BadChannelHandlerUnexpected3_21());
  }

  @Test
  public void testBadChannelHandlerUnexpected3NotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_BadChannelHandlerUnexpected3_21());
  }

  @Test
  public void testBadChannelHandlerUnexpected3ExceptionFree() {
    assertExceptionFree(get_BadChannelHandlerUnexpected3_21());
  }

  @Test
  public void testBadChannelHandlerUnexpected3TODOFree() {
    assertTODOFree(get_BadChannelHandlerUnexpected3_21());
  }

  @Test
  public void stable_BadChannelHandlerUnexpected3_21() {
    String live = get_BadChannelHandlerUnexpected3_21();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_BadChannelHandlerUnexpected3_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 13");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 14");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_BadChannelHandlerUnexpected3_failure.a' failed to parse: Parser was expecting an identifier, but got a Symbol:+ instead. {Token: `+` @ (3,13) -> (3,14): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting an identifier, but got a Symbol:+ instead. {Token: `+` @ (3,13) -> (3,14): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_BadChannelHandlerUnexpected4_22 = null;
  private String get_BadChannelHandlerUnexpected4_22() {
    if (cached_BadChannelHandlerUnexpected4_22 != null) {
      return cached_BadChannelHandlerUnexpected4_22;
    }
    cached_BadChannelHandlerUnexpected4_22 = generateTestOutput(false, "BadChannelHandlerUnexpected4_22", "./test_code/Parser_BadChannelHandlerUnexpected4_failure.a");
    return cached_BadChannelHandlerUnexpected4_22;
  }

  @Test
  public void testBadChannelHandlerUnexpected4Failure() {
    assertLiveFail(get_BadChannelHandlerUnexpected4_22());
  }

  @Test
  public void testBadChannelHandlerUnexpected4NotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_BadChannelHandlerUnexpected4_22());
  }

  @Test
  public void testBadChannelHandlerUnexpected4ExceptionFree() {
    assertExceptionFree(get_BadChannelHandlerUnexpected4_22());
  }

  @Test
  public void testBadChannelHandlerUnexpected4TODOFree() {
    assertTODOFree(get_BadChannelHandlerUnexpected4_22());
  }

  @Test
  public void stable_BadChannelHandlerUnexpected4_22() {
    String live = get_BadChannelHandlerUnexpected4_22();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_BadChannelHandlerUnexpected4_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 8");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 9");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_BadChannelHandlerUnexpected4_failure.a' failed to parse: Parser was expecting an identifier, but got a Symbol:+ instead. {Token: `+` @ (3,8) -> (3,9): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting an identifier, but got a Symbol:+ instead. {Token: `+` @ (3,8) -> (3,9): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_BadChannelHandlerUnexpected5_23 = null;
  private String get_BadChannelHandlerUnexpected5_23() {
    if (cached_BadChannelHandlerUnexpected5_23 != null) {
      return cached_BadChannelHandlerUnexpected5_23;
    }
    cached_BadChannelHandlerUnexpected5_23 = generateTestOutput(false, "BadChannelHandlerUnexpected5_23", "./test_code/Parser_BadChannelHandlerUnexpected5_failure.a");
    return cached_BadChannelHandlerUnexpected5_23;
  }

  @Test
  public void testBadChannelHandlerUnexpected5Failure() {
    assertLiveFail(get_BadChannelHandlerUnexpected5_23());
  }

  @Test
  public void testBadChannelHandlerUnexpected5NotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_BadChannelHandlerUnexpected5_23());
  }

  @Test
  public void testBadChannelHandlerUnexpected5ExceptionFree() {
    assertExceptionFree(get_BadChannelHandlerUnexpected5_23());
  }

  @Test
  public void testBadChannelHandlerUnexpected5TODOFree() {
    assertTODOFree(get_BadChannelHandlerUnexpected5_23());
  }

  @Test
  public void stable_BadChannelHandlerUnexpected5_23() {
    String live = get_BadChannelHandlerUnexpected5_23();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_BadChannelHandlerUnexpected5_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 12");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_BadChannelHandlerUnexpected5_failure.a' failed to parse: Parser was expecting a Symbol=`(`; instead, the parse got Symbol:!. {Token: `!` @ (3,11) -> (3,12): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting a Symbol=`(`; instead, the parse got Symbol:!. {Token: `!` @ (3,11) -> (3,12): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_BlockEmpty_24 = null;
  private String get_BlockEmpty_24() {
    if (cached_BlockEmpty_24 != null) {
      return cached_BlockEmpty_24;
    }
    cached_BlockEmpty_24 = generateTestOutput(true, "BlockEmpty_24", "./test_code/Parser_BlockEmpty_success.a");
    return cached_BlockEmpty_24;
  }

  @Test
  public void testBlockEmptyEmission() {
    assertEmissionGood(get_BlockEmpty_24());
  }

  @Test
  public void testBlockEmptySuccess() {
    assertLivePass(get_BlockEmpty_24());
  }

  @Test
  public void testBlockEmptyGoodWillHappy() {
    assertGoodWillHappy(get_BlockEmpty_24());
  }

  @Test
  public void testBlockEmptyExceptionFree() {
    assertExceptionFree(get_BlockEmpty_24());
  }

  @Test
  public void testBlockEmptyTODOFree() {
    assertTODOFree(get_BlockEmpty_24());
  }

  @Test
  public void stable_BlockEmpty_24() {
    String live = get_BlockEmpty_24();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_BlockEmpty_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class BlockEmpty_24 extends LivingDocument {");
    gold.append("\n  public BlockEmpty_24(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaBlockEmpty_24 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaBlockEmpty_24() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(BlockEmpty_24 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    BlockEmpty_24 __self = this;");
    gold.append("\n    DeltaBlockEmpty_24 __state = new DeltaBlockEmpty_24();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 3;");
    gold.append("\n    __track(0);");
    gold.append("\n    if (true) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(1);");
    gold.append("\n      ;");
    gold.append("\n");
    gold.append("\n    }");
    gold.append("\n    __track(2);");
    gold.append("\n    if (false) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(3);");
    gold.append("\n      final int x = 123;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":5,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":5,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_BlockSingleStatement_25 = null;
  private String get_BlockSingleStatement_25() {
    if (cached_BlockSingleStatement_25 != null) {
      return cached_BlockSingleStatement_25;
    }
    cached_BlockSingleStatement_25 = generateTestOutput(true, "BlockSingleStatement_25", "./test_code/Parser_BlockSingleStatement_success.a");
    return cached_BlockSingleStatement_25;
  }

  @Test
  public void testBlockSingleStatementEmission() {
    assertEmissionGood(get_BlockSingleStatement_25());
  }

  @Test
  public void testBlockSingleStatementSuccess() {
    assertLivePass(get_BlockSingleStatement_25());
  }

  @Test
  public void testBlockSingleStatementGoodWillHappy() {
    assertGoodWillHappy(get_BlockSingleStatement_25());
  }

  @Test
  public void testBlockSingleStatementExceptionFree() {
    assertExceptionFree(get_BlockSingleStatement_25());
  }

  @Test
  public void testBlockSingleStatementTODOFree() {
    assertTODOFree(get_BlockSingleStatement_25());
  }

  @Test
  public void stable_BlockSingleStatement_25() {
    String live = get_BlockSingleStatement_25();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_BlockSingleStatement_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class BlockSingleStatement_25 extends LivingDocument {");
    gold.append("\n  public BlockSingleStatement_25(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaBlockSingleStatement_25 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaBlockSingleStatement_25() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(BlockSingleStatement_25 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    BlockSingleStatement_25 __self = this;");
    gold.append("\n    DeltaBlockSingleStatement_25 __state = new DeltaBlockSingleStatement_25();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  private void __step_foo() {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    ;");
    gold.append("\n");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {");
    gold.append("\n    switch(__new_state) {");
    gold.append("\n      case \"foo\":");
    gold.append("\n        __step_foo();");
    gold.append("\n        return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(1);");
    gold.append("\n    if (false) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(2);");
    gold.append("\n      final int x = 123;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":2,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":2,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_Channels_26 = null;
  private String get_Channels_26() {
    if (cached_Channels_26 != null) {
      return cached_Channels_26;
    }
    cached_Channels_26 = generateTestOutput(true, "Channels_26", "./test_code/Parser_Channels_success.a");
    return cached_Channels_26;
  }

  @Test
  public void testChannelsEmission() {
    assertEmissionGood(get_Channels_26());
  }

  @Test
  public void testChannelsSuccess() {
    assertLivePass(get_Channels_26());
  }

  @Test
  public void testChannelsGoodWillHappy() {
    assertGoodWillHappy(get_Channels_26());
  }

  @Test
  public void testChannelsExceptionFree() {
    assertExceptionFree(get_Channels_26());
  }

  @Test
  public void testChannelsTODOFree() {
    assertTODOFree(get_Channels_26());
  }

  @Test
  public void stable_Channels_26() {
    String live = get_Channels_26();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_Channels_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class Channels_26 extends LivingDocument {");
    gold.append("\n  public Channels_26(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaChannels_26 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaChannels_26() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(Channels_26 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    Channels_26 __self = this;");
    gold.append("\n    DeltaChannels_26 __state = new DeltaChannels_26();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static class RTxX implements NtMessageBase {");
    gold.append("\n    private RTxX(JsonStreamReader __reader) {");
    gold.append("\n      __reader.skipValue();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxX() {}");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxX {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxX() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxX __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private void handleChannelMessage_goo1(NtClient c, RTxX x) throws AbortMessageException {");
    gold.append("\n    __code_cost += 1;");
    gold.append("\n");
    gold.append("\n  }");
    gold.append("\n  private void handleChannelMessage_goo2(NtClient client, RTxX x) throws AbortMessageException {");
    gold.append("\n    __code_cost += 1;");
    gold.append("\n");
    gold.append("\n  }");
    gold.append("\n  private void handleChannelMessage_gooarr1(NtClient c, RTxX[] x) throws AbortMessageException {");
    gold.append("\n    __code_cost += 1;");
    gold.append("\n");
    gold.append("\n  }");
    gold.append("\n  private void handleChannelMessage_gooarr2(NtClient client, RTxX[] arr) throws AbortMessageException {");
    gold.append("\n    __code_cost += 1;");
    gold.append("\n");
    gold.append("\n  }");
    gold.append("\n  private final Sink<RTxX> __queue_foo1 = new Sink<>(\"foo1\");");
    gold.append("\n  private final NtChannel<RTxX> foo1 = new NtChannel<>(__futures, __queue_foo1);");
    gold.append("\n  private final Sink<RTxX[]> __queue_foo2 = new Sink<>(\"foo2\");");
    gold.append("\n  private final NtChannel<RTxX[]> foo2 = new NtChannel<>(__futures, __queue_foo2);");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask __task) {");
    gold.append("\n    switch (__task.channel) {");
    gold.append("\n      case \"foo1\":");
    gold.append("\n        __queue_foo1.enqueue(__task, (RTxX) __task.message);");
    gold.append("\n        return;");
    gold.append("\n      case \"foo2\":");
    gold.append("\n        __queue_foo2.enqueue(__task, (RTxX[]) __task.message);");
    gold.append("\n        return;");
    gold.append("\n      case \"goo1\":");
    gold.append("\n        __task.setAction(() -> handleChannelMessage_goo1(__task.who, (RTxX)(__task.message)));");
    gold.append("\n        return;");
    gold.append("\n      case \"goo2\":");
    gold.append("\n        __task.setAction(() -> handleChannelMessage_goo2(__task.who, (RTxX)(__task.message)));");
    gold.append("\n        return;");
    gold.append("\n      case \"gooarr1\":");
    gold.append("\n        __task.setAction(() -> handleChannelMessage_gooarr1(__task.who, (RTxX[])(__task.message)));");
    gold.append("\n        return;");
    gold.append("\n      case \"gooarr2\":");
    gold.append("\n        __task.setAction(() -> handleChannelMessage_gooarr2(__task.who, (RTxX[])(__task.message)));");
    gold.append("\n        return;");
    gold.append("\n      default:");
    gold.append("\n        return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String __channel, JsonStreamReader __reader) {");
    gold.append("\n    switch (__channel) {");
    gold.append("\n      case \"foo1\":");
    gold.append("\n        return new RTxX(__reader);");
    gold.append("\n      case \"foo2\":");
    gold.append("\n        {");
    gold.append("\n          ArrayList<RTxX> __array_foo2 = new ArrayList<>();");
    gold.append("\n          if (__reader.startArray()) {");
    gold.append("\n            while (__reader.notEndOfArray()) {");
    gold.append("\n              __array_foo2.add(new RTxX(__reader));");
    gold.append("\n            }");
    gold.append("\n          }");
    gold.append("\n          return __array_foo2.toArray(new RTxX[__array_foo2.size()]);");
    gold.append("\n        }");
    gold.append("\n");
    gold.append("\n      case \"goo1\":");
    gold.append("\n        return new RTxX(__reader);");
    gold.append("\n      case \"goo2\":");
    gold.append("\n        return new RTxX(__reader);");
    gold.append("\n      case \"gooarr1\":");
    gold.append("\n        {");
    gold.append("\n          ArrayList<RTxX> __array_gooarr1 = new ArrayList<>();");
    gold.append("\n          if (__reader.startArray()) {");
    gold.append("\n            while (__reader.notEndOfArray()) {");
    gold.append("\n              __array_gooarr1.add(new RTxX(__reader));");
    gold.append("\n            }");
    gold.append("\n          }");
    gold.append("\n          return __array_gooarr1.toArray(new RTxX[__array_gooarr1.size()]);");
    gold.append("\n        }");
    gold.append("\n");
    gold.append("\n      case \"gooarr2\":");
    gold.append("\n        {");
    gold.append("\n          ArrayList<RTxX> __array_gooarr2 = new ArrayList<>();");
    gold.append("\n          if (__reader.startArray()) {");
    gold.append("\n            while (__reader.notEndOfArray()) {");
    gold.append("\n              __array_gooarr2.add(new RTxX(__reader));");
    gold.append("\n            }");
    gold.append("\n          }");
    gold.append("\n          return __array_gooarr2.toArray(new RTxX[__array_gooarr2.size()]);");
    gold.append("\n        }");
    gold.append("\n");
    gold.append("\n      default:");
    gold.append("\n        __reader.skipValue();");
    gold.append("\n        return NtMessageBase.NULL;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n    __queue_foo1.clear();");
    gold.append("\n    __queue_foo2.clear();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_CommentsWithin_27 = null;
  private String get_CommentsWithin_27() {
    if (cached_CommentsWithin_27 != null) {
      return cached_CommentsWithin_27;
    }
    cached_CommentsWithin_27 = generateTestOutput(true, "CommentsWithin_27", "./test_code/Parser_CommentsWithin_success.a");
    return cached_CommentsWithin_27;
  }

  @Test
  public void testCommentsWithinEmission() {
    assertEmissionGood(get_CommentsWithin_27());
  }

  @Test
  public void testCommentsWithinSuccess() {
    assertLivePass(get_CommentsWithin_27());
  }

  @Test
  public void testCommentsWithinGoodWillHappy() {
    assertGoodWillHappy(get_CommentsWithin_27());
  }

  @Test
  public void testCommentsWithinExceptionFree() {
    assertExceptionFree(get_CommentsWithin_27());
  }

  @Test
  public void testCommentsWithinTODOFree() {
    assertTODOFree(get_CommentsWithin_27());
  }

  @Test
  public void stable_CommentsWithin_27() {
    String live = get_CommentsWithin_27();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_CommentsWithin_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class CommentsWithin_27 extends LivingDocument {");
    gold.append("\n  public CommentsWithin_27(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaCommentsWithin_27 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaCommentsWithin_27() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(CommentsWithin_27 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    CommentsWithin_27 __self = this;");
    gold.append("\n    DeltaCommentsWithin_27 __state = new DeltaCommentsWithin_27();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 3;");
    gold.append("\n    __track(0);");
    gold.append("\n    int x = 0;");
    gold.append("\n    __track(1);");
    gold.append("\n    int z = 0;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":3,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":3,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_ConnectionEvents_28 = null;
  private String get_ConnectionEvents_28() {
    if (cached_ConnectionEvents_28 != null) {
      return cached_ConnectionEvents_28;
    }
    cached_ConnectionEvents_28 = generateTestOutput(true, "ConnectionEvents_28", "./test_code/Parser_ConnectionEvents_success.a");
    return cached_ConnectionEvents_28;
  }

  @Test
  public void testConnectionEventsEmission() {
    assertEmissionGood(get_ConnectionEvents_28());
  }

  @Test
  public void testConnectionEventsSuccess() {
    assertLivePass(get_ConnectionEvents_28());
  }

  @Test
  public void testConnectionEventsGoodWillHappy() {
    assertGoodWillHappy(get_ConnectionEvents_28());
  }

  @Test
  public void testConnectionEventsExceptionFree() {
    assertExceptionFree(get_ConnectionEvents_28());
  }

  @Test
  public void testConnectionEventsTODOFree() {
    assertTODOFree(get_ConnectionEvents_28());
  }

  @Test
  public void stable_ConnectionEvents_28() {
    String live = get_ConnectionEvents_28();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_ConnectionEvents_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class ConnectionEvents_28 extends LivingDocument {");
    gold.append("\n  private final RxInt32 x;");
    gold.append("\n  public ConnectionEvents_28(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    x = new RxInt32(this, 0);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"x\":");
    gold.append("\n            x.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n    x.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    x.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaConnectionEvents_28 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaConnectionEvents_28() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(ConnectionEvents_28 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    ConnectionEvents_28 __self = this;");
    gold.append("\n    DeltaConnectionEvents_28 __state = new DeltaConnectionEvents_28();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  public boolean __onConnected__0(NtClient cv){");
    gold.append("\n    __code_cost += 3;");
    gold.append("\n    __track(0);");
    gold.append("\n    x.bumpUpPost();");
    gold.append("\n    __track(1);");
    gold.append("\n    return true;");
    gold.append("\n  }");
    gold.append("\n  public void __onDisconnected__0(NtClient cv) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(2);");
    gold.append("\n    x.bumpDownPost();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    if (__onConnected__0(__cvalue)) __result = true;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {");
    gold.append("\n    __onDisconnected__0(__cvalue);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\n{\"command\":\"connect\",\"timestamp\":\"25\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"}}-->{\"__seq\":1,\"__connection_id\":1,\"__time\":\"25\",\"x\":1,\"__clients\":{\"0\":{\"agent\":\"?\",\"authority\":\"?\"}}} need:true in:0");
    gold.append("\n{\"command\":\"connect\",\"timestamp\":\"50\",\"who\":{\"agent\":\"rando\",\"authority\":\"random-place\"}}-->{\"__seq\":2,\"__connection_id\":2,\"__time\":\"50\",\"x\":2,\"__clients\":{\"1\":{\"agent\":\"rando\",\"authority\":\"random-place\"}}} need:true in:0");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":3}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":3}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"75\"}-->{\"__messages\":null,\"__seq\":3,\"__entropy\":\"-4962768465676381896\",\"__time\":\"75\"} need:false in:-75");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"100\"}-->{\"__goodwill_used\":0,\"__cost\":6,\"__billing_seq\":3} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":3,\"__connection_id\":2,\"__time\":\"75\",\"x\":2,\"__clients\":{\"0\":{\"agent\":\"?\",\"authority\":\"?\"},\"1\":{\"agent\":\"rando\",\"authority\":\"random-place\"}},\"__goodwill_used\":0,\"__cost\":6,\"__billing_seq\":3}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"x\":2,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":3,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":2,\"__message_id\":0,\"__time\":\"100\",\"__clients\":{\"0\":{\"agent\":\"?\",\"authority\":\"?\"},\"1\":{\"agent\":\"rando\",\"authority\":\"random-place\"}}}");
    gold.append("\n{\"x\":2,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":3,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":2,\"__message_id\":0,\"__time\":\"100\",\"__clients\":{\"0\":{\"agent\":\"?\",\"authority\":\"?\"},\"1\":{\"agent\":\"rando\",\"authority\":\"random-place\"}}}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_ControlFlow_29 = null;
  private String get_ControlFlow_29() {
    if (cached_ControlFlow_29 != null) {
      return cached_ControlFlow_29;
    }
    cached_ControlFlow_29 = generateTestOutput(true, "ControlFlow_29", "./test_code/Parser_ControlFlow_success.a");
    return cached_ControlFlow_29;
  }

  @Test
  public void testControlFlowEmission() {
    assertEmissionGood(get_ControlFlow_29());
  }

  @Test
  public void testControlFlowSuccess() {
    assertLivePass(get_ControlFlow_29());
  }

  @Test
  public void testControlFlowGoodWillHappy() {
    assertGoodWillHappy(get_ControlFlow_29());
  }

  @Test
  public void testControlFlowExceptionFree() {
    assertExceptionFree(get_ControlFlow_29());
  }

  @Test
  public void testControlFlowTODOFree() {
    assertTODOFree(get_ControlFlow_29());
  }

  @Test
  public void stable_ControlFlow_29() {
    String live = get_ControlFlow_29();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_ControlFlow_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class ControlFlow_29 extends LivingDocument {");
    gold.append("\n  private final RxInt32 s;");
    gold.append("\n  public ControlFlow_29(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    s = new RxInt32(this, 0);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"s\":");
    gold.append("\n            s.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"s\");");
    gold.append("\n    s.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    s.__commit(\"s\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    s.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaControlFlow_29 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaControlFlow_29() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(ControlFlow_29 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    ControlFlow_29 __self = this;");
    gold.append("\n    DeltaControlFlow_29 __state = new DeltaControlFlow_29();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static class RTxF implements NtMessageBase {");
    gold.append("\n    private RTxF(JsonStreamReader __reader) {");
    gold.append("\n      __reader.skipValue();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxF() {}");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxF {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxF() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxF __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private void handleChannelMessage_foo(NtClient client, RTxF x) throws AbortMessageException {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    throw new AbortMessageException();");
    gold.append("\n");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask __task) {");
    gold.append("\n    switch (__task.channel) {");
    gold.append("\n      case \"foo\":");
    gold.append("\n        __task.setAction(() -> handleChannelMessage_foo(__task.who, (RTxF)(__task.message)));");
    gold.append("\n        return;");
    gold.append("\n      default:");
    gold.append("\n        return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String __channel, JsonStreamReader __reader) {");
    gold.append("\n    switch (__channel) {");
    gold.append("\n      case \"foo\":");
    gold.append("\n        return new RTxF(__reader);");
    gold.append("\n      default:");
    gold.append("\n        __reader.skipValue();");
    gold.append("\n        return NtMessageBase.NULL;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  private void __step_dead() {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(1);");
    gold.append("\n    throw new ComputeBlockedException(null, null);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {");
    gold.append("\n    switch(__new_state) {");
    gold.append("\n      case \"dead\":");
    gold.append("\n        __step_dead();");
    gold.append("\n        return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 4;");
    gold.append("\n    __track(2);");
    gold.append("\n    while (__goodwill(11, 9, 11, 13) && (true)) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(3);");
    gold.append("\n      break;");
    gold.append("\n    }");
    gold.append("\n    __track(4);");
    gold.append("\n    int k = 0;");
    gold.append("\n    __track(5);");
    gold.append("\n    while (__goodwill(17, 9, 17, 15) && (k < 10)) {");
    gold.append("\n      __code_cost += 4;");
    gold.append("\n      __track(6);");
    gold.append("\n      k++;");
    gold.append("\n      __track(7);");
    gold.append("\n      if (k < 8) {");
    gold.append("\n        __code_cost += 2;");
    gold.append("\n        __track(8);");
    gold.append("\n        continue;");
    gold.append("\n      }");
    gold.append("\n      __track(9);");
    gold.append("\n      s.opAddTo(k);");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\",\"s\":27} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":12,\"__cost\":60,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"s\":27,\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":12,\"__cost\":60,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"s\":27,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"s\":27,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_Conversion_30 = null;
  private String get_Conversion_30() {
    if (cached_Conversion_30 != null) {
      return cached_Conversion_30;
    }
    cached_Conversion_30 = generateTestOutput(true, "Conversion_30", "./test_code/Parser_Conversion_success.a");
    return cached_Conversion_30;
  }

  @Test
  public void testConversionEmission() {
    assertEmissionGood(get_Conversion_30());
  }

  @Test
  public void testConversionSuccess() {
    assertLivePass(get_Conversion_30());
  }

  @Test
  public void testConversionGoodWillHappy() {
    assertGoodWillHappy(get_Conversion_30());
  }

  @Test
  public void testConversionExceptionFree() {
    assertExceptionFree(get_Conversion_30());
  }

  @Test
  public void testConversionTODOFree() {
    assertTODOFree(get_Conversion_30());
  }

  @Test
  public void stable_Conversion_30() {
    String live = get_Conversion_30();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_Conversion_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class Conversion_30 extends LivingDocument {");
    gold.append("\n  public Conversion_30(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaConversion_30 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaConversion_30() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(Conversion_30 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    Conversion_30 __self = this;");
    gold.append("\n    DeltaConversion_30 __state = new DeltaConversion_30();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static class RTxX implements NtMessageBase {");
    gold.append("\n    private int x = 0;");
    gold.append("\n    private RTxX(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              this.x = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      __writer.writeInteger(x);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxX() {}");
    gold.append("\n    private RTxX(int x) {");
    gold.append("\n      this.x = x;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxX {");
    gold.append("\n    private DInt32 __dx;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxX() {");
    gold.append("\n      __dx = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxX __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __dx.show(__item.x, __obj.planField(\"x\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private static class RTxXY implements NtMessageBase {");
    gold.append("\n    private int x = 0;");
    gold.append("\n    private int y = 0;");
    gold.append("\n    private RTxXY(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              this.x = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            case \"y\":");
    gold.append("\n              this.y = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      __writer.writeInteger(x);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"y\");");
    gold.append("\n      __writer.writeInteger(y);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxXY() {}");
    gold.append("\n    private RTxXY(int x, int y) {");
    gold.append("\n      this.x = x;");
    gold.append("\n      this.y = y;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxXY {");
    gold.append("\n    private DInt32 __dx;");
    gold.append("\n    private DInt32 __dy;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxXY() {");
    gold.append("\n      __dx = new DInt32();");
    gold.append("\n      __dy = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxXY __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __dx.show(__item.x, __obj.planField(\"x\"));");
    gold.append("\n      __dy.show(__item.y, __obj.planField(\"y\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 3;");
    gold.append("\n    __track(0);");
    gold.append("\n    RTxXY[] z = new RTxXY[] {new RTxXY(123, 42)};");
    gold.append("\n    __track(1);");
    gold.append("\n    RTxX[] x = Utility.convertMultiple(z, (__n) -> new RTxX[__n], (__obj) -> new RTxX(__obj.x));");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":3,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":3,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_DefineConstructorNoBlockEOS_31 = null;
  private String get_DefineConstructorNoBlockEOS_31() {
    if (cached_DefineConstructorNoBlockEOS_31 != null) {
      return cached_DefineConstructorNoBlockEOS_31;
    }
    cached_DefineConstructorNoBlockEOS_31 = generateTestOutput(false, "DefineConstructorNoBlockEOS_31", "./test_code/Parser_DefineConstructorNoBlockEOS_failure.a");
    return cached_DefineConstructorNoBlockEOS_31;
  }

  @Test
  public void testDefineConstructorNoBlockEOSFailure() {
    assertLiveFail(get_DefineConstructorNoBlockEOS_31());
  }

  @Test
  public void testDefineConstructorNoBlockEOSNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_DefineConstructorNoBlockEOS_31());
  }

  @Test
  public void testDefineConstructorNoBlockEOSExceptionFree() {
    assertExceptionFree(get_DefineConstructorNoBlockEOS_31());
  }

  @Test
  public void testDefineConstructorNoBlockEOSTODOFree() {
    assertTODOFree(get_DefineConstructorNoBlockEOS_31());
  }

  @Test
  public void stable_DefineConstructorNoBlockEOS_31() {
    String live = get_DefineConstructorNoBlockEOS_31();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_DefineConstructorNoBlockEOS_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 10");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_DefineConstructorNoBlockEOS_failure.a' failed to parse: Parser was expecting an atomic expression, but got end of stream instead. {Token: `@construct` @ (0,0) -> (0,10): Keyword} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting an atomic expression, but got end of stream instead. {Token: `@construct` @ (0,0) -> (0,10): Keyword} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_DefineConstructor_32 = null;
  private String get_DefineConstructor_32() {
    if (cached_DefineConstructor_32 != null) {
      return cached_DefineConstructor_32;
    }
    cached_DefineConstructor_32 = generateTestOutput(true, "DefineConstructor_32", "./test_code/Parser_DefineConstructor_success.a");
    return cached_DefineConstructor_32;
  }

  @Test
  public void testDefineConstructorEmission() {
    assertEmissionGood(get_DefineConstructor_32());
  }

  @Test
  public void testDefineConstructorSuccess() {
    assertLivePass(get_DefineConstructor_32());
  }

  @Test
  public void testDefineConstructorGoodWillHappy() {
    assertGoodWillHappy(get_DefineConstructor_32());
  }

  @Test
  public void testDefineConstructorExceptionFree() {
    assertExceptionFree(get_DefineConstructor_32());
  }

  @Test
  public void testDefineConstructorTODOFree() {
    assertTODOFree(get_DefineConstructor_32());
  }

  @Test
  public void stable_DefineConstructor_32() {
    String live = get_DefineConstructor_32();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_DefineConstructor_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class DefineConstructor_32 extends LivingDocument {");
    gold.append("\n  public DefineConstructor_32(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaDefineConstructor_32 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaDefineConstructor_32() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(DefineConstructor_32 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    DefineConstructor_32 __self = this;");
    gold.append("\n    DeltaDefineConstructor_32 __state = new DeltaDefineConstructor_32();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static class RTxM implements NtMessageBase {");
    gold.append("\n    private RTxM(JsonStreamReader __reader) {");
    gold.append("\n      __reader.skipValue();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxM() {}");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxM {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxM() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxM __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {}");
    gold.append("\n  private void __construct_1(NtClient me, NtMessageBase __object) {}");
    gold.append("\n  private void __construct_2(NtClient __who, RTxM m1) {}");
    gold.append("\n  private void __construct_3(NtClient c, RTxM m3) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    return new RTxM(__reader);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object_pre_cast) {");
    gold.append("\n    RTxM __object = (RTxM) __object_pre_cast;");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n    __construct_1(__who, __object);");
    gold.append("\n    __construct_2(__who, __object);");
    gold.append("\n    __construct_3(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_DefineFunction_33 = null;
  private String get_DefineFunction_33() {
    if (cached_DefineFunction_33 != null) {
      return cached_DefineFunction_33;
    }
    cached_DefineFunction_33 = generateTestOutput(true, "DefineFunction_33", "./test_code/Parser_DefineFunction_success.a");
    return cached_DefineFunction_33;
  }

  @Test
  public void testDefineFunctionEmission() {
    assertEmissionGood(get_DefineFunction_33());
  }

  @Test
  public void testDefineFunctionSuccess() {
    assertLivePass(get_DefineFunction_33());
  }

  @Test
  public void testDefineFunctionGoodWillHappy() {
    assertGoodWillHappy(get_DefineFunction_33());
  }

  @Test
  public void testDefineFunctionExceptionFree() {
    assertExceptionFree(get_DefineFunction_33());
  }

  @Test
  public void testDefineFunctionTODOFree() {
    assertTODOFree(get_DefineFunction_33());
  }

  @Test
  public void stable_DefineFunction_33() {
    String live = get_DefineFunction_33();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_DefineFunction_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class DefineFunction_33 extends LivingDocument {");
    gold.append("\n  public DefineFunction_33(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaDefineFunction_33 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaDefineFunction_33() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(DefineFunction_33 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    DefineFunction_33 __self = this;");
    gold.append("\n    DeltaDefineFunction_33 __state = new DeltaDefineFunction_33();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private int __FUNC_0_square(int x) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return x * x;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    int z = __FUNC_0_square(4);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":4,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":4,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_DefineProcedure_34 = null;
  private String get_DefineProcedure_34() {
    if (cached_DefineProcedure_34 != null) {
      return cached_DefineProcedure_34;
    }
    cached_DefineProcedure_34 = generateTestOutput(true, "DefineProcedure_34", "./test_code/Parser_DefineProcedure_success.a");
    return cached_DefineProcedure_34;
  }

  @Test
  public void testDefineProcedureEmission() {
    assertEmissionGood(get_DefineProcedure_34());
  }

  @Test
  public void testDefineProcedureSuccess() {
    assertLivePass(get_DefineProcedure_34());
  }

  @Test
  public void testDefineProcedureGoodWillHappy() {
    assertGoodWillHappy(get_DefineProcedure_34());
  }

  @Test
  public void testDefineProcedureExceptionFree() {
    assertExceptionFree(get_DefineProcedure_34());
  }

  @Test
  public void testDefineProcedureTODOFree() {
    assertTODOFree(get_DefineProcedure_34());
  }

  @Test
  public void stable_DefineProcedure_34() {
    String live = get_DefineProcedure_34();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_DefineProcedure_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class DefineProcedure_34 extends LivingDocument {");
    gold.append("\n  private final RxInt32 z;");
    gold.append("\n  public DefineProcedure_34(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    z = new RxInt32(this, 1);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"z\":");
    gold.append("\n            z.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"z\");");
    gold.append("\n    z.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    z.__commit(\"z\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    z.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaDefineProcedure_34 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaDefineProcedure_34() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(DefineProcedure_34 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    DefineProcedure_34 __self = this;");
    gold.append("\n    DeltaDefineProcedure_34 __state = new DeltaDefineProcedure_34();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private int __FUNC_0_square(int x) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return x * x * z.get();");
    gold.append("\n  }");
    gold.append("\n  private void __FUNC_1_set(int x) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(1);");
    gold.append("\n    z.set(x);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 3;");
    gold.append("\n    __track(2);");
    gold.append("\n    __FUNC_1_set(2);");
    gold.append("\n    __track(3);");
    gold.append("\n    int z = __FUNC_0_square(4);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\",\"z\":2} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":7,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"z\":2,\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":7,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"z\":2,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"z\":2,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_DefineRecordAutoType_35 = null;
  private String get_DefineRecordAutoType_35() {
    if (cached_DefineRecordAutoType_35 != null) {
      return cached_DefineRecordAutoType_35;
    }
    cached_DefineRecordAutoType_35 = generateTestOutput(true, "DefineRecordAutoType_35", "./test_code/Parser_DefineRecordAutoType_success.a");
    return cached_DefineRecordAutoType_35;
  }

  @Test
  public void testDefineRecordAutoTypeEmission() {
    assertEmissionGood(get_DefineRecordAutoType_35());
  }

  @Test
  public void testDefineRecordAutoTypeSuccess() {
    assertLivePass(get_DefineRecordAutoType_35());
  }

  @Test
  public void testDefineRecordAutoTypeGoodWillHappy() {
    assertGoodWillHappy(get_DefineRecordAutoType_35());
  }

  @Test
  public void testDefineRecordAutoTypeExceptionFree() {
    assertExceptionFree(get_DefineRecordAutoType_35());
  }

  @Test
  public void testDefineRecordAutoTypeTODOFree() {
    assertTODOFree(get_DefineRecordAutoType_35());
  }

  @Test
  public void stable_DefineRecordAutoType_35() {
    String live = get_DefineRecordAutoType_35();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_DefineRecordAutoType_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class DefineRecordAutoType_35 extends LivingDocument {");
    gold.append("\n  private final RxInt32 x;");
    gold.append("\n  public DefineRecordAutoType_35(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    x = new RxInt32(this, 0);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"x\":");
    gold.append("\n            x.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n    x.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    x.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaDefineRecordAutoType_35 {");
    gold.append("\n    private DInt32 __dx;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaDefineRecordAutoType_35() {");
    gold.append("\n      __dx = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(DefineRecordAutoType_35 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      __dx.show(__item.x.get(), __obj.planField(\"x\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    DefineRecordAutoType_35 __self = this;");
    gold.append("\n    DeltaDefineRecordAutoType_35 __state = new DeltaDefineRecordAutoType_35();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private class RTxX extends RxRecordBase<RTxX> {");
    gold.append("\n    private final RxLazy<Integer> y;");
    gold.append("\n    private final RxInt32 id;");
    gold.append("\n    private RTxX(RxParent __owner) {");
    gold.append("\n      super(__owner);");
    gold.append("\n      y = new RxLazy<Integer>(this, () -> ((x.get() + 1) * (x.get() + 2)));");
    gold.append("\n      x.__subscribe(y);");
    gold.append("\n      y.__subscribe(this);");
    gold.append("\n      id = new RxInt32(this, 0);");
    gold.append("\n      if (__owner instanceof RxTable) {");
    gold.append("\n        /* ok */");
    gold.append("\n      } else {");
    gold.append("\n        /* ok */");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    String[] __INDEX_COLUMNS = new String[] {};");
    gold.append("\n    @Override");
    gold.append("\n    public String[] __getIndexColumns() {");
    gold.append("\n      return __INDEX_COLUMNS;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int[] __getIndexValues() {");
    gold.append("\n      return new int[] {};");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __insert(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while(__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"id\":");
    gold.append("\n              id.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"id\");");
    gold.append("\n      id.__dump(__writer);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __forward.writeObjectFieldIntro(__name);");
    gold.append("\n        __forward.beginObject();");
    gold.append("\n        __reverse.writeObjectFieldIntro(__name);");
    gold.append("\n        __reverse.beginObject();");
    gold.append("\n        id.__commit(\"id\", __forward, __reverse);");
    gold.append("\n        __forward.endObject();");
    gold.append("\n        __reverse.endObject();");
    gold.append("\n        __lowerDirtyCommit();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __revert() {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __isDying = false;");
    gold.append("\n        id.__revert();");
    gold.append("\n        __lowerDirtyRevert();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public String __name() {");
    gold.append("\n      return \"X\";");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __deindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    public void __reindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int __id() {");
    gold.append("\n      return id.get();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __setId(int __id, boolean __force) {");
    gold.append("\n      if (__force) {");
    gold.append("\n        id.forceSet(__id);");
    gold.append("\n      } else {");
    gold.append("\n        id.set(__id);");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxX {");
    gold.append("\n    private int __gy;");
    gold.append("\n    private DInt32 __dy;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxX() {");
    gold.append("\n      __gy = -1;");
    gold.append("\n      __dy = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxX __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__gy != __item.y.getGeneration()) {");
    gold.append("\n        __dy.show(__item.y.get(), __obj.planField(\"y\"));");
    gold.append("\n        __gy = __item.y.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{\"x\":0},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{\"x\":0},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":2,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":2,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"x\":0,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"x\":0,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_DefineRecordNoNameEndOfStream_36 = null;
  private String get_DefineRecordNoNameEndOfStream_36() {
    if (cached_DefineRecordNoNameEndOfStream_36 != null) {
      return cached_DefineRecordNoNameEndOfStream_36;
    }
    cached_DefineRecordNoNameEndOfStream_36 = generateTestOutput(false, "DefineRecordNoNameEndOfStream_36", "./test_code/Parser_DefineRecordNoNameEndOfStream_failure.a");
    return cached_DefineRecordNoNameEndOfStream_36;
  }

  @Test
  public void testDefineRecordNoNameEndOfStreamFailure() {
    assertLiveFail(get_DefineRecordNoNameEndOfStream_36());
  }

  @Test
  public void testDefineRecordNoNameEndOfStreamNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_DefineRecordNoNameEndOfStream_36());
  }

  @Test
  public void testDefineRecordNoNameEndOfStreamExceptionFree() {
    assertExceptionFree(get_DefineRecordNoNameEndOfStream_36());
  }

  @Test
  public void testDefineRecordNoNameEndOfStreamTODOFree() {
    assertTODOFree(get_DefineRecordNoNameEndOfStream_36());
  }

  @Test
  public void stable_DefineRecordNoNameEndOfStream_36() {
    String live = get_DefineRecordNoNameEndOfStream_36();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_DefineRecordNoNameEndOfStream_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 6");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_DefineRecordNoNameEndOfStream_failure.a' failed to parse: Parser was expecting an identifier, but got end of stream instead. {Token: `record` @ (0,0) -> (0,6): Identifer} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting an identifier, but got end of stream instead. {Token: `record` @ (0,0) -> (0,6): Identifer} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_DefineRecordNoNameSymbolInstead_37 = null;
  private String get_DefineRecordNoNameSymbolInstead_37() {
    if (cached_DefineRecordNoNameSymbolInstead_37 != null) {
      return cached_DefineRecordNoNameSymbolInstead_37;
    }
    cached_DefineRecordNoNameSymbolInstead_37 = generateTestOutput(false, "DefineRecordNoNameSymbolInstead_37", "./test_code/Parser_DefineRecordNoNameSymbolInstead_failure.a");
    return cached_DefineRecordNoNameSymbolInstead_37;
  }

  @Test
  public void testDefineRecordNoNameSymbolInsteadFailure() {
    assertLiveFail(get_DefineRecordNoNameSymbolInstead_37());
  }

  @Test
  public void testDefineRecordNoNameSymbolInsteadNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_DefineRecordNoNameSymbolInstead_37());
  }

  @Test
  public void testDefineRecordNoNameSymbolInsteadExceptionFree() {
    assertExceptionFree(get_DefineRecordNoNameSymbolInstead_37());
  }

  @Test
  public void testDefineRecordNoNameSymbolInsteadTODOFree() {
    assertTODOFree(get_DefineRecordNoNameSymbolInstead_37());
  }

  @Test
  public void stable_DefineRecordNoNameSymbolInstead_37() {
    String live = get_DefineRecordNoNameSymbolInstead_37();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_DefineRecordNoNameSymbolInstead_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 7");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 8");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_DefineRecordNoNameSymbolInstead_failure.a' failed to parse: Parser was expecting an identifier, but got a Symbol:{ instead. {Token: `{` @ (0,7) -> (0,8): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting an identifier, but got a Symbol:{ instead. {Token: `{` @ (0,7) -> (0,8): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_DispatchEOS1_38 = null;
  private String get_DispatchEOS1_38() {
    if (cached_DispatchEOS1_38 != null) {
      return cached_DispatchEOS1_38;
    }
    cached_DispatchEOS1_38 = generateTestOutput(false, "DispatchEOS1_38", "./test_code/Parser_DispatchEOS1_failure.a");
    return cached_DispatchEOS1_38;
  }

  @Test
  public void testDispatchEOS1Failure() {
    assertLiveFail(get_DispatchEOS1_38());
  }

  @Test
  public void testDispatchEOS1NotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_DispatchEOS1_38());
  }

  @Test
  public void testDispatchEOS1ExceptionFree() {
    assertExceptionFree(get_DispatchEOS1_38());
  }

  @Test
  public void testDispatchEOS1TODOFree() {
    assertTODOFree(get_DispatchEOS1_38());
  }

  @Test
  public void stable_DispatchEOS1_38() {
    String live = get_DispatchEOS1_38();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_DispatchEOS1_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 4,");
    gold.append("\n      \"character\" : 9");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 4,");
    gold.append("\n      \"character\" : 10");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_DispatchEOS1_failure.a' failed to parse: Expected `::`, but got end of stream instead. {Token: `X` @ (4,9) -> (4,10): Identifer} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Expected `::`, but got end of stream instead. {Token: `X` @ (4,9) -> (4,10): Identifer} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_DispatchEOS2_39 = null;
  private String get_DispatchEOS2_39() {
    if (cached_DispatchEOS2_39 != null) {
      return cached_DispatchEOS2_39;
    }
    cached_DispatchEOS2_39 = generateTestOutput(false, "DispatchEOS2_39", "./test_code/Parser_DispatchEOS2_failure.a");
    return cached_DispatchEOS2_39;
  }

  @Test
  public void testDispatchEOS2Failure() {
    assertLiveFail(get_DispatchEOS2_39());
  }

  @Test
  public void testDispatchEOS2NotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_DispatchEOS2_39());
  }

  @Test
  public void testDispatchEOS2ExceptionFree() {
    assertExceptionFree(get_DispatchEOS2_39());
  }

  @Test
  public void testDispatchEOS2TODOFree() {
    assertTODOFree(get_DispatchEOS2_39());
  }

  @Test
  public void stable_DispatchEOS2_39() {
    String live = get_DispatchEOS2_39();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_DispatchEOS2_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 4,");
    gold.append("\n      \"character\" : 10");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 4,");
    gold.append("\n      \"character\" : 12");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_DispatchEOS2_failure.a' failed to parse: Expected an id or `*`, but got end of stream instead {Token: `::` @ (4,10) -> (4,12): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Expected an id or `*`, but got end of stream instead {Token: `::` @ (4,10) -> (4,12): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_Dispatch_40 = null;
  private String get_Dispatch_40() {
    if (cached_Dispatch_40 != null) {
      return cached_Dispatch_40;
    }
    cached_Dispatch_40 = generateTestOutput(true, "Dispatch_40", "./test_code/Parser_Dispatch_success.a");
    return cached_Dispatch_40;
  }

  @Test
  public void testDispatchEmission() {
    assertEmissionGood(get_Dispatch_40());
  }

  @Test
  public void testDispatchSuccess() {
    assertLivePass(get_Dispatch_40());
  }

  @Test
  public void testDispatchGoodWillHappy() {
    assertGoodWillHappy(get_Dispatch_40());
  }

  @Test
  public void testDispatchExceptionFree() {
    assertExceptionFree(get_Dispatch_40());
  }

  @Test
  public void testDispatchTODOFree() {
    assertTODOFree(get_Dispatch_40());
  }

  @Test
  public void stable_Dispatch_40() {
    String live = get_Dispatch_40();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_Dispatch_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class Dispatch_40 extends LivingDocument {");
    gold.append("\n  public Dispatch_40(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaDispatch_40 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaDispatch_40() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(Dispatch_40 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    Dispatch_40 __self = this;");
    gold.append("\n    DeltaDispatch_40 __state = new DeltaDispatch_40();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static final int [] __ALL_VALUES_X = new int[] {1, 2, 3};");
    gold.append("\n  private int __IND_DISPATCH_0_foo__0(int self, int x) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return 0;");
    gold.append("\n  }");
    gold.append("\n  private int __IND_DISPATCH_0_foo__1(int self, int x) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(1);");
    gold.append("\n    return 0;");
    gold.append("\n  }");
    gold.append("\n  private int __IND_DISPATCH_0_foo__2(int self, int x) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(2);");
    gold.append("\n    return 0;");
    gold.append("\n  }");
    gold.append("\n  private int __DISPATCH_0_foo(int __value, int x) {");
    gold.append("\n    if (__value == 1) {");
    gold.append("\n      return __IND_DISPATCH_0_foo__0(__value, x);");
    gold.append("\n    }");
    gold.append("\n    if (__value == 2) {");
    gold.append("\n      return __IND_DISPATCH_0_foo__2(__value, x);");
    gold.append("\n    }");
    gold.append("\n    if (__value == 3) {");
    gold.append("\n      return __IND_DISPATCH_0_foo__2(__value, x);");
    gold.append("\n    }");
    gold.append("\n    return __IND_DISPATCH_0_foo__1(__value, x);");
    gold.append("\n  }");
    gold.append("\n  private void __IND_DISPATCH_1_g__0(int self) {}");
    gold.append("\n  private void __DISPATCH_1_g(int __value) {");
    gold.append("\n    if (__value == 1) {");
    gold.append("\n      __IND_DISPATCH_1_g__0(__value);");
    gold.append("\n      return;");
    gold.append("\n    }");
    gold.append("\n    if (__value == 2) {");
    gold.append("\n      __IND_DISPATCH_1_g__0(__value);");
    gold.append("\n      return;");
    gold.append("\n    }");
    gold.append("\n    if (__value == 3) {");
    gold.append("\n      __IND_DISPATCH_1_g__0(__value);");
    gold.append("\n      return;");
    gold.append("\n    }");
    gold.append("\n    __IND_DISPATCH_1_g__0(__value);");
    gold.append("\n  }");
    gold.append("\n  private void __IND_DISPATCH_2_z__0(int self, int x, int y, int z) {}");
    gold.append("\n  private void __DISPATCH_2_z(int __value, int x, int y, int z) {");
    gold.append("\n    if (__value == 1) {");
    gold.append("\n      __IND_DISPATCH_2_z__0(__value, x, y, z);");
    gold.append("\n      return;");
    gold.append("\n    }");
    gold.append("\n    if (__value == 2) {");
    gold.append("\n      __IND_DISPATCH_2_z__0(__value, x, y, z);");
    gold.append("\n      return;");
    gold.append("\n    }");
    gold.append("\n    if (__value == 3) {");
    gold.append("\n      __IND_DISPATCH_2_z__0(__value, x, y, z);");
    gold.append("\n      return;");
    gold.append("\n    }");
    gold.append("\n    __IND_DISPATCH_2_z__0(__value, x, y, z);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_DoWhileEOS_41 = null;
  private String get_DoWhileEOS_41() {
    if (cached_DoWhileEOS_41 != null) {
      return cached_DoWhileEOS_41;
    }
    cached_DoWhileEOS_41 = generateTestOutput(false, "DoWhileEOS_41", "./test_code/Parser_DoWhileEOS_failure.a");
    return cached_DoWhileEOS_41;
  }

  @Test
  public void testDoWhileEOSFailure() {
    assertLiveFail(get_DoWhileEOS_41());
  }

  @Test
  public void testDoWhileEOSNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_DoWhileEOS_41());
  }

  @Test
  public void testDoWhileEOSExceptionFree() {
    assertExceptionFree(get_DoWhileEOS_41());
  }

  @Test
  public void testDoWhileEOSTODOFree() {
    assertTODOFree(get_DoWhileEOS_41());
  }

  @Test
  public void stable_DoWhileEOS_41() {
    String live = get_DoWhileEOS_41();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_DoWhileEOS_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_DoWhileEOS_failure.a' failed to parse: Parser was expecting `while`, but got an end of the stream instead. {Token: `}` @ (3,2) -> (3,3): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting `while`, but got an end of the stream instead. {Token: `}` @ (3,2) -> (3,3): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_DoWhileNoWhile_42 = null;
  private String get_DoWhileNoWhile_42() {
    if (cached_DoWhileNoWhile_42 != null) {
      return cached_DoWhileNoWhile_42;
    }
    cached_DoWhileNoWhile_42 = generateTestOutput(false, "DoWhileNoWhile_42", "./test_code/Parser_DoWhileNoWhile_failure.a");
    return cached_DoWhileNoWhile_42;
  }

  @Test
  public void testDoWhileNoWhileFailure() {
    assertLiveFail(get_DoWhileNoWhile_42());
  }

  @Test
  public void testDoWhileNoWhileNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_DoWhileNoWhile_42());
  }

  @Test
  public void testDoWhileNoWhileExceptionFree() {
    assertExceptionFree(get_DoWhileNoWhile_42());
  }

  @Test
  public void testDoWhileNoWhileTODOFree() {
    assertTODOFree(get_DoWhileNoWhile_42());
  }

  @Test
  public void stable_DoWhileNoWhile_42() {
    String live = get_DoWhileNoWhile_42();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_DoWhileNoWhile_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 4");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 3,");
    gold.append("\n      \"character\" : 5");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_DoWhileNoWhile_failure.a' failed to parse: Parser was expecting keyword:`while`, but got `(` instead. {Token: `(` @ (3,4) -> (3,5): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting keyword:`while`, but got `(` instead. {Token: `(` @ (3,4) -> (3,5): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_EnumEmpty_43 = null;
  private String get_EnumEmpty_43() {
    if (cached_EnumEmpty_43 != null) {
      return cached_EnumEmpty_43;
    }
    cached_EnumEmpty_43 = generateTestOutput(false, "EnumEmpty_43", "./test_code/Parser_EnumEmpty_failure.a");
    return cached_EnumEmpty_43;
  }

  @Test
  public void testEnumEmptyFailure() {
    assertLiveFail(get_EnumEmpty_43());
  }

  @Test
  public void testEnumEmptyNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_EnumEmpty_43());
  }

  @Test
  public void testEnumEmptyExceptionFree() {
    assertExceptionFree(get_EnumEmpty_43());
  }

  @Test
  public void testEnumEmptyTODOFree() {
    assertTODOFree(get_EnumEmpty_43());
  }

  @Test
  public void stable_EnumEmpty_43() {
    String live = get_EnumEmpty_43();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_EnumEmpty_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 12");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"enum 'Name' has no values (EnumStorage)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_EnumEndOfStreamAfterColon_44 = null;
  private String get_EnumEndOfStreamAfterColon_44() {
    if (cached_EnumEndOfStreamAfterColon_44 != null) {
      return cached_EnumEndOfStreamAfterColon_44;
    }
    cached_EnumEndOfStreamAfterColon_44 = generateTestOutput(false, "EnumEndOfStreamAfterColon_44", "./test_code/Parser_EnumEndOfStreamAfterColon_failure.a");
    return cached_EnumEndOfStreamAfterColon_44;
  }

  @Test
  public void testEnumEndOfStreamAfterColonFailure() {
    assertLiveFail(get_EnumEndOfStreamAfterColon_44());
  }

  @Test
  public void testEnumEndOfStreamAfterColonNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_EnumEndOfStreamAfterColon_44());
  }

  @Test
  public void testEnumEndOfStreamAfterColonExceptionFree() {
    assertExceptionFree(get_EnumEndOfStreamAfterColon_44());
  }

  @Test
  public void testEnumEndOfStreamAfterColonTODOFree() {
    assertTODOFree(get_EnumEndOfStreamAfterColon_44());
  }

  @Test
  public void stable_EnumEndOfStreamAfterColon_44() {
    String live = get_EnumEndOfStreamAfterColon_44();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_EnumEndOfStreamAfterColon_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 15");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 16");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_EnumEndOfStreamAfterColon_failure.a' failed to parse: Parser was expecting an integer after ':', but got end of stream instead. {Token: `:` @ (0,15) -> (0,16): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting an integer after ':', but got end of stream instead. {Token: `:` @ (0,15) -> (0,16): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_EnumEndOfStreamAfterLabel_45 = null;
  private String get_EnumEndOfStreamAfterLabel_45() {
    if (cached_EnumEndOfStreamAfterLabel_45 != null) {
      return cached_EnumEndOfStreamAfterLabel_45;
    }
    cached_EnumEndOfStreamAfterLabel_45 = generateTestOutput(false, "EnumEndOfStreamAfterLabel_45", "./test_code/Parser_EnumEndOfStreamAfterLabel_failure.a");
    return cached_EnumEndOfStreamAfterLabel_45;
  }

  @Test
  public void testEnumEndOfStreamAfterLabelFailure() {
    assertLiveFail(get_EnumEndOfStreamAfterLabel_45());
  }

  @Test
  public void testEnumEndOfStreamAfterLabelNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_EnumEndOfStreamAfterLabel_45());
  }

  @Test
  public void testEnumEndOfStreamAfterLabelExceptionFree() {
    assertExceptionFree(get_EnumEndOfStreamAfterLabel_45());
  }

  @Test
  public void testEnumEndOfStreamAfterLabelTODOFree() {
    assertTODOFree(get_EnumEndOfStreamAfterLabel_45());
  }

  @Test
  public void stable_EnumEndOfStreamAfterLabel_45() {
    String live = get_EnumEndOfStreamAfterLabel_45();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_EnumEndOfStreamAfterLabel_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 14");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 15");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_EnumEndOfStreamAfterLabel_failure.a' failed to parse: Parser was expecting either a Symbol=} or an Identifer to define a new enum label, but got end of stream instead. {Token: `Y` @ (0,14) -> (0,15): Identifer} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting either a Symbol=} or an Identifer to define a new enum label, but got end of stream instead. {Token: `Y` @ (0,14) -> (0,15): Identifer} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_EnumErrorNoIdentLabel_46 = null;
  private String get_EnumErrorNoIdentLabel_46() {
    if (cached_EnumErrorNoIdentLabel_46 != null) {
      return cached_EnumErrorNoIdentLabel_46;
    }
    cached_EnumErrorNoIdentLabel_46 = generateTestOutput(false, "EnumErrorNoIdentLabel_46", "./test_code/Parser_EnumErrorNoIdentLabel_failure.a");
    return cached_EnumErrorNoIdentLabel_46;
  }

  @Test
  public void testEnumErrorNoIdentLabelFailure() {
    assertLiveFail(get_EnumErrorNoIdentLabel_46());
  }

  @Test
  public void testEnumErrorNoIdentLabelNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_EnumErrorNoIdentLabel_46());
  }

  @Test
  public void testEnumErrorNoIdentLabelExceptionFree() {
    assertExceptionFree(get_EnumErrorNoIdentLabel_46());
  }

  @Test
  public void testEnumErrorNoIdentLabelTODOFree() {
    assertTODOFree(get_EnumErrorNoIdentLabel_46());
  }

  @Test
  public void stable_EnumErrorNoIdentLabel_46() {
    String live = get_EnumErrorNoIdentLabel_46();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_EnumErrorNoIdentLabel_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 12");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 13");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_EnumErrorNoIdentLabel_failure.a' failed to parse: Parser was expecting an identifier, but got a NumberLiteral:1 instead. {Token: `1` @ (0,12) -> (0,13): NumberLiteral:NumberIsInteger} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting an identifier, but got a NumberLiteral:1 instead. {Token: `1` @ (0,12) -> (0,13): NumberLiteral:NumberIsInteger} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_EnumErrorNoName_47 = null;
  private String get_EnumErrorNoName_47() {
    if (cached_EnumErrorNoName_47 != null) {
      return cached_EnumErrorNoName_47;
    }
    cached_EnumErrorNoName_47 = generateTestOutput(false, "EnumErrorNoName_47", "./test_code/Parser_EnumErrorNoName_failure.a");
    return cached_EnumErrorNoName_47;
  }

  @Test
  public void testEnumErrorNoNameFailure() {
    assertLiveFail(get_EnumErrorNoName_47());
  }

  @Test
  public void testEnumErrorNoNameNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_EnumErrorNoName_47());
  }

  @Test
  public void testEnumErrorNoNameExceptionFree() {
    assertExceptionFree(get_EnumErrorNoName_47());
  }

  @Test
  public void testEnumErrorNoNameTODOFree() {
    assertTODOFree(get_EnumErrorNoName_47());
  }

  @Test
  public void stable_EnumErrorNoName_47() {
    String live = get_EnumErrorNoName_47();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_EnumErrorNoName_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 6");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 7");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_EnumErrorNoName_failure.a' failed to parse: Parser was expecting an identifier, but got a Symbol:{ instead. {Token: `{` @ (0,6) -> (0,7): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting an identifier, but got a Symbol:{ instead. {Token: `{` @ (0,6) -> (0,7): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_EnumErrorNoOpenBrace_48 = null;
  private String get_EnumErrorNoOpenBrace_48() {
    if (cached_EnumErrorNoOpenBrace_48 != null) {
      return cached_EnumErrorNoOpenBrace_48;
    }
    cached_EnumErrorNoOpenBrace_48 = generateTestOutput(false, "EnumErrorNoOpenBrace_48", "./test_code/Parser_EnumErrorNoOpenBrace_failure.a");
    return cached_EnumErrorNoOpenBrace_48;
  }

  @Test
  public void testEnumErrorNoOpenBraceFailure() {
    assertLiveFail(get_EnumErrorNoOpenBrace_48());
  }

  @Test
  public void testEnumErrorNoOpenBraceNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_EnumErrorNoOpenBrace_48());
  }

  @Test
  public void testEnumErrorNoOpenBraceExceptionFree() {
    assertExceptionFree(get_EnumErrorNoOpenBrace_48());
  }

  @Test
  public void testEnumErrorNoOpenBraceTODOFree() {
    assertTODOFree(get_EnumErrorNoOpenBrace_48());
  }

  @Test
  public void stable_EnumErrorNoOpenBrace_48() {
    String live = get_EnumErrorNoOpenBrace_48();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_EnumErrorNoOpenBrace_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 10");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_EnumErrorNoOpenBrace_failure.a' failed to parse: Parser was expecting a Symbol=`{`; instead, the parse got Identifer:X. {Token: `X` @ (0,10) -> (0,11): Identifer} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting a Symbol=`{`; instead, the parse got Identifer:X. {Token: `X` @ (0,10) -> (0,11): Identifer} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_EnumLazy_49 = null;
  private String get_EnumLazy_49() {
    if (cached_EnumLazy_49 != null) {
      return cached_EnumLazy_49;
    }
    cached_EnumLazy_49 = generateTestOutput(true, "EnumLazy_49", "./test_code/Parser_EnumLazy_success.a");
    return cached_EnumLazy_49;
  }

  @Test
  public void testEnumLazyEmission() {
    assertEmissionGood(get_EnumLazy_49());
  }

  @Test
  public void testEnumLazySuccess() {
    assertLivePass(get_EnumLazy_49());
  }

  @Test
  public void testEnumLazyGoodWillHappy() {
    assertGoodWillHappy(get_EnumLazy_49());
  }

  @Test
  public void testEnumLazyExceptionFree() {
    assertExceptionFree(get_EnumLazy_49());
  }

  @Test
  public void testEnumLazyTODOFree() {
    assertTODOFree(get_EnumLazy_49());
  }

  @Test
  public void stable_EnumLazy_49() {
    String live = get_EnumLazy_49();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_EnumLazy_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class EnumLazy_49 extends LivingDocument {");
    gold.append("\n  public EnumLazy_49(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaEnumLazy_49 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaEnumLazy_49() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(EnumLazy_49 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    EnumLazy_49 __self = this;");
    gold.append("\n    DeltaEnumLazy_49 __state = new DeltaEnumLazy_49();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static final int [] __ALL_VALUES_Name = new int[] {0, 1, 2};");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_EnumNoIntegerAfterColon_50 = null;
  private String get_EnumNoIntegerAfterColon_50() {
    if (cached_EnumNoIntegerAfterColon_50 != null) {
      return cached_EnumNoIntegerAfterColon_50;
    }
    cached_EnumNoIntegerAfterColon_50 = generateTestOutput(false, "EnumNoIntegerAfterColon_50", "./test_code/Parser_EnumNoIntegerAfterColon_failure.a");
    return cached_EnumNoIntegerAfterColon_50;
  }

  @Test
  public void testEnumNoIntegerAfterColonFailure() {
    assertLiveFail(get_EnumNoIntegerAfterColon_50());
  }

  @Test
  public void testEnumNoIntegerAfterColonNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_EnumNoIntegerAfterColon_50());
  }

  @Test
  public void testEnumNoIntegerAfterColonExceptionFree() {
    assertExceptionFree(get_EnumNoIntegerAfterColon_50());
  }

  @Test
  public void testEnumNoIntegerAfterColonTODOFree() {
    assertTODOFree(get_EnumNoIntegerAfterColon_50());
  }

  @Test
  public void stable_EnumNoIntegerAfterColon_50() {
    String live = get_EnumNoIntegerAfterColon_50();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_EnumNoIntegerAfterColon_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 15");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 16");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_EnumNoIntegerAfterColon_failure.a' failed to parse: Parser was expecting a valid numeric sequence, but got a Identifer instead. {Token: `Y` @ (0,15) -> (0,16): Identifer} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting a valid numeric sequence, but got a Identifer instead. {Token: `Y` @ (0,15) -> (0,16): Identifer} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_EnumNoisy_51 = null;
  private String get_EnumNoisy_51() {
    if (cached_EnumNoisy_51 != null) {
      return cached_EnumNoisy_51;
    }
    cached_EnumNoisy_51 = generateTestOutput(true, "EnumNoisy_51", "./test_code/Parser_EnumNoisy_success.a");
    return cached_EnumNoisy_51;
  }

  @Test
  public void testEnumNoisyEmission() {
    assertEmissionGood(get_EnumNoisy_51());
  }

  @Test
  public void testEnumNoisySuccess() {
    assertLivePass(get_EnumNoisy_51());
  }

  @Test
  public void testEnumNoisyGoodWillHappy() {
    assertGoodWillHappy(get_EnumNoisy_51());
  }

  @Test
  public void testEnumNoisyExceptionFree() {
    assertExceptionFree(get_EnumNoisy_51());
  }

  @Test
  public void testEnumNoisyTODOFree() {
    assertTODOFree(get_EnumNoisy_51());
  }

  @Test
  public void stable_EnumNoisy_51() {
    String live = get_EnumNoisy_51();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_EnumNoisy_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class EnumNoisy_51 extends LivingDocument {");
    gold.append("\n  public EnumNoisy_51(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaEnumNoisy_51 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaEnumNoisy_51() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(EnumNoisy_51 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    EnumNoisy_51 __self = this;");
    gold.append("\n    DeltaEnumNoisy_51 __state = new DeltaEnumNoisy_51();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static final int [] __ALL_VALUES_Fancy = new int[] {1, 2};");
    gold.append("\n  private static final int [] __ALL_VALUES_FancyWithSpicyComma = new int[] {1, 2, 3};");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_EnumPrefix_52 = null;
  private String get_EnumPrefix_52() {
    if (cached_EnumPrefix_52 != null) {
      return cached_EnumPrefix_52;
    }
    cached_EnumPrefix_52 = generateTestOutput(true, "EnumPrefix_52", "./test_code/Parser_EnumPrefix_success.a");
    return cached_EnumPrefix_52;
  }

  @Test
  public void testEnumPrefixEmission() {
    assertEmissionGood(get_EnumPrefix_52());
  }

  @Test
  public void testEnumPrefixSuccess() {
    assertLivePass(get_EnumPrefix_52());
  }

  @Test
  public void testEnumPrefixGoodWillHappy() {
    assertGoodWillHappy(get_EnumPrefix_52());
  }

  @Test
  public void testEnumPrefixExceptionFree() {
    assertExceptionFree(get_EnumPrefix_52());
  }

  @Test
  public void testEnumPrefixTODOFree() {
    assertTODOFree(get_EnumPrefix_52());
  }

  @Test
  public void stable_EnumPrefix_52() {
    String live = get_EnumPrefix_52();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_EnumPrefix_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class EnumPrefix_52 extends LivingDocument {");
    gold.append("\n  public EnumPrefix_52(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaEnumPrefix_52 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaEnumPrefix_52() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(EnumPrefix_52 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    EnumPrefix_52 __self = this;");
    gold.append("\n    DeltaEnumPrefix_52 __state = new DeltaEnumPrefix_52();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static final int [] __ALL_VALUES_X = new int[] {0, 1, 2, 3, 4};");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  public void __test_PrimaryTest(TestReportBuilder report) {");
    gold.append("\n    report.begin(\"PrimaryTest\");");
    gold.append("\n    {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(0);");
    gold.append("\n      __assert_truth((__A0_X).length == 3, 5, 2, 5, 29);");
    gold.append("\n    }");
    gold.append("\n    report.end(getAndResetAssertions());");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {\"PrimaryTest\"};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {");
    gold.append("\n    switch(testName) {");
    gold.append("\n      case \"PrimaryTest\":");
    gold.append("\n          __test_PrimaryTest(report);");
    gold.append("\n          return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  private static final int [] __A0_X = new int[] {0, 2, 3};");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\nTEST[PrimaryTest] = 100.0%");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_EnumSetDefault_53 = null;
  private String get_EnumSetDefault_53() {
    if (cached_EnumSetDefault_53 != null) {
      return cached_EnumSetDefault_53;
    }
    cached_EnumSetDefault_53 = generateTestOutput(true, "EnumSetDefault_53", "./test_code/Parser_EnumSetDefault_success.a");
    return cached_EnumSetDefault_53;
  }

  @Test
  public void testEnumSetDefaultEmission() {
    assertEmissionGood(get_EnumSetDefault_53());
  }

  @Test
  public void testEnumSetDefaultSuccess() {
    assertLivePass(get_EnumSetDefault_53());
  }

  @Test
  public void testEnumSetDefaultGoodWillHappy() {
    assertGoodWillHappy(get_EnumSetDefault_53());
  }

  @Test
  public void testEnumSetDefaultExceptionFree() {
    assertExceptionFree(get_EnumSetDefault_53());
  }

  @Test
  public void testEnumSetDefaultTODOFree() {
    assertTODOFree(get_EnumSetDefault_53());
  }

  @Test
  public void stable_EnumSetDefault_53() {
    String live = get_EnumSetDefault_53();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_EnumSetDefault_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class EnumSetDefault_53 extends LivingDocument {");
    gold.append("\n  public EnumSetDefault_53(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaEnumSetDefault_53 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaEnumSetDefault_53() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(EnumSetDefault_53 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    EnumSetDefault_53 __self = this;");
    gold.append("\n    DeltaEnumSetDefault_53 __state = new DeltaEnumSetDefault_53();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static final int [] __ALL_VALUES_Name = new int[] {1, 2};");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_EnumWithHexValue_54 = null;
  private String get_EnumWithHexValue_54() {
    if (cached_EnumWithHexValue_54 != null) {
      return cached_EnumWithHexValue_54;
    }
    cached_EnumWithHexValue_54 = generateTestOutput(true, "EnumWithHexValue_54", "./test_code/Parser_EnumWithHexValue_success.a");
    return cached_EnumWithHexValue_54;
  }

  @Test
  public void testEnumWithHexValueEmission() {
    assertEmissionGood(get_EnumWithHexValue_54());
  }

  @Test
  public void testEnumWithHexValueSuccess() {
    assertLivePass(get_EnumWithHexValue_54());
  }

  @Test
  public void testEnumWithHexValueGoodWillHappy() {
    assertGoodWillHappy(get_EnumWithHexValue_54());
  }

  @Test
  public void testEnumWithHexValueExceptionFree() {
    assertExceptionFree(get_EnumWithHexValue_54());
  }

  @Test
  public void testEnumWithHexValueTODOFree() {
    assertTODOFree(get_EnumWithHexValue_54());
  }

  @Test
  public void stable_EnumWithHexValue_54() {
    String live = get_EnumWithHexValue_54();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_EnumWithHexValue_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class EnumWithHexValue_54 extends LivingDocument {");
    gold.append("\n  public EnumWithHexValue_54(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaEnumWithHexValue_54 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaEnumWithHexValue_54() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(EnumWithHexValue_54 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    EnumWithHexValue_54 __self = this;");
    gold.append("\n    DeltaEnumWithHexValue_54 __state = new DeltaEnumWithHexValue_54();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static final int [] __ALL_VALUES_Name = new int[] {1, 2, 4};");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_FieldDeref_55 = null;
  private String get_FieldDeref_55() {
    if (cached_FieldDeref_55 != null) {
      return cached_FieldDeref_55;
    }
    cached_FieldDeref_55 = generateTestOutput(true, "FieldDeref_55", "./test_code/Parser_FieldDeref_success.a");
    return cached_FieldDeref_55;
  }

  @Test
  public void testFieldDerefEmission() {
    assertEmissionGood(get_FieldDeref_55());
  }

  @Test
  public void testFieldDerefSuccess() {
    assertLivePass(get_FieldDeref_55());
  }

  @Test
  public void testFieldDerefGoodWillHappy() {
    assertGoodWillHappy(get_FieldDeref_55());
  }

  @Test
  public void testFieldDerefExceptionFree() {
    assertExceptionFree(get_FieldDeref_55());
  }

  @Test
  public void testFieldDerefTODOFree() {
    assertTODOFree(get_FieldDeref_55());
  }

  @Test
  public void stable_FieldDeref_55() {
    String live = get_FieldDeref_55();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_FieldDeref_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class FieldDeref_55 extends LivingDocument {");
    gold.append("\n  private final RxInt32 result;");
    gold.append("\n  public FieldDeref_55(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    result = new RxInt32(this, 0);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"result\":");
    gold.append("\n            result.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"result\");");
    gold.append("\n    result.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    result.__commit(\"result\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    result.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaFieldDeref_55 {");
    gold.append("\n    private DInt32 __dresult;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaFieldDeref_55() {");
    gold.append("\n      __dresult = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(FieldDeref_55 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      __dresult.show(__item.result.get(), __obj.planField(\"result\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    FieldDeref_55 __self = this;");
    gold.append("\n    DeltaFieldDeref_55 __state = new DeltaFieldDeref_55();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static class RTxM implements NtMessageBase {");
    gold.append("\n    private int x = 0;");
    gold.append("\n    private RTxM(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              this.x = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      __writer.writeInteger(x);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxM() {}");
    gold.append("\n    private RTxM(int x) {");
    gold.append("\n      this.x = x;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxM {");
    gold.append("\n    private DInt32 __dx;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxM() {");
    gold.append("\n      __dx = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxM __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __dx.show(__item.x, __obj.planField(\"x\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 3;");
    gold.append("\n    __track(0);");
    gold.append("\n    final RTxM m = new RTxM(123);");
    gold.append("\n    __track(1);");
    gold.append("\n    result.set(m.x);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\",\"result\":123} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{\"result\":123},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{\"result\":123},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":5,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"result\":123,\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":5,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"result\":123,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"result\":123,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_ForeachEOS_56 = null;
  private String get_ForeachEOS_56() {
    if (cached_ForeachEOS_56 != null) {
      return cached_ForeachEOS_56;
    }
    cached_ForeachEOS_56 = generateTestOutput(false, "ForeachEOS_56", "./test_code/Parser_ForeachEOS_failure.a");
    return cached_ForeachEOS_56;
  }

  @Test
  public void testForeachEOSFailure() {
    assertLiveFail(get_ForeachEOS_56());
  }

  @Test
  public void testForeachEOSNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_ForeachEOS_56());
  }

  @Test
  public void testForeachEOSExceptionFree() {
    assertExceptionFree(get_ForeachEOS_56());
  }

  @Test
  public void testForeachEOSTODOFree() {
    assertTODOFree(get_ForeachEOS_56());
  }

  @Test
  public void stable_ForeachEOS_56() {
    String live = get_ForeachEOS_56();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_ForeachEOS_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 1,");
    gold.append("\n      \"character\" : 10");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 1,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_ForeachEOS_failure.a' failed to parse: Parser was expecting `in`, but got an end of the stream instead. {Token: `x` @ (1,10) -> (1,11): Identifer} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting `in`, but got an end of the stream instead. {Token: `x` @ (1,10) -> (1,11): Identifer} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_ForeachNoInToken_57 = null;
  private String get_ForeachNoInToken_57() {
    if (cached_ForeachNoInToken_57 != null) {
      return cached_ForeachNoInToken_57;
    }
    cached_ForeachNoInToken_57 = generateTestOutput(false, "ForeachNoInToken_57", "./test_code/Parser_ForeachNoInToken_failure.a");
    return cached_ForeachNoInToken_57;
  }

  @Test
  public void testForeachNoInTokenFailure() {
    assertLiveFail(get_ForeachNoInToken_57());
  }

  @Test
  public void testForeachNoInTokenNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_ForeachNoInToken_57());
  }

  @Test
  public void testForeachNoInTokenExceptionFree() {
    assertExceptionFree(get_ForeachNoInToken_57());
  }

  @Test
  public void testForeachNoInTokenTODOFree() {
    assertTODOFree(get_ForeachNoInToken_57());
  }

  @Test
  public void stable_ForeachNoInToken_57() {
    String live = get_ForeachNoInToken_57();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_ForeachNoInToken_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 1,");
    gold.append("\n      \"character\" : 12");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 1,");
    gold.append("\n      \"character\" : 13");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_ForeachNoInToken_failure.a' failed to parse: Parser was expecting `in`, but got `:` instead. {Token: `:` @ (1,12) -> (1,13): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting `in`, but got `:` instead. {Token: `:` @ (1,12) -> (1,13): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_FunctionApply_58 = null;
  private String get_FunctionApply_58() {
    if (cached_FunctionApply_58 != null) {
      return cached_FunctionApply_58;
    }
    cached_FunctionApply_58 = generateTestOutput(true, "FunctionApply_58", "./test_code/Parser_FunctionApply_success.a");
    return cached_FunctionApply_58;
  }

  @Test
  public void testFunctionApplyEmission() {
    assertEmissionGood(get_FunctionApply_58());
  }

  @Test
  public void testFunctionApplySuccess() {
    assertLivePass(get_FunctionApply_58());
  }

  @Test
  public void testFunctionApplyGoodWillHappy() {
    assertGoodWillHappy(get_FunctionApply_58());
  }

  @Test
  public void testFunctionApplyExceptionFree() {
    assertExceptionFree(get_FunctionApply_58());
  }

  @Test
  public void testFunctionApplyTODOFree() {
    assertTODOFree(get_FunctionApply_58());
  }

  @Test
  public void stable_FunctionApply_58() {
    String live = get_FunctionApply_58();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_FunctionApply_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class FunctionApply_58 extends LivingDocument {");
    gold.append("\n  private final RxInt32 value;");
    gold.append("\n  public FunctionApply_58(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    value = new RxInt32(this, 0);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"value\":");
    gold.append("\n            value.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"value\");");
    gold.append("\n    value.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    value.__commit(\"value\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    value.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaFunctionApply_58 {");
    gold.append("\n    private DInt32 __dvalue;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaFunctionApply_58() {");
    gold.append("\n      __dvalue = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(FunctionApply_58 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      __dvalue.show(__item.value.get(), __obj.planField(\"value\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    FunctionApply_58 __self = this;");
    gold.append("\n    DeltaFunctionApply_58 __state = new DeltaFunctionApply_58();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private int __FUNC_0_square(int x) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return x * x;");
    gold.append("\n  }");
    gold.append("\n  private int __FUNC_1_miny(int a, int b) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return (a < b ? a : b);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    value.set(__FUNC_0_square(4) + __FUNC_1_miny(1, 2));");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\",\"value\":17} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{\"value\":17},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{\"value\":17},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":8,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"value\":17,\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":8,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"value\":17,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"value\":17,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_GlobalDefinePublicInt_59 = null;
  private String get_GlobalDefinePublicInt_59() {
    if (cached_GlobalDefinePublicInt_59 != null) {
      return cached_GlobalDefinePublicInt_59;
    }
    cached_GlobalDefinePublicInt_59 = generateTestOutput(true, "GlobalDefinePublicInt_59", "./test_code/Parser_GlobalDefinePublicInt_success.a");
    return cached_GlobalDefinePublicInt_59;
  }

  @Test
  public void testGlobalDefinePublicIntEmission() {
    assertEmissionGood(get_GlobalDefinePublicInt_59());
  }

  @Test
  public void testGlobalDefinePublicIntSuccess() {
    assertLivePass(get_GlobalDefinePublicInt_59());
  }

  @Test
  public void testGlobalDefinePublicIntGoodWillHappy() {
    assertGoodWillHappy(get_GlobalDefinePublicInt_59());
  }

  @Test
  public void testGlobalDefinePublicIntExceptionFree() {
    assertExceptionFree(get_GlobalDefinePublicInt_59());
  }

  @Test
  public void testGlobalDefinePublicIntTODOFree() {
    assertTODOFree(get_GlobalDefinePublicInt_59());
  }

  @Test
  public void stable_GlobalDefinePublicInt_59() {
    String live = get_GlobalDefinePublicInt_59();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_GlobalDefinePublicInt_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class GlobalDefinePublicInt_59 extends LivingDocument {");
    gold.append("\n  private final RxInt32 x;");
    gold.append("\n  private final RxInt32 y;");
    gold.append("\n  public GlobalDefinePublicInt_59(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    x = new RxInt32(this, 1);");
    gold.append("\n    y = new RxInt32(this, 0);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"x\":");
    gold.append("\n            x.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"y\":");
    gold.append("\n            y.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n    x.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"y\");");
    gold.append("\n    y.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n    y.__commit(\"y\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    x.__revert();");
    gold.append("\n    y.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaGlobalDefinePublicInt_59 {");
    gold.append("\n    private DInt32 __dx;");
    gold.append("\n    private DInt32 __dy;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaGlobalDefinePublicInt_59() {");
    gold.append("\n      __dx = new DInt32();");
    gold.append("\n      __dy = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(GlobalDefinePublicInt_59 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      __dx.show(__item.x.get(), __obj.planField(\"x\"));");
    gold.append("\n      __dy.show(__item.y.get(), __obj.planField(\"y\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    GlobalDefinePublicInt_59 __self = this;");
    gold.append("\n    DeltaGlobalDefinePublicInt_59 __state = new DeltaGlobalDefinePublicInt_59();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{\"x\":1,\"y\":0},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{\"x\":1,\"y\":0},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":4,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":4,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"x\":1,\"y\":0,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"x\":1,\"y\":0,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_GlobalDefineVariableHangingNoDefault_60 = null;
  private String get_GlobalDefineVariableHangingNoDefault_60() {
    if (cached_GlobalDefineVariableHangingNoDefault_60 != null) {
      return cached_GlobalDefineVariableHangingNoDefault_60;
    }
    cached_GlobalDefineVariableHangingNoDefault_60 = generateTestOutput(false, "GlobalDefineVariableHangingNoDefault_60", "./test_code/Parser_GlobalDefineVariableHangingNoDefault_failure.a");
    return cached_GlobalDefineVariableHangingNoDefault_60;
  }

  @Test
  public void testGlobalDefineVariableHangingNoDefaultFailure() {
    assertLiveFail(get_GlobalDefineVariableHangingNoDefault_60());
  }

  @Test
  public void testGlobalDefineVariableHangingNoDefaultNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_GlobalDefineVariableHangingNoDefault_60());
  }

  @Test
  public void testGlobalDefineVariableHangingNoDefaultExceptionFree() {
    assertExceptionFree(get_GlobalDefineVariableHangingNoDefault_60());
  }

  @Test
  public void testGlobalDefineVariableHangingNoDefaultTODOFree() {
    assertTODOFree(get_GlobalDefineVariableHangingNoDefault_60());
  }

  @Test
  public void stable_GlobalDefineVariableHangingNoDefault_60() {
    String live = get_GlobalDefineVariableHangingNoDefault_60();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_GlobalDefineVariableHangingNoDefault_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 13");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 14");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_GlobalDefineVariableHangingNoDefault_failure.a' failed to parse: Parser was expecting an atomic expression, but got end of stream instead. {Token: `=` @ (0,13) -> (0,14): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting an atomic expression, but got end of stream instead. {Token: `=` @ (0,13) -> (0,14): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_GlobalDefineVariableHangingNoSemicolon_61 = null;
  private String get_GlobalDefineVariableHangingNoSemicolon_61() {
    if (cached_GlobalDefineVariableHangingNoSemicolon_61 != null) {
      return cached_GlobalDefineVariableHangingNoSemicolon_61;
    }
    cached_GlobalDefineVariableHangingNoSemicolon_61 = generateTestOutput(false, "GlobalDefineVariableHangingNoSemicolon_61", "./test_code/Parser_GlobalDefineVariableHangingNoSemicolon_failure.a");
    return cached_GlobalDefineVariableHangingNoSemicolon_61;
  }

  @Test
  public void testGlobalDefineVariableHangingNoSemicolonFailure() {
    assertLiveFail(get_GlobalDefineVariableHangingNoSemicolon_61());
  }

  @Test
  public void testGlobalDefineVariableHangingNoSemicolonNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_GlobalDefineVariableHangingNoSemicolon_61());
  }

  @Test
  public void testGlobalDefineVariableHangingNoSemicolonExceptionFree() {
    assertExceptionFree(get_GlobalDefineVariableHangingNoSemicolon_61());
  }

  @Test
  public void testGlobalDefineVariableHangingNoSemicolonTODOFree() {
    assertTODOFree(get_GlobalDefineVariableHangingNoSemicolon_61());
  }

  @Test
  public void stable_GlobalDefineVariableHangingNoSemicolon_61() {
    String live = get_GlobalDefineVariableHangingNoSemicolon_61();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_GlobalDefineVariableHangingNoSemicolon_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 12");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_GlobalDefineVariableHangingNoSemicolon_failure.a' failed to parse: Parser was expecting a Symbol=`;`; instead, the parser got an end of stream. {Token: `x` @ (0,11) -> (0,12): Identifer} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting a Symbol=`;`; instead, the parser got an end of stream. {Token: `x` @ (0,11) -> (0,12): Identifer} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_GlobalDefineVariableNoName_62 = null;
  private String get_GlobalDefineVariableNoName_62() {
    if (cached_GlobalDefineVariableNoName_62 != null) {
      return cached_GlobalDefineVariableNoName_62;
    }
    cached_GlobalDefineVariableNoName_62 = generateTestOutput(false, "GlobalDefineVariableNoName_62", "./test_code/Parser_GlobalDefineVariableNoName_failure.a");
    return cached_GlobalDefineVariableNoName_62;
  }

  @Test
  public void testGlobalDefineVariableNoNameFailure() {
    assertLiveFail(get_GlobalDefineVariableNoName_62());
  }

  @Test
  public void testGlobalDefineVariableNoNameNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_GlobalDefineVariableNoName_62());
  }

  @Test
  public void testGlobalDefineVariableNoNameExceptionFree() {
    assertExceptionFree(get_GlobalDefineVariableNoName_62());
  }

  @Test
  public void testGlobalDefineVariableNoNameTODOFree() {
    assertTODOFree(get_GlobalDefineVariableNoName_62());
  }

  @Test
  public void stable_GlobalDefineVariableNoName_62() {
    String live = get_GlobalDefineVariableNoName_62();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_GlobalDefineVariableNoName_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 12");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_GlobalDefineVariableNoName_failure.a' failed to parse: Parser was expecting an identifier, but got a Symbol:; instead. {Token: `;` @ (0,11) -> (0,12): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting an identifier, but got a Symbol:; instead. {Token: `;` @ (0,11) -> (0,12): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_GlobalDefineVariablePolicyOnly_63 = null;
  private String get_GlobalDefineVariablePolicyOnly_63() {
    if (cached_GlobalDefineVariablePolicyOnly_63 != null) {
      return cached_GlobalDefineVariablePolicyOnly_63;
    }
    cached_GlobalDefineVariablePolicyOnly_63 = generateTestOutput(false, "GlobalDefineVariablePolicyOnly_63", "./test_code/Parser_GlobalDefineVariablePolicyOnly_failure.a");
    return cached_GlobalDefineVariablePolicyOnly_63;
  }

  @Test
  public void testGlobalDefineVariablePolicyOnlyFailure() {
    assertLiveFail(get_GlobalDefineVariablePolicyOnly_63());
  }

  @Test
  public void testGlobalDefineVariablePolicyOnlyNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_GlobalDefineVariablePolicyOnly_63());
  }

  @Test
  public void testGlobalDefineVariablePolicyOnlyExceptionFree() {
    assertExceptionFree(get_GlobalDefineVariablePolicyOnly_63());
  }

  @Test
  public void testGlobalDefineVariablePolicyOnlyTODOFree() {
    assertTODOFree(get_GlobalDefineVariablePolicyOnly_63());
  }

  @Test
  public void stable_GlobalDefineVariablePolicyOnly_63() {
    String live = get_GlobalDefineVariablePolicyOnly_63();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_GlobalDefineVariablePolicyOnly_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 6");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_GlobalDefineVariablePolicyOnly_failure.a' failed to parse: Parser was expecting a reactive type, but got an end of stream instead. {Token: `public` @ (0,0) -> (0,6): Identifer} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting a reactive type, but got an end of stream instead. {Token: `public` @ (0,0) -> (0,6): Identifer} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_If_64 = null;
  private String get_If_64() {
    if (cached_If_64 != null) {
      return cached_If_64;
    }
    cached_If_64 = generateTestOutput(true, "If_64", "./test_code/Parser_If_success.a");
    return cached_If_64;
  }

  @Test
  public void testIfEmission() {
    assertEmissionGood(get_If_64());
  }

  @Test
  public void testIfSuccess() {
    assertLivePass(get_If_64());
  }

  @Test
  public void testIfGoodWillHappy() {
    assertGoodWillHappy(get_If_64());
  }

  @Test
  public void testIfExceptionFree() {
    assertExceptionFree(get_If_64());
  }

  @Test
  public void testIfTODOFree() {
    assertTODOFree(get_If_64());
  }

  @Test
  public void stable_If_64() {
    String live = get_If_64();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_If_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class If_64 extends LivingDocument {");
    gold.append("\n  public If_64(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaIf_64 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaIf_64() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(If_64 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    If_64 __self = this;");
    gold.append("\n    DeltaIf_64 __state = new DeltaIf_64();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 5;");
    gold.append("\n    __track(0);");
    gold.append("\n    int x = 0;");
    gold.append("\n    __track(1);");
    gold.append("\n    if (true) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(2);");
    gold.append("\n      x = 1;");
    gold.append("\n    } else {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(3);");
    gold.append("\n      x = 2;");
    gold.append("\n    }");
    gold.append("\n    __track(4);");
    gold.append("\n    int y = 1;");
    gold.append("\n    __track(5);");
    gold.append("\n    if (x < 1) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(6);");
    gold.append("\n      y++;");
    gold.append("\n    } else if (x < 5) {");
    gold.append("\n      __code_cost += 3;");
    gold.append("\n      __track(7);");
    gold.append("\n      y++;");
    gold.append("\n      __track(8);");
    gold.append("\n      y++;");
    gold.append("\n    } else {");
    gold.append("\n      __code_cost += 5;");
    gold.append("\n      __track(9);");
    gold.append("\n      y++;");
    gold.append("\n      __track(10);");
    gold.append("\n      y++;");
    gold.append("\n      __track(11);");
    gold.append("\n      y++;");
    gold.append("\n      __track(12);");
    gold.append("\n      y++;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":10,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":10,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_ImportDoc_65 = null;
  private String get_ImportDoc_65() {
    if (cached_ImportDoc_65 != null) {
      return cached_ImportDoc_65;
    }
    cached_ImportDoc_65 = generateTestOutput(true, "ImportDoc_65", "./test_code/Parser_ImportDoc_success.a");
    return cached_ImportDoc_65;
  }

  @Test
  public void testImportDocEmission() {
    assertEmissionGood(get_ImportDoc_65());
  }

  @Test
  public void testImportDocSuccess() {
    assertLivePass(get_ImportDoc_65());
  }

  @Test
  public void testImportDocGoodWillHappy() {
    assertGoodWillHappy(get_ImportDoc_65());
  }

  @Test
  public void testImportDocExceptionFree() {
    assertExceptionFree(get_ImportDoc_65());
  }

  @Test
  public void testImportDocTODOFree() {
    assertTODOFree(get_ImportDoc_65());
  }

  @Test
  public void stable_ImportDoc_65() {
    String live = get_ImportDoc_65();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_ImportDoc_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class ImportDoc_65 extends LivingDocument {");
    gold.append("\n  public ImportDoc_65(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaImportDoc_65 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaImportDoc_65() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(ImportDoc_65 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    ImportDoc_65 __self = this;");
    gold.append("\n    DeltaImportDoc_65 __state = new DeltaImportDoc_65();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 5;");
    gold.append("\n    __track(0);");
    gold.append("\n    int x = 0;");
    gold.append("\n    __track(1);");
    gold.append("\n    if (true) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(2);");
    gold.append("\n      x = 1;");
    gold.append("\n    } else {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(3);");
    gold.append("\n      x = 2;");
    gold.append("\n    }");
    gold.append("\n    __track(4);");
    gold.append("\n    int y = 1;");
    gold.append("\n    __track(5);");
    gold.append("\n    if (x < 1) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(6);");
    gold.append("\n      y++;");
    gold.append("\n    } else if (x < 5) {");
    gold.append("\n      __code_cost += 3;");
    gold.append("\n      __track(7);");
    gold.append("\n      y++;");
    gold.append("\n      __track(8);");
    gold.append("\n      y++;");
    gold.append("\n    } else {");
    gold.append("\n      __code_cost += 5;");
    gold.append("\n      __track(9);");
    gold.append("\n      y++;");
    gold.append("\n      __track(10);");
    gold.append("\n      y++;");
    gold.append("\n      __track(11);");
    gold.append("\n      y++;");
    gold.append("\n      __track(12);");
    gold.append("\n      y++;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":10,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":10,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_ImportFailureEOS_66 = null;
  private String get_ImportFailureEOS_66() {
    if (cached_ImportFailureEOS_66 != null) {
      return cached_ImportFailureEOS_66;
    }
    cached_ImportFailureEOS_66 = generateTestOutput(false, "ImportFailureEOS_66", "./test_code/Parser_ImportFailureEOS_failure.a");
    return cached_ImportFailureEOS_66;
  }

  @Test
  public void testImportFailureEOSFailure() {
    assertLiveFail(get_ImportFailureEOS_66());
  }

  @Test
  public void testImportFailureEOSNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_ImportFailureEOS_66());
  }

  @Test
  public void testImportFailureEOSExceptionFree() {
    assertExceptionFree(get_ImportFailureEOS_66());
  }

  @Test
  public void testImportFailureEOSTODOFree() {
    assertTODOFree(get_ImportFailureEOS_66());
  }

  @Test
  public void stable_ImportFailureEOS_66() {
    String live = get_ImportFailureEOS_66();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_ImportFailureEOS_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 6");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_ImportFailureEOS_failure.a' failed to parse: Parser tried to read a string literal, but got end of stream {Token: `import` @ (0,0) -> (0,6): Identifer} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser tried to read a string literal, but got end of stream {Token: `import` @ (0,0) -> (0,6): Identifer} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_ImportFailureInvalid_67 = null;
  private String get_ImportFailureInvalid_67() {
    if (cached_ImportFailureInvalid_67 != null) {
      return cached_ImportFailureInvalid_67;
    }
    cached_ImportFailureInvalid_67 = generateTestOutput(false, "ImportFailureInvalid_67", "./test_code/Parser_ImportFailureInvalid_failure.a");
    return cached_ImportFailureInvalid_67;
  }

  @Test
  public void testImportFailureInvalidFailure() {
    assertLiveFail(get_ImportFailureInvalid_67());
  }

  @Test
  public void testImportFailureInvalidNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_ImportFailureInvalid_67());
  }

  @Test
  public void testImportFailureInvalidExceptionFree() {
    assertExceptionFree(get_ImportFailureInvalid_67());
  }

  @Test
  public void testImportFailureInvalidTODOFree() {
    assertTODOFree(get_ImportFailureInvalid_67());
  }

  @Test
  public void stable_ImportFailureInvalid_67() {
    String live = get_ImportFailureInvalid_67();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_ImportFailureInvalid_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 7");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_ImportFailureInvalid_failure.a' failed to parse: Parser tried to read a string literal, but got a Identifer instead {Token: `Nope` @ (0,7) -> (0,11): Identifer} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser tried to read a string literal, but got a Identifer instead {Token: `Nope` @ (0,7) -> (0,11): Identifer} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_IndexDeref_68 = null;
  private String get_IndexDeref_68() {
    if (cached_IndexDeref_68 != null) {
      return cached_IndexDeref_68;
    }
    cached_IndexDeref_68 = generateTestOutput(true, "IndexDeref_68", "./test_code/Parser_IndexDeref_success.a");
    return cached_IndexDeref_68;
  }

  @Test
  public void testIndexDerefEmission() {
    assertEmissionGood(get_IndexDeref_68());
  }

  @Test
  public void testIndexDerefSuccess() {
    assertLivePass(get_IndexDeref_68());
  }

  @Test
  public void testIndexDerefGoodWillHappy() {
    assertGoodWillHappy(get_IndexDeref_68());
  }

  @Test
  public void testIndexDerefExceptionFree() {
    assertExceptionFree(get_IndexDeref_68());
  }

  @Test
  public void testIndexDerefTODOFree() {
    assertTODOFree(get_IndexDeref_68());
  }

  @Test
  public void stable_IndexDeref_68() {
    String live = get_IndexDeref_68();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_IndexDeref_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class IndexDeref_68 extends LivingDocument {");
    gold.append("\n  private final RxInt32 result;");
    gold.append("\n  public IndexDeref_68(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    result = new RxInt32(this, 0);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"result\":");
    gold.append("\n            result.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"result\");");
    gold.append("\n    result.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    result.__commit(\"result\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    result.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaIndexDeref_68 {");
    gold.append("\n    private DInt32 __dresult;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaIndexDeref_68() {");
    gold.append("\n      __dresult = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(IndexDeref_68 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      __dresult.show(__item.result.get(), __obj.planField(\"result\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    IndexDeref_68 __self = this;");
    gold.append("\n    DeltaIndexDeref_68 __state = new DeltaIndexDeref_68();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static class RTxM implements NtMessageBase {");
    gold.append("\n    private int x = 0;");
    gold.append("\n    private RTxM(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              this.x = __reader.readInteger();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      __writer.writeInteger(x);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxM() {}");
    gold.append("\n    private RTxM(int x) {");
    gold.append("\n      this.x = x;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxM {");
    gold.append("\n    private DInt32 __dx;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxM() {");
    gold.append("\n      __dx = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxM __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __dx.show(__item.x, __obj.planField(\"x\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 4;");
    gold.append("\n    __track(0);");
    gold.append("\n    RTxM[] m = new RTxM[] {new RTxM(123), new RTxM(42)};");
    gold.append("\n    __track(1);");
    gold.append("\n    NtMaybe<RTxM> _AutoConditionmm_2;");
    gold.append("\n    if ((_AutoConditionmm_2 = Utility.lookup(m, 0)).has()) {");
    gold.append("\n      RTxM mm = _AutoConditionmm_2.get();");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(2);");
    gold.append("\n      result.set(mm.x);");
    gold.append("\n    }");
    gold.append("\n    __track(3);");
    gold.append("\n    NtMaybe<RTxM> _AutoConditionmm_3;");
    gold.append("\n    if ((_AutoConditionmm_3 = Utility.lookup(m, 42)).has()) {");
    gold.append("\n      RTxM mm = _AutoConditionmm_3.get();");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(4);");
    gold.append("\n      result.set(mm.x);");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\",\"result\":123} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{\"result\":123},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{\"result\":123},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":8,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"result\":123,\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":8,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"result\":123,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"result\":123,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_InvalidCharacterFast_69 = null;
  private String get_InvalidCharacterFast_69() {
    if (cached_InvalidCharacterFast_69 != null) {
      return cached_InvalidCharacterFast_69;
    }
    cached_InvalidCharacterFast_69 = generateTestOutput(false, "InvalidCharacterFast_69", "./test_code/Parser_InvalidCharacterFast_failure.a");
    return cached_InvalidCharacterFast_69;
  }

  @Test
  public void testInvalidCharacterFastFailure() {
    assertLiveFail(get_InvalidCharacterFast_69());
  }

  @Test
  public void testInvalidCharacterFastNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_InvalidCharacterFast_69());
  }

  @Test
  public void testInvalidCharacterFastExceptionFree() {
    assertExceptionFree(get_InvalidCharacterFast_69());
  }

  @Test
  public void testInvalidCharacterFastTODOFree() {
    assertTODOFree(get_InvalidCharacterFast_69());
  }

  @Test
  public void stable_InvalidCharacterFast_69() {
    String live = get_InvalidCharacterFast_69();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_InvalidCharacterFast_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_InvalidCharacterFast_failure.a' failed to lex: Failed to understand codepoint:96('`') (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Lex): Failed to understand codepoint:96('`') (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_InvalidCharacterSlow_70 = null;
  private String get_InvalidCharacterSlow_70() {
    if (cached_InvalidCharacterSlow_70 != null) {
      return cached_InvalidCharacterSlow_70;
    }
    cached_InvalidCharacterSlow_70 = generateTestOutput(false, "InvalidCharacterSlow_70", "./test_code/Parser_InvalidCharacterSlow_failure.a");
    return cached_InvalidCharacterSlow_70;
  }

  @Test
  public void testInvalidCharacterSlowFailure() {
    assertLiveFail(get_InvalidCharacterSlow_70());
  }

  @Test
  public void testInvalidCharacterSlowNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_InvalidCharacterSlow_70());
  }

  @Test
  public void testInvalidCharacterSlowExceptionFree() {
    assertExceptionFree(get_InvalidCharacterSlow_70());
  }

  @Test
  public void testInvalidCharacterSlowTODOFree() {
    assertTODOFree(get_InvalidCharacterSlow_70());
  }

  @Test
  public void stable_InvalidCharacterSlow_70() {
    String live = get_InvalidCharacterSlow_70();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_InvalidCharacterSlow_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_InvalidCharacterSlow_failure.a' failed to lex: Codepoint fell outside of valid range:29503('猿') is outside of [0, 256) (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Lex): Codepoint fell outside of valid range:29503('猿') is outside of [0, 256) (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_InvalidLong_71 = null;
  private String get_InvalidLong_71() {
    if (cached_InvalidLong_71 != null) {
      return cached_InvalidLong_71;
    }
    cached_InvalidLong_71 = generateTestOutput(false, "InvalidLong_71", "./test_code/Parser_InvalidLong_failure.a");
    return cached_InvalidLong_71;
  }

  @Test
  public void testInvalidLongFailure() {
    assertLiveFail(get_InvalidLong_71());
  }

  @Test
  public void testInvalidLongNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_InvalidLong_71());
  }

  @Test
  public void testInvalidLongExceptionFree() {
    assertExceptionFree(get_InvalidLong_71());
  }

  @Test
  public void testInvalidLongTODOFree() {
    assertTODOFree(get_InvalidLong_71());
  }

  @Test
  public void stable_InvalidLong_71() {
    String live = get_InvalidLong_71();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_InvalidLong_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 1,");
    gold.append("\n      \"character\" : 11");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 1,");
    gold.append("\n      \"character\" : 19");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_InvalidLong_failure.a' failed to parse: Parser was expecting a valid integral sequence, but got a '123x01xL' instead. {Token: `123x01xL` @ (1,11) -> (1,19): NumberLiteral:NumberIsInteger} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting a valid integral sequence, but got a '123x01xL' instead. {Token: `123x01xL` @ (1,11) -> (1,19): NumberLiteral:NumberIsInteger} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_InvalidMultiPolicyRecord_72 = null;
  private String get_InvalidMultiPolicyRecord_72() {
    if (cached_InvalidMultiPolicyRecord_72 != null) {
      return cached_InvalidMultiPolicyRecord_72;
    }
    cached_InvalidMultiPolicyRecord_72 = generateTestOutput(false, "InvalidMultiPolicyRecord_72", "./test_code/Parser_InvalidMultiPolicyRecord_failure.a");
    return cached_InvalidMultiPolicyRecord_72;
  }

  @Test
  public void testInvalidMultiPolicyRecordFailure() {
    assertLiveFail(get_InvalidMultiPolicyRecord_72());
  }

  @Test
  public void testInvalidMultiPolicyRecordNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_InvalidMultiPolicyRecord_72());
  }

  @Test
  public void testInvalidMultiPolicyRecordExceptionFree() {
    assertExceptionFree(get_InvalidMultiPolicyRecord_72());
  }

  @Test
  public void testInvalidMultiPolicyRecordTODOFree() {
    assertTODOFree(get_InvalidMultiPolicyRecord_72());
  }

  @Test
  public void stable_InvalidMultiPolicyRecord_72() {
    String live = get_InvalidMultiPolicyRecord_72();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_InvalidMultiPolicyRecord_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 6,");
    gold.append("\n      \"character\" : 19");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 6,");
    gold.append("\n      \"character\" : 20");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_InvalidMultiPolicyRecord_failure.a' failed to parse: Parser was expecting one of the following symbols:,, >; instead, the parse got Symbol:+. {Token: `+` @ (6,19) -> (6,20): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting one of the following symbols:,, >; instead, the parse got Symbol:+. {Token: `+` @ (6,19) -> (6,20): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_JustComments_73 = null;
  private String get_JustComments_73() {
    if (cached_JustComments_73 != null) {
      return cached_JustComments_73;
    }
    cached_JustComments_73 = generateTestOutput(true, "JustComments_73", "./test_code/Parser_JustComments_success.a");
    return cached_JustComments_73;
  }

  @Test
  public void testJustCommentsEmission() {
    assertEmissionGood(get_JustComments_73());
  }

  @Test
  public void testJustCommentsSuccess() {
    assertLivePass(get_JustComments_73());
  }

  @Test
  public void testJustCommentsGoodWillHappy() {
    assertGoodWillHappy(get_JustComments_73());
  }

  @Test
  public void testJustCommentsExceptionFree() {
    assertExceptionFree(get_JustComments_73());
  }

  @Test
  public void testJustCommentsTODOFree() {
    assertTODOFree(get_JustComments_73());
  }

  @Test
  public void stable_JustComments_73() {
    String live = get_JustComments_73();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_JustComments_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class JustComments_73 extends LivingDocument {");
    gold.append("\n  public JustComments_73(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaJustComments_73 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaJustComments_73() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(JustComments_73 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    JustComments_73 __self = this;");
    gold.append("\n    DeltaJustComments_73 __state = new DeltaJustComments_73();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_Linq_74 = null;
  private String get_Linq_74() {
    if (cached_Linq_74 != null) {
      return cached_Linq_74;
    }
    cached_Linq_74 = generateTestOutput(true, "Linq_74", "./test_code/Parser_Linq_success.a");
    return cached_Linq_74;
  }

  @Test
  public void testLinqEmission() {
    assertEmissionGood(get_Linq_74());
  }

  @Test
  public void testLinqSuccess() {
    assertLivePass(get_Linq_74());
  }

  @Test
  public void testLinqGoodWillHappy() {
    assertGoodWillHappy(get_Linq_74());
  }

  @Test
  public void testLinqExceptionFree() {
    assertExceptionFree(get_Linq_74());
  }

  @Test
  public void testLinqTODOFree() {
    assertTODOFree(get_Linq_74());
  }

  @Test
  public void stable_Linq_74() {
    String live = get_Linq_74();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_Linq_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class Linq_74 extends LivingDocument {");
    gold.append("\n  private final RxTable<RTxX> x;");
    gold.append("\n  private final RxLazy<NtList<RTxX>> where1;");
    gold.append("\n  private final RxLazy<NtList<RTxX>> where_as1;");
    gold.append("\n  private final RxLazy<NtList<RTxX>> order1;");
    gold.append("\n  private final RxLazy<NtList<RTxX>> order2;");
    gold.append("\n  private final RxLazy<NtList<RTxX>> order3;");
    gold.append("\n  private final RxLazy<NtList<RTxX>> order4;");
    gold.append("\n  private final RxLazy<NtList<RTxX>> order5;");
    gold.append("\n  private final RxLazy<NtList<RTxX>> shuffle1;");
    gold.append("\n  private final RxLazy<NtList<RTxX>> limit1;");
    gold.append("\n  private final RxLazy<NtList<RTxX>> limit2;");
    gold.append("\n  public Linq_74(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    x = new RxTable<>(__self, this, \"x\", (RxParent __parent) -> new RTxX(__parent), 0);");
    gold.append("\n    where1 = new RxLazy<NtList<RTxX>>(this, () -> (x.iterate(false).where(true, new __CLOSURE_WhereClause0())));");
    gold.append("\n    x.__subscribe(where1);");
    gold.append("\n    where_as1 = new RxLazy<NtList<RTxX>>(this, () -> (x.iterate(false).where(true, new __CLOSURE_WhereClause1())));");
    gold.append("\n    x.__subscribe(where_as1);");
    gold.append("\n    order1 = new RxLazy<NtList<RTxX>>(this, () -> (x.iterate(false).orderBy(true, __ORDER_X_id_a)));");
    gold.append("\n    x.__subscribe(order1);");
    gold.append("\n    order2 = new RxLazy<NtList<RTxX>>(this, () -> (x.iterate(false).orderBy(true, __ORDER_X_id_d)));");
    gold.append("\n    x.__subscribe(order2);");
    gold.append("\n    order3 = new RxLazy<NtList<RTxX>>(this, () -> (x.iterate(false).orderBy(true, __ORDER_X_id_a)));");
    gold.append("\n    x.__subscribe(order3);");
    gold.append("\n    order4 = new RxLazy<NtList<RTxX>>(this, () -> (x.iterate(false).orderBy(true, __ORDER_X_by_a)));");
    gold.append("\n    x.__subscribe(order4);");
    gold.append("\n    order5 = new RxLazy<NtList<RTxX>>(this, () -> (x.iterate(false).orderBy(true, __ORDER_X_by_a_id_d)));");
    gold.append("\n    x.__subscribe(order5);");
    gold.append("\n    shuffle1 = new RxLazy<NtList<RTxX>>(this, () -> (x.iterate(false).shuffle(true, __random)));");
    gold.append("\n    x.__subscribe(shuffle1);");
    gold.append("\n    limit1 = new RxLazy<NtList<RTxX>>(this, () -> (x.iterate(false).skipAndLimit(true, 0, 1)));");
    gold.append("\n    x.__subscribe(limit1);");
    gold.append("\n    limit2 = new RxLazy<NtList<RTxX>>(this, () -> (x.iterate(false).skipAndLimit(true, 2, 1)));");
    gold.append("\n    x.__subscribe(limit2);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"x\":");
    gold.append("\n            x.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n    x.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    x.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaLinq_74 {");
    gold.append("\n    private int __gwhere1;");
    gold.append("\n    private DRecordList<DeltaRTxX> __dwhere1;");
    gold.append("\n    private int __gwhere_as1;");
    gold.append("\n    private DRecordList<DeltaRTxX> __dwhere_as1;");
    gold.append("\n    private int __gorder1;");
    gold.append("\n    private DRecordList<DeltaRTxX> __dorder1;");
    gold.append("\n    private int __gorder2;");
    gold.append("\n    private DRecordList<DeltaRTxX> __dorder2;");
    gold.append("\n    private int __gorder3;");
    gold.append("\n    private DRecordList<DeltaRTxX> __dorder3;");
    gold.append("\n    private int __gorder4;");
    gold.append("\n    private DRecordList<DeltaRTxX> __dorder4;");
    gold.append("\n    private int __gorder5;");
    gold.append("\n    private DRecordList<DeltaRTxX> __dorder5;");
    gold.append("\n    private int __gshuffle1;");
    gold.append("\n    private DRecordList<DeltaRTxX> __dshuffle1;");
    gold.append("\n    private int __glimit1;");
    gold.append("\n    private DRecordList<DeltaRTxX> __dlimit1;");
    gold.append("\n    private int __glimit2;");
    gold.append("\n    private DRecordList<DeltaRTxX> __dlimit2;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaLinq_74() {");
    gold.append("\n      __gwhere1 = -1;");
    gold.append("\n      __dwhere1 = new DRecordList<DeltaRTxX>();");
    gold.append("\n      __gwhere_as1 = -1;");
    gold.append("\n      __dwhere_as1 = new DRecordList<DeltaRTxX>();");
    gold.append("\n      __gorder1 = -1;");
    gold.append("\n      __dorder1 = new DRecordList<DeltaRTxX>();");
    gold.append("\n      __gorder2 = -1;");
    gold.append("\n      __dorder2 = new DRecordList<DeltaRTxX>();");
    gold.append("\n      __gorder3 = -1;");
    gold.append("\n      __dorder3 = new DRecordList<DeltaRTxX>();");
    gold.append("\n      __gorder4 = -1;");
    gold.append("\n      __dorder4 = new DRecordList<DeltaRTxX>();");
    gold.append("\n      __gorder5 = -1;");
    gold.append("\n      __dorder5 = new DRecordList<DeltaRTxX>();");
    gold.append("\n      __gshuffle1 = -1;");
    gold.append("\n      __dshuffle1 = new DRecordList<DeltaRTxX>();");
    gold.append("\n      __glimit1 = -1;");
    gold.append("\n      __dlimit1 = new DRecordList<DeltaRTxX>();");
    gold.append("\n      __glimit2 = -1;");
    gold.append("\n      __dlimit2 = new DRecordList<DeltaRTxX>();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(Linq_74 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 10;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__gwhere1 != __item.where1.getGeneration()) {");
    gold.append("\n        {");
    gold.append("\n          PrivateLazyDeltaWriter __list5 = __obj.planField(\"where1\").planObject();");
    gold.append("\n          DRecordList<DeltaRTxX> __deltaList6 = __dwhere1;");
    gold.append("\n          DRecordList<DeltaRTxX>.Walk __deltaListWalker7 = __deltaList6.begin();");
    gold.append("\n          for (RTxX __listElement8 : __item.where1.get()) {");
    gold.append("\n            DeltaRTxX __deltaElement9 = __deltaList6.getPrior(__listElement8.__id(), () -> new DeltaRTxX());");
    gold.append("\n            __deltaElement9.show(__listElement8, __list5.planField(__listElement8.__id()));");
    gold.append("\n            __deltaListWalker7.next(__listElement8.__id());");
    gold.append("\n          }");
    gold.append("\n          __deltaListWalker7.end(__list5);");
    gold.append("\n          __list5.end();");
    gold.append("\n        }");
    gold.append("\n        __gwhere1 = __item.where1.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__gwhere_as1 != __item.where_as1.getGeneration()) {");
    gold.append("\n        {");
    gold.append("\n          PrivateLazyDeltaWriter __list10 = __obj.planField(\"where_as1\").planObject();");
    gold.append("\n          DRecordList<DeltaRTxX> __deltaList11 = __dwhere_as1;");
    gold.append("\n          DRecordList<DeltaRTxX>.Walk __deltaListWalker12 = __deltaList11.begin();");
    gold.append("\n          for (RTxX __listElement13 : __item.where_as1.get()) {");
    gold.append("\n            DeltaRTxX __deltaElement14 = __deltaList11.getPrior(__listElement13.__id(), () -> new DeltaRTxX());");
    gold.append("\n            __deltaElement14.show(__listElement13, __list10.planField(__listElement13.__id()));");
    gold.append("\n            __deltaListWalker12.next(__listElement13.__id());");
    gold.append("\n          }");
    gold.append("\n          __deltaListWalker12.end(__list10);");
    gold.append("\n          __list10.end();");
    gold.append("\n        }");
    gold.append("\n        __gwhere_as1 = __item.where_as1.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__gorder1 != __item.order1.getGeneration()) {");
    gold.append("\n        {");
    gold.append("\n          PrivateLazyDeltaWriter __list15 = __obj.planField(\"order1\").planObject();");
    gold.append("\n          DRecordList<DeltaRTxX> __deltaList16 = __dorder1;");
    gold.append("\n          DRecordList<DeltaRTxX>.Walk __deltaListWalker17 = __deltaList16.begin();");
    gold.append("\n          for (RTxX __listElement18 : __item.order1.get()) {");
    gold.append("\n            DeltaRTxX __deltaElement19 = __deltaList16.getPrior(__listElement18.__id(), () -> new DeltaRTxX());");
    gold.append("\n            __deltaElement19.show(__listElement18, __list15.planField(__listElement18.__id()));");
    gold.append("\n            __deltaListWalker17.next(__listElement18.__id());");
    gold.append("\n          }");
    gold.append("\n          __deltaListWalker17.end(__list15);");
    gold.append("\n          __list15.end();");
    gold.append("\n        }");
    gold.append("\n        __gorder1 = __item.order1.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__gorder2 != __item.order2.getGeneration()) {");
    gold.append("\n        {");
    gold.append("\n          PrivateLazyDeltaWriter __list20 = __obj.planField(\"order2\").planObject();");
    gold.append("\n          DRecordList<DeltaRTxX> __deltaList21 = __dorder2;");
    gold.append("\n          DRecordList<DeltaRTxX>.Walk __deltaListWalker22 = __deltaList21.begin();");
    gold.append("\n          for (RTxX __listElement23 : __item.order2.get()) {");
    gold.append("\n            DeltaRTxX __deltaElement24 = __deltaList21.getPrior(__listElement23.__id(), () -> new DeltaRTxX());");
    gold.append("\n            __deltaElement24.show(__listElement23, __list20.planField(__listElement23.__id()));");
    gold.append("\n            __deltaListWalker22.next(__listElement23.__id());");
    gold.append("\n          }");
    gold.append("\n          __deltaListWalker22.end(__list20);");
    gold.append("\n          __list20.end();");
    gold.append("\n        }");
    gold.append("\n        __gorder2 = __item.order2.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__gorder3 != __item.order3.getGeneration()) {");
    gold.append("\n        {");
    gold.append("\n          PrivateLazyDeltaWriter __list25 = __obj.planField(\"order3\").planObject();");
    gold.append("\n          DRecordList<DeltaRTxX> __deltaList26 = __dorder3;");
    gold.append("\n          DRecordList<DeltaRTxX>.Walk __deltaListWalker27 = __deltaList26.begin();");
    gold.append("\n          for (RTxX __listElement28 : __item.order3.get()) {");
    gold.append("\n            DeltaRTxX __deltaElement29 = __deltaList26.getPrior(__listElement28.__id(), () -> new DeltaRTxX());");
    gold.append("\n            __deltaElement29.show(__listElement28, __list25.planField(__listElement28.__id()));");
    gold.append("\n            __deltaListWalker27.next(__listElement28.__id());");
    gold.append("\n          }");
    gold.append("\n          __deltaListWalker27.end(__list25);");
    gold.append("\n          __list25.end();");
    gold.append("\n        }");
    gold.append("\n        __gorder3 = __item.order3.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__gorder4 != __item.order4.getGeneration()) {");
    gold.append("\n        {");
    gold.append("\n          PrivateLazyDeltaWriter __list30 = __obj.planField(\"order4\").planObject();");
    gold.append("\n          DRecordList<DeltaRTxX> __deltaList31 = __dorder4;");
    gold.append("\n          DRecordList<DeltaRTxX>.Walk __deltaListWalker32 = __deltaList31.begin();");
    gold.append("\n          for (RTxX __listElement33 : __item.order4.get()) {");
    gold.append("\n            DeltaRTxX __deltaElement34 = __deltaList31.getPrior(__listElement33.__id(), () -> new DeltaRTxX());");
    gold.append("\n            __deltaElement34.show(__listElement33, __list30.planField(__listElement33.__id()));");
    gold.append("\n            __deltaListWalker32.next(__listElement33.__id());");
    gold.append("\n          }");
    gold.append("\n          __deltaListWalker32.end(__list30);");
    gold.append("\n          __list30.end();");
    gold.append("\n        }");
    gold.append("\n        __gorder4 = __item.order4.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__gorder5 != __item.order5.getGeneration()) {");
    gold.append("\n        {");
    gold.append("\n          PrivateLazyDeltaWriter __list35 = __obj.planField(\"order5\").planObject();");
    gold.append("\n          DRecordList<DeltaRTxX> __deltaList36 = __dorder5;");
    gold.append("\n          DRecordList<DeltaRTxX>.Walk __deltaListWalker37 = __deltaList36.begin();");
    gold.append("\n          for (RTxX __listElement38 : __item.order5.get()) {");
    gold.append("\n            DeltaRTxX __deltaElement39 = __deltaList36.getPrior(__listElement38.__id(), () -> new DeltaRTxX());");
    gold.append("\n            __deltaElement39.show(__listElement38, __list35.planField(__listElement38.__id()));");
    gold.append("\n            __deltaListWalker37.next(__listElement38.__id());");
    gold.append("\n          }");
    gold.append("\n          __deltaListWalker37.end(__list35);");
    gold.append("\n          __list35.end();");
    gold.append("\n        }");
    gold.append("\n        __gorder5 = __item.order5.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__gshuffle1 != __item.shuffle1.getGeneration()) {");
    gold.append("\n        {");
    gold.append("\n          PrivateLazyDeltaWriter __list40 = __obj.planField(\"shuffle1\").planObject();");
    gold.append("\n          DRecordList<DeltaRTxX> __deltaList41 = __dshuffle1;");
    gold.append("\n          DRecordList<DeltaRTxX>.Walk __deltaListWalker42 = __deltaList41.begin();");
    gold.append("\n          for (RTxX __listElement43 : __item.shuffle1.get()) {");
    gold.append("\n            DeltaRTxX __deltaElement44 = __deltaList41.getPrior(__listElement43.__id(), () -> new DeltaRTxX());");
    gold.append("\n            __deltaElement44.show(__listElement43, __list40.planField(__listElement43.__id()));");
    gold.append("\n            __deltaListWalker42.next(__listElement43.__id());");
    gold.append("\n          }");
    gold.append("\n          __deltaListWalker42.end(__list40);");
    gold.append("\n          __list40.end();");
    gold.append("\n        }");
    gold.append("\n        __gshuffle1 = __item.shuffle1.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__glimit1 != __item.limit1.getGeneration()) {");
    gold.append("\n        {");
    gold.append("\n          PrivateLazyDeltaWriter __list45 = __obj.planField(\"limit1\").planObject();");
    gold.append("\n          DRecordList<DeltaRTxX> __deltaList46 = __dlimit1;");
    gold.append("\n          DRecordList<DeltaRTxX>.Walk __deltaListWalker47 = __deltaList46.begin();");
    gold.append("\n          for (RTxX __listElement48 : __item.limit1.get()) {");
    gold.append("\n            DeltaRTxX __deltaElement49 = __deltaList46.getPrior(__listElement48.__id(), () -> new DeltaRTxX());");
    gold.append("\n            __deltaElement49.show(__listElement48, __list45.planField(__listElement48.__id()));");
    gold.append("\n            __deltaListWalker47.next(__listElement48.__id());");
    gold.append("\n          }");
    gold.append("\n          __deltaListWalker47.end(__list45);");
    gold.append("\n          __list45.end();");
    gold.append("\n        }");
    gold.append("\n        __glimit1 = __item.limit1.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__glimit2 != __item.limit2.getGeneration()) {");
    gold.append("\n        {");
    gold.append("\n          PrivateLazyDeltaWriter __list50 = __obj.planField(\"limit2\").planObject();");
    gold.append("\n          DRecordList<DeltaRTxX> __deltaList51 = __dlimit2;");
    gold.append("\n          DRecordList<DeltaRTxX>.Walk __deltaListWalker52 = __deltaList51.begin();");
    gold.append("\n          for (RTxX __listElement53 : __item.limit2.get()) {");
    gold.append("\n            DeltaRTxX __deltaElement54 = __deltaList51.getPrior(__listElement53.__id(), () -> new DeltaRTxX());");
    gold.append("\n            __deltaElement54.show(__listElement53, __list50.planField(__listElement53.__id()));");
    gold.append("\n            __deltaListWalker52.next(__listElement53.__id());");
    gold.append("\n          }");
    gold.append("\n          __deltaListWalker52.end(__list50);");
    gold.append("\n          __list50.end();");
    gold.append("\n        }");
    gold.append("\n        __glimit2 = __item.limit2.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    Linq_74 __self = this;");
    gold.append("\n    DeltaLinq_74 __state = new DeltaLinq_74();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private class RTxX extends RxRecordBase<RTxX> {");
    gold.append("\n    private final RxInt32 id;");
    gold.append("\n    private final RxString name;");
    gold.append("\n    private final RxInt32 by;");
    gold.append("\n    private RTxX(RxParent __owner) {");
    gold.append("\n      super(__owner);");
    gold.append("\n      id = new RxInt32(this, 0);");
    gold.append("\n      name = new RxString(this, \"\");");
    gold.append("\n      by = new RxInt32(this, 0);");
    gold.append("\n      if (__owner instanceof RxTable) {");
    gold.append("\n        /* ok */");
    gold.append("\n      } else {");
    gold.append("\n        /* ok */");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    String[] __INDEX_COLUMNS = new String[] {\"by\"};");
    gold.append("\n    @Override");
    gold.append("\n    public String[] __getIndexColumns() {");
    gold.append("\n      return __INDEX_COLUMNS;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int[] __getIndexValues() {");
    gold.append("\n      return new int[] {by.getIndexValue()};");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __insert(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while(__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"id\":");
    gold.append("\n              id.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"name\":");
    gold.append("\n              name.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"by\":");
    gold.append("\n              by.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"id\");");
    gold.append("\n      id.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"name\");");
    gold.append("\n      name.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"by\");");
    gold.append("\n      by.__dump(__writer);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __forward.writeObjectFieldIntro(__name);");
    gold.append("\n        __forward.beginObject();");
    gold.append("\n        __reverse.writeObjectFieldIntro(__name);");
    gold.append("\n        __reverse.beginObject();");
    gold.append("\n        id.__commit(\"id\", __forward, __reverse);");
    gold.append("\n        name.__commit(\"name\", __forward, __reverse);");
    gold.append("\n        by.__commit(\"by\", __forward, __reverse);");
    gold.append("\n        __forward.endObject();");
    gold.append("\n        __reverse.endObject();");
    gold.append("\n        __lowerDirtyCommit();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __revert() {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __isDying = false;");
    gold.append("\n        id.__revert();");
    gold.append("\n        name.__revert();");
    gold.append("\n        by.__revert();");
    gold.append("\n        __lowerDirtyRevert();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public String __name() {");
    gold.append("\n      return \"X\";");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __deindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    public void __reindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int __id() {");
    gold.append("\n      return id.get();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __setId(int __id, boolean __force) {");
    gold.append("\n      if (__force) {");
    gold.append("\n        id.forceSet(__id);");
    gold.append("\n      } else {");
    gold.append("\n        id.set(__id);");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxX {");
    gold.append("\n    private DInt32 __did;");
    gold.append("\n    private DString __dname;");
    gold.append("\n    private DInt32 __dby;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxX() {");
    gold.append("\n      __did = new DInt32();");
    gold.append("\n      __dname = new DString();");
    gold.append("\n      __dby = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxX __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 3;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __did.show(__item.id.get(), __obj.planField(\"id\"));");
    gold.append("\n      __dname.show(__item.name.get(), __obj.planField(\"name\"));");
    gold.append("\n      __dby.show(__item.by.get(), __obj.planField(\"by\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private static class RTx_AnonObjConvert_0 implements NtMessageBase {");
    gold.append("\n    private String name = \"\";");
    gold.append("\n    private RTx_AnonObjConvert_0(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"name\":");
    gold.append("\n              this.name = __reader.readString();");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"name\");");
    gold.append("\n      __writer.writeString(name);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTx_AnonObjConvert_0() {}");
    gold.append("\n    private RTx_AnonObjConvert_0(String name) {");
    gold.append("\n      this.name = name;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTx_AnonObjConvert_0 {");
    gold.append("\n    private DString __dname;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTx_AnonObjConvert_0() {");
    gold.append("\n      __dname = new DString();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTx_AnonObjConvert_0 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __dname.show(__item.name, __obj.planField(\"name\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  public boolean __onConnected__0(NtClient who){");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return (who.equals(NtClient.NO_ONE));");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    if (__onConnected__0(__cvalue)) __result = true;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 6;");
    gold.append("\n    __track(1);");
    gold.append("\n    {");
    gold.append("\n      RxTable<RTxX> _AutoRef55 = x;");
    gold.append("\n      RTx_AnonObjConvert_0 _AutoExpr57 = new RTx_AnonObjConvert_0(\"J\");");
    gold.append("\n      RTxX _CreateRef56 = _AutoRef55.make();");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      _CreateRef56.name.set(_AutoExpr57.name);");
    gold.append("\n    }");
    gold.append("\n    __track(2);");
    gold.append("\n    {");
    gold.append("\n      RxTable<RTxX> _AutoRef58 = x;");
    gold.append("\n      RTx_AnonObjConvert_0 _AutoExpr60 = new RTx_AnonObjConvert_0(\"B\");");
    gold.append("\n      RTxX _CreateRef59 = _AutoRef58.make();");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      _CreateRef59.name.set(_AutoExpr60.name);");
    gold.append("\n    }");
    gold.append("\n    __track(3);");
    gold.append("\n    {");
    gold.append("\n      RxTable<RTxX> _AutoRef61 = x;");
    gold.append("\n      RTx_AnonObjConvert_0 _AutoExpr63 = new RTx_AnonObjConvert_0(\"S\");");
    gold.append("\n      RTxX _CreateRef62 = _AutoRef61.make();");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      _CreateRef62.name.set(_AutoExpr63.name);");
    gold.append("\n    }");
    gold.append("\n    __track(4);");
    gold.append("\n    {");
    gold.append("\n      RxTable<RTxX> _AutoRef64 = x;");
    gold.append("\n      RTx_AnonObjConvert_0 _AutoExpr66 = new RTx_AnonObjConvert_0(\"E\");");
    gold.append("\n      RTxX _CreateRef65 = _AutoRef64.make();");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      _CreateRef65.name.set(_AutoExpr66.name);");
    gold.append("\n    }");
    gold.append("\n    __track(5);");
    gold.append("\n    {");
    gold.append("\n      RxTable<RTxX> _AutoRef67 = x;");
    gold.append("\n      RTx_AnonObjConvert_0 _AutoExpr69 = new RTx_AnonObjConvert_0(\"R\");");
    gold.append("\n      RTxX _CreateRef68 = _AutoRef67.make();");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      _CreateRef68.name.set(_AutoExpr69.name);");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  private class __CLOSURE_WhereClause0 implements WhereClause<RTxX> {");
    gold.append("\n    @Override");
    gold.append("\n    public int[] getIndices() {");
    gold.append("\n      return new int[] {};");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void scopeByIndicies(IndexQuerySet __set) {}");
    gold.append("\n    @Override");
    gold.append("\n    public Integer getPrimaryKey() {");
    gold.append("\n      return null;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public boolean test(RTxX __obj) {");
    gold.append("\n      String name = __obj.name.get();");
    gold.append("\n      __code_cost ++;");
    gold.append("\n      return LibString.equality(name, \"J\");");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class __CLOSURE_WhereClause1 implements WhereClause<RTxX> {");
    gold.append("\n    @Override");
    gold.append("\n    public int[] getIndices() {");
    gold.append("\n      return new int[] {};");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void scopeByIndicies(IndexQuerySet __set) {}");
    gold.append("\n    @Override");
    gold.append("\n    public Integer getPrimaryKey() {");
    gold.append("\n      return null;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public boolean test(RTxX z) {");
    gold.append("\n      __code_cost ++;");
    gold.append("\n      return LibString.equality(z.name.get(), \"J\");");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private final static Comparator<RTxX> __ORDER_X_by_a = new Comparator<RTxX>() {");
    gold.append("\n    @Override");
    gold.append("\n    public int compare(RTxX __a, RTxX __b) {");
    gold.append("\n      return __a.by.compareTo(__b.by);");
    gold.append("\n    }");
    gold.append("\n  };");
    gold.append("\n  private final static Comparator<RTxX> __ORDER_X_by_a_id_d = new Comparator<RTxX>() {");
    gold.append("\n    @Override");
    gold.append("\n    public int compare(RTxX __a, RTxX __b) {");
    gold.append("\n      int result = __a.by.compareTo(__b.by);");
    gold.append("\n      if (result != 0) return result;");
    gold.append("\n      return -__a.id.compareTo(__b.id);");
    gold.append("\n    }");
    gold.append("\n  };");
    gold.append("\n  private final static Comparator<RTxX> __ORDER_X_id_a = new Comparator<RTxX>() {");
    gold.append("\n    @Override");
    gold.append("\n    public int compare(RTxX __a, RTxX __b) {");
    gold.append("\n      return __a.id.compareTo(__b.id);");
    gold.append("\n    }");
    gold.append("\n  };");
    gold.append("\n  private final static Comparator<RTxX> __ORDER_X_id_d = new Comparator<RTxX>() {");
    gold.append("\n    @Override");
    gold.append("\n    public int compare(RTxX __a, RTxX __b) {");
    gold.append("\n      return -__a.id.compareTo(__b.id);");
    gold.append("\n    }");
    gold.append("\n  };");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\",\"x\":{\"auto_key\":5,\"rows\":{\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"1\":{\"id\":1,\"name\":\"B\",\"by\":0},\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"3\":{\"id\":3,\"name\":\"E\",\"by\":0},\"4\":{\"id\":4,\"name\":\"R\",\"by\":0}}}} need:true in:0");
    gold.append("\n{\"command\":\"connect\",\"timestamp\":\"25\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"}}-->{\"__seq\":1,\"__connection_id\":1,\"__time\":\"25\",\"__clients\":{\"0\":{\"agent\":\"?\",\"authority\":\"?\"}}} need:true in:0");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{\"where1\":{\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"@o\":[\"0\"]},\"where_as1\":{\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"@o\":[\"0\"]},\"order1\":{\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"1\":{\"id\":1,\"name\":\"B\",\"by\":0},\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"3\":{\"id\":3,\"name\":\"E\",\"by\":0},\"4\":{\"id\":4,\"name\":\"R\",\"by\":0},\"@o\":[\"0\",\"1\",\"2\",\"3\",\"4\"]},\"order2\":{\"4\":{\"id\":4,\"name\":\"R\",\"by\":0},\"3\":{\"id\":3,\"name\":\"E\",\"by\":0},\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"1\":{\"id\":1,\"name\":\"B\",\"by\":0},\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"@o\":[\"4\",\"3\",\"2\",\"1\",\"0\"]},\"order3\":{\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"1\":{\"id\":1,\"name\":\"B\",\"by\":0},\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"3\":{\"id\":3,\"name\":\"E\",\"by\":0},\"4\":{\"id\":4,\"name\":\"R\",\"by\":0},\"@o\":[\"0\",\"1\",\"2\",\"3\",\"4\"]},\"order4\":{\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"1\":{\"id\":1,\"name\":\"B\",\"by\":0},\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"3\":{\"id\":3,\"name\":\"E\",\"by\":0},\"4\":{\"id\":4,\"name\":\"R\",\"by\":0},\"@o\":[\"0\",\"1\",\"2\",\"3\",\"4\"]},\"order5\":{\"4\":{\"id\":4,\"name\":\"R\",\"by\":0},\"3\":{\"id\":3,\"name\":\"E\",\"by\":0},\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"1\":{\"id\":1,\"name\":\"B\",\"by\":0},\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"@o\":[\"4\",\"3\",\"2\",\"1\",\"0\"]},\"shuffle1\":{\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"3\":{\"id\":3,\"name\":\"E\",\"by\":0},\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"1\":{\"id\":1,\"name\":\"B\",\"by\":0},\"4\":{\"id\":4,\"name\":\"R\",\"by\":0},\"@o\":[\"2\",\"3\",\"0\",\"1\",\"4\"]},\"limit1\":{\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"@o\":[\"0\"]},\"limit2\":{\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"@o\":[\"2\"]}},\"outstanding\":[],\"blockers\":[],\"seq\":2}");
    gold.append("\n+ RANDO DELTA:{\"data\":{\"where1\":{\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"@o\":[\"0\"]},\"where_as1\":{\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"@o\":[\"0\"]},\"order1\":{\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"1\":{\"id\":1,\"name\":\"B\",\"by\":0},\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"3\":{\"id\":3,\"name\":\"E\",\"by\":0},\"4\":{\"id\":4,\"name\":\"R\",\"by\":0},\"@o\":[\"0\",\"1\",\"2\",\"3\",\"4\"]},\"order2\":{\"4\":{\"id\":4,\"name\":\"R\",\"by\":0},\"3\":{\"id\":3,\"name\":\"E\",\"by\":0},\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"1\":{\"id\":1,\"name\":\"B\",\"by\":0},\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"@o\":[\"4\",\"3\",\"2\",\"1\",\"0\"]},\"order3\":{\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"1\":{\"id\":1,\"name\":\"B\",\"by\":0},\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"3\":{\"id\":3,\"name\":\"E\",\"by\":0},\"4\":{\"id\":4,\"name\":\"R\",\"by\":0},\"@o\":[\"0\",\"1\",\"2\",\"3\",\"4\"]},\"order4\":{\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"1\":{\"id\":1,\"name\":\"B\",\"by\":0},\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"3\":{\"id\":3,\"name\":\"E\",\"by\":0},\"4\":{\"id\":4,\"name\":\"R\",\"by\":0},\"@o\":[\"0\",\"1\",\"2\",\"3\",\"4\"]},\"order5\":{\"4\":{\"id\":4,\"name\":\"R\",\"by\":0},\"3\":{\"id\":3,\"name\":\"E\",\"by\":0},\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"1\":{\"id\":1,\"name\":\"B\",\"by\":0},\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"@o\":[\"4\",\"3\",\"2\",\"1\",\"0\"]},\"shuffle1\":{\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"3\":{\"id\":3,\"name\":\"E\",\"by\":0},\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"1\":{\"id\":1,\"name\":\"B\",\"by\":0},\"4\":{\"id\":4,\"name\":\"R\",\"by\":0},\"@o\":[\"2\",\"3\",\"0\",\"1\",\"4\"]},\"limit1\":{\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"@o\":[\"0\"]},\"limit2\":{\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"@o\":[\"2\"]}},\"outstanding\":[],\"blockers\":[],\"seq\":2}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"50\"}-->{\"__messages\":null,\"__seq\":2,\"__entropy\":\"-4962768465676381896\",\"__time\":\"50\"} need:false in:-50");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"75\"}-->{\"__goodwill_used\":0,\"__cost\":249,\"__billing_seq\":2} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"x\":{\"auto_key\":5,\"rows\":{\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"1\":{\"id\":1,\"name\":\"B\",\"by\":0},\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"3\":{\"id\":3,\"name\":\"E\",\"by\":0},\"4\":{\"id\":4,\"name\":\"R\",\"by\":0}}},\"__seq\":2,\"__connection_id\":1,\"__time\":\"50\",\"__clients\":{\"0\":{\"agent\":\"?\",\"authority\":\"?\"}},\"__goodwill_used\":0,\"__cost\":249,\"__billing_seq\":2}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"x\":{\"auto_key\":5,\"rows\":{\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"1\":{\"id\":1,\"name\":\"B\",\"by\":0},\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"3\":{\"id\":3,\"name\":\"E\",\"by\":0},\"4\":{\"id\":4,\"name\":\"R\",\"by\":0}}},\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":2,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":1,\"__message_id\":0,\"__time\":\"75\",\"__clients\":{\"0\":{\"agent\":\"?\",\"authority\":\"?\"}}}");
    gold.append("\n{\"x\":{\"auto_key\":5,\"rows\":{\"0\":{\"id\":0,\"name\":\"J\",\"by\":0},\"1\":{\"id\":1,\"name\":\"B\",\"by\":0},\"2\":{\"id\":2,\"name\":\"S\",\"by\":0},\"3\":{\"id\":3,\"name\":\"E\",\"by\":0},\"4\":{\"id\":4,\"name\":\"R\",\"by\":0}}},\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":2,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":1,\"__message_id\":0,\"__time\":\"75\",\"__clients\":{\"0\":{\"agent\":\"?\",\"authority\":\"?\"}}}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_Loops_75 = null;
  private String get_Loops_75() {
    if (cached_Loops_75 != null) {
      return cached_Loops_75;
    }
    cached_Loops_75 = generateTestOutput(true, "Loops_75", "./test_code/Parser_Loops_success.a");
    return cached_Loops_75;
  }

  @Test
  public void testLoopsEmission() {
    assertEmissionGood(get_Loops_75());
  }

  @Test
  public void testLoopsSuccess() {
    assertLivePass(get_Loops_75());
  }

  @Test
  public void testLoopsGoodWillHappy() {
    assertGoodWillHappy(get_Loops_75());
  }

  @Test
  public void testLoopsExceptionFree() {
    assertExceptionFree(get_Loops_75());
  }

  @Test
  public void testLoopsTODOFree() {
    assertTODOFree(get_Loops_75());
  }

  @Test
  public void stable_Loops_75() {
    String live = get_Loops_75();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_Loops_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class Loops_75 extends LivingDocument {");
    gold.append("\n  public Loops_75(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaLoops_75 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaLoops_75() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(Loops_75 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    Loops_75 __self = this;");
    gold.append("\n    DeltaLoops_75 __state = new DeltaLoops_75();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static class RTxFoo implements NtMessageBase {");
    gold.append("\n    private RTxFoo(JsonStreamReader __reader) {");
    gold.append("\n      __reader.skipValue();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxFoo() {}");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxFoo {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxFoo() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxFoo __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 7;");
    gold.append("\n    __track(0);");
    gold.append("\n    int x = 1;");
    gold.append("\n    __track(1);");
    gold.append("\n    while (__goodwill(5, 9, 5, 15) && (x < 10)) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(2);");
    gold.append("\n      x++;");
    gold.append("\n    }");
    gold.append("\n    __track(3);");
    gold.append("\n    do {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(4);");
    gold.append("\n      x--;");
    gold.append("\n    } while (__goodwill(11, 11, 11, 16) && (x > 0));");
    gold.append("\n    __track(5);");
    gold.append("\n    {");
    gold.append("\n      int k = 0;");
    gold.append("\n      for (;__goodwill(13, 18, 13, 24) && (k < 10);k++) {");
    gold.append("\n        __code_cost += 2;");
    gold.append("\n        __track(6);");
    gold.append("\n        x += k;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    __track(7);");
    gold.append("\n    RTxFoo[] arr = new RTxFoo[] {};");
    gold.append("\n    __track(8);");
    gold.append("\n    for(RTxFoo e : arr) {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(9);");
    gold.append("\n      x *= 7;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":31,\"__cost\":65,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":31,\"__cost\":65,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_Maps_76 = null;
  private String get_Maps_76() {
    if (cached_Maps_76 != null) {
      return cached_Maps_76;
    }
    cached_Maps_76 = generateTestOutput(true, "Maps_76", "./test_code/Parser_Maps_success.a");
    return cached_Maps_76;
  }

  @Test
  public void testMapsEmission() {
    assertEmissionGood(get_Maps_76());
  }

  @Test
  public void testMapsSuccess() {
    assertLivePass(get_Maps_76());
  }

  @Test
  public void testMapsGoodWillHappy() {
    assertGoodWillHappy(get_Maps_76());
  }

  @Test
  public void testMapsExceptionFree() {
    assertExceptionFree(get_Maps_76());
  }

  @Test
  public void testMapsTODOFree() {
    assertTODOFree(get_Maps_76());
  }

  @Test
  public void stable_Maps_76() {
    String live = get_Maps_76();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_Maps_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class Maps_76 extends LivingDocument {");
    gold.append("\n  public Maps_76(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaMaps_76 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaMaps_76() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(Maps_76 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    Maps_76 __self = this;");
    gold.append("\n    DeltaMaps_76 __state = new DeltaMaps_76();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  private void __step_ok() {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    NtMap<Integer,Integer> foo = new NtMap<Integer,Integer>();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {");
    gold.append("\n    switch(__new_state) {");
    gold.append("\n      case \"ok\":");
    gold.append("\n        __step_ok();");
    gold.append("\n        return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_MathAndLogic_77 = null;
  private String get_MathAndLogic_77() {
    if (cached_MathAndLogic_77 != null) {
      return cached_MathAndLogic_77;
    }
    cached_MathAndLogic_77 = generateTestOutput(true, "MathAndLogic_77", "./test_code/Parser_MathAndLogic_success.a");
    return cached_MathAndLogic_77;
  }

  @Test
  public void testMathAndLogicEmission() {
    assertEmissionGood(get_MathAndLogic_77());
  }

  @Test
  public void testMathAndLogicSuccess() {
    assertLivePass(get_MathAndLogic_77());
  }

  @Test
  public void testMathAndLogicGoodWillHappy() {
    assertGoodWillHappy(get_MathAndLogic_77());
  }

  @Test
  public void testMathAndLogicExceptionFree() {
    assertExceptionFree(get_MathAndLogic_77());
  }

  @Test
  public void testMathAndLogicTODOFree() {
    assertTODOFree(get_MathAndLogic_77());
  }

  @Test
  public void stable_MathAndLogic_77() {
    String live = get_MathAndLogic_77();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_MathAndLogic_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class MathAndLogic_77 extends LivingDocument {");
    gold.append("\n  public MathAndLogic_77(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaMathAndLogic_77 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaMathAndLogic_77() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(MathAndLogic_77 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    MathAndLogic_77 __self = this;");
    gold.append("\n    DeltaMathAndLogic_77 __state = new DeltaMathAndLogic_77();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 14;");
    gold.append("\n    __track(0);");
    gold.append("\n    final int x = 1 + 2 + 3;");
    gold.append("\n    __track(1);");
    gold.append("\n    final int y = 2 * 3 * 4;");
    gold.append("\n    __track(2);");
    gold.append("\n    final int z = 10 - 5 - 3 - 1;");
    gold.append("\n    __track(3);");
    gold.append("\n    final boolean u = true && true;");
    gold.append("\n    __track(4);");
    gold.append("\n    final boolean v = false || false;");
    gold.append("\n    __track(5);");
    gold.append("\n    final boolean eq = 1 == 2;");
    gold.append("\n    __track(6);");
    gold.append("\n    final boolean ne = 1 != 2;");
    gold.append("\n    __track(7);");
    gold.append("\n    final boolean lt = 1 < 2;");
    gold.append("\n    __track(8);");
    gold.append("\n    final boolean gt = 1 > 2;");
    gold.append("\n    __track(9);");
    gold.append("\n    final boolean lte = 1 <= 2;");
    gold.append("\n    __track(10);");
    gold.append("\n    final boolean gte = 1 >= 2;");
    gold.append("\n    __track(11);");
    gold.append("\n    final int t0 = (true ? 4 : 5);");
    gold.append("\n    __track(12);");
    gold.append("\n    final int t1 = (false ? 4 : 5);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":14,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":14,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_MaybeIncompleteEOS_78 = null;
  private String get_MaybeIncompleteEOS_78() {
    if (cached_MaybeIncompleteEOS_78 != null) {
      return cached_MaybeIncompleteEOS_78;
    }
    cached_MaybeIncompleteEOS_78 = generateTestOutput(false, "MaybeIncompleteEOS_78", "./test_code/Parser_MaybeIncompleteEOS_failure.a");
    return cached_MaybeIncompleteEOS_78;
  }

  @Test
  public void testMaybeIncompleteEOSFailure() {
    assertLiveFail(get_MaybeIncompleteEOS_78());
  }

  @Test
  public void testMaybeIncompleteEOSNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_MaybeIncompleteEOS_78());
  }

  @Test
  public void testMaybeIncompleteEOSExceptionFree() {
    assertExceptionFree(get_MaybeIncompleteEOS_78());
  }

  @Test
  public void testMaybeIncompleteEOSTODOFree() {
    assertTODOFree(get_MaybeIncompleteEOS_78());
  }

  @Test
  public void stable_MaybeIncompleteEOS_78() {
    String live = get_MaybeIncompleteEOS_78();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_MaybeIncompleteEOS_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 6");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 12");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_MaybeIncompleteEOS_failure.a' failed to parse: Parser was expected either a '<' or '(' after @maybe, but got end of stream instead. {Token: `@maybe` @ (2,6) -> (2,12): Keyword} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expected either a '<' or '(' after @maybe, but got end of stream instead. {Token: `@maybe` @ (2,6) -> (2,12): Keyword} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_MaybeIncompleteSymbol_79 = null;
  private String get_MaybeIncompleteSymbol_79() {
    if (cached_MaybeIncompleteSymbol_79 != null) {
      return cached_MaybeIncompleteSymbol_79;
    }
    cached_MaybeIncompleteSymbol_79 = generateTestOutput(false, "MaybeIncompleteSymbol_79", "./test_code/Parser_MaybeIncompleteSymbol_failure.a");
    return cached_MaybeIncompleteSymbol_79;
  }

  @Test
  public void testMaybeIncompleteSymbolFailure() {
    assertLiveFail(get_MaybeIncompleteSymbol_79());
  }

  @Test
  public void testMaybeIncompleteSymbolNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_MaybeIncompleteSymbol_79());
  }

  @Test
  public void testMaybeIncompleteSymbolExceptionFree() {
    assertExceptionFree(get_MaybeIncompleteSymbol_79());
  }

  @Test
  public void testMaybeIncompleteSymbolTODOFree() {
    assertTODOFree(get_MaybeIncompleteSymbol_79());
  }

  @Test
  public void stable_MaybeIncompleteSymbol_79() {
    String live = get_MaybeIncompleteSymbol_79();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_MaybeIncompleteSymbol_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 12");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 2,");
    gold.append("\n      \"character\" : 13");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_MaybeIncompleteSymbol_failure.a' failed to parse: Parser was expected either a '<' or '(' after @maybe, but got `+` instead. {Token: `+` @ (2,12) -> (2,13): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expected either a '<' or '(' after @maybe, but got `+` instead. {Token: `+` @ (2,12) -> (2,13): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_Maybe_80 = null;
  private String get_Maybe_80() {
    if (cached_Maybe_80 != null) {
      return cached_Maybe_80;
    }
    cached_Maybe_80 = generateTestOutput(true, "Maybe_80", "./test_code/Parser_Maybe_success.a");
    return cached_Maybe_80;
  }

  @Test
  public void testMaybeEmission() {
    assertEmissionGood(get_Maybe_80());
  }

  @Test
  public void testMaybeSuccess() {
    assertLivePass(get_Maybe_80());
  }

  @Test
  public void testMaybeGoodWillHappy() {
    assertGoodWillHappy(get_Maybe_80());
  }

  @Test
  public void testMaybeExceptionFree() {
    assertExceptionFree(get_Maybe_80());
  }

  @Test
  public void testMaybeTODOFree() {
    assertTODOFree(get_Maybe_80());
  }

  @Test
  public void stable_Maybe_80() {
    String live = get_Maybe_80();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_Maybe_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class Maybe_80 extends LivingDocument {");
    gold.append("\n  private final RxInt32 v0;");
    gold.append("\n  private final RxMaybe<RxString> name;");
    gold.append("\n  public Maybe_80(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    v0 = new RxInt32(this, 0);");
    gold.append("\n    name = new RxMaybe<>(this, (RxParent __parent) -> new RxString(__parent, \"Jeff\"));");
    gold.append("\n    name.make();");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"v0\":");
    gold.append("\n            v0.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"name\":");
    gold.append("\n            name.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"v0\");");
    gold.append("\n    v0.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"name\");");
    gold.append("\n    name.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    v0.__commit(\"v0\", __forward, __reverse);");
    gold.append("\n    name.__commit(\"name\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    v0.__revert();");
    gold.append("\n    name.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaMaybe_80 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaMaybe_80() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(Maybe_80 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    Maybe_80 __self = this;");
    gold.append("\n    DeltaMaybe_80 __state = new DeltaMaybe_80();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 13;");
    gold.append("\n    __track(0);");
    gold.append("\n    NtMaybe<Integer> x = new NtMaybe<Integer>();");
    gold.append("\n    __track(1);");
    gold.append("\n    NtMaybe<Integer> _AutoConditionxx_0;");
    gold.append("\n    if ((_AutoConditionxx_0 = x).has()) {");
    gold.append("\n      int xx = _AutoConditionxx_0.get();");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(2);");
    gold.append("\n      v0.opAddTo(1);");
    gold.append("\n    }");
    gold.append("\n    __track(3);");
    gold.append("\n    x.set(2);");
    gold.append("\n    __track(4);");
    gold.append("\n    NtMaybe<Integer> _AutoConditionxx_1;");
    gold.append("\n    if ((_AutoConditionxx_1 = x).has()) {");
    gold.append("\n      int xx = _AutoConditionxx_1.get();");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(5);");
    gold.append("\n      v0.opAddTo(2);");
    gold.append("\n    }");
    gold.append("\n    __track(6);");
    gold.append("\n    NtMaybe<Integer> _AutoConditionxx_2;");
    gold.append("\n    if ((_AutoConditionxx_2 = new NtMaybe<Integer>(4)).has()) {");
    gold.append("\n      int xx = _AutoConditionxx_2.get();");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(7);");
    gold.append("\n      v0.opAddTo(xx);");
    gold.append("\n    }");
    gold.append("\n    __track(8);");
    gold.append("\n    NtMaybe<Integer> z = new NtMaybe<Integer>();");
    gold.append("\n    __track(9);");
    gold.append("\n    z.set(new NtMaybe<Integer>(1));");
    gold.append("\n    __track(10);");
    gold.append("\n    NtMaybe<Integer> _AutoConditionxx_3;");
    gold.append("\n    if ((_AutoConditionxx_3 = z).has()) {");
    gold.append("\n      int xx = _AutoConditionxx_3.get();");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(11);");
    gold.append("\n      v0.opAddTo(8);");
    gold.append("\n    }");
    gold.append("\n    __track(12);");
    gold.append("\n    name.make().set(\"Dawg\");");
    gold.append("\n    __track(13);");
    gold.append("\n    NtMaybe<Integer> w = new NtMaybe<Integer>(new NtMaybe<Integer>(4));");
    gold.append("\n    __track(14);");
    gold.append("\n    NtMaybe<Integer> _AutoConditionxx_4;");
    gold.append("\n    if ((_AutoConditionxx_4 = w).has()) {");
    gold.append("\n      int xx = _AutoConditionxx_4.get();");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(15);");
    gold.append("\n      v0.opAddTo(16);");
    gold.append("\n    }");
    gold.append("\n    __track(16);");
    gold.append("\n    NtMaybe<Integer> _AutoConditionxx_5;");
    gold.append("\n    if ((_AutoConditionxx_5 = new NtMaybe<Integer>()).has()) {");
    gold.append("\n      int xx = _AutoConditionxx_5.get();");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(17);");
    gold.append("\n      v0.opAddTo(32);");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\",\"v0\":30,\"name\":\"Dawg\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":21,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"v0\":30,\"name\":\"Dawg\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":21,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"v0\":30,\"name\":\"Dawg\",\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"v0\":30,\"name\":\"Dawg\",\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_NativeTypes_81 = null;
  private String get_NativeTypes_81() {
    if (cached_NativeTypes_81 != null) {
      return cached_NativeTypes_81;
    }
    cached_NativeTypes_81 = generateTestOutput(true, "NativeTypes_81", "./test_code/Parser_NativeTypes_success.a");
    return cached_NativeTypes_81;
  }

  @Test
  public void testNativeTypesEmission() {
    assertEmissionGood(get_NativeTypes_81());
  }

  @Test
  public void testNativeTypesSuccess() {
    assertLivePass(get_NativeTypes_81());
  }

  @Test
  public void testNativeTypesGoodWillHappy() {
    assertGoodWillHappy(get_NativeTypes_81());
  }

  @Test
  public void testNativeTypesExceptionFree() {
    assertExceptionFree(get_NativeTypes_81());
  }

  @Test
  public void testNativeTypesTODOFree() {
    assertTODOFree(get_NativeTypes_81());
  }

  @Test
  public void stable_NativeTypes_81() {
    String live = get_NativeTypes_81();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_NativeTypes_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class NativeTypes_81 extends LivingDocument {");
    gold.append("\n  public NativeTypes_81(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaNativeTypes_81 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaNativeTypes_81() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(NativeTypes_81 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    NativeTypes_81 __self = this;");
    gold.append("\n    DeltaNativeTypes_81 __state = new DeltaNativeTypes_81();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static class RTxM implements NtMessageBase {");
    gold.append("\n    private RTxM(JsonStreamReader __reader) {");
    gold.append("\n      __reader.skipValue();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __writeOut(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxM() {}");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxM {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxM() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxM __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private int __FUNC_0_isum(NtList<Integer> lst) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return 0;");
    gold.append("\n  }");
    gold.append("\n  private void __FUNC_1_drive(SimpleFuture<RTxM> f, RTxM m) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  private void __step_l() {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {");
    gold.append("\n    switch(__new_state) {");
    gold.append("\n      case \"l\":");
    gold.append("\n        __step_l();");
    gold.append("\n        return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 10;");
    gold.append("\n    __track(0);");
    gold.append("\n    boolean b = false;");
    gold.append("\n    __track(1);");
    gold.append("\n    NtClient c = NtClient.NO_ONE;");
    gold.append("\n    __track(2);");
    gold.append("\n    double d = 3.14;");
    gold.append("\n    __track(3);");
    gold.append("\n    int i = 42;");
    gold.append("\n    __track(4);");
    gold.append("\n    String s = \"Hello World\";");
    gold.append("\n    __track(5);");
    gold.append("\n    String l = \"l\";");
    gold.append("\n    __track(6);");
    gold.append("\n    RTxM m = new RTxM();");
    gold.append("\n    __track(7);");
    gold.append("\n    NtMaybe<Boolean> mb = new NtMaybe<Boolean>(true);");
    gold.append("\n    __track(8);");
    gold.append("\n    NtMaybe<Double> md = new NtMaybe<Double>();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":10,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":10,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_Preempt_82 = null;
  private String get_Preempt_82() {
    if (cached_Preempt_82 != null) {
      return cached_Preempt_82;
    }
    cached_Preempt_82 = generateTestOutput(true, "Preempt_82", "./test_code/Parser_Preempt_success.a");
    return cached_Preempt_82;
  }

  @Test
  public void testPreemptEmission() {
    assertEmissionGood(get_Preempt_82());
  }

  @Test
  public void testPreemptSuccess() {
    assertLivePass(get_Preempt_82());
  }

  @Test
  public void testPreemptGoodWillHappy() {
    assertGoodWillHappy(get_Preempt_82());
  }

  @Test
  public void testPreemptExceptionFree() {
    assertExceptionFree(get_Preempt_82());
  }

  @Test
  public void testPreemptTODOFree() {
    assertTODOFree(get_Preempt_82());
  }

  @Test
  public void stable_Preempt_82() {
    String live = get_Preempt_82();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_Preempt_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class Preempt_82 extends LivingDocument {");
    gold.append("\n  private final RxInt32 v;");
    gold.append("\n  public Preempt_82(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    v = new RxInt32(this, 0);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"v\":");
    gold.append("\n            v.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"v\");");
    gold.append("\n    v.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    v.__commit(\"v\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    v.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaPreempt_82 {");
    gold.append("\n    private DInt32 __dv;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaPreempt_82() {");
    gold.append("\n      __dv = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(Preempt_82 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      __dv.show(__item.v.get(), __obj.planField(\"v\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    Preempt_82 __self = this;");
    gold.append("\n    DeltaPreempt_82 __state = new DeltaPreempt_82();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  private void __step_b() {");
    gold.append("\n    __code_cost += 4;");
    gold.append("\n    __track(0);");
    gold.append("\n    v.set(500);");
    gold.append("\n    __track(1);");
    gold.append("\n    __preemptStateMachine(\"c\");");
    gold.append("\n    __track(2);");
    gold.append("\n    throw new ComputeBlockedException(null, null);");
    gold.append("\n  }");
    gold.append("\n  private void __step_c() {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(3);");
    gold.append("\n    v.set(1000);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {");
    gold.append("\n    switch(__new_state) {");
    gold.append("\n      case \"b\":");
    gold.append("\n        __step_b();");
    gold.append("\n        return;");
    gold.append("\n      case \"c\":");
    gold.append("\n        __step_c();");
    gold.append("\n        return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  public boolean __onConnected__0(NtClient who){");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(4);");
    gold.append("\n    return true;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    if (__onConnected__0(__cvalue)) __result = true;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(5);");
    gold.append("\n    __transitionStateMachine(\"b\", 0);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__state\":\"b\",\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\n{\"command\":\"connect\",\"timestamp\":\"25\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"}}-->{\"__seq\":1,\"__connection_id\":1,\"__time\":\"25\",\"__clients\":{\"0\":{\"agent\":\"?\",\"authority\":\"?\"}}} need:true in:0");
    gold.append("\n{\"command\":\"connect\",\"timestamp\":\"50\",\"who\":{\"agent\":\"rando\",\"authority\":\"random-place\"}}-->{\"__seq\":2,\"__connection_id\":2,\"__time\":\"50\",\"__clients\":{\"1\":{\"agent\":\"rando\",\"authority\":\"random-place\"}}} need:true in:0");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{\"v\":500},\"outstanding\":[],\"blockers\":[],\"seq\":3}");
    gold.append("\n+ RANDO DELTA:{\"data\":{\"v\":500},\"outstanding\":[],\"blockers\":[],\"seq\":3}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"75\"}-->{\"__messages\":null,\"__state\":\"c\",\"__next_time\":\"75\",\"__seq\":3,\"__entropy\":\"-4962768465676381896\",\"__time\":\"75\",\"v\":500} need:true in:0");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{\"v\":1000},\"outstanding\":[],\"blockers\":[],\"seq\":4}");
    gold.append("\n+ RANDO DELTA:{\"data\":{\"v\":1000},\"outstanding\":[],\"blockers\":[],\"seq\":4}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"100\"}-->{\"__messages\":null,\"__state\":\"\",\"__seq\":4,\"__entropy\":\"4804307197456638271\",\"__time\":\"100\",\"v\":1000} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"125\"}-->{\"__goodwill_used\":0,\"__cost\":16,\"__billing_seq\":4} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__entropy\":\"4804307197456638271\",\"__seq\":4,\"__connection_id\":2,\"__time\":\"100\",\"__clients\":{\"0\":{\"agent\":\"?\",\"authority\":\"?\"},\"1\":{\"agent\":\"rando\",\"authority\":\"random-place\"}},\"__next_time\":\"75\",\"v\":1000,\"__goodwill_used\":0,\"__cost\":16,\"__billing_seq\":4}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"v\":1000,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"75\",\"__blocked\":false,\"__seq\":4,\"__entropy\":\"4804307197456638271\",\"__auto_future_id\":0,\"__connection_id\":2,\"__message_id\":0,\"__time\":\"125\",\"__clients\":{\"0\":{\"agent\":\"?\",\"authority\":\"?\"},\"1\":{\"agent\":\"rando\",\"authority\":\"random-place\"}}}");
    gold.append("\n{\"v\":1000,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"75\",\"__blocked\":false,\"__seq\":4,\"__entropy\":\"4804307197456638271\",\"__auto_future_id\":0,\"__connection_id\":2,\"__message_id\":0,\"__time\":\"125\",\"__clients\":{\"0\":{\"agent\":\"?\",\"authority\":\"?\"},\"1\":{\"agent\":\"rando\",\"authority\":\"random-place\"}}}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_PureFunctionMustReturn_83 = null;
  private String get_PureFunctionMustReturn_83() {
    if (cached_PureFunctionMustReturn_83 != null) {
      return cached_PureFunctionMustReturn_83;
    }
    cached_PureFunctionMustReturn_83 = generateTestOutput(false, "PureFunctionMustReturn_83", "./test_code/Parser_PureFunctionMustReturn_failure.a");
    return cached_PureFunctionMustReturn_83;
  }

  @Test
  public void testPureFunctionMustReturnFailure() {
    assertLiveFail(get_PureFunctionMustReturn_83());
  }

  @Test
  public void testPureFunctionMustReturnNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_PureFunctionMustReturn_83());
  }

  @Test
  public void testPureFunctionMustReturnExceptionFree() {
    assertExceptionFree(get_PureFunctionMustReturn_83());
  }

  @Test
  public void testPureFunctionMustReturnTODOFree() {
    assertTODOFree(get_PureFunctionMustReturn_83());
  }

  @Test
  public void stable_PureFunctionMustReturn_83() {
    String live = get_PureFunctionMustReturn_83();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_PureFunctionMustReturn_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 16");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 17");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_PureFunctionMustReturn_failure.a' failed to parse: Parser was expecting -> for the pure function, and pure functions must have return types. {Token: `)` @ (0,16) -> (0,17): Symbol} (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Parse): Parser was expecting -> for the pure function, and pure functions must have return types. {Token: `)` @ (0,16) -> (0,17): Symbol} (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_ReactiveRef_84 = null;
  private String get_ReactiveRef_84() {
    if (cached_ReactiveRef_84 != null) {
      return cached_ReactiveRef_84;
    }
    cached_ReactiveRef_84 = generateTestOutput(true, "ReactiveRef_84", "./test_code/Parser_ReactiveRef_success.a");
    return cached_ReactiveRef_84;
  }

  @Test
  public void testReactiveRefEmission() {
    assertEmissionGood(get_ReactiveRef_84());
  }

  @Test
  public void testReactiveRefSuccess() {
    assertLivePass(get_ReactiveRef_84());
  }

  @Test
  public void testReactiveRefGoodWillHappy() {
    assertGoodWillHappy(get_ReactiveRef_84());
  }

  @Test
  public void testReactiveRefExceptionFree() {
    assertExceptionFree(get_ReactiveRef_84());
  }

  @Test
  public void testReactiveRefTODOFree() {
    assertTODOFree(get_ReactiveRef_84());
  }

  @Test
  public void stable_ReactiveRef_84() {
    String live = get_ReactiveRef_84();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_ReactiveRef_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class ReactiveRef_84 extends LivingDocument {");
    gold.append("\n  private final RTxX x;");
    gold.append("\n  public ReactiveRef_84(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    x = new RTxX(this);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"x\":");
    gold.append("\n            x.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n    x.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    x.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaReactiveRef_84 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaReactiveRef_84() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(ReactiveRef_84 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    ReactiveRef_84 __self = this;");
    gold.append("\n    DeltaReactiveRef_84 __state = new DeltaReactiveRef_84();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private class RTxX extends RxRecordBase<RTxX> {");
    gold.append("\n    private final RxInt32 x;");
    gold.append("\n    private final RxInt32 id;");
    gold.append("\n    private RTxX(RxParent __owner) {");
    gold.append("\n      super(__owner);");
    gold.append("\n      x = new RxInt32(this, 0);");
    gold.append("\n      id = new RxInt32(this, 0);");
    gold.append("\n      if (__owner instanceof RxTable) {");
    gold.append("\n        /* ok */");
    gold.append("\n      } else {");
    gold.append("\n        /* ok */");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    String[] __INDEX_COLUMNS = new String[] {\"x\"};");
    gold.append("\n    @Override");
    gold.append("\n    public String[] __getIndexColumns() {");
    gold.append("\n      return __INDEX_COLUMNS;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int[] __getIndexValues() {");
    gold.append("\n      return new int[] {x.getIndexValue()};");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __insert(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while(__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              x.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"id\":");
    gold.append("\n              id.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      x.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"id\");");
    gold.append("\n      id.__dump(__writer);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __forward.writeObjectFieldIntro(__name);");
    gold.append("\n        __forward.beginObject();");
    gold.append("\n        __reverse.writeObjectFieldIntro(__name);");
    gold.append("\n        __reverse.beginObject();");
    gold.append("\n        x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n        id.__commit(\"id\", __forward, __reverse);");
    gold.append("\n        __forward.endObject();");
    gold.append("\n        __reverse.endObject();");
    gold.append("\n        __lowerDirtyCommit();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __revert() {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __isDying = false;");
    gold.append("\n        x.__revert();");
    gold.append("\n        id.__revert();");
    gold.append("\n        __lowerDirtyRevert();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public String __name() {");
    gold.append("\n      return \"X\";");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __deindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    public void __reindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int __id() {");
    gold.append("\n      return id.get();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __setId(int __id, boolean __force) {");
    gold.append("\n      if (__force) {");
    gold.append("\n        id.forceSet(__id);");
    gold.append("\n      } else {");
    gold.append("\n        id.set(__id);");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxX {");
    gold.append("\n    private DInt32 __dx;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxX() {");
    gold.append("\n      __dx = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxX __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __dx.show(__item.x.get(), __obj.planField(\"x\"));");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    x.x.set(123);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\",\"x\":{\"x\":123}} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":2,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"x\":{\"x\":123},\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":2,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"x\":{\"x\":123,\"id\":0},\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"x\":{\"x\":123,\"id\":0},\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_RecordMethod_85 = null;
  private String get_RecordMethod_85() {
    if (cached_RecordMethod_85 != null) {
      return cached_RecordMethod_85;
    }
    cached_RecordMethod_85 = generateTestOutput(true, "RecordMethod_85", "./test_code/Parser_RecordMethod_success.a");
    return cached_RecordMethod_85;
  }

  @Test
  public void testRecordMethodEmission() {
    assertEmissionGood(get_RecordMethod_85());
  }

  @Test
  public void testRecordMethodSuccess() {
    assertLivePass(get_RecordMethod_85());
  }

  @Test
  public void testRecordMethodGoodWillHappy() {
    assertGoodWillHappy(get_RecordMethod_85());
  }

  @Test
  public void testRecordMethodExceptionFree() {
    assertExceptionFree(get_RecordMethod_85());
  }

  @Test
  public void testRecordMethodTODOFree() {
    assertTODOFree(get_RecordMethod_85());
  }

  @Test
  public void stable_RecordMethod_85() {
    String live = get_RecordMethod_85();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_RecordMethod_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class RecordMethod_85 extends LivingDocument {");
    gold.append("\n  private final RTxX x;");
    gold.append("\n  public RecordMethod_85(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    x = new RTxX(this);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"x\":");
    gold.append("\n            x.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n    x.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    x.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRecordMethod_85 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRecordMethod_85() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RecordMethod_85 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    RecordMethod_85 __self = this;");
    gold.append("\n    DeltaRecordMethod_85 __state = new DeltaRecordMethod_85();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private class RTxX extends RxRecordBase<RTxX> {");
    gold.append("\n    private final RxInt32 id;");
    gold.append("\n    private RTxX(RxParent __owner) {");
    gold.append("\n      super(__owner);");
    gold.append("\n      id = new RxInt32(this, 0);");
    gold.append("\n      if (__owner instanceof RxTable) {");
    gold.append("\n        /* ok */");
    gold.append("\n      } else {");
    gold.append("\n        /* ok */");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    private int __METH_0_foo() {");
    gold.append("\n      __code_cost += 2;");
    gold.append("\n      __track(0);");
    gold.append("\n      return 1;");
    gold.append("\n    }");
    gold.append("\n    private void __METH_1_goo(int g) {}");
    gold.append("\n    String[] __INDEX_COLUMNS = new String[] {};");
    gold.append("\n    @Override");
    gold.append("\n    public String[] __getIndexColumns() {");
    gold.append("\n      return __INDEX_COLUMNS;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int[] __getIndexValues() {");
    gold.append("\n      return new int[] {};");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __insert(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while(__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"id\":");
    gold.append("\n              id.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"id\");");
    gold.append("\n      id.__dump(__writer);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __forward.writeObjectFieldIntro(__name);");
    gold.append("\n        __forward.beginObject();");
    gold.append("\n        __reverse.writeObjectFieldIntro(__name);");
    gold.append("\n        __reverse.beginObject();");
    gold.append("\n        id.__commit(\"id\", __forward, __reverse);");
    gold.append("\n        __forward.endObject();");
    gold.append("\n        __reverse.endObject();");
    gold.append("\n        __lowerDirtyCommit();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __revert() {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __isDying = false;");
    gold.append("\n        id.__revert();");
    gold.append("\n        __lowerDirtyRevert();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public String __name() {");
    gold.append("\n      return \"X\";");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __deindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    public void __reindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int __id() {");
    gold.append("\n      return id.get();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __setId(int __id, boolean __force) {");
    gold.append("\n      if (__force) {");
    gold.append("\n        id.forceSet(__id);");
    gold.append("\n      } else {");
    gold.append("\n        id.set(__id);");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxX {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxX() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxX __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 3;");
    gold.append("\n    __track(1);");
    gold.append("\n    x.__METH_0_foo();");
    gold.append("\n    __track(2);");
    gold.append("\n    x.__METH_1_goo(123);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":5,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":5,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"x\":{\"id\":0},\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"x\":{\"id\":0},\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_RecordPolicies_86 = null;
  private String get_RecordPolicies_86() {
    if (cached_RecordPolicies_86 != null) {
      return cached_RecordPolicies_86;
    }
    cached_RecordPolicies_86 = generateTestOutput(true, "RecordPolicies_86", "./test_code/Parser_RecordPolicies_success.a");
    return cached_RecordPolicies_86;
  }

  @Test
  public void testRecordPoliciesEmission() {
    assertEmissionGood(get_RecordPolicies_86());
  }

  @Test
  public void testRecordPoliciesSuccess() {
    assertLivePass(get_RecordPolicies_86());
  }

  @Test
  public void testRecordPoliciesGoodWillHappy() {
    assertGoodWillHappy(get_RecordPolicies_86());
  }

  @Test
  public void testRecordPoliciesExceptionFree() {
    assertExceptionFree(get_RecordPolicies_86());
  }

  @Test
  public void testRecordPoliciesTODOFree() {
    assertTODOFree(get_RecordPolicies_86());
  }

  @Test
  public void stable_RecordPolicies_86() {
    String live = get_RecordPolicies_86();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_RecordPolicies_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class RecordPolicies_86 extends LivingDocument {");
    gold.append("\n  public RecordPolicies_86(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRecordPolicies_86 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRecordPolicies_86() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RecordPolicies_86 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    RecordPolicies_86 __self = this;");
    gold.append("\n    DeltaRecordPolicies_86 __state = new DeltaRecordPolicies_86();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private class RTxX extends RxRecordBase<RTxX> {");
    gold.append("\n    private final RxInt32 x;");
    gold.append("\n    private final RxInt32 z;");
    gold.append("\n    private final RxClient who;");
    gold.append("\n    private final RxInt32 u;");
    gold.append("\n    private final RxInt32 v;");
    gold.append("\n    private final RxInt32 w;");
    gold.append("\n    private final RxInt32 id;");
    gold.append("\n    private RTxX(RxParent __owner) {");
    gold.append("\n      super(__owner);");
    gold.append("\n      x = new RxInt32(this, 0);");
    gold.append("\n      z = new RxInt32(this, 0);");
    gold.append("\n      who = new RxClient(this, NtClient.NO_ONE);");
    gold.append("\n      u = new RxInt32(this, 0);");
    gold.append("\n      v = new RxInt32(this, 0);");
    gold.append("\n      w = new RxInt32(this, 0);");
    gold.append("\n      id = new RxInt32(this, 0);");
    gold.append("\n      if (__owner instanceof RxTable) {");
    gold.append("\n        /* ok */");
    gold.append("\n      } else {");
    gold.append("\n        /* ok */");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public boolean __POLICY_p1(NtClient c){");
    gold.append("\n      __track(0);");
    gold.append("\n      return true;");
    gold.append("\n    }");
    gold.append("\n    public boolean __POLICY_p2(NtClient c){");
    gold.append("\n      __track(1);");
    gold.append("\n      return true;");
    gold.append("\n    }");
    gold.append("\n    String[] __INDEX_COLUMNS = new String[] {\"u\", \"v\", \"w\", \"who\", \"x\", \"z\"};");
    gold.append("\n    @Override");
    gold.append("\n    public String[] __getIndexColumns() {");
    gold.append("\n      return __INDEX_COLUMNS;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int[] __getIndexValues() {");
    gold.append("\n      return new int[] {u.getIndexValue(), v.getIndexValue(), w.getIndexValue(), who.getIndexValue(), x.getIndexValue(), z.getIndexValue()};");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __insert(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while(__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"x\":");
    gold.append("\n              x.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"z\":");
    gold.append("\n              z.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"who\":");
    gold.append("\n              who.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"u\":");
    gold.append("\n              u.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"v\":");
    gold.append("\n              v.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"w\":");
    gold.append("\n              w.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            case \"id\":");
    gold.append("\n              id.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n      x.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"z\");");
    gold.append("\n      z.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"who\");");
    gold.append("\n      who.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"u\");");
    gold.append("\n      u.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"v\");");
    gold.append("\n      v.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"w\");");
    gold.append("\n      w.__dump(__writer);");
    gold.append("\n      __writer.writeObjectFieldIntro(\"id\");");
    gold.append("\n      id.__dump(__writer);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __forward.writeObjectFieldIntro(__name);");
    gold.append("\n        __forward.beginObject();");
    gold.append("\n        __reverse.writeObjectFieldIntro(__name);");
    gold.append("\n        __reverse.beginObject();");
    gold.append("\n        x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n        z.__commit(\"z\", __forward, __reverse);");
    gold.append("\n        who.__commit(\"who\", __forward, __reverse);");
    gold.append("\n        u.__commit(\"u\", __forward, __reverse);");
    gold.append("\n        v.__commit(\"v\", __forward, __reverse);");
    gold.append("\n        w.__commit(\"w\", __forward, __reverse);");
    gold.append("\n        id.__commit(\"id\", __forward, __reverse);");
    gold.append("\n        __forward.endObject();");
    gold.append("\n        __reverse.endObject();");
    gold.append("\n        __lowerDirtyCommit();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __revert() {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __isDying = false;");
    gold.append("\n        x.__revert();");
    gold.append("\n        z.__revert();");
    gold.append("\n        who.__revert();");
    gold.append("\n        u.__revert();");
    gold.append("\n        v.__revert();");
    gold.append("\n        w.__revert();");
    gold.append("\n        id.__revert();");
    gold.append("\n        __lowerDirtyRevert();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public String __name() {");
    gold.append("\n      return \"X\";");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __deindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    public void __reindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int __id() {");
    gold.append("\n      return id.get();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __setId(int __id, boolean __force) {");
    gold.append("\n      if (__force) {");
    gold.append("\n        id.forceSet(__id);");
    gold.append("\n      } else {");
    gold.append("\n        id.set(__id);");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxX {");
    gold.append("\n    private DInt32 __dx;");
    gold.append("\n    private DInt32 __du;");
    gold.append("\n    private DInt32 __dv;");
    gold.append("\n    private DInt32 __dw;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxX() {");
    gold.append("\n      __dx = new DInt32();");
    gold.append("\n      __du = new DInt32();");
    gold.append("\n      __dv = new DInt32();");
    gold.append("\n      __dw = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxX __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 4;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __dx.show(__item.x.get(), __obj.planField(\"x\"));");
    gold.append("\n      if (__writer.who.equals(__item.who.get())) {");
    gold.append("\n        __du.show(__item.u.get(), __obj.planField(\"u\"));");
    gold.append("\n        /* privacy check close up */");
    gold.append("\n      } else {");
    gold.append("\n        __du.hide(__obj.planField(\"u\"));");
    gold.append("\n      }");
    gold.append("\n      if (__item.__POLICY_p1(__writer.who)) {");
    gold.append("\n        __dv.show(__item.v.get(), __obj.planField(\"v\"));");
    gold.append("\n        /* privacy check close up */");
    gold.append("\n      } else {");
    gold.append("\n        __dv.hide(__obj.planField(\"v\"));");
    gold.append("\n      }");
    gold.append("\n      if (__item.__POLICY_p1(__writer.who) && __item.__POLICY_p2(__writer.who)) {");
    gold.append("\n        __dw.show(__item.w.get(), __obj.planField(\"w\"));");
    gold.append("\n        /* privacy check close up */");
    gold.append("\n      } else {");
    gold.append("\n        __dw.hide(__obj.planField(\"w\"));");
    gold.append("\n      }");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":0,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_ReturnEmpty_87 = null;
  private String get_ReturnEmpty_87() {
    if (cached_ReturnEmpty_87 != null) {
      return cached_ReturnEmpty_87;
    }
    cached_ReturnEmpty_87 = generateTestOutput(true, "ReturnEmpty_87", "./test_code/Parser_ReturnEmpty_success.a");
    return cached_ReturnEmpty_87;
  }

  @Test
  public void testReturnEmptyEmission() {
    assertEmissionGood(get_ReturnEmpty_87());
  }

  @Test
  public void testReturnEmptySuccess() {
    assertLivePass(get_ReturnEmpty_87());
  }

  @Test
  public void testReturnEmptyGoodWillHappy() {
    assertGoodWillHappy(get_ReturnEmpty_87());
  }

  @Test
  public void testReturnEmptyExceptionFree() {
    assertExceptionFree(get_ReturnEmpty_87());
  }

  @Test
  public void testReturnEmptyTODOFree() {
    assertTODOFree(get_ReturnEmpty_87());
  }

  @Test
  public void stable_ReturnEmpty_87() {
    String live = get_ReturnEmpty_87();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_ReturnEmpty_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class ReturnEmpty_87 extends LivingDocument {");
    gold.append("\n  public ReturnEmpty_87(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaReturnEmpty_87 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaReturnEmpty_87() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(ReturnEmpty_87 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    ReturnEmpty_87 __self = this;");
    gold.append("\n    DeltaReturnEmpty_87 __state = new DeltaReturnEmpty_87();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private void __FUNC_0_foo() {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(1);");
    gold.append("\n    __FUNC_0_foo();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":4,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":4,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_StateMachine_88 = null;
  private String get_StateMachine_88() {
    if (cached_StateMachine_88 != null) {
      return cached_StateMachine_88;
    }
    cached_StateMachine_88 = generateTestOutput(true, "StateMachine_88", "./test_code/Parser_StateMachine_success.a");
    return cached_StateMachine_88;
  }

  @Test
  public void testStateMachineEmission() {
    assertEmissionGood(get_StateMachine_88());
  }

  @Test
  public void testStateMachineSuccess() {
    assertLivePass(get_StateMachine_88());
  }

  @Test
  public void testStateMachineGoodWillHappy() {
    assertGoodWillHappy(get_StateMachine_88());
  }

  @Test
  public void testStateMachineExceptionFree() {
    assertExceptionFree(get_StateMachine_88());
  }

  @Test
  public void testStateMachineTODOFree() {
    assertTODOFree(get_StateMachine_88());
  }

  @Test
  public void stable_StateMachine_88() {
    String live = get_StateMachine_88();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_StateMachine_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class StateMachine_88 extends LivingDocument {");
    gold.append("\n  private final RxInt32 x;");
    gold.append("\n  private final RxFastString ptr;");
    gold.append("\n  public StateMachine_88(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    x = new RxInt32(this, 0);");
    gold.append("\n    ptr = new RxFastString(this, \"\");");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"x\":");
    gold.append("\n            x.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"ptr\":");
    gold.append("\n            ptr.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n    x.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"ptr\");");
    gold.append("\n    ptr.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n    ptr.__commit(\"ptr\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    x.__revert();");
    gold.append("\n    ptr.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaStateMachine_88 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaStateMachine_88() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(StateMachine_88 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    StateMachine_88 __self = this;");
    gold.append("\n    DeltaStateMachine_88 __state = new DeltaStateMachine_88();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  private void __step_foo() {");
    gold.append("\n    __code_cost += 3;");
    gold.append("\n    __track(0);");
    gold.append("\n    x.set(2);");
    gold.append("\n    __track(1);");
    gold.append("\n    __invoke(\"goo\");");
    gold.append("\n  }");
    gold.append("\n  private void __step_goo() {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(2);");
    gold.append("\n    x.set(3);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {");
    gold.append("\n    switch(__new_state) {");
    gold.append("\n      case \"foo\":");
    gold.append("\n        __step_foo();");
    gold.append("\n        return;");
    gold.append("\n      case \"goo\":");
    gold.append("\n        __step_goo();");
    gold.append("\n        return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 4;");
    gold.append("\n    __track(3);");
    gold.append("\n    x.set(1);");
    gold.append("\n    __track(4);");
    gold.append("\n    ptr.set(\"foo\");");
    gold.append("\n    __track(5);");
    gold.append("\n    __transitionStateMachine(\"foo\", 0);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__state\":\"foo\",\"__constructed\":true,\"__entropy\":\"0\",\"x\":1,\"ptr\":\"foo\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__state\":\"\",\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\",\"x\":3} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":9,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"x\":3,\"ptr\":\"foo\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":9,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"x\":3,\"ptr\":\"foo\",\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"x\":3,\"ptr\":\"foo\",\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_StringEscapingBadUnicodeHex_89 = null;
  private String get_StringEscapingBadUnicodeHex_89() {
    if (cached_StringEscapingBadUnicodeHex_89 != null) {
      return cached_StringEscapingBadUnicodeHex_89;
    }
    cached_StringEscapingBadUnicodeHex_89 = generateTestOutput(false, "StringEscapingBadUnicodeHex_89", "./test_code/Parser_StringEscapingBadUnicodeHex_failure.a");
    return cached_StringEscapingBadUnicodeHex_89;
  }

  @Test
  public void testStringEscapingBadUnicodeHexFailure() {
    assertLiveFail(get_StringEscapingBadUnicodeHex_89());
  }

  @Test
  public void testStringEscapingBadUnicodeHexNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_StringEscapingBadUnicodeHex_89());
  }

  @Test
  public void testStringEscapingBadUnicodeHexExceptionFree() {
    assertExceptionFree(get_StringEscapingBadUnicodeHex_89());
  }

  @Test
  public void testStringEscapingBadUnicodeHexTODOFree() {
    assertTODOFree(get_StringEscapingBadUnicodeHex_89());
  }

  @Test
  public void stable_StringEscapingBadUnicodeHex_89() {
    String live = get_StringEscapingBadUnicodeHex_89();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_StringEscapingBadUnicodeHex_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_StringEscapingBadUnicodeHex_failure.a' failed to lex: Unrecognized hex value within the unicode escape value:33('!') (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Lex): Unrecognized hex value within the unicode escape value:33('!') (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_StringEscapingBad_90 = null;
  private String get_StringEscapingBad_90() {
    if (cached_StringEscapingBad_90 != null) {
      return cached_StringEscapingBad_90;
    }
    cached_StringEscapingBad_90 = generateTestOutput(false, "StringEscapingBad_90", "./test_code/Parser_StringEscapingBad_failure.a");
    return cached_StringEscapingBad_90;
  }

  @Test
  public void testStringEscapingBadFailure() {
    assertLiveFail(get_StringEscapingBad_90());
  }

  @Test
  public void testStringEscapingBadNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_StringEscapingBad_90());
  }

  @Test
  public void testStringEscapingBadExceptionFree() {
    assertExceptionFree(get_StringEscapingBad_90());
  }

  @Test
  public void testStringEscapingBadTODOFree() {
    assertTODOFree(get_StringEscapingBad_90());
  }

  @Test
  public void stable_StringEscapingBad_90() {
    String live = get_StringEscapingBad_90();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_StringEscapingBad_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"File './test_code/Parser_StringEscapingBad_failure.a' failed to lex: Unrecognized string escape value:122('z') (ParseException)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 0,");
    gold.append("\n      \"character\" : 0");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"Import failed (Lex): Unrecognized string escape value:122('z') (ImportIssue)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_StringEscaping_91 = null;
  private String get_StringEscaping_91() {
    if (cached_StringEscaping_91 != null) {
      return cached_StringEscaping_91;
    }
    cached_StringEscaping_91 = generateTestOutput(true, "StringEscaping_91", "./test_code/Parser_StringEscaping_success.a");
    return cached_StringEscaping_91;
  }

  @Test
  public void testStringEscapingEmission() {
    assertEmissionGood(get_StringEscaping_91());
  }

  @Test
  public void testStringEscapingSuccess() {
    assertLivePass(get_StringEscaping_91());
  }

  @Test
  public void testStringEscapingGoodWillHappy() {
    assertGoodWillHappy(get_StringEscaping_91());
  }

  @Test
  public void testStringEscapingExceptionFree() {
    assertExceptionFree(get_StringEscaping_91());
  }

  @Test
  public void testStringEscapingTODOFree() {
    assertTODOFree(get_StringEscaping_91());
  }

  @Test
  public void stable_StringEscaping_91() {
    String live = get_StringEscaping_91();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_StringEscaping_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class StringEscaping_91 extends LivingDocument {");
    gold.append("\n  public StringEscaping_91(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaStringEscaping_91 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaStringEscaping_91() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(StringEscaping_91 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    StringEscaping_91 __self = this;");
    gold.append("\n    DeltaStringEscaping_91 __state = new DeltaStringEscaping_91();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 5;");
    gold.append("\n    __track(0);");
    gold.append("\n    String s0 = \"xyz\";");
    gold.append("\n    __track(1);");
    gold.append("\n    String s1 = \"\\n\\t\\b\\f\";");
    gold.append("\n    __track(2);");
    gold.append("\n    String s2 = \"\\u0012\";");
    gold.append("\n    __track(3);");
    gold.append("\n    String s3 = \"\\uafaf\";");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":5,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":5,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_SymbolClustering_92 = null;
  private String get_SymbolClustering_92() {
    if (cached_SymbolClustering_92 != null) {
      return cached_SymbolClustering_92;
    }
    cached_SymbolClustering_92 = generateTestOutput(true, "SymbolClustering_92", "./test_code/Parser_SymbolClustering_success.a");
    return cached_SymbolClustering_92;
  }

  @Test
  public void testSymbolClusteringEmission() {
    assertEmissionGood(get_SymbolClustering_92());
  }

  @Test
  public void testSymbolClusteringSuccess() {
    assertLivePass(get_SymbolClustering_92());
  }

  @Test
  public void testSymbolClusteringGoodWillHappy() {
    assertGoodWillHappy(get_SymbolClustering_92());
  }

  @Test
  public void testSymbolClusteringExceptionFree() {
    assertExceptionFree(get_SymbolClustering_92());
  }

  @Test
  public void testSymbolClusteringTODOFree() {
    assertTODOFree(get_SymbolClustering_92());
  }

  @Test
  public void stable_SymbolClustering_92() {
    String live = get_SymbolClustering_92();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_SymbolClustering_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class SymbolClustering_92 extends LivingDocument {");
    gold.append("\n  private final RxInt32 x;");
    gold.append("\n  public SymbolClustering_92(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    x = new RxInt32(this, 0);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"x\":");
    gold.append("\n            x.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n    x.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    x.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaSymbolClustering_92 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaSymbolClustering_92() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(SymbolClustering_92 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    SymbolClustering_92 __self = this;");
    gold.append("\n    DeltaSymbolClustering_92 __state = new DeltaSymbolClustering_92();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    x.set((1 + -2));");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\",\"x\":-1} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":2,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"x\":-1,\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":2,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"x\":-1,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"x\":-1,\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_Testing_93 = null;
  private String get_Testing_93() {
    if (cached_Testing_93 != null) {
      return cached_Testing_93;
    }
    cached_Testing_93 = generateTestOutput(true, "Testing_93", "./test_code/Parser_Testing_success.a");
    return cached_Testing_93;
  }

  @Test
  public void testTestingEmission() {
    assertEmissionGood(get_Testing_93());
  }

  @Test
  public void testTestingSuccess() {
    assertLivePass(get_Testing_93());
  }

  @Test
  public void testTestingGoodWillHappy() {
    assertGoodWillHappy(get_Testing_93());
  }

  @Test
  public void testTestingExceptionFree() {
    assertExceptionFree(get_Testing_93());
  }

  @Test
  public void testTestingTODOFree() {
    assertTODOFree(get_Testing_93());
  }

  @Test
  public void stable_Testing_93() {
    String live = get_Testing_93();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_Testing_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class Testing_93 extends LivingDocument {");
    gold.append("\n  private final RxInt32 x;");
    gold.append("\n  public Testing_93(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    x = new RxInt32(this, 1);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"x\":");
    gold.append("\n            x.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n    x.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    x.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaTesting_93 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaTesting_93() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(Testing_93 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    Testing_93 __self = this;");
    gold.append("\n    DeltaTesting_93 __state = new DeltaTesting_93();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  private void __step_bump() {");
    gold.append("\n    __code_cost += 3;");
    gold.append("\n    __track(0);");
    gold.append("\n    x.bumpUpPost();");
    gold.append("\n    __track(1);");
    gold.append("\n    __transitionStateMachine(\"dump\", 0);");
    gold.append("\n  }");
    gold.append("\n  private void __step_dump() {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(2);");
    gold.append("\n    throw new ComputeBlockedException(null, null);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {");
    gold.append("\n    switch(__new_state) {");
    gold.append("\n      case \"bump\":");
    gold.append("\n        __step_bump();");
    gold.append("\n        return;");
    gold.append("\n      case \"dump\":");
    gold.append("\n        __step_dump();");
    gold.append("\n        return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  public void __test_PrimaryTest(TestReportBuilder report) {");
    gold.append("\n    report.begin(\"PrimaryTest\");");
    gold.append("\n    {");
    gold.append("\n      __code_cost += 4;");
    gold.append("\n      __track(3);");
    gold.append("\n      __assert_truth(true, 15, 2, 15, 14);");
    gold.append("\n      __track(4);");
    gold.append("\n      __test_progress();");
    gold.append("\n      __track(5);");
    gold.append("\n      __assert_truth(x.get() == 2, 17, 2, 17, 16);");
    gold.append("\n    }");
    gold.append("\n    report.end(getAndResetAssertions());");
    gold.append("\n  }");
    gold.append("\n  public void __test_SecondTest(TestReportBuilder report) {");
    gold.append("\n    report.begin(\"SecondTest\");");
    gold.append("\n    {");
    gold.append("\n      __code_cost += 3;");
    gold.append("\n      __track(6);");
    gold.append("\n      __assert_truth(true, 21, 2, 21, 14);");
    gold.append("\n      __track(7);");
    gold.append("\n      __assert_truth(x.get() == 1, 22, 2, 22, 16);");
    gold.append("\n    }");
    gold.append("\n    report.end(getAndResetAssertions());");
    gold.append("\n  }");
    gold.append("\n  public void __test_ThirdTest(TestReportBuilder report) {");
    gold.append("\n    report.begin(\"ThirdTest\");");
    gold.append("\n    {");
    gold.append("\n      __code_cost += 5;");
    gold.append("\n      __track(8);");
    gold.append("\n      __assert_truth(true, 26, 2, 26, 14);");
    gold.append("\n      __track(9);");
    gold.append("\n      __test_progress();");
    gold.append("\n      __track(10);");
    gold.append("\n      __assert_truth(x.get() == 2, 28, 2, 28, 16);");
    gold.append("\n      __track(11);");
    gold.append("\n      __assert_truth(!false, 29, 2, 29, 16);");
    gold.append("\n    }");
    gold.append("\n    report.end(getAndResetAssertions());");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {\"PrimaryTest\", \"SecondTest\", \"ThirdTest\"};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {");
    gold.append("\n    switch(testName) {");
    gold.append("\n      case \"PrimaryTest\":");
    gold.append("\n          __test_PrimaryTest(report);");
    gold.append("\n          return;");
    gold.append("\n      case \"SecondTest\":");
    gold.append("\n          __test_SecondTest(report);");
    gold.append("\n          return;");
    gold.append("\n      case \"ThirdTest\":");
    gold.append("\n          __test_ThirdTest(report);");
    gold.append("\n          return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(12);");
    gold.append("\n    __transitionStateMachine(\"bump\", 0);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__state\":\"bump\",\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__state\":\"dump\",\"__next_time\":\"25\",\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\",\"x\":2} need:true in:0");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"50\"}-->{\"__blocked\":true,\"__seq\":2} need:false in:0");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"75\"}-->{\"__goodwill_used\":0,\"__cost\":7,\"__billing_seq\":2} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"dump\",\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__next_time\":\"25\",\"__seq\":2,\"__time\":\"25\",\"x\":2,\"__blocked\":true,\"__goodwill_used\":0,\"__cost\":7,\"__billing_seq\":2}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"x\":2,\"__state\":\"dump\",\"__constructed\":true,\"__next_time\":\"25\",\"__blocked\":true,\"__seq\":2,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"75\"}");
    gold.append("\n{\"x\":2,\"__state\":\"dump\",\"__constructed\":true,\"__next_time\":\"25\",\"__blocked\":true,\"__seq\":2,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"75\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\nTEST[PrimaryTest] = 100.0%");
    gold.append("\nTEST[SecondTest] = 100.0%");
    gold.append("\nTEST[ThirdTest] = 100.0%");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_TheNoState_94 = null;
  private String get_TheNoState_94() {
    if (cached_TheNoState_94 != null) {
      return cached_TheNoState_94;
    }
    cached_TheNoState_94 = generateTestOutput(true, "TheNoState_94", "./test_code/Parser_TheNoState_success.a");
    return cached_TheNoState_94;
  }

  @Test
  public void testTheNoStateEmission() {
    assertEmissionGood(get_TheNoState_94());
  }

  @Test
  public void testTheNoStateSuccess() {
    assertLivePass(get_TheNoState_94());
  }

  @Test
  public void testTheNoStateGoodWillHappy() {
    assertGoodWillHappy(get_TheNoState_94());
  }

  @Test
  public void testTheNoStateExceptionFree() {
    assertExceptionFree(get_TheNoState_94());
  }

  @Test
  public void testTheNoStateTODOFree() {
    assertTODOFree(get_TheNoState_94());
  }

  @Test
  public void stable_TheNoState_94() {
    String live = get_TheNoState_94();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_TheNoState_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class TheNoState_94 extends LivingDocument {");
    gold.append("\n  private final RxFastString x;");
    gold.append("\n  private final RxString z;");
    gold.append("\n  public TheNoState_94(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    x = new RxFastString(this, \"\");");
    gold.append("\n    z = new RxString(this, \"\");");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"x\":");
    gold.append("\n            x.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"z\":");
    gold.append("\n            z.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"x\");");
    gold.append("\n    x.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"z\");");
    gold.append("\n    z.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    x.__commit(\"x\", __forward, __reverse);");
    gold.append("\n    z.__commit(\"z\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    x.__revert();");
    gold.append("\n    z.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaTheNoState_94 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaTheNoState_94() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(TheNoState_94 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    TheNoState_94 __self = this;");
    gold.append("\n    DeltaTheNoState_94 __state = new DeltaTheNoState_94();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  private void __step_() {}");
    gold.append("\n  private void __step_foo() {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {");
    gold.append("\n    switch(__new_state) {");
    gold.append("\n      case \"\":");
    gold.append("\n        __step_();");
    gold.append("\n        return;");
    gold.append("\n      case \"foo\":");
    gold.append("\n        __step_foo();");
    gold.append("\n        return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 8;");
    gold.append("\n    __track(0);");
    gold.append("\n    x.set(\"foo\");");
    gold.append("\n    __track(1);");
    gold.append("\n    x.set(\"\");");
    gold.append("\n    __track(2);");
    gold.append("\n    x.set(\"\");");
    gold.append("\n    __track(3);");
    gold.append("\n    x.set(\"foo\");");
    gold.append("\n    __track(4);");
    gold.append("\n    z.set(\"\");");
    gold.append("\n    __track(5);");
    gold.append("\n    String y = \"\";");
    gold.append("\n    __track(6);");
    gold.append("\n    x.set(\"foo\");");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\",\"x\":\"foo\",\"z\":\"\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":8,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"x\":\"foo\",\"z\":\"\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":8,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"x\":\"foo\",\"z\":\"\",\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"x\":\"foo\",\"z\":\"\",\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_UnicodeInString_95 = null;
  private String get_UnicodeInString_95() {
    if (cached_UnicodeInString_95 != null) {
      return cached_UnicodeInString_95;
    }
    cached_UnicodeInString_95 = generateTestOutput(true, "UnicodeInString_95", "./test_code/Parser_UnicodeInString_success.a");
    return cached_UnicodeInString_95;
  }

  @Test
  public void testUnicodeInStringEmission() {
    assertEmissionGood(get_UnicodeInString_95());
  }

  @Test
  public void testUnicodeInStringSuccess() {
    assertLivePass(get_UnicodeInString_95());
  }

  @Test
  public void testUnicodeInStringGoodWillHappy() {
    assertGoodWillHappy(get_UnicodeInString_95());
  }

  @Test
  public void testUnicodeInStringExceptionFree() {
    assertExceptionFree(get_UnicodeInString_95());
  }

  @Test
  public void testUnicodeInStringTODOFree() {
    assertTODOFree(get_UnicodeInString_95());
  }

  @Test
  public void stable_UnicodeInString_95() {
    String live = get_UnicodeInString_95();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_UnicodeInString_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class UnicodeInString_95 extends LivingDocument {");
    gold.append("\n  public UnicodeInString_95(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaUnicodeInString_95 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaUnicodeInString_95() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(UnicodeInString_95 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    UnicodeInString_95 __self = this;");
    gold.append("\n    DeltaUnicodeInString_95 __state = new DeltaUnicodeInString_95();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  private void __construct_0(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    String x = \"猿も木から落ちる\";");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient __who, NtMessageBase __object) {");
    gold.append("\n    __construct_0(__who, __object);");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":2,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":2,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
  private String cached_ViewerCompute_96 = null;
  private String get_ViewerCompute_96() {
    if (cached_ViewerCompute_96 != null) {
      return cached_ViewerCompute_96;
    }
    cached_ViewerCompute_96 = generateTestOutput(true, "ViewerCompute_96", "./test_code/Parser_ViewerCompute_success.a");
    return cached_ViewerCompute_96;
  }

  @Test
  public void testViewerComputeEmission() {
    assertEmissionGood(get_ViewerCompute_96());
  }

  @Test
  public void testViewerComputeSuccess() {
    assertLivePass(get_ViewerCompute_96());
  }

  @Test
  public void testViewerComputeGoodWillHappy() {
    assertGoodWillHappy(get_ViewerCompute_96());
  }

  @Test
  public void testViewerComputeExceptionFree() {
    assertExceptionFree(get_ViewerCompute_96());
  }

  @Test
  public void testViewerComputeTODOFree() {
    assertTODOFree(get_ViewerCompute_96());
  }

  @Test
  public void stable_ViewerCompute_96() {
    String live = get_ViewerCompute_96();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:Parser_ViewerCompute_success.a");
    gold.append("\n--EMISSION-----------------------------------------");
    gold.append("\nEmission Success, Yay");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\nimport com.fasterxml.jackson.databind.JsonNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ArrayNode;");
    gold.append("\nimport com.fasterxml.jackson.databind.node.ObjectNode;");
    gold.append("\nimport org.adamalang.runtime.*;");
    gold.append("\nimport org.adamalang.runtime.async.*;");
    gold.append("\nimport org.adamalang.runtime.contracts.*;");
    gold.append("\nimport org.adamalang.runtime.delta.*;");
    gold.append("\nimport org.adamalang.runtime.exceptions.*;");
    gold.append("\nimport org.adamalang.runtime.index.*;");
    gold.append("\nimport org.adamalang.runtime.json.*;");
    gold.append("\nimport org.adamalang.runtime.natives.*;");
    gold.append("\nimport org.adamalang.runtime.natives.lists.*;");
    gold.append("\nimport org.adamalang.runtime.ops.*;");
    gold.append("\nimport org.adamalang.runtime.reactives.*;");
    gold.append("\nimport org.adamalang.runtime.stdlib.*;");
    gold.append("\nimport java.util.function.Consumer;");
    gold.append("\nimport java.util.function.Function;");
    gold.append("\nimport java.util.ArrayList;");
    gold.append("\nimport java.util.Comparator;");
    gold.append("\nimport java.util.Map;");
    gold.append("\nimport java.lang.Math;");
    gold.append("\npublic class ViewerCompute_96 extends LivingDocument {");
    gold.append("\n  private final RxGuard ___y;");
    gold.append("\n  public int __COMPUTE_y(NtClient who) {");
    gold.append("\n    return 2;");
    gold.append("\n  }");
    gold.append("\n  public ViewerCompute_96(DocumentMonitor __monitor) {");
    gold.append("\n    super(__monitor);");
    gold.append("\n    ___y =  new RxGuard();");
    gold.append("\n    __goodwillBudget = 100000;");
    gold.append("\n    __goodwillLimitOfBudget = 100000;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __insert(JsonStreamReader __reader) {");
    gold.append("\n    if (__reader.startObject()) {");
    gold.append("\n      while(__reader.notEndOfObject()) {");
    gold.append("\n        String __fieldName = __reader.fieldName();");
    gold.append("\n        switch (__fieldName) {");
    gold.append("\n          case \"__state\":");
    gold.append("\n            __state.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__constructed\":");
    gold.append("\n            __constructed.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__next_time\":");
    gold.append("\n            __next_time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__blocked\":");
    gold.append("\n            __blocked.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__seq\":");
    gold.append("\n            __seq.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__entropy\":");
    gold.append("\n            __entropy.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__auto_future_id\":");
    gold.append("\n            __auto_future_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__connection_id\":");
    gold.append("\n            __connection_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__message_id\":");
    gold.append("\n            __message_id.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__time\":");
    gold.append("\n            __time.__insert(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__clients\":");
    gold.append("\n            __hydrateClients(__reader);");
    gold.append("\n            break;");
    gold.append("\n          case \"__messages\":");
    gold.append("\n            __hydrateMessages(__reader);");
    gold.append("\n            break;");
    gold.append("\n          default:");
    gold.append("\n            __reader.skipValue();");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n    __writer.beginObject();");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__state\");");
    gold.append("\n    __state.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__constructed\");");
    gold.append("\n    __constructed.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__next_time\");");
    gold.append("\n    __next_time.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__blocked\");");
    gold.append("\n    __blocked.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__seq\");");
    gold.append("\n    __seq.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__entropy\");");
    gold.append("\n    __entropy.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__auto_future_id\");");
    gold.append("\n    __auto_future_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__connection_id\");");
    gold.append("\n    __connection_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__message_id\");");
    gold.append("\n    __message_id.__dump(__writer);");
    gold.append("\n    __writer.writeObjectFieldIntro(\"__time\");");
    gold.append("\n    __time.__dump(__writer);");
    gold.append("\n    __dumpClients(__writer);");
    gold.append("\n    __dumpMessages(__writer);");
    gold.append("\n    __writer.endObject();");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n    __state.__commit(\"__state\", __forward, __reverse);");
    gold.append("\n    __constructed.__commit(\"__constructed\", __forward, __reverse);");
    gold.append("\n    __next_time.__commit(\"__next_time\", __forward, __reverse);");
    gold.append("\n    __blocked.__commit(\"__blocked\", __forward, __reverse);");
    gold.append("\n    __seq.__commit(\"__seq\", __forward, __reverse);");
    gold.append("\n    __entropy.__commit(\"__entropy\", __forward, __reverse);");
    gold.append("\n    __auto_future_id.__commit(\"__auto_future_id\", __forward, __reverse);");
    gold.append("\n    __connection_id.__commit(\"__connection_id\", __forward, __reverse);");
    gold.append("\n    __message_id.__commit(\"__message_id\", __forward, __reverse);");
    gold.append("\n    __time.__commit(\"__time\", __forward, __reverse);");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __revert() {");
    gold.append("\n    __state.__revert();");
    gold.append("\n    __constructed.__revert();");
    gold.append("\n    __next_time.__revert();");
    gold.append("\n    __blocked.__revert();");
    gold.append("\n    __seq.__revert();");
    gold.append("\n    __entropy.__revert();");
    gold.append("\n    __auto_future_id.__revert();");
    gold.append("\n    __connection_id.__revert();");
    gold.append("\n    __message_id.__revert();");
    gold.append("\n    __time.__revert();");
    gold.append("\n    /* root */");
    gold.append("\n  }");
    gold.append("\n  private class DeltaViewerCompute_96 {");
    gold.append("\n    private int __gy;");
    gold.append("\n    private DInt32 __dy;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaViewerCompute_96() {");
    gold.append("\n      __gy = -1;");
    gold.append("\n      __dy = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(ViewerCompute_96 __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __obj.manifest();");
    gold.append("\n      if (__gy != __item.___y.getGeneration()) {");
    gold.append("\n        Integer __local_y = __item.__COMPUTE_y(__writer.who);");
    gold.append("\n        __dy.show(__local_y, __obj.planField(\"y\"));");
    gold.append("\n        __gy = __item.___y.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public PrivateView __createPrivateView(NtClient __who, Consumer<String> __updates) {");
    gold.append("\n    ViewerCompute_96 __self = this;");
    gold.append("\n    DeltaViewerCompute_96 __state = new DeltaViewerCompute_96();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private class RTxM extends RxRecordBase<RTxM> {");
    gold.append("\n    private final RxInt32 id;");
    gold.append("\n    private final RxGuard ___x;");
    gold.append("\n    private RTxM(RxParent __owner) {");
    gold.append("\n      super(__owner);");
    gold.append("\n      id = new RxInt32(this, 0);");
    gold.append("\n      ___x =  new RxGuard();");
    gold.append("\n      if (__owner instanceof RxTable) {");
    gold.append("\n        /* ok */");
    gold.append("\n      } else {");
    gold.append("\n        /* ok */");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public int __COMPUTE_x(NtClient who) {");
    gold.append("\n      return 1;");
    gold.append("\n    }");
    gold.append("\n    String[] __INDEX_COLUMNS = new String[] {};");
    gold.append("\n    @Override");
    gold.append("\n    public String[] __getIndexColumns() {");
    gold.append("\n      return __INDEX_COLUMNS;");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int[] __getIndexValues() {");
    gold.append("\n      return new int[] {};");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __insert(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while(__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"id\":");
    gold.append("\n              id.__insert(__reader);");
    gold.append("\n              break;");
    gold.append("\n            default:");
    gold.append("\n              __reader.skipValue();");
    gold.append("\n          }");
    gold.append("\n        }");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __dump(JsonStreamWriter __writer) {");
    gold.append("\n      __writer.beginObject();");
    gold.append("\n      __writer.writeObjectFieldIntro(\"id\");");
    gold.append("\n      id.__dump(__writer);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __commit(String __name, JsonStreamWriter __forward, JsonStreamWriter __reverse) {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __forward.writeObjectFieldIntro(__name);");
    gold.append("\n        __forward.beginObject();");
    gold.append("\n        __reverse.writeObjectFieldIntro(__name);");
    gold.append("\n        __reverse.beginObject();");
    gold.append("\n        id.__commit(\"id\", __forward, __reverse);");
    gold.append("\n        __forward.endObject();");
    gold.append("\n        __reverse.endObject();");
    gold.append("\n        __lowerDirtyCommit();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __revert() {");
    gold.append("\n      if (__isDirty()) {");
    gold.append("\n        __isDying = false;");
    gold.append("\n        id.__revert();");
    gold.append("\n        __lowerDirtyRevert();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public String __name() {");
    gold.append("\n      return \"M\";");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __deindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    public void __reindex() {");
    gold.append("\n      /* ok */");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public int __id() {");
    gold.append("\n      return id.get();");
    gold.append("\n    }");
    gold.append("\n    @Override");
    gold.append("\n    public void __setId(int __id, boolean __force) {");
    gold.append("\n      if (__force) {");
    gold.append("\n        id.forceSet(__id);");
    gold.append("\n      } else {");
    gold.append("\n        id.set(__id);");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxM {");
    gold.append("\n    private int __gx;");
    gold.append("\n    private DInt32 __dx;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxM() {");
    gold.append("\n      __gx = -1;");
    gold.append("\n      __dx = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxM __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      if (__gx != __item.___x.getGeneration()) {");
    gold.append("\n        Integer __local_x = __item.__COMPUTE_x(__writer.who);");
    gold.append("\n        __dx.show(__local_x, __obj.planField(\"x\"));");
    gold.append("\n        __gx = __item.___x.getGeneration();");
    gold.append("\n      }");
    gold.append("\n      if (__obj.end()) {");
    gold.append("\n        __emitted = true;");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n    public void hide(PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      if (__emitted) {");
    gold.append("\n        __emitted = false;");
    gold.append("\n        __writer.writeNull();");
    gold.append("\n      }");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask task) {");
    gold.append("\n    return;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String channel, JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {}");
    gold.append("\n  @Override");
    gold.append("\n  public boolean __onConnected(NtClient __cvalue) {");
    gold.append("\n    boolean __result = false;");
    gold.append("\n    return __result;");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __onDisconnected(NtClient __cvalue) {}");
    gold.append("\n  @Override");
    gold.append("\n  public String[] __getTests() {");
    gold.append("\n    return new String[] {};");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  public void __test(TestReportBuilder report, String testName) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected void __construct_intern(NtClient who, NtMessageBase message) {}");
    gold.append("\n  @Override");
    gold.append("\n  protected NtMessageBase __parse_construct_arg(JsonStreamReader __reader) {");
    gold.append("\n    __reader.skipValue();");
    gold.append("\n    return NtMessageBase.NULL;");
    gold.append("\n  }");
    gold.append("\n  /* end of file */");
    gold.append("\n}");
    gold.append("\n");
    gold.append("\n--JAVA COMPILE RESULTS-----------------------------");
    gold.append("\n--JAVA RUNNING-------------------------------------");
    gold.append("\n{\"command\":\"construct\",\"timestamp\":\"0\",\"who\":{\"agent\":\"?\",\"authority\":\"?\"},\"arg\":{},\"entropy\":\"0\"}-->{\"__constructed\":true,\"__entropy\":\"0\"} need:true in:0");
    gold.append("\nNO_ONE was DENIED:5011");
    gold.append("\nRANDO was DENIED:5011");
    gold.append("\n+ NO_ONE DELTA:{\"data\":{\"y\":2},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n+ RANDO DELTA:{\"data\":{\"y\":2},\"outstanding\":[],\"blockers\":[],\"seq\":1}");
    gold.append("\n{\"command\":\"invalidate\",\"timestamp\":\"25\"}-->{\"__messages\":null,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__time\":\"25\"} need:false in:-25");
    gold.append("\n{\"command\":\"bill\",\"timestamp\":\"50\"}-->{\"__goodwill_used\":0,\"__cost\":2,\"__billing_seq\":1} need:true in:0");
    gold.append("\n--JAVA RESULTS-------------------------------------");
    gold.append("\n{\"__constructed\":true,\"__entropy\":\"-4962768465676381896\",\"__seq\":1,\"__time\":\"25\",\"__goodwill_used\":0,\"__cost\":2,\"__billing_seq\":1}");
    gold.append("\n--DUMP RESULTS-------------------------------------");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n{\"__state\":\"\",\"__constructed\":true,\"__next_time\":\"0\",\"__blocked\":false,\"__seq\":1,\"__entropy\":\"-4962768465676381896\",\"__auto_future_id\":0,\"__connection_id\":0,\"__message_id\":0,\"__time\":\"50\"}");
    gold.append("\n--JAVA TEST RESULTS--------------------------------");
    gold.append("\n");
    gold.append("\nSuccess");
    assertStable(live, gold);
  }
}
