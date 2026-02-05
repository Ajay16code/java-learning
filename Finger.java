import java.util.*;
//Count a Finger
public class Finger{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rem = n%8;

        if(rem == 0)
        {
            System.out.print(2);
        }
        else if(n<5)
        {
            System.out.print(rem);
        }
        else
        {
            System.out.print(10-rem);
        }
    }
}