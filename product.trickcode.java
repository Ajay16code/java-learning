reverse


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n>0)
        {
            int digit = n%10;
            rev = rev*10 + digit;
            n /= 10;
        }
        System.out.println(rev);
    }
}


palindrome



import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int rev = 0;
        while(n>0)
        {
            int digit = n%10;
            rev = rev*10 + digit;
            n /= 10;
        }
        if(num == rev)
        {
            System.out.print("It is Palindrome");
        }
        else
        {
            System.out.print("It is not a Palindrome");
        }
    }
}


Armstrong


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int rev = 0;
        while(n>0)
        {
            int digit = n%10;
            rev += digit*digit*digit;
            n /= 10;
        }
        if(num == rev)
        {
            System.out.print("It is Armstrong");
        }
        else
        {
            System.out.print("It is not a  Armstrong");
        }
        
    }
}


Prime no


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean flag = true;
        if(n<=1)
        {
            System.out.println("It is Not Prime");
            return;
        }
        for(int i=2;i<n;i++)
        {
            if(n % i == 0)
            {
                flag = false;
                break;
            }
        }
        if(flag)
            {
                System.out.println("It is Prime");
            }
            else
            {
                System.out.println("It is Not a Prime");
            }
        
    }
}


fibannaci



import java.util.*;
class Main {
    public static int fiban(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fiban(n-1) + fiban(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        // int firstnum = 0;
        // int secondnum =1;
        
        for(int i=0;i<=n;i++)
        {
            System.out.print(fiban(i)+" ");
        }
        // {
        //     System.out.print(firstnum+" ");
            
        //     int sum = firstnum + secondnum;
        //     firstnum = secondnum;
        //     secondnum = sum;
        // }
        
        
    }
}



factorial


import java.util.*;
class Main {
    // public static int fact(int n)
    // {
    //     if(n==0 || n==1)
    //     {
    //         return n;
    //     }
    //     return n*fact(n-1);
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        // System.out.print(fact(n));
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact *= i;
        }
        System.out.print(fact);
        
        
    }
}




hcf or gcd and lcm


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num1 = a;
        int num2 = b;
        while(num2 != 0)
        {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        int gcd = num1;
        System.out.println("gcd"+" "+gcd);
        int lcm = 0;
        if(a != 0 && b != 0)
        {
            lcm = Math.abs(a*b)/gcd;
        }
        System.out.println("lcm"+" "+lcm);
    }
}



adam no 


import java.util.*;
class Main {
    public static int rev(int n)
        {
            int rever = 0;
            while(n>0)
            {
               int digit = n % 10;
               rever = rever * 10 + digit;
               n /= 10;
            }
            return rever;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int reversen = rev(n);
        int sqrn = n*n;
        int sqrrevn = reversen * reversen;
        
        if(sqrn == rev(sqrrevn))
        {
            System.out.println("It is Adam");
        }
        else
        {
            System.out.println("It is not Adam");
        }
        
    }
}



happy no



