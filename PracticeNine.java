public class PracticeNine {
    public static void main(String[] args) {
        while (true){
            System.out.println("no inf cycle");
            break;
        }

        for(int i = 3; i!=0; i--){
             if (i==0){
                continue;
            }
            double j = 1/(double)i;
            System.out.println(i);
            System.out.println(j);
           
        }
    }
}