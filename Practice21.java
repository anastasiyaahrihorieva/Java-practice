class ClassA {
    private static void privateMethod(){
        System.out.println("private method in outer class");
    }

    private class InnerPrivate {
        void innerPrivateMethod(){
            privateMethod();
        }
    }
    class InnerDefault {
        void innerDefaultMethod(){
            privateMethod();
            System.out.println("from inner Default class");
            byte innerDefaultVar = 100;
        }
    }
    
    protected class InnerProtected {
        void innerProtectedMethod(){
            privateMethod();
            System.out.println("from inner Protected class");
        }
    }
    public class InnerPublic {
        public Byte innerPublicVar = 1;
        void innerPublicMethod(){
            privateMethod();
            System.out.println("from inner Public class");
            
        }
    }

    //Практика #3   Имеет ли внешний класс доступ к полям и методам внутреннего класса? Как возможность доступа зависит от спецификаторов доступа? Приведите примеры кода.
    void ClassMethod(){
        //System.out.println(innerPublicVar); //напрямую нельзя обратиться к полю внутреннего класса
        InnerPublic iP = new InnerPublic();
        System.out.println(iP.innerPublicVar); //доступ через экземпляр внутреннего класса
    }

}


public class Practice21 {
    public static void main(String[] args){
    ClassA A = new ClassA();

    //Практика #1 Приведите примеры использования различных спецификаторов доступа для внутренних классов и объясните их поведение.
    // ClassA.InnerPrivate p1 = outer.new InnerPrivate(); // private — нельзя
    ClassA.InnerDefault p2 = A.new InnerDefault();  
    ClassA.InnerProtected p3 = A.new InnerProtected(); //если в том же пакете или в наследнике
    ClassA.InnerPublic p4 = A.new InnerPublic(); //доступен отовсюду

    //Практика #2 Имеет ли внутренний класс доступ к полям и методам внешнего класса? Как возможность доступа зависит от спецификаторов доступа? Приведите примеры кода.
    p2.innerDefaultMethod();
    p3.innerProtectedMethod();
    p4.innerPublicMethod();
    }
}

