public class Bai21_hamtrongjava {
    public static void main(String[] args) {
        int kq = Cong(1,2,3);
        int kq2 = Cong(4,5,6);
        System.out.println("Tong cac so la = "+kq);
        System.out.println("Tong cac so la = "+kq2);
        Xinchao("male");
        Xinchao("female");
    }

    public static int Cong(int x,int y,int z){
        return x+y+z;
    }
    public static void Xinchao(String gioitinh) {
        if (gioitinh.equals("female"))
            System.out.println("Xin chao toi la nhan vien nu");
        else if (gioitinh.equals("male"))
            System.out.println("Xin chao toi la nhan vien nam");
        else
            System.out.println("Ban nhap gioi tinh sai");

    }
}
