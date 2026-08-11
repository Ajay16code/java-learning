linear 

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] arr = {12,43,2,76,89,42,55,34};
        int target = 42;
        
        for(int i=0;i<= arr.length-1;i++)
        {
            if(arr[i] == target)
            {
                System.out.print(i);
                break;
            }
        }
    }
}

first occurrence and last occurrence

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6,7,2,9,8,2,1,2};
        int target = 2;
        int first = -1;
        int last = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                if(first == -1)
                   first = i;
            last = i;
            }
        }
        System.out.println(first);
        System.out.println(last);
    }
}

bubble sort

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {12,43,2,76,89,42,55,34};
        int n = arr.length;
        
        for(int i=0;i<n-1 ;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<n-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

insertion sort

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {12,43,2,76,89,42,55,34};
        int n = arr.length;
        
        
        for(int i=0;i<n;i++)
        {
            int key = arr[i];
            int j = i - 1;
            while(j >=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

factorial

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

    
class Main {
    public static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
            
        }
        else
        {
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,43,2,76,89,42,55,34};
        int n = 15;
        
        System.out.print(fact(n));
        
        
        
    }
}

fibannaci

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

    
class Main {
    
    public static void main(String[] args) {
        int[] arr = {12,43,2,76,89,42,55,34};
        int n = 5;
       
        int firstnum = 0;
        int secondnum = 1;
        for(int i= 0;i<=n;i++)
        {
            System.out.print(firstnum+" ");
            int sum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = sum;
        }
        
    
 
    }
}

tower of Hanoi

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    
    
    static void hanoi(int n,char source,char helper,char destination)
    {
        if(n == 0)
    {
        return;
    }
    
        hanoi(n-1,source,destination,helper);
        
        System.out.println(" Move Disk "+n+" from "+source+" to "+destination);
        hanoi(n-1,helper,source,destination);
    }
    public static void main(String[] args) {
        int n = 3;
        
        hanoi(n,'A','B','C');
        
    }
}

permutation

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

    
class Main {
    
    public static void main(String[] args) {
        String s = "ABC";
        
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                for(int k=0;k<s.length();k++)
                {
                    if(i != j && j != k && k != i)
                    {
                        System.out.println(""+s.charAt(i)+s.charAt(j)+s.charAt(k));
                    }
                    
                }
            }
        }
    
 
    }
}

generate parantheses


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int n = 3;
        int total = (int) Math.pow(2,2*n);
        
        for(int i=0;i<total;i++)
        {
            String s = "";
            int open =0;
            int close = 0;
            for(int j=0;j<2*n;j++)
            {
                if((i&(1<<j)) != 0)
                {
                    s += "(";
                    open++;
                }
                else
                {
                    s += ")";
                    close++;
                }
                if(close>open)
                {
                    break;
                }
                
            }
            if(open == n && close == n)
            {
                System.out.println(s);
            }
        }
    }
}
