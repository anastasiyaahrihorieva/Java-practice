interface A{ //Практика #1 Приведите пример интерфейса, в котором определен один неабстрактный метод и один статический метод, а также класс, реализующий этот интерфейс. 
//Покажите все способы вызова методов интерфейса.
    default void methodA(){
        System.out.println("non abstract method from A");
    }

    static void staticMethodA(){
        System.out.println("static method from A");
    }

    void interfaceMethod();
}

interface ASameMethods{
    default void methodA(){
        System.out.println("non abstract method from ASameMethods");
    }

    static void staticMethodA(){
        System.out.println("static method from ASameMethods");
    }

    void interfaceMethod();
}

class Aa implements A{
    @Override
    public void methodA(){  
        System.out.println("overrided method");
    }
    
    @Override
    public void interfaceMethod() {
        System.out.println("interfaceMethod implemented in Aa");
    }
}

class B implements A, ASameMethods{ // Практика #2 Что произойдет, если класс реализует два интерфейса с одинаковыми неабстрактными методами? Как выйти из такого положения? Приведите пример.
    @Override
    public void methodA() {
        A.super.methodA(); 
    }
    
    @Override
    public void interfaceMethod() {
        System.out.println("interfaceMethod implemented in B");
    }
}

public class Practice24 {
    public static void main(String[] args){
        A a = new Aa();
        a.methodA();       
        a.interfaceMethod(); 
        A.staticMethodA();  
        
        
        B b = new B();
        b.methodA();      
        b.interfaceMethod();
        
        
        A.staticMethodA();     
        ASameMethods.staticMethodA(); 
    }
}