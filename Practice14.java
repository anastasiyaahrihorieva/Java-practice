import java.util.ArrayList;
import java.util.List;

class ParametrClass<T> {
    private T prm;

    void setVal(T prm) {
        this.prm = prm;
    }

}

class Calculate_10x<T extends Number> {
    void calc_10x(T val) {
        System.out.println(val.doubleValue() * 10);
    }
}

class ProcessNumber<T> {
    void process(List<? super Integer> list) {
        list.add(42);     
        list.add(100);  
    }
}
    

public class Practice14 {
    public static void main(String[] args) {
    //Практика #1 Приведите примеры использования оператора instanceof с объектами параметризованных классов.

    ParametrClass<String> helloVar = new ParametrClass<>();
    helloVar.setVal("hello");
    System.out.println(helloVar instanceof ParametrClass);
    //System.out.println(helloVar instanceof String); // false

    // Практика #2 Приведите примеры использования конструкций <? extends T> и <? super T>. Объясните, зачем они нужны?
    
    Calculate_10x<Integer> x = new Calculate_10x<>();
    x.calc_10x(Integer.valueOf(11));

    ProcessNumber<String> processor = new ProcessNumber<>(); //
    ArrayList<Number> numbers = new ArrayList<>();
    processor.process(numbers);

    }
    
}
