class EnumerationEx {
    enum ConstNum {
        NUM1("число 1"), NUM2("число 2"), NUM3("число 3");   // Практика #1 Приведите примеры класса, в котором используется инициализация элементов перечисления.
        
        private String name;
        
        ConstNum(String name) {
            this.name = name;
        }
        
        // Практика #2 Приведите примеры реализации собственного перечисления c любым дополнительным методом
        public void isTheFirst() {
            System.out.println(this == NUM1);
        }
    }
}

public class Practice16 {
    public static void main(String[] args) {
        EnumerationEx.ConstNum n2 = EnumerationEx.ConstNum.NUM2;
        n2.isTheFirst();
    }
}