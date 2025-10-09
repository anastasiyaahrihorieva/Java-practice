class Advertisment{
    public String advertSlogan = "buy here";
    protected double kpi = 3.8;
    private double secretIndex = 0.07;
    double comission = 1;
    double yourBudget(double yourMoney) {
        return secretIndex * yourMoney - comission;
    }
}

class BonusToSalary extends Advertisment{
    boolean calc(double k){
        return(k>=kpi);
    }
}

public class PracticeEleven{
    public static void main(String[] args) {
    Advertisment ad = new Advertisment();
    System.out.println(ad.advertSlogan);
    System.out.println(ad.yourBudget(100000));

    BonusToSalary isBonus = new BonusToSalary();
    System.out.println(isBonus.calc(4));
    }
}