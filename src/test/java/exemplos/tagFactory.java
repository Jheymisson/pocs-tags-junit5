package exemplos;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class tagFactory {
    @TestFactory
    Collection<DynamicTest> dynamicTests() {
        return Arrays.asList(
                DynamicTest.dynamicTest("First dynamic test", () -> assertTrue(true)),
                DynamicTest.dynamicTest("Second dynamic test", () -> assertEquals(4, 2 * 2))
        );
    }
}
