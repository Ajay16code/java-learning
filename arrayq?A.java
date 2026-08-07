


second

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       int[] arr = {12,43,76,11,90,123,76,87};
       
       int max = arr[0];
       int second = 0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i] > max)
           {
               second = max;
               max = arr[i];
           }
           if(arr[i] > second && arr[i] != max)
           {
               second = arr[i];
           }
       }
       System.out.print(second);
    }
}

right rotate


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       int[] arr = {12,43,76,11,90,123,76,87};
       
       int first =  arr[arr.length - 1];
       
       for(int i=arr.length - 1 ; i>0;i--)
       {
           arr[i] = arr[i - 1];
       }
      arr[0] = first;
       for(int x : arr)
       {
           System.out.print(x+" ");
       }
       
    }
}


left rotate

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       int[] arr = {12,43,76,11,90,123,76,87};
       
       int first =   arr[0];
       
       for(int i=0;i<arr.length;i--)
       {
           arr[i] = arr[i + 1];
       }
      arr[arr.length - 1] = first;
       for(int x : arr)
       {
           System.out.print(x+" ");
       }
       
    }
}


merge array

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       int[] arr1 = {12,43,76,11,18};
       int[] arr2 = (87,98,34):
       
       int[] result =new int[arr1.length + arr2.length];
       int k = 0;
       for(int i =0;i<arr1.length;i++)
       {
           result[k] = arr1[i];
           k++;
       }
       for(int i=0;i<arr2.length;i++)
           {
               result[k] = arr2[i];
               k++;
           }
       for(int x : result)
       {
           System.out.print(x+" ");
       }
       
       
       
    }
}


pair sum

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       int[] arr = {12,43,76,11,18,11};
       int target = 30;
       boolean flag = false;
       for(int i=0;i<arr.length;i++)
       {
           for(int j=i;j<arr.length;j++)
           {
               if(arr[i] + arr[j] == target)
               {
                   System.out.println(arr[i] +"+"+ arr[j] +"="+target);
                   flag = true;
               }
           }
           
       }
       if(flag)
       {
           System.out.print("Pair sum found");
       }
       else
       {
           System.out.print("Pair sum Not found");
       }
       
       
       
    }
}


common element in array

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       int[] arr1 = {12,43,76,11,18,};
       int[] arr2 = {34,56,78,90,11};
       for(int i=0;i<arr1.length;i++)
       {
           for(int j=i;j<arr2.length;j++)
           {
               if(arr1[i] == arr2[j])
               {
                   System.out.println(arr1[i]);
                   break;
               }
               
           }
           
       }
    }
}


missing element

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4};
       int n = arr.length + 1;
       int expected =  n * (n + 1) / 2;
       int actual = 0;
       
       for(int i=0;i<arr.length;i++)
       {
           actual += arr[i];
           
       }
       int miss  = expected - actual;
       
       System.out.print(miss);  
       
       
       
    }
}

buy and sell stock

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       int[] arr = {12,43,76,11,18};
       int min = arr[0];
       int max = 0;
       
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i] < min)
           {
               min = arr[i];
           }
           int profit = arr[i] - min ;
           
           if(profit > max)
           {
               max = profit;
           }
       }
       System.out.print(max);
       
    }
}

binary 

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       int[] arr = {12,43,76,11,18};
       Arrays.sort(arr);
       int target = 43;
       int left = 0;
       int right = arr.length - 1 ;
       boolean flag = false;
       
       while(left <= right)
       {
           int mid = left + (right - left) / 2;
           
           if(arr[mid] == target)
           {
               flag = true;
               System.out.println(mid);
               break;
           }
           else if(arr[mid] < target)
           {
               left = mid + 1;
           }
           else
            {
                right = mid -1;
            }
       }
       if(flag)
       {
           System.out.print("Found");
       }
       else
       {
           System.out.print("Not");
       }
       
    }
}
