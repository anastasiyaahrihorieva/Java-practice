import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

// Практика #4 Зачем нужен интерфейс AutoCloseable? Приведите пример.
class My_Closeable_Type implements AutoCloseable {

    public static void main(String[] args) {
    try( My_Closeable_Type ct = new My_Closeable_Type()) {};
    } 

    @Override  
    public void close(){
		System.out.println("it was closed automatically");
	}
}

public class Practice32 {
    public static void main(String[] args) {
        byte[] arr = { 1, 2, 3, 4, 5 };
        InputStream byteStream = new ByteArrayInputStream(arr);
        ByteArrayOutputStream a = new ByteArrayOutputStream();

        //Практика #1 Приведите пример использования одного из подклассов класса InputStream для демонстрации работы метода read().
        try {
            int b;
            while ((b = byteStream.read()) != -1) {
                System.out.print(b + " ");
            }
            
            //Практика #2 Приведите пример использования одного из подклассов класса OutputStream для демонстрации работы метода write(int).
            a.write(97);
            System.out.println(a.toString());  
            a.close();

        } catch (Exception e) {}

        

    }
}