public class PracticeTen{
    public static void main(String[] args) {
    int a1[] = {1,2,3,4,5};
    String s = java.util.Arrays.toString(a1);
    System.out.println(s);
    int index = java.util.Arrays.binarySearch(a1, 1);
    System.out.println(index);

    int a2[] = {1,2,3,4,5};
    boolean areEqual = java.util.Arrays.equals(a1, a2);
    System.out.println(areEqual);
    //boolean compr = java.util.Arrayы.compare(a1, a2);
    //System.out.println(compr);
    
    int a3[] = {5,4,3,2,1};
    java.util.Arrays.sort(a3, 0,3);
    for(int el:a3){
        System.out.println(el);
    }
    }
}