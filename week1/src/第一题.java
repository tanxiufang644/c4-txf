import java.util.Scanner;

public class 第一题 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("输入体重（kg）:");
        double a=in.nextDouble();
                System.out.println("输入身高(m):");
        double b=in.nextDouble();
        double c=a/(b*b);
        if(c<18.5)
            System.out.println("过轻");
        else if(c<25&&c>=18.5)
            System.out.println("正常");
        
        
        
        
        
        
        else if(c<28&&c>=25)
            System.out.println("过重");
        else if(c<32&&c>=28)
            System.out.println("肥胖");
        else if(c>=32)
            System.out.println("非常肥胖");
































    }


}
