public class PracticeFive {
    public static void main(String[] args) {
        /*  Практика #1
        Приведите примеры использования всех определенных выше операторов с операндами базовых типов, 
        а также с операндами типа String. Для операторов ++ и -- 
        продемонстрируйте префиксную и постфиксную форму записи.*/

        double a = 5.2+ 6;
        double b = 11.0 - 13.8;
        int x = 10;
        x += 5;
        x -= 3;
        x *= 2;
        x /= 4;
        x %= 3;
        
        String str1 = "Hello";
        String str2 = "World";
        str1 += " " + str2;
        
        double returnBigger = (a > b) ? a : b;

        boolean bool1 = (a > 10) || (b < 0);
        boolean bool2 = (a > 0) && (b < 20);
        int bitOr = 50 | 3;
        int bitXor = 3 ^ 3;
        int bitAnd = 5 & 9;
        //System.out.println(bitAnd);
        boolean equalDouble = b == -2.8;
        boolean equalString = str1.equals("Hello World");
        
        boolean greater = a > b;
        boolean greaterEqual = a >= 11;
        boolean less = b < 0;
        boolean lessEqual = b <= -2.8;
        boolean stringCompare = (str1.length() > str2.length());
        
        int value = 64;
        int bitsAmount = 3;
        int z = (value << bitsAmount);

        int unsignedShiftRight = -16 >>> 2;
        int shiftLeft = 4 << 2;
        
        String concat = str1 + " " + str2;

        int negative = (int)-a;
        int multiply = (int)a * 2;
        double divide = b / 2.0;
        int modulus = 17 % 5;
        
        int preIncrement = ++x;
        int postIncrement = x++;
        int preDecrement = --x;
        int postDecrement = x--;
        int bitwiseNot = ~5;
        boolean logicalNot = !bool1;
        
        double calculated = (a + b) * 2;
        String[] array = {"one", "two", "three"};
        String arrayElement = array[1];
    
        /*Практика #2
        Приведите примеры использования оператора instanceof.  
        Отдельно рассмотрите случай, когда оператор применятся к null-объекту. */
        int num = 10;
        Integer wrappedNum = num;
        System.out.println(wrappedNum instanceof Integer);
        System.out.println(null instanceof Integer);
        System.out.println(null instanceof Boolean);
        
    }
}