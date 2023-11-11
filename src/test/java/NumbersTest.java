import org.junit.jupiter.api.Test;

import java.util.OptionalInt;

import static org.assertj.core.api.Assertions.assertThat;

class NumbersTest {

    private Numbers numbers = new Numbers();

    @Test
    void shouldFindFirstDigitInString() {
        final OptionalInt firstDigit = numbers.findFirstDigit("Hello!!112");

        assertThat(firstDigit).isPresent()
                .hasValue(1);
    }

    @Test
    void shouldNotFindAnyDigitWhenThereAreNone() {
        final OptionalInt firstDigit = numbers.findFirstDigit("SDA");

        assertThat(firstDigit).isEmpty();
    }
}
