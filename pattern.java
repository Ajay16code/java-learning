left triangle

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i=1;i<=n;i++,System.out.println())
        {
            
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
                
            }
            for(int k=1;k<i+1;k++)
            {
                System.out.print("*");
            }
        }
    }
}





right triangle

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i=1;i<=n;i++,System.out.println())
        {
            for(int k=0;k<i;k++)
            {
                System.out.print("*");
            }
        }
    }
}



inverted triangle 

class Main {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i=n;i>=0;i--,System.out.println())
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n*2-i;j++)
            {
                System.out.print("*");
            }
            
        }
   }
}



diamond

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i=n;i>=0;i--,System.out.println())
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n*2-i;j++)
            {
                System.out.print("*");
            }
            
        }
        for(int i=1;i<=n;i++,System.out.println())
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n*2-i;j++)
            {
                System.out.print("*");
            }
            
        }
    }
}

pyramid

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i=n;i>=0;i--,System.out.println())
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n*2-i;j++)
            {
                System.out.print("*");
            }
            
        }
        
    }
}


inverted pyramid 


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 5;
        
        
        for(int i=1;i<=n;i++,System.out.println())
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n*2-i;j++)
            {
                System.out.print("*");
            }
            
        }
    }
}



inverted triangle 

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 5;
        
        
        for(int i=1;i<=n;i++,System.out.println())
        {
            
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            
        }
    }
}


butterfly 

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++,System.out.println())
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            int space = 2 * (n-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
        }
        for(int i=n-1;i>=1;i--,System.out.println())
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            int space = 2 * (n-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
        }
    }
}



hourglass 
class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n-1;i++,System.out.println())
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n*2-i;j++)
            {
                System.out.print("*");
            }
            
        }
        for(int i=n;i>=0;i--,System.out.println())
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n*2-i;j++)
            {
                System.out.print("*");
            }
            
        }
        
    }
}


Hollow Square

class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++,System.out.println())
        {
            for(int j=0;j<n;j++)
            {
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1)
                {
                    System.out.print("*");
                }
                else
                {
                  System.out.print(" ");  
                }
                
            }
        }
        
        
    }
}


Hollow diamond


class Main {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i=n;i>=0;i--,System.out.println())
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n*2-i;j++)
            {
                if(j==i || j==n*2-i || j==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            
        }
        for(int i=1;i<=n;i++,System.out.println())
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n*2-i;j++)
            {
                if(j==i || j==n*2-i || j==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            
        }
    }
}

pascal triangle

class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++,System.out.println()) {
            for (int j = 0; j < n - i - 1; j++) 
            {
                System.out.print("  ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + "   ");
                num = num * (i - j) / (j + 1);
            }
        }
    }
            
    }
    

pascal triangle right

class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++,System.out.println()) {
            for (int j = 0; j < n - i - 1; j++) 
            {
                System.out.print("  ");
            }
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + "   ");
                num = num * (i - j) / (j + 1);
            }
        }
    }
            
    }
    

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
class Main {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;

        for (int i = 1; i <= n; i++,System.out.println()) {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
        }
    }
            
    }
    


A
BC
DEF
GHIJ
KLMNO



class Main {
    public static void main(String[] args) {
        int n = 5;
        char num = 'A';

        for (int i = 1; i <= n; i++,System.out.println()) {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num);
                num++;
            }
        }
    }
            
    }
    



