import java.util.Scanner;

public class console{
    public static void main(String[] args){
        System.out.println("введите имя:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Привет, "+ name);
    }
}
