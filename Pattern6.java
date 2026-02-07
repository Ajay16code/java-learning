import java.util.Scanner;

public class Pattern6 {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        for(int i=n;i>=1;i--,System.out.println())
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64));
            }
        }
        
    }
}

ABCDE
ABCD
ABC
AB
A