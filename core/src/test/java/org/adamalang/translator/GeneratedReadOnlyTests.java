/* The Adama Programming Language For Board Games!
 *    See http://www.adama-lang.org/ for more information.
 * (c) copyright 2020 Jeffrey M. Barber (http://jeffrey.io) */
package org.adamalang.translator;

import org.junit.Test;

public class GeneratedReadOnlyTests extends GeneratedBase {
  private String cached_FutureResultReadOnly_1 = null;
  private String get_FutureResultReadOnly_1() {
    if (cached_FutureResultReadOnly_1 != null) {
      return cached_FutureResultReadOnly_1;
    }
    cached_FutureResultReadOnly_1 = generateTestOutput(false, "FutureResultReadOnly_1", "./test_code/ReadOnly_FutureResultReadOnly_failure.a");
    return cached_FutureResultReadOnly_1;
  }

  @Test
  public void testFutureResultReadOnlyFailure() {
    assertLiveFail(get_FutureResultReadOnly_1());
  }

  @Test
  public void testFutureResultReadOnlyNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_FutureResultReadOnly_1());
  }

  @Test
  public void testFutureResultReadOnlyExceptionFree() {
    assertExceptionFree(get_FutureResultReadOnly_1());
  }

  @Test
  public void testFutureResultReadOnlyTODOFree() {
    assertTODOFree(get_FutureResultReadOnly_1());
  }

  @Test
  public void stable_FutureResultReadOnly_1() {
    String live = get_FutureResultReadOnly_1();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:ReadOnly_FutureResultReadOnly_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 8,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 8,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The variable 'x' is readonly (VariableLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 8,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 8,");
    gold.append("\n      \"character\" : 5");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The field 'x' is on a readonly message (FieldLookup)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_ProcedureArgs_2 = null;
  private String get_ProcedureArgs_2() {
    if (cached_ProcedureArgs_2 != null) {
      return cached_ProcedureArgs_2;
    }
    cached_ProcedureArgs_2 = generateTestOutput(false, "ProcedureArgs_2", "./test_code/ReadOnly_ProcedureArgs_failure.a");
    return cached_ProcedureArgs_2;
  }

  @Test
  public void testProcedureArgsFailure() {
    assertLiveFail(get_ProcedureArgs_2());
  }

  @Test
  public void testProcedureArgsNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_ProcedureArgs_2());
  }

  @Test
  public void testProcedureArgsExceptionFree() {
    assertExceptionFree(get_ProcedureArgs_2());
  }

  @Test
  public void testProcedureArgsTODOFree() {
    assertTODOFree(get_ProcedureArgs_2());
  }

  @Test
  public void stable_ProcedureArgs_2() {
    String live = get_ProcedureArgs_2();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:ReadOnly_ProcedureArgs_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The variable 'x' is readonly (VariableLookup)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_SimpleBool_3 = null;
  private String get_SimpleBool_3() {
    if (cached_SimpleBool_3 != null) {
      return cached_SimpleBool_3;
    }
    cached_SimpleBool_3 = generateTestOutput(false, "SimpleBool_3", "./test_code/ReadOnly_SimpleBool_failure.a");
    return cached_SimpleBool_3;
  }

  @Test
  public void testSimpleBoolFailure() {
    assertLiveFail(get_SimpleBool_3());
  }

  @Test
  public void testSimpleBoolNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_SimpleBool_3());
  }

  @Test
  public void testSimpleBoolExceptionFree() {
    assertExceptionFree(get_SimpleBool_3());
  }

  @Test
  public void testSimpleBoolTODOFree() {
    assertTODOFree(get_SimpleBool_3());
  }

  @Test
  public void stable_SimpleBool_3() {
    String live = get_SimpleBool_3();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:ReadOnly_SimpleBool_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 4,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 4,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The variable 'y' is readonly (VariableLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 6,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 6,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The variable 'z' is readonly (VariableLookup)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_SimpleClient_4 = null;
  private String get_SimpleClient_4() {
    if (cached_SimpleClient_4 != null) {
      return cached_SimpleClient_4;
    }
    cached_SimpleClient_4 = generateTestOutput(false, "SimpleClient_4", "./test_code/ReadOnly_SimpleClient_failure.a");
    return cached_SimpleClient_4;
  }

  @Test
  public void testSimpleClientFailure() {
    assertLiveFail(get_SimpleClient_4());
  }

  @Test
  public void testSimpleClientNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_SimpleClient_4());
  }

  @Test
  public void testSimpleClientExceptionFree() {
    assertExceptionFree(get_SimpleClient_4());
  }

  @Test
  public void testSimpleClientTODOFree() {
    assertTODOFree(get_SimpleClient_4());
  }

  @Test
  public void stable_SimpleClient_4() {
    String live = get_SimpleClient_4();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:ReadOnly_SimpleClient_failure.a");
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
    gold.append("\n  \"message\" : \"The variable 'y' is readonly (VariableLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The variable 'z' is readonly (VariableLookup)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_SimpleDouble_5 = null;
  private String get_SimpleDouble_5() {
    if (cached_SimpleDouble_5 != null) {
      return cached_SimpleDouble_5;
    }
    cached_SimpleDouble_5 = generateTestOutput(false, "SimpleDouble_5", "./test_code/ReadOnly_SimpleDouble_failure.a");
    return cached_SimpleDouble_5;
  }

  @Test
  public void testSimpleDoubleFailure() {
    assertLiveFail(get_SimpleDouble_5());
  }

  @Test
  public void testSimpleDoubleNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_SimpleDouble_5());
  }

  @Test
  public void testSimpleDoubleExceptionFree() {
    assertExceptionFree(get_SimpleDouble_5());
  }

  @Test
  public void testSimpleDoubleTODOFree() {
    assertTODOFree(get_SimpleDouble_5());
  }

  @Test
  public void stable_SimpleDouble_5() {
    String live = get_SimpleDouble_5();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:ReadOnly_SimpleDouble_failure.a");
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
    gold.append("\n  \"message\" : \"The variable 'y' is readonly (VariableLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The variable 'z' is readonly (VariableLookup)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_SimpleEnum_6 = null;
  private String get_SimpleEnum_6() {
    if (cached_SimpleEnum_6 != null) {
      return cached_SimpleEnum_6;
    }
    cached_SimpleEnum_6 = generateTestOutput(false, "SimpleEnum_6", "./test_code/ReadOnly_SimpleEnum_failure.a");
    return cached_SimpleEnum_6;
  }

  @Test
  public void testSimpleEnumFailure() {
    assertLiveFail(get_SimpleEnum_6());
  }

  @Test
  public void testSimpleEnumNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_SimpleEnum_6());
  }

  @Test
  public void testSimpleEnumExceptionFree() {
    assertExceptionFree(get_SimpleEnum_6());
  }

  @Test
  public void testSimpleEnumTODOFree() {
    assertTODOFree(get_SimpleEnum_6());
  }

  @Test
  public void stable_SimpleEnum_6() {
    String live = get_SimpleEnum_6();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:ReadOnly_SimpleEnum_failure.a");
    gold.append("\n--ISSUES-------------------------------------------");
    gold.append("\n[ {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 4,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 4,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The variable 'y' is readonly (VariableLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 6,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 6,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The variable 'z' is readonly (VariableLookup)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_SimpleInteger_7 = null;
  private String get_SimpleInteger_7() {
    if (cached_SimpleInteger_7 != null) {
      return cached_SimpleInteger_7;
    }
    cached_SimpleInteger_7 = generateTestOutput(false, "SimpleInteger_7", "./test_code/ReadOnly_SimpleInteger_failure.a");
    return cached_SimpleInteger_7;
  }

  @Test
  public void testSimpleIntegerFailure() {
    assertLiveFail(get_SimpleInteger_7());
  }

  @Test
  public void testSimpleIntegerNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_SimpleInteger_7());
  }

  @Test
  public void testSimpleIntegerExceptionFree() {
    assertExceptionFree(get_SimpleInteger_7());
  }

  @Test
  public void testSimpleIntegerTODOFree() {
    assertTODOFree(get_SimpleInteger_7());
  }

  @Test
  public void stable_SimpleInteger_7() {
    String live = get_SimpleInteger_7();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:ReadOnly_SimpleInteger_failure.a");
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
    gold.append("\n  \"message\" : \"The variable 'y' is readonly (VariableLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The variable 'z' is readonly (VariableLookup)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_SimpleLong_8 = null;
  private String get_SimpleLong_8() {
    if (cached_SimpleLong_8 != null) {
      return cached_SimpleLong_8;
    }
    cached_SimpleLong_8 = generateTestOutput(false, "SimpleLong_8", "./test_code/ReadOnly_SimpleLong_failure.a");
    return cached_SimpleLong_8;
  }

  @Test
  public void testSimpleLongFailure() {
    assertLiveFail(get_SimpleLong_8());
  }

  @Test
  public void testSimpleLongNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_SimpleLong_8());
  }

  @Test
  public void testSimpleLongExceptionFree() {
    assertExceptionFree(get_SimpleLong_8());
  }

  @Test
  public void testSimpleLongTODOFree() {
    assertTODOFree(get_SimpleLong_8());
  }

  @Test
  public void stable_SimpleLong_8() {
    String live = get_SimpleLong_8();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:ReadOnly_SimpleLong_failure.a");
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
    gold.append("\n  \"message\" : \"The variable 'y' is readonly (VariableLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The variable 'z' is readonly (VariableLookup)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_SimpleMaybe_9 = null;
  private String get_SimpleMaybe_9() {
    if (cached_SimpleMaybe_9 != null) {
      return cached_SimpleMaybe_9;
    }
    cached_SimpleMaybe_9 = generateTestOutput(false, "SimpleMaybe_9", "./test_code/ReadOnly_SimpleMaybe_failure.a");
    return cached_SimpleMaybe_9;
  }

  @Test
  public void testSimpleMaybeFailure() {
    assertLiveFail(get_SimpleMaybe_9());
  }

  @Test
  public void testSimpleMaybeNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_SimpleMaybe_9());
  }

  @Test
  public void testSimpleMaybeExceptionFree() {
    assertExceptionFree(get_SimpleMaybe_9());
  }

  @Test
  public void testSimpleMaybeTODOFree() {
    assertTODOFree(get_SimpleMaybe_9());
  }

  @Test
  public void stable_SimpleMaybe_9() {
    String live = get_SimpleMaybe_9();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:ReadOnly_SimpleMaybe_failure.a");
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
    gold.append("\n  \"message\" : \"The variable 'x' is readonly (VariableLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The variable 'y' is readonly (VariableLookup)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_SimpleString_10 = null;
  private String get_SimpleString_10() {
    if (cached_SimpleString_10 != null) {
      return cached_SimpleString_10;
    }
    cached_SimpleString_10 = generateTestOutput(false, "SimpleString_10", "./test_code/ReadOnly_SimpleString_failure.a");
    return cached_SimpleString_10;
  }

  @Test
  public void testSimpleStringFailure() {
    assertLiveFail(get_SimpleString_10());
  }

  @Test
  public void testSimpleStringNotTerribleLineNumbers() {
    assertNotTerribleLineNumbers(get_SimpleString_10());
  }

  @Test
  public void testSimpleStringExceptionFree() {
    assertExceptionFree(get_SimpleString_10());
  }

  @Test
  public void testSimpleStringTODOFree() {
    assertTODOFree(get_SimpleString_10());
  }

  @Test
  public void stable_SimpleString_10() {
    String live = get_SimpleString_10();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:ReadOnly_SimpleString_failure.a");
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
    gold.append("\n  \"message\" : \"The variable 'y' is readonly (VariableLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 5,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The variable 'z' is readonly (VariableLookup)\"");
    gold.append("\n}, {");
    gold.append("\n  \"range\" : {");
    gold.append("\n    \"start\" : {");
    gold.append("\n      \"line\" : 7,");
    gold.append("\n      \"character\" : 2");
    gold.append("\n    },");
    gold.append("\n    \"end\" : {");
    gold.append("\n      \"line\" : 7,");
    gold.append("\n      \"character\" : 3");
    gold.append("\n    }");
    gold.append("\n  },");
    gold.append("\n  \"severity\" : 1,");
    gold.append("\n  \"source\" : \"error\",");
    gold.append("\n  \"message\" : \"The variable 'k' is readonly (VariableLookup)\"");
    gold.append("\n} ]");
    gold.append("\n--JAVA---------------------------------------------");
    gold.append("\n");
    gold.append("\nFailedValidation");
    assertStable(live, gold);
  }
  private String cached_Simples_11 = null;
  private String get_Simples_11() {
    if (cached_Simples_11 != null) {
      return cached_Simples_11;
    }
    cached_Simples_11 = generateTestOutput(true, "Simples_11", "./test_code/ReadOnly_Simples_success.a");
    return cached_Simples_11;
  }

  @Test
  public void testSimplesEmission() {
    assertEmissionGood(get_Simples_11());
  }

  @Test
  public void testSimplesSuccess() {
    assertLivePass(get_Simples_11());
  }

  @Test
  public void testSimplesGoodWillHappy() {
    assertGoodWillHappy(get_Simples_11());
  }

  @Test
  public void testSimplesExceptionFree() {
    assertExceptionFree(get_Simples_11());
  }

  @Test
  public void testSimplesTODOFree() {
    assertTODOFree(get_Simples_11());
  }

  @Test
  public void stable_Simples_11() {
    String live = get_Simples_11();
    StringBuilder gold = new StringBuilder();
    gold.append("Path:ReadOnly_Simples_success.a");
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
    gold.append("\npublic class Simples_11 extends LivingDocument {");
    gold.append("\n  public Simples_11(DocumentMonitor __monitor) {");
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
    gold.append("\n  private class DeltaSimples_11 {");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaSimples_11() {");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(Simples_11 __item, PrivateLazyDeltaWriter __writer) {");
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
    gold.append("\n    Simples_11 __self = this;");
    gold.append("\n    DeltaSimples_11 __state = new DeltaSimples_11();");
    gold.append("\n    return new PrivateView(__who, __updates) {");
    gold.append("\n      @Override");
    gold.append("\n      public void update(JsonStreamWriter __writer) {");
    gold.append("\n        __state.show(__self, PrivateLazyDeltaWriter.bind(__who, __writer));");
    gold.append("\n      }");
    gold.append("\n    };");
    gold.append("\n  }");
    gold.append("\n  private static class RTxM implements NtMessageBase {");
    gold.append("\n    private int xyz = 123;");
    gold.append("\n    private RTxM(JsonStreamReader __reader) {");
    gold.append("\n      if (__reader.startObject()) {");
    gold.append("\n        while (__reader.notEndOfObject()) {");
    gold.append("\n          String __fieldName = __reader.fieldName();");
    gold.append("\n          switch (__fieldName) {");
    gold.append("\n            case \"xyz\":");
    gold.append("\n              this.xyz = __reader.readInteger();");
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
    gold.append("\n      __writer.writeObjectFieldIntro(\"xyz\");");
    gold.append("\n      __writer.writeInteger(xyz);");
    gold.append("\n      __writer.endObject();");
    gold.append("\n    }");
    gold.append("\n    private RTxM() {}");
    gold.append("\n    private RTxM(int xyz) {");
    gold.append("\n      this.xyz = xyz;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  private class DeltaRTxM {");
    gold.append("\n    private DInt32 __dxyz;");
    gold.append("\n    private boolean __emitted;");
    gold.append("\n    private DeltaRTxM() {");
    gold.append("\n      __dxyz = new DInt32();");
    gold.append("\n      __emitted = false;");
    gold.append("\n    }");
    gold.append("\n    public void show(RTxM __item, PrivateLazyDeltaWriter __writer) {");
    gold.append("\n      __code_cost += 1;");
    gold.append("\n      PrivateLazyDeltaWriter __obj = __writer.planObject();");
    gold.append("\n      __dxyz.show(__item.xyz, __obj.planField(\"xyz\"));");
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
    gold.append("\n  private final Sink<RTxM> __queue_foo = new Sink<>(\"foo\");");
    gold.append("\n  private final NtChannel<RTxM> foo = new NtChannel<>(__futures, __queue_foo);");
    gold.append("\n  @Override");
    gold.append("\n  protected void __route(AsyncTask __task) {");
    gold.append("\n    switch (__task.channel) {");
    gold.append("\n      case \"foo\":");
    gold.append("\n        __queue_foo.enqueue(__task, (RTxM) __task.message);");
    gold.append("\n        return;");
    gold.append("\n      default:");
    gold.append("\n        return;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected Object __parse_message2(String __channel, JsonStreamReader __reader) {");
    gold.append("\n    switch (__channel) {");
    gold.append("\n      case \"foo\":");
    gold.append("\n        return new RTxM(__reader);");
    gold.append("\n      default:");
    gold.append("\n        __reader.skipValue();");
    gold.append("\n        return NtMessageBase.NULL;");
    gold.append("\n    }");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __reset_future_queues() {");
    gold.append("\n    __queue_foo.clear();");
    gold.append("\n  }");
    gold.append("\n  private void __step_fooz() {");
    gold.append("\n    __code_cost += 2;");
    gold.append("\n    __track(0);");
    gold.append("\n    final SimpleFuture<RTxM> fut = foo.fetch(NtClient.NO_ONE);");
    gold.append("\n  }");
    gold.append("\n  @Override");
    gold.append("\n  protected void __invoke_label(String __new_state) {");
    gold.append("\n    switch(__new_state) {");
    gold.append("\n      case \"fooz\":");
    gold.append("\n        __step_fooz();");
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
    gold.append("\n    __code_cost += 14;");
    gold.append("\n    __track(1);");
    gold.append("\n    final int r0 = 1;");
    gold.append("\n    __track(2);");
    gold.append("\n    final boolean r1 = true;");
    gold.append("\n    __track(3);");
    gold.append("\n    final long r2 = 3L;");
    gold.append("\n    __track(4);");
    gold.append("\n    final double r3 = 4.42;");
    gold.append("\n    __track(5);");
    gold.append("\n    final String r4 = \"\";");
    gold.append("\n    __track(6);");
    gold.append("\n    final NtList<Integer> r5 = new EmptyNtList<Integer>();");
    gold.append("\n    __track(7);");
    gold.append("\n    final NtList<NtClient> r6 = new EmptyNtList<NtClient>();");
    gold.append("\n    __track(8);");
    gold.append("\n    final NtClient r7 = NtClient.NO_ONE;");
    gold.append("\n    __track(9);");
    gold.append("\n    final NtMaybe<Integer> r8 = new NtMaybe<Integer>(100);");
    gold.append("\n    __track(10);");
    gold.append("\n    NtTable<RTxM> p = new NtTable<RTxM>(() -> new RTxM());");
    gold.append("\n    __track(11);");
    gold.append("\n    final NtTable<RTxM> r9 = new NtTable<RTxM>(p);");
    gold.append("\n    __track(12);");
    gold.append("\n    final NtChannel<RTxM> r10 = foo;");
    gold.append("\n    __track(13);");
    gold.append("\n    final NtTable<RTxM> r11 = new NtTable<RTxM>(() -> new RTxM());");
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
}
