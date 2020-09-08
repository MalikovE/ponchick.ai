package recognition;

public class Perceptron {

    public static boolean recognisePonchick(Grid grid) {
        int[] weights = new int[]{ 2, 1, 2, 4, -4, 4, 2, -1, 2 };
        int bias = -5;
        int sum = 0;
        for (int i = 0; i < grid.get().length; i++) {
            sum += grid.get()[i] ? weights[i] : 0;
        }
        return sum + bias > 0;
    }

}