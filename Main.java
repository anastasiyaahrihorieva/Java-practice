abstract class Shape {
    public abstract double area();
}

class Square extends Shape{
    private double size;
    Square(double a) { this.size = a; }

    @Override 
    public double area(){ return size*size; }
}

class Rect extends Shape{

    private double s_a, s_b;
    Rect(double a, double b){ 
        this.s_a = a; 
        this.s_b = b;
    }
    @Override 
    public double area(){return s_a*s_b;}
}

class PrintShapeArea{
    static void printArea(Shape sh){
        System.out.println(sh.area());
    }
}

public class Main {
    public static void main(String[] args) {
        Rect rct = new Rect(2.0, 3.0);
        Square sq = new Square(5.0);
        PrintShapeArea.printArea(sq);
        PrintShapeArea.printArea(rct);
    }

}