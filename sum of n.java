// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//parameterized
class Main {
    
    static int sum(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return n+sum(n-1);
    }
    
    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum(n));
    }
}
//functional
class Main {
    
    static void f(int i,int sum)
    {
        if(i<1)
        {
            System.out.println(sum);
            return;
        }
        f(i - 1, sum + i);
    }
    
    public static void main(String[] args) {
        int n =4 ;
        f(n,0);
    }
}
