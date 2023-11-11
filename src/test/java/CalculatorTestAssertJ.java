import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTestAssertJ {

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
        assertThat(actualResult).isEqualTo(19);
        assertThat(actualResult1).isEqualTo(-9);
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
        assertThat(actualResult).isEqualTo(-1);
        assertThat(actualResult1).isEqualTo(5);
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
        assertThat(actualResult).isEqualTo(90);
        assertThat(actualResult1).isEqualTo(14);
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
        assertThat(actualResult).isEqualTo(0.9);
        assertThat(actualResult1).isEqualTo(-0.1);
        assertThat(actualResult2).isEqualTo(0);
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
        assertThat(actualResultForA).isTrue();
        assertThat(actualResultForB).isFalse();
        assertThat(actualResultForC).isFalse();
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
        assertThat(actualResultForA).isFalse();
        assertThat(actualResultForB).isFalse();
        assertThat(actualResultForC).isTrue();
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
        assertThat(actualResultForA).isTrue();
        assertThat(actualResultForB).isFalse();
        assertThat(actualResultForC).isFalse();
    }

    @Test
    void shouldFindMaxFromTwoNumbers() {

        //given
        int a = 9;
        int b = 8;


        //when
        int actualResult = calculator.max(a, b);

        //then
        assertThat(actualResult).isEqualTo(9);
    }

    @Test
    void shouldFindMinFromTwoNumbers() {

        //given
        int a = 9;
        int b = 8;


        //when
        int actualResult = calculator.min(a, b);

        //then
        assertThat(actualResult).isEqualTo(8);
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
        assertThat(actualResultForAB).isEqualTo(8.5);
        assertThat(actualResultForCD).isEqualTo(-4);
        assertThat(actualResultForDE).isEqualTo(-3.5);
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
        assertThat(actualResultForAB).isEqualTo(81);
        assertThat(actualResultForAC).isEqualTo(0.1111111111111111);
        assertThat(actualResultForAD).isEqualTo(1);
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
        assertThat(actualResult).isEqualTo(17);
        assertThat(actualResult1).isEqualTo(8);
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
        assertThat(actualResult).isEqualTo(1);
        assertThat(actualResult1).isEqualTo(19);
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
        assertThat(actualResult).isEqualTo(-180);
        assertThat(actualResult1).isEqualTo(140);
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
        assertThat(actualResult).isEqualTo(-0.45);
        assertThat(actualResult1).isEqualTo(0.0);
        assertThat(actualResult2).isEqualTo(0.0);
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
        assertThat(actualResult).isEqualTo(9);
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
        assertThat(actualResult).isEqualTo(-7);
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
        assertThat(actualResultForABC).isEqualTo(5.333333492279053);
        assertThat(actualResultForCDE).isEqualTo(-2.6666667461395264);
        assertThat(actualResultForACE).isEqualTo(2.6666667461395264);
    }

}
