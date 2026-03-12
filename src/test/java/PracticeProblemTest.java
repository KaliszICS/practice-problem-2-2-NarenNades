import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PracticeProblemTest {

   // ─────────────────────────────────────────────
   // 1 & 6. isEven
   // ─────────────────────────────────────────────

   @Test
   @DisplayName("isEven: 4 is even → true")
   void isEvenTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isEven", cArg);
         assertEquals(true, (boolean) method.invoke(null, 4));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isEven: 7 is odd → false")
   void isEvenTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isEven", cArg);
         assertEquals(false, (boolean) method.invoke(null, 7));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isEven: 0 is considered even → true")
   void isEvenTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isEven", cArg);
         assertEquals(true, (boolean) method.invoke(null, 0));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isEven: -2 is even → true")
   void isEvenTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isEven", cArg);
         assertEquals(true, (boolean) method.invoke(null, -2));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isEven: -3 is odd → false")
   void isEvenTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isEven", cArg);
         assertEquals(false, (boolean) method.invoke(null, -3));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   // ─────────────────────────────────────────────
   // 2 & 7. isOdd
   // ─────────────────────────────────────────────

   @Test
   @DisplayName("isOdd: 3 is odd → true")
   void isOddTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isOdd", cArg);
         assertEquals(true, (boolean) method.invoke(null, 3));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isOdd: 8 is even → false")
   void isOddTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isOdd", cArg);
         assertEquals(false, (boolean) method.invoke(null, 8));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isOdd: 0 is considered even → false")
   void isOddTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isOdd", cArg);
         assertEquals(false, (boolean) method.invoke(null, 0));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isOdd: -5 is odd → true")
   void isOddTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isOdd", cArg);
         assertEquals(true, (boolean) method.invoke(null, -5));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isOdd: -4 is even → false")
   void isOddTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isOdd", cArg);
         assertEquals(false, (boolean) method.invoke(null, -4));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   // ─────────────────────────────────────────────
   // 3 & 8. isPositive
   // ─────────────────────────────────────────────

   @Test
   @DisplayName("isPositive: 5 is positive → true")
   void isPositiveTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isPositive", cArg);
         assertEquals(true, (boolean) method.invoke(null, 5));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isPositive: -3 is not positive → false")
   void isPositiveTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isPositive", cArg);
         assertEquals(false, (boolean) method.invoke(null, -3));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isPositive: 0 is not positive → false")
   void isPositiveTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isPositive", cArg);
         assertEquals(false, (boolean) method.invoke(null, 0));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isPositive: 1 is positive → true")
   void isPositiveTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isPositive", cArg);
         assertEquals(true, (boolean) method.invoke(null, 1));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isPositive: -1 is not positive → false")
   void isPositiveTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isPositive", cArg);
         assertEquals(false, (boolean) method.invoke(null, -1));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   // ─────────────────────────────────────────────
   // 4 & 9. isNegative
   // ─────────────────────────────────────────────

   @Test
   @DisplayName("isNegative: -7 is negative → true")
   void isNegativeTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isNegative", cArg);
         assertEquals(true, (boolean) method.invoke(null, -7));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isNegative: 6 is not negative → false")
   void isNegativeTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isNegative", cArg);
         assertEquals(false, (boolean) method.invoke(null, 6));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isNegative: 0 is not negative → false")
   void isNegativeTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isNegative", cArg);
         assertEquals(false, (boolean) method.invoke(null, 0));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isNegative: -1 is negative → true")
   void isNegativeTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isNegative", cArg);
         assertEquals(true, (boolean) method.invoke(null, -1));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isNegative: 1 is not negative → false")
   void isNegativeTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class };
         Method method = testClass.getDeclaredMethod("isNegative", cArg);
         assertEquals(false, (boolean) method.invoke(null, 1));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   // ─────────────────────────────────────────────
   // 5 & 10. combinedLength
   // ─────────────────────────────────────────────

   @Test
   @DisplayName("combinedLength: \"hello\" + \"world\" = 10")
   void combinedLengthTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class };
         Method method = testClass.getDeclaredMethod("combinedLength", cArg);
         assertEquals(10, (int) method.invoke(null, "hello", "world"));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("combinedLength: \"\" + \"\" = 0")
   void combinedLengthTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class };
         Method method = testClass.getDeclaredMethod("combinedLength", cArg);
         assertEquals(0, (int) method.invoke(null, "", ""));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("combinedLength: \"abc\" + \"\" = 3")
   void combinedLengthTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class };
         Method method = testClass.getDeclaredMethod("combinedLength", cArg);
         assertEquals(3, (int) method.invoke(null, "abc", ""));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("combinedLength: \"\" + \"xyz\" = 3")
   void combinedLengthTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class };
         Method method = testClass.getDeclaredMethod("combinedLength", cArg);
         assertEquals(3, (int) method.invoke(null, "", "xyz"));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("combinedLength: \"Java\" + \"Tests\" = 9")
   void combinedLengthTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class };
         Method method = testClass.getDeclaredMethod("combinedLength", cArg);
         assertEquals(9, (int) method.invoke(null, "Java", "Tests"));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }
}
