public class Practice29 {
    public static void main(String[] args) {

        // ArithmeticException
        try {
            int result = 1 / 0;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("div by zero");
        }

        int res = 1 / 0;
        System.out.println("Результат: " + res);
    }
}