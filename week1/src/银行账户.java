import java.util.Scanner;

public class 银行账户 {
    private String acount;
    private double a;

    public void f(String acount) {
        this.acount = acount;
        System.out.println(acount);
    }

    public void x(double a) {
        this.a = a;
        System.out.println("余额为" + a);

    }

    public static void main(String args[]) {
        bank b = new bank();
        Scanner in = new Scanner(System.in);
        String acount = in.nextLine();
        b.f(acount);
        double a = in.nextDouble();
        b.x(a);


    }
}