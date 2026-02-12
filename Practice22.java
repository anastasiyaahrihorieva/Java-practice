interface A {
    static class B{
        void bb(){
            System.out.println("method bb from nested class B in interface A");
        }
    }
}

public class Practice22 {
    public static void main(String[] args){
    A.B nestedVar = new A.B();
    nestedVar.bb();
    }
}

