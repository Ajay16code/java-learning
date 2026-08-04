sum of digit


import java.util.*;
class Main {
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;
        while(n>0)
        {
            int digit = n % 10;
            sum += digit;
            n = n/10;
        }
        System.out.print(sum);
    }
}


count the digit


import java.util.*;
class Main {
    public static void main(String[] args) {
        int n = 123456789;
        int count = 0;
        while(n>0)
        {
            int digit = n % 10;
            count += 1;
            n = n/10;
        }
        System.out.print(count);
    }
}


swap number 


import java.util.*;
class Main {
    public static void main(String[] args) {
        int n = 12;
        int m = 15;
        int temp = n;
        n = m;
        m = temp;
        System.out.println("n: "+n);
        System.out.println("m: "+m);
    }
}



largest of three number 


import java.util.*;
class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int c = 16;
        if(a>b && a>c)
        {
            System.out.print("A is largest");   
        }
        else if(b>a && b>c)
        {
            System.out.print("B is largest");   
        }
        else
        {
            System.out.print("C is largest");
        }
    }
}


perfect number


import java.util.*;
class Main {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        if(num <= 1)
        {
            System.out.println(num +"is not a perfect");
        }
        else
        {
            
            for(int i=1;i<=num/2;i++)
            {
                if(num % i == 0)
                {
                sum += i;
                }
            }
        }
        if(sum == num)
        {
            System.out.println(num +" is a perfect");
        }
        else
        {
            System.out.println(num +" is not a perfect");
        }
        
        
    }
}

strong number 


import java.util.*;
class Main {
    public static void main(String[] args) {
        int num = 15;
        int origin = num;
        int sum = 0;
        int [] fact = {1,1,2,6,24,120,720,5040,40320,362880};
        int temp = origin;
        
        while(temp>0)
        {
            int digit = temp % 10;
            sum += fact[digit];
            temp = temp/10;
        }
        if(sum == origin)
        {
            System.out.println(num +" is a Strong");
        }
        else
        {
            System.out.println(num +" is not a Strong");
        }
        
        
    }
}

decimal to binary

import java.util.*;
class Main {
    public static void main(String[] args) {
        int decimalword = 45;
        String binaryword = "";
        
        int temp = decimalword;
        
        while(temp>0)
        {
            int digit = temp % 2;
            binaryword = binaryword + digit;
            temp = temp/2;
        }
        System.out.println(binaryword);
        
    }
}


binary to decimal

import java.util.*;
class Main {
    public static void main(String[] args) {
        
        String binaryword = "101101";
        int decimalword = 0;
        int base = 1;
        
        for(int i=binaryword.length()-1;i>=0;i--)
        {
            if(binaryword.charAt(i) == '1')
            {
                decimalword += base;
            }
            base *= 2;
        }
        
        
        
        System.out.println(decimalword);
        
    }
}


replace words


built in function


import java.util.*;
class Main {
    public static void main(String[] args) {
        String name = "Ajay";
        StringBuilder sb = new StringBuilder(name);
        sb.replace(1,3,"ku");
        System.out.println(sb.toString());
        sb.setCharAt(3,'i');
    }
}


replace words


without built in


import java.util.*;
class Main {
    public static void main(String[] args) {
        String name = "Ajay";
        
        char target = 'y';
        char replace = 'i';
        
        char[] chars = name.toCharArray();
        
        for(int i=0;i<chars.length;i++)
        {
            if(chars[i] == target)
            {
                chars[i] = replace;
            }
        }
        String result = "";
        for(char c : chars)
        {
            result += c;
        }
        System.out.println(result);
        
    }
}

count words

import java.util.*;
class Main {
    public static void main(String[] args) {
        String word = "Ajay Sivakumar";
        int count = 0;
        
        for(char i : word.toCharArray())
        {
            count++;
        }
        System.out.println(count);
    }
}
