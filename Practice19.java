class A{
    void printNumber(double a){System.out.println("here is a double "+a);}
    void printNumber(int a){System.out.println("here is an int "+a);} //Практика #1 Приведите пример перегруженных методов.
}

class B extends A{
    @Override // Практика #2 Приведите пример переопределенного метода. Что будет, если у переопределенного и переопределяемого (из суперкласса) методов не будет совпадать тип возвращаемого значения?
    void printNumber(int b){System.out.println("here is an overrided method and int "+b);}

    // Практика #3 Приведите пример и объясните, когда использование аннотации @Override помогает обнаружить ошибку.
    // void prntNumber(double b){System.out.println("here is an overrided method and double "+b);}
}

public class Practice19 {
    public static void main(String[] args) {
        A a = new A();
        a.printNumber(2.5);
        
        B b = new B();
        b.printNumber(2);
    }
}