import java.util.Scanner;

public class 第一周第三题 {
    public static void f(String x)
    {
      for(int i=(x.length()-1);i>=0;i--)
          System.out.print(x.charAt(i));


    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        f(a);
    }
}
