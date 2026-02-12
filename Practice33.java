import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice33 {
    public static void main(String[] args) {
        try {
            File f = new File("тхт.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
        }

    }
}