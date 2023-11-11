import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class StringModifierTest {

    @Test
    void shouldModifyStringToUpperCase() {
        String s = "it is a test";
        String expected = "IT IS A TEST";

        String s1 = StringModifier.toUpper(s);

        assertLinesMatch(List.of(expected), List.of(s1));
    }

    @Test
    void shouldModifyStringToLowerCase() {
        String s = "IT IS A TEST";
        String expected = "it is a test";

        String s1 = StringModifier.toLower(s);

        assertLinesMatch(List.of(expected), List.of(s1));
    }

}
