import java.util.Scanner;

public class 第七题 {
    private int a;
    private int b;
    private int c;
    private int d;
    public void x(int a,int b,int c,int d)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    public void add()
    {
        System.out.print("两复数相加的结果为：");
        System.out.printf("%d",(a+c));
        System.out.printf("%+d",(b+d));
        System.out.println("i");


    }
    public void reduce()
    {

        System.out.print("两复数相减的结果为：");
        System.out.printf("%d",(a-c));
        System.out.printf("%+d",(b-d));
        System.out.println("i");
    }
    public void multiply()
    {
        System.out.print("两复数相乘的结果为：");
        System.out.printf("%d",(a*c-b*d));
        System.out.printf("%+d",(a*d+b*c));
        System.out.println("i");
    }
    public static void main(String[] args) {
        第七题 b=new 第七题();
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
       int B=in.nextInt();
       int c=in.nextInt();
       int d=in.nextInt();
       b.x(a,B,c,d);
        b.add();
       b. reduce();
       b. multiply();
    }
}
