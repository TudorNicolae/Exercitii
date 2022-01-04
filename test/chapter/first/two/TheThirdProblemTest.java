package chapter.first.two;

import org.junit.Assert;
import org.junit.Test;

public class TheThirdProblemTest {

    @Test
    public void testIdenticNumbers() {
        TheThirdProblem  theThirdProblem = new TheThirdProblem();
        boolean hasIdenticDigits = theThirdProblem.checkIdenticDigits(55);
        Assert.assertEquals(hasIdenticDigits, true);

    }
    @Test
    public void testIdenticNumbers2() {
        TheThirdProblem  theThirdProblem = new TheThirdProblem();
        boolean hasIdenticDigits = theThirdProblem.checkIdenticDigits(56);
        Assert.assertEquals(hasIdenticDigits, false);

    }
    @Test
    public void testAdunare() {
        Assert.assertEquals(4, 3 + 2);

    }
}
