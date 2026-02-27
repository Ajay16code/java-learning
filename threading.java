import java.util.*;
import java.io.*;

public class threading{
     public static void main(String [] args)
{
       System.out.println("Making bake :",threading.currentthread.getId())
       System.out.println("Packaage a cake :",threading.currentthread.getId())
       System.out.println("Delivery a cake :",threading.currentthread.getId())
       int count = 0;
       int Cake = 1;
       for(int i=0;i<Cake;i++){
            
       Cake = count++;
       System.out.print(Cake);
}

}
