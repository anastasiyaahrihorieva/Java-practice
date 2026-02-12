public class Practice30 {

    public static void main(String[] args) {

        try {
            int number = -20;
            System.out.println("ok " + number); // RuntimeException

            // String s = "abc";
            // int n = Integer.parseInt(s); //  NumberFormatException

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: ");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: ");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: ");
        }

    }
}
