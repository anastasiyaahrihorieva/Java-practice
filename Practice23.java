class A{
    void method(){
        System.out.println("not overrided from A");
    }

    @Deprecated
    void oldMethod(){
        System.out.println("old method, better try another");

        @SuppressWarnings("unused") 
        byte bb;
    }

}

class Aa extends A{
    @Override
    void method(){
        System.out.println("overrided from Aa");
    }
}



public class Practice23 {
    public static void main(String[] args){
        Aa a = new Aa();
        a.method();
    }
}

