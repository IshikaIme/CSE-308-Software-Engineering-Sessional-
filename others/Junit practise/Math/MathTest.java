package Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class MathTest {
        @Test
        void TwoPlusTwoIsFour()
        {
            var math = new Math();
            assertEquals(4,math.add(2,2));
        }

        @Test
        void twoplusthreeisfive()
        {
            var math = new Math();
            assertEquals(5,math.add(2,3));
        }

    }
