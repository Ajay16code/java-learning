import java.util.*;
import java.io.*;
import java.io.file;

public class file1
  {
    public static void main(String[]args)
    {
      
      FileReader f1 = new FileReader("Choose a path");
      Scanner fil1 = new Scanner(f1);
    }
  }

public class file2 extends file1
  {
    public static void main(String[] args)
    {
      FileWriter f2 = new FileWriter("Choose a path");
      Scanner fil2 = new Scanner(f2);
      while(String fil2 != fil2.nextLine())
        {
        System.out.println(" ");
        }
    }
  }
