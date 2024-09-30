import java.util.Scanner;

public class Bai21_vdgiaiptb2 {
    public static void main(String[] args) {

    String kq = GiaiPTB2(1,2,3);
    String kq2 = GiaiPTB2(1,2,1);
    String kq3 = GiaiPTB2(1,2,-3);
        System.out.println(kq);
        System.out.println(kq2);
        System.out.println(kq3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so a: ");
        double x= sc.nextDouble();
        System.out.println("Moi nhap vao so b: ");
        double y =sc.nextDouble();
        System.out.println("Moi nhap vao so c: ");
        double z= sc.nextDouble();
        String kq4 = GiaiPTB2(x,y,z);
        System.out.println(kq4);
    }

    public static String GiaiPTB2(double a,double b,double c){
    if (a==0){
        if (b==0 && c==0)
            return "Pt bac nhat vo so nghiem";
        else if (b==0 && c!=0) {
            return "Pt bac nhat vo nghiem";
            }
        else
            return "Pt bac nhat co nghiem : "+(-c/b);
        }
        else {
            double delta = (b*b)-(4*a*c);
            if (delta<0)
                return "Pt bac 2 vo nghiem";
            else if (delta==0) {
                double x=-b/(2*a);
                return "Pt bac 2 co nghiem kep x = "+x;
        }
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Pt bac 2 co 2 nghiem phan biet x1= " + x1 + " x2 = " + x2 ;
            }
        }
    }
}

