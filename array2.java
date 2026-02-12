import java.util.*;

public class array2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
            count += arr[i];
        }
        System.out.print(count);
    }
}