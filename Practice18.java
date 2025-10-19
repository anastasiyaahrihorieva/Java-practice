class AA {
    AA(){
        System.out.println("parrent class constructor");
    }

    String name = "name is defined in parent class";
    
    void mthdAA(){
        System.out.println("parent class method");
    }
}

//Практика #1 Приведите пример кода, демонстрирующего все три варианта использования ключевого слова super.
class B extends AA{
   B(){
    super();
   }

   String name = super.name;

   void mthdB(){
    System.out.println("method B + ");
    super.mthdAA();
   }

}

//Практика #3 Перепешите код с использованием конструкции this(). Помните, что в каждом конструкторе вызов this() должен быть единственным и первым среди всех операций.
class A {
    int a;
    int b;
    int c;
    int z;

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        z = 1;
    }
    
    public A(int a) {
        this(a, 0, 0);  
    }

    public A(int a, int b) {
        this(a, b, 0); 
    }

    public A() {
        this(0, 0, 0);  
    }
    
}

public class Practice18 {
    public static void main(String[] args) {
        B b = new B();
        b.mthdB();
        System.out.println(b.name);
    }
}