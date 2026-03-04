public class PracticeSix {
    public static void main(String[] args) {
        // Практика #1 Приведите примеры использования методы decode().
        Integer v1 = Integer.decode("025");
        Byte v2 = Byte.decode("#15");
        System.out.println(v1);
        System.out.println(v2);

        // Практика #2 Приведите все способы создания экземпляра класса Boolean.
        Boolean v3 = Boolean.valueOf(true);
        Boolean v4 = Boolean.valueOf("any string");
        Boolean v5 = Boolean.parseBoolean("true");
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);

        // Практика #3 В каком случае при автоупаковке/автораспаковке будет брошено
        // исключение NullPointerException. Приведите пример.

        Integer c = null;
        int NPE = c;

    }
}