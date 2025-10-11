class CalcSum{
    double sum(double x, double y){ return x + y; }
    double sum(double x, double y, double z){ return x + y + z; }
}

class CalcSumLn extends CalcSum{
    @Override
    double sum(double x, double y){return Math.log(x*y);}
    double sum(double x, double y, double z){return Math.log(x*y*z);}
}

public class PracticeTwelve{
    public static void main(String[] args){
        CalcSum calc = new CalcSum();
        System.out.println(calc.sum(2, 3));      
        System.out.println(calc.sum(4, 3, 7));     

        CalcSumLn sumLn = new CalcSumLn();
        System.out.println(sumLn.sum(2, 3));
        System.out.println(sumLn.sum(4, 3, 7));
    }
}