package NGAYBON;

public class PhuongTrinhBacHai {
    private double a,b,c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public static String explain() {
        return "PhuongTrinhBacHai: ax^2+bx+c=0";
    }
    public PhuongTrinhBacHai(double a, double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }
    public  double getRoot(){
        double root = -this.c / this.b;
        return root;
    }
    public double getRoot1() {
        double root1 = 0;
        if (this.getDiscriminant() >= 0) {
            root1 = (-this.b - Math.sqrt(this.getDiscriminant()))/(2*this.a);
        }
        return root1;
    }
    public double getRoot2() {
        double root2 = 0;
        if (this.getDiscriminant() >= 0) {
            root2 = (-this.b + Math.sqrt(this.getDiscriminant()))/(2*this.a);
        }
        return root2;
    }

}
