import java.util.Formatter;

import java.util.Date;

public class Practice27 {
    public static void main(String[] args){
    //Практика #1 Приведите пример использования пяти любых спецификаторов из таблицы.
    String a = String.format("%s", "Usage of s");
    String b = String.format("%h", "hello");
    String pi = String.format("%e", 3.1415);
    String c = String.format("A B C D %n E");
    String d = String.format("A B C D %% %%");
    
    //Практика #3 Приведите пример использования пяти любых спецификаторов из таблицы.
    Date date = new Date(); 
    System.out.printf("%tD %n", date);
    System.out.printf("%tL %n", date);
    System.out.printf("%tH %n", date);
    System.out.printf("%tY %n", date);
    System.out.printf("%tB %n", date);
    }
}
