import java.util.ArrayList;
import java.util.List;

class PrintArr {
    void printArray(int ... num) {
        for (int n : num){
            System.out.println("integer is here: " + n);
        }
    }

    void printArray(double ... num) {
        for (double n : num){
            System.out.println("double is here: " + n);
        }
    }
}


public class Practice15 {
    public static void main(String[] args) {
    PrintArr arr = new PrintArr();
    arr.printArray(1, 2);
    arr.printArray(1.1, 2.2, 3.3);
    }
    
}
