public class Practice26 {
    public static void main(String[] args){
    
        StringBuffer sbuffer = new StringBuffer("Hello");
        StringBuilder sbuilder = new StringBuilder("World");
        
        // append - добавляет строку в конец
        sbuffer.append(" Java");
        sbuilder.append(" Programming");
        
        // insert - вставляет строку в указанную позицию
        sbuffer.insert(5, " Beautiful");
        sbuilder.insert(5, " Amazing");
        
        // reverse - переворачивает строку
        StringBuffer reversedBuffer = new StringBuffer(sbuffer).reverse();
        StringBuilder reversedBuilder = new StringBuilder(sbuilder).reverse();
        
        // delete - удаляет символы в указанном диапазоне
        sbuffer.delete(5, 15);
        sbuilder.delete(5, 13);
        
        // replace - заменяет символы в указанном диапазоне
        sbuffer.replace(6, 10, "World");
        sbuilder.replace(0, 5, "Hello");
        
        // capacity - возвращает текущую емкость буфера
        int bufferCapacity = sbuffer.capacity();
        int builderCapacity = sbuilder.capacity();
        
        // ensureCapacity - гарантирует минимальную емкость
        sbuffer.ensureCapacity(100);
        sbuilder.ensureCapacity(100);
        
        // setLength - устанавливает новую длину строки
        sbuilder.setLength(10);
        
        // charAt - возвращает символ по указанному индексу
        char bufferChar = sbuffer.charAt(1);
        char builderChar = sbuilder.charAt(1);
        
        // setCharAt - устанавливает символ по указанному индексу
        sbuilder.setCharAt(1, 'A');
    }
}  

class Practice2{
    public class StringConversionDemo {
    public static void main(String[] args) {
        
        String str = "String";
        StringBuffer buffer = new StringBuffer("StringBuffer");
        StringBuilder builder = new StringBuilder("StringBuilder ");
        
        //конструктор
        StringBuffer bufferFromString = new StringBuffer(str);
        String strFromBufferConstructor = new String(buffer);
        StringBuilder builderFromBuffer3 = new StringBuilder(buffer.toString());
        StringBuffer bufferFromBuilder3 = new StringBuffer(builder.toString());

        //append()
        StringBuffer bufferAppend = new StringBuffer();
        bufferAppend.append(str);
        StringBuilder builderAppend = new StringBuilder();
        builderAppend.append(str);
      
        //toString()
        String strFromBuffer = buffer.toString();
        String strFromBuilder = builder.toString();
    }
}
}