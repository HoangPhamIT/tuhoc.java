import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai22_datetimejava {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang + 1);
        System.out.println(ngay);
        cal.set(Calendar.YEAR , 1987);
        cal.set(Calendar.MONTH , 11);
        cal.set(Calendar.DAY_OF_MONTH,27);
        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("ngay thang nam sinh : "
        +ngaySinh+"/"
        +(thangSinh+1)+"/"
        +namSinh);
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        Date d = cal.getTime();
        String s = dinhDang.format(d);
        System.out.println(s);
    }
}


