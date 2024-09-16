import java.util.Scanner;

public class bai12_toantu3ngoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 số nguyên n: ");
        int n = sc.nextInt();
        String traloi = (n%2 ==0)?"Chẵn" : "Lẻ";
        System.out.println("Số "+n+" là số "+traloi);
    }
}
