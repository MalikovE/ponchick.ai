import org.junit.Assert;
import org.junit.Test;
import recognition.Grid;
import recognition.Perceptron;

public class PerceptronTest {

    @Test
    public void itsPonchick() {
        char[][] input = {
                {'X', 'X', 'X'},
                {'X', '_', 'X'},
                {'X', 'X', 'X'}
        };
        boolean result = Perceptron.recognisePonchick(Grid.read(input));
        Assert.assertTrue(result);
    }

    @Test
    public void itsNotPonchick() {
        char[][] input = {
                {'X', 'X', '_'},
                {'_', 'X', '_'},
                {'X', 'X', 'X'}
        };
        boolean result = Perceptron.recognisePonchick(Grid.read(input));
        Assert.assertFalse(result);
    }
}
