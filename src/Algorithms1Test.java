import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class Algorithms1Test {

    @Test
    void randomBoyName() {
    Algorithms1 algorithms1 = new Algorithms1();
    String randomName = algorithms1.randomBoyName();
    assertEquals(randomName, "Faktor");
    }

    @org.junit.jupiter.api.Test
    void testRandomBoyName() {
    }
}