public class bai20_xulyngoaile {
    public static void main(String[] args) {
        int a=10;
        int b = 2;
        try {
            int c = a/b;
            System.out.println("c= "+c);
        }
        catch (ArithmeticException ex) {
            System.out.println("Co loi toan hoc");
            ex.printStackTrace();
        }
        catch (Exception ex){
            System.out.println("Co loi");
            ex.printStackTrace();
        }
        finally {
            System.out.println("co loi hay khong loi deu phai lam cai nay");
        }
        System.out.println("Doan code phia sau");

    }
}
