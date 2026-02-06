import java.util.*;

public static void main(String []args)
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=1;i<=n;i++,System.out.println())
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print((char)(j+64));
        }
    }
    for(int i=1;i<=n;i++,System.out.println())
    {
        for(int j=n;j>i;j--)
        {
            System.out.print((char)(j+64));
        }
    }
}

5
A
AB
ABC
ABCD
ABCDE
EDCB
EDC
ED
E
