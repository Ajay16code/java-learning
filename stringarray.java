reverse a word

class Main {
    public static void main(String[] args) {
        String s = "I am Ajay";
        String[] spa = s.split(" ");
        for(int i=spa.length-1;i>=0;i--)
        {
            System.out.print(spa[i]+" ");
        }
    }
}


captilize word

class Main {
    public static void main(String[] args) {
        String s = "i hello vanakam";
        String result = "";
        
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            
            if(i==0 || s.charAt(i - 1) == ' ')
            {
                result += Character.toUpperCase(ch);
            }
            else
            {
                result += Character.toLowerCase(ch);
            }
        }
        System.out.print(result);
    }
}


example input is i hello world
output is I Hello World



class Main {
    public static void main(String[] args) {
        String s = "i hello vanakam";
        String ans  = "";
        
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                ch = (char)(ch - 32);
            }
            ans += ch;
        }
        System.out.print(ans);
    }
}



class Main { public static void main(String[] args) { String s = "i hello vanakam"; System.out.print(s.toUpperCase()); }



check substring


import java.util.*;
class Main {
    public static void main(String[] args) {
        String s = "HelloWorld";
        Scanner sc = new Scanner(System.in);
        
        String p = sc.nextLine();
        
        if(s.contains(p))
        {
            System.out.print("Ok");
        }
        else
        {
            System.out.print("Not");
        }
        
    }
}



import java.util.*;
class Main {
    public static void main(String[] args) {
        String s = "HelloWorld";
        Scanner sc = new Scanner(System.in);
        
        String p = sc.nextLine();
        
        if(s.indexOf(p) != -1)
        {
            System.out.print("Ok");
        }
        else
        {
            System.out.print("Not");
        }
        
    }
}



toggle case

import java.util.*;
class Main {
    public static void main(String[] args) {
        String s = "HelloWorld";
        String result = "";
        for(int i=0;i<s.length()-1;i++)
        {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch<= 'z')
            {
                ch = (char)(ch - 32);
            }
            else if(ch >= 'A' && ch<= 'Z')
            {
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        System.out.print(result);
        
        
        
    }
}


count consonant 

import java.util.*;
class Main {
    public static void main(String[] args) {
        String s = "Ajay";
        String consonant = "";
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')
            {
                count++;
                
            }
        }
        System.out.print(count);
        
        
        
    }
}



rearrange positive and negative num




move 0 to end

import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,4,0,5,0,9,0,8};
        
        int index = 0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != 0)
            {
                arr[index] = arr[i];
                index++;
            }
        }
            while(index < arr.length)
            {
                arr[index] = 0;
                index++;
            }
        
        System.out.print(Arrays.toString(arr));
        
        
        
    }
}



kadane ' s algorithm


import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        
        int max = Integer.MIN_VALUE;
        
        int sum = 0;
        
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
            
            if(sum > max)
            {
                max = sum;
            }
            if(sum < 0)
            {
                sum = 0;
            }
        }
        System.out.print(max);
        
        
        
        
        
    }
}


Maximum subarray

import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max = Integer.MIN_VALUE;
        int sum =0;
        
        int start = 0;
        int end = 0;
        int temp = 0;
        
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
            
            if(sum > max)
            {
                max = sum;
                start = temp;
                end = i;
            }
            if(sum <0)
            {
                sum = 0;
                temp = i + 1;
            }
        }
        System.out.println(max);
        for(int i= start;i<=end;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        
        
    }
}

rearrange positive and negative number


import java.util.*;
class Main {
    public static void main(String[] args) {
        int [] arr = {2,1,-4,6,-7,-8,9,-1};
        
        
        int pos = 0;
        int neg = 1;
        int n = arr.length;
        int[] res = new int[n];
        
        for(int i=0;i<n;i++)
        {
            if(arr[i] > 0)
            {
                res[pos] = arr[i];
                pos += 2;
            }
            else
            {
                res[neg] = arr[i];
                neg += 2;
            }
        }
        System.out.print(Arrays.toString(res));
    }
}


triplet sum


import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {4,10,22,48,2,2,64,25,50,12};
        int target = 87;
        int sum = 0;
        
        for(int i=0;i<arr.length;i++)
        {
            int left = i + 1;
            int right = arr.length - 1;
            
            while(left < right)
            {
                sum = arr[i] + arr[left] + arr[right];
            
            if(sum == target)
            {
                System.out.print(arr[i] +" "+ arr[left] +" "+ arr[right]);
                return;
            }
            else if(sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }
            }
        }
        System.out.print("Not found");
    }
}



