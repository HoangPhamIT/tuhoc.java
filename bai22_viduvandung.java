import java.util.Calendar;
import java.util.Scanner;

public class bai22_viduvandung {
    public static void main(String[] args) {
        int day, month,year , tuoi;
        Scanner input = new Scanner(System.in);
        System.out.println("Moi nhap vao ngay sinh : ");
        day = input.nextInt();
        System.out.println("Moi nhap vao thang sinh : ");
         month = input.nextInt();
        System.out.println("Moi nhap vao nam sinh  : ");
        year = input.nextInt();
        Calendar birthday = Calendar.getInstance();
        birthday.set(year,month-1,day);
        int namSinh = birthday.get(Calendar.YEAR);
        int thangSinh = birthday.get(Calendar.MONTH);
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngay thang nam sinh : "
                +ngaySinh+"/"
                +(thangSinh+1)+"/"
                +namSinh);
        Calendar now = Calendar.getInstance();
        int namHienTai = now.get(Calendar.YEAR);
        tuoi = namHienTai-namSinh;
        System.out.println("Tuoi cua ban la: "+tuoi);
    }
}
