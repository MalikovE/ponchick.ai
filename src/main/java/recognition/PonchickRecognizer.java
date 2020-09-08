package recognition;

public class PonchickRecognizer {
    public static void main(String[] args) {
        while (true) {
            if (Perceptron.recognisePonchick(Grid.read(3,3))) {
                System.out.println("It's a ponchik!");
            } else {
                System.out.println("It's not a ponchik!");
            }
        }
    }
}