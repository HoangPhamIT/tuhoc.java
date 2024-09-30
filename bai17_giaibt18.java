import java.util.Scanner;

public class bai17_giaibt18 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Moi nhap vao mot so nguyen a>0 : ");
            a= sc.nextInt();
            while (a<=0){
                System.out.println("Nhap lai a , a phai > 0 ");
                a= sc.nextInt();
            }
            System.out.printf("Ban da nhap a thanh cong, a= " +a);
            int demUoc=0;
            for (int i=1; i<=a;i++){
                if(a%i ==0)
                    demUoc++;
            }
            if (demUoc==2)
                System.out.println(a+ " la so nguyen to");
            else
                System.out.println(a+ " khong phai la so nguyen to");
            System.out.println("Neu ban muon thoat , nhan y de thoat: ");
            String traloi = new Scanner(System.in).nextLine();
            if (traloi.equals("y") || traloi.equals("y"))
                break;
        }
    }
}

