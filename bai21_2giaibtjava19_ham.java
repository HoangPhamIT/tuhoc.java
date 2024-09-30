import java.util.Scanner;

public class bai21_2giaibtjava19_ham {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao a : ");
        double a = sc.nextDouble();
        System.out.println("Moi nhap vao b : ");
        double b = sc.nextDouble();
        System.out.println("Moi chon phep tinh : + - * /");
        String PhepTinh = new Scanner(System.in).nextLine();
        switch (PhepTinh) {
            case "+":
                cong(a,b);
                break;
            case "-":
                tru(a,b);
                break;
            case "*":
                nhan(a,b);
                break;
            case "/":
                chia(a,b);
                break;
            default:
                System.out.println("Phim bam khong hop le");
                break;
        }
    }
    public static void cong(double a,double b){
        double kq=a+b;
        System.out.println("kq = "+kq);
    }
    public static void tru(double a,double b){
        double kq=a-b;
        System.out.println("kq = "+kq);
    }
    public static void nhan(double a,double b){
        double kq=a*b;
        System.out.println("kq = "+kq);
    }
    public static void chia(double a,double b){
        if (b==0)
            System.out.println("Khong the chia cho so 0");
        else {
            double kq = a/b;
            System.out.println("kq = "+kq);
        }
    }
}
