public class 第二题 {
   public static int f(int x)
    {
        int a=0;
        int k=x;
     while (k!=0)
        {
         a=(a+(k%10)*(k%10)*(k%10));
         k=k/10;
     }
     if(a==x)
         return x;
     else
         return -1;
    }
    public static void main(String[] args) {
        int x;
        int count=0;
        for(x=100;x<1000;x++)
        {
            if(f(x)!=-1)
                count++;
        }
        System.out.println(count);
    }
}
