import java.util.Scanner;

public class bai12_1giaibt10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào đtb: ");
        double dtb = sc.nextDouble();
        String traloi = (dtb>=8 && dtb<=10)?"Giỏi":
                ((dtb<8 && dtb>=6.5)?"Khá":
                        (dtb<6.5 && dtb>=5)?"Trung bình" :"Yếu");
        System.out.println(traloi);
    }
}
