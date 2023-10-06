package exemplos;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class tagRepet {
    @RepeatedTest(5)
    void repeatedTest() {
        assertTrue(Math.random() > 0);
    }
}
