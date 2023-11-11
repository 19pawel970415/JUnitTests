import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    static void setupAll() {
        System.out.println("The tests start: ");
    }

    @AfterAll
    static void closeupAll() {
        System.out.println("The tests end.");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("The first testing method.")
    void shouldAddTwoNumbers() {

        // given
        int a = 9;
        int b = 10;
        int c = -2;
        int d = -7;

        // when
        int actualResult = calculator.add(a, b);
        int actualResult1 = calculator.add(c, d);

        // then
        assertAll(
                () -> assertEquals(19, actualResult, "Assertion 1 failed"),
                () -> assertEquals(-9, actualResult1, "Assertion 2 failed")
        );
    }

    @Test
    void shouldSubtractTwoNumbers() {

        //given
        int a = 9;
        int b = 10;
        int c = -2;
        int d = -7;


        //when
        int actualResult = calculator.subtract(a, b);
        int actualResult1 = calculator.subtract(c, d);

        //then
        assertAll(
                () -> assertEquals(-1, actualResult, "Assertion 1 failed"),
                () -> assertEquals(5, actualResult1, "Assertion 2 failed")
        );
    }

    @Test
    void shouldMultiplyTwoNumbers() {

        //given
        int a = 9;
        int b = 10;
        int c = -2;
        int d = -7;

        //when
        int actualResult = calculator.multiply(a, b);
        int actualResult1 = calculator.multiply(c, d);

        //then
        assertAll(
                () -> assertEquals(90, actualResult, "Assertion 1 failed"),
                () -> assertEquals(14, actualResult1, "Assertion 2 failed")
        );
    }

    @Test
    void shouldDivideTwoNumbers() {

        //given
        int a = 9;
        int b = 10;
        int c = -2;
        int d = 20;
        int e = 0;


        //when
        double actualResult = (double) calculator.divide(a, b);
        double actualResult1 = (double) calculator.divide(c, d);
        double actualResult2 = (double) calculator.divide(d, e);

        //then
        assertAll(
                () -> assertEquals(0.9, actualResult, "Assertion 1 failed"),
                () -> assertEquals(-0.1, actualResult1, "Assertion 2 failed"),
                () -> assertEquals(0, actualResult2, "Assertion 2 failed")
        );
    }

    @Test
    void shouldCheckIfPositive() {

        //given
        int a = 9;
        int b = 0;
        int c = -1;


        //when
        boolean actualResultForA = calculator.isPositive(a);
        boolean actualResultForB = calculator.isPositive(b);
        boolean actualResultForC = calculator.isPositive(c);

        //then
        assertAll(
                () -> assertTrue(actualResultForA),
                () -> assertFalse(actualResultForB),
                () -> assertFalse(actualResultForC)
        );
    }

    @Test
    void shouldCheckIfNegative() {

        //given
        int a = 9;
        int b = 0;
        int c = -1;


        //when
        boolean actualResultForA = calculator.isNegative(a);
        boolean actualResultForB = calculator.isNegative(b);
        boolean actualResultForC = calculator.isNegative(c);

        //then
        assertAll(
                () -> assertFalse(actualResultForA),
                () -> assertFalse(actualResultForB),
                () -> assertTrue(actualResultForC)
        );
    }

    @Test
    void shouldCheckIfOdd() {

        //given
        int a = 9;
        int b = 0;
        int c = -2;


        //when
        boolean actualResultForA = calculator.isOdd(a);
        boolean actualResultForB = calculator.isOdd(b);
        boolean actualResultForC = calculator.isOdd(c);

        //then
        assertAll(
                () -> assertTrue(actualResultForA),
                () -> assertFalse(actualResultForB),
                () -> assertFalse(actualResultForC)
        );
    }

    @Test
    void shouldFindMaxFromTwoNumbers() {

        //given
        int a = 9;
        int b = 8;


        //when
        int actualResult = calculator.max(a, b);

        //then
        assertEquals(9, actualResult);
    }

    @Test
    void shouldFindMinFromTwoNumbers() {

        //given
        int a = 9;
        int b = 8;


        //when
        int actualResult = calculator.min(a, b);

        //then
        assertEquals(8, actualResult);
    }

    @Test
    void shouldFindAverageOfTwoNumbers() {

        //given
        int a = 9;
        int b = 8;
        int c = -1;
        int d = -7;
        int e = 0;


        //when
        double actualResultForAB = calculator.average(a, b);
        double actualResultForCD = calculator.average(c, d);
        double actualResultForDE = calculator.average(d, e);


        //then
        assertAll(
                () -> assertEquals(8.5, actualResultForAB),
                () -> assertEquals(-4, actualResultForCD),
                () -> assertEquals(-3.5, actualResultForDE)
        );
    }

    @Test
    void shouldFindPower() {

        //given
        int a = 9;
        int b = 2;
        int c = -1;
        int d = 0;


        //when
        double actualResultForAB = calculator.power(a, b);
        double actualResultForAC = calculator.power(a, c);
        double actualResultForAD = calculator.power(a, d);


        //then
        assertAll(
                () -> assertEquals(81, actualResultForAB),
                () -> assertEquals(0.1111111111111111, actualResultForAC),
                () -> assertEquals(1, actualResultForAD)
        );
    }

    @Test
    void shouldAddThreeNumbers() {

        // given
        int a = 9;
        int b = 10;
        int c = -2;
        int d = 0;


        // when
        int actualResult = calculator.add(a, b, c);
        int actualResult1 = calculator.add(b, c, d);

        // then
        assertAll(
                () -> assertEquals(17, actualResult, "Assertion 1 failed"),
                () -> assertEquals(8, actualResult1, "Assertion 2 failed")
        );
    }

    @Test
    void shouldSubtractThreeNumbers() {

        //given
        int a = 9;
        int b = 10;
        int c = -2;
        int d = -7;


        //when
        int actualResult = calculator.subtract(a, b, c);
        int actualResult1 = calculator.subtract(b, c, d);

        //then
        assertAll(
                () -> assertEquals(1, actualResult, "Assertion 1 failed"),
                () -> assertEquals(19, actualResult1, "Assertion 2 failed")
        );
    }

    @Test
    void shouldMultiplyThreeNumbers() {

        //given
        int a = 9;
        int b = 10;
        int c = -2;
        int d = -7;


        //when
        int actualResult = calculator.multiply(a, b, c);
        int actualResult1 = calculator.multiply(b, c, d);

        //then
        assertAll(
                () -> assertEquals(-180, actualResult, "Assertion 1 failed"),
                () -> assertEquals(140, actualResult1, "Assertion 2 failed")
        );
    }

    @Test
    void shouldDivideThreeNumbers() {

        //given
        int a = 9;
        int b = 10;
        int c = -2;
        int d = 0;


        //when
        double actualResult = (double) calculator.divide(a, b, c);
        double actualResult1 = (double) calculator.divide(b, c, d);
        double actualResult2 = (double) calculator.divide(b, d, c);

        //then
        assertAll(
                () -> assertEquals(-0.45, actualResult, "Assertion 1 failed"),
                () -> assertEquals(0.0, actualResult1, "Assertion 2 failed"),
                () -> assertEquals(0.0, actualResult2, "Assertion 2 failed")
        );
    }

    @Test
    void shouldFindMaxFromThreeNumbers() {

        //given
        int a = 9;
        int b = 8;
        int c = -2;


        //when
        int actualResult = calculator.max(a, b, c);

        //then
        assertEquals(9, actualResult);
    }

    @Test
    void shouldFindMinFromThreeNumbers() {

        //given
        int a = 9;
        int b = 8;
        int c = -7;


        //when
        int actualResult = calculator.min(a, b, c);

        //then
        assertEquals(-7, actualResult);
    }

    @Test
    @DisplayName("The last testing method")
    void shouldFindAverageOfThreeNumbers() {

        //given
        int a = 9;
        int b = 8;
        int c = -1;
        int d = -7;
        int e = 0;


        //when
        double actualResultForABC = calculator.average(a, b, c);
        double actualResultForCDE = calculator.average(c, d, e);
        double actualResultForACE = calculator.average(a, c, e);


        //then
        assertAll(
                () -> assertEquals(5.333333492279053, actualResultForABC),
                () -> assertEquals(-2.6666667461395264, actualResultForCDE),
                () -> assertEquals(2.6666667461395264, actualResultForACE)
        );
    }
}
