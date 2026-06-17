public class exceptionArithmetic {
    public static void main(String[] args) {
        // int r = 10/0;
        // System.out.println(r);
        try {
            int r = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}