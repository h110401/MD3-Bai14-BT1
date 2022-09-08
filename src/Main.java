import rikkei.academy.Calculator;

public class Main {
    public static void main(String[] args) {
        try {
            double[] root = Calculator.quadraticSolver(1, -2, 1);
            for (double r : root) {
                System.out.println(r);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
