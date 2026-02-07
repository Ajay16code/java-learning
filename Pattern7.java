import java.util.*;

public class Pattern7 {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        for(int i=1;i<=n-1;i++,System.out.println())
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--)
            {
                System.out.print((char)(j+64));
            }
        }
        for(int i=1;i<=n;i++,System.out.println())
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=2*n-2*i+1;j>=1;j--)
            {
                System.out.print((char)(j+64));
            }
        }
    }
}
    A
   CBA
  EDCBA
 GFEDCBA
IHGFEDCBA
 GFEDCBA
  EDCBA
   CBA
    A