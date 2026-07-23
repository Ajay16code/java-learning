// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int count = 1;
        for(int i=1;i<=str.length();i++)
        {
            if(i<str.length() && str.charAt(i) == str.charAt(i-1))
            {
                count++;
            }
            else
            {
                System.out.print(str.charAt(i-1));
                System.out.print(count);
                count  = 1;
            }
        }
        sc.close();
    }
}
