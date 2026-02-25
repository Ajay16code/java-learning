import java.util.*;
import java.util.Scanner;
public class array4
{
   public static void main (String [] args)
{   
      int n = sc.nextInt();
      int [] arr = new int[n];
      int sum = 0;
      for(int i=0; i<arr.length;i++){
          arr[i] = sc.nextInt();
          sum += arr[i];
      }
   for(int i=0; i<arr.length;i++){
          System.out.print(arr[i]+" ");
          System.out.println();
          System.out.println(arr[i].length);
          System.out.println(sum);
          Cake c1 = new Cake();
          c1 = c1.thread.currentthread();
      }
}
}
