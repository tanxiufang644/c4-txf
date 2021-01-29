public class task1 {
    public static void main(String[] args) {
        System.out.println("hello world");
        int n = fab(1, 2);
        System.out.println(n);
    }
    public static int fab(int a,int b)
    {
        if(a>b)
            return 0;
        return 1;
    }
}