import java.util.Scanner;

public class 第一周第四题 {

    public static void f(int a[])
    {
        int i;
        int[] b=new int[a.length];
        int count=0;
        int count2=0;
        for(i=0;(count+count2)<a.length;i++)
        {
          if(a[i]==0)
          { b[a.length-1-count2]=0;
          count2++;}
          else
          {   b[count]=a[i];
          count++;}
        }
        for(i=0;i<b.length-1;i++)
        { System.out.print(b[i]+",");}
        System.out.println(b[i]);

    }
    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
        int[] a={0,1,3,0,12,0,8};
           f(a);
    }
}
