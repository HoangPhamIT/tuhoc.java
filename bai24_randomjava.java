import java.util.Random;

public class bai24_randomjava {
    public static void main(String[] args) {
        Random rd = new Random();
        int soNguyen = rd.nextInt(0,51);
        System.out.println(soNguyen);
         double x = rd.nextDouble(-100,100);
        System.out.println(x);
    }
}
