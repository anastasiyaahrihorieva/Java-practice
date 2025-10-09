public class PracticeEight {
    public static void main(String[] args) {
        byte valueByte = 2; //short valueShort = 20; //int valueInt = 200
        byte caseNum;
        switch(valueByte){ //switch(valueShort){ //switch(valueInt){
            case 1:
                caseNum = 1;
                break;
            case 2:
                caseNum = 2;
                break;
            default:
                caseNum = 0;
                break;
        }
        System.out.println(caseNum);

        char c = 'a';
        switch(c){
            case 'a':
                System.out.println("your symbol is a");
                break;
            case 'A':
                System.out.println("your symbol is A. i need an 'a'");
                break;
            default:
                System.out.println("there is no 'a'");
                break;
        }
    }
}