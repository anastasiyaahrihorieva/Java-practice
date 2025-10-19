class A {
    final void printStr(){
        System.out.println("can't be overrided");
    }
}

class B extends A{
    void BprintStr(){
        System.out.println("different method");
    }
}

final class C extends A{
    void CprintStr(){
        System.out.println("C can not have a child ");
    }
}
public class Practice17 {
    public static void main(String[] args) {
        A ob = new A();
        ob.printStr();
    }
}