import java.util.StringJoiner;

class ConcatenateStrings {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("1");  
        joiner.add("2");
        joiner.add("3");
        joiner.add("4");
        String combination = joiner.toString();
        System.out.println(combination); //  1, 2, 3, 4
    }
}


public class Practice25 {
    public static void main(String[] args){
        String a = "hello";
        a.contains("a");  // boolean. находится ли последовательность эл-в в строке
        a.getBytes();  //byte[] конвертирует строку в последовательность байт
        a.indexOf("e");  //int индекс первого вхождения указанного символа (символов) в строке
        a.toUpperCase();  //String. значение, представляющее новую строку, преобразованную в верхний регистр
        a.replaceAll("o", "oooo");  //String копия строки, в которой совпадения регулярного выражения заменяются новыми подстроками
        a.length();  // int длина строки
        a.isEmpty(); //boolean возвращает true, если строка пуста
        a.subSequence(1, 3); //  String последовательность символов из строки
        a.charAt(2);//  char символ по указанному индексу в строке
        a.codePointBefore(1);// int Юникод указанного символа в строке   
    }
}