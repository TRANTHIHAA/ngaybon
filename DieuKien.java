package NGAYBON;

import java.util.Scanner;

public class DieuKien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(PhuongTrinhBacHai.explain());
        System.out.print("nhap a: ");
        double a = sc.nextDouble();
        System.out.print("nhap b:");
        double b = sc.nextDouble();
        System.out.print("nhap c:");
        double c = sc.nextDouble();

        PhuongTrinhBacHai PT2 = new PhuongTrinhBacHai(a,b,c);
        if(PT2.getA() == 0) {
            System.out.println("nghiem cua PT la: "+ PT2.getRoot());
        } else if(PT2.getDiscriminant() > 0){
            System.out.println("nghiem 1 la: "+PT2.getRoot1());
            System.out.println("nghiem 1 la: "+PT2.getRoot2());
        } else if( PT2.getDiscriminant() ==0){
            System.out.println("nghiệm kép : "+PT2.getRoot1());
        } else  {
            System.out.println("PT vo nghiem");
        }
    }


}
