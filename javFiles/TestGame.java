package javFiles;

import org.junit.Test;
import javFiles.game;

public class TestGame {

    @Test
    public final void testRandGenRespose() {
        game.randGenRespose().equals("abc");
    }
  /*  @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculator.add("1,2");
        Assert.assertTrue(true);
    }
    @Test(expected = RuntimeException.class)
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        StringCalculator.add("1,X");
    }*/
}
