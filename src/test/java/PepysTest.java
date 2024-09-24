import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * The test class PepysTest.
 *
 * @author Joe Polacco
 * @version August 15, 2020
 */
public class PepysTest {
    @Test
    public void testProbAtLeastOneSix() {
        Pepys pepys = new Pepys();
        assertEquals(0.6651, pepys.probAtLeastOneSix(1000000), 0.001);

    }

    @Test
    public void testProbAtLeastTwoSixes() {
        Pepys pepys = new Pepys();
        assertEquals(0.6187, pepys.probAtLeastTwoSixes(1000000), 0.001);
    }

}
