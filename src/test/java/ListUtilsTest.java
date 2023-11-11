import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListUtilsTest {

    private final ListUtils listUtils = new ListUtils();

    @Test
    void shouldTripleInput() {
        final List<Integer> inputs = List.of(4, 2, 7);
        final List<Integer> expectedOutput = List.of(12, 6, 21);
        final int multiplier = 3;

        final List<Integer> actualResults = listUtils.multiplyInputs(inputs, multiplier);

        assertIterableEquals(expectedOutput, actualResults, "Lists do not match in terms of values or size");
        assertNotSame(inputs, actualResults, "The input list was modified while it should not be touched");
    }
}
