import java.util.*;

public class Pattern4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++,System.out.println())
        {
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
        }
        for(int i=n-1;i>=1;i--,System.out.println())
        {
            for(int j=1;j<2*i;j++)
            {
                System.out.print("*");
            }
        }
    }
}

5
*
***
*****
*******
*********
*******
*****
***
*