import java.util.Scanner;

public class Practice28 {
    public static void main(String[] args){
    
    // ArithmeticException
    try {
        int result = 1 / 0;
        System.out.println("Результат: " + result);
    } catch (ArithmeticException e) {
        System.out.println("div by zero");
    }

    // ArrayIndexOutOfBoundsException
    Boolean two[];
    two = new Boolean[] {true, false};
    try{
        System.out.println(two[2]);
    } catch (ArrayIndexOutOfBoundsException a){
        System.out.println("index is out of boundaries");
    }

    // IllegalArgumentException
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter your age: ");
    int age = scanner.nextInt();
    scanner.close();
    if (age < 0) {
        throw new IllegalArgumentException("age can not be < 0");
    }

        
    // ClassCastException
    try {
        Object obj = Integer.valueOf(42);
        Boolean bool = (Boolean) obj;
    } catch (ClassCastException cast_e) {
        System.out.println("can not make a boolean from integer");
    }

    // NullPointerException
    Boolean nullVar = null;
    try {
        System.out.println(nullVar.toString());  
    } catch (NullPointerException e) {
        System.out.println("null pointer");
    }
    }
}