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
        void randomName() {
            Algorithms1 a = new Algorithms1();
            String name = a.randomName(); //Problem name undeholder ikke et navn det indeholder null, selvom randomname() souter navnet Pop i Algorithms1

            assertEquals(name, "Pop");

        }
    }



