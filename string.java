reverse a string

class Main {
    public static void main(String[] args) {
        String s = "Ajay";
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}



palindrome


class Main {
    public static void main(String[] args) {
        String s = "leveln";
        boolean flag = true;

        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
            {
                flag = false;
                break;
            }
        }
        if(flag)
            {
                System.out.println("It is Palindrome");
            }
            else
            {
                System.out.println("It is Not Palindrome");

            }
    }
}


remove space

class Main {
    public static void main(String[] args) {
        String s = "My name is Ajay ";
        
        String space = "";
        for(int i=0;i<=s.length()-1;i++)
        {
            if(s.charAt(i) != ' ')
            {
                space += s.charAt(i);
            }
        }
        System.out.print(space);
    }
}

remove duplicate character

class Main {
    public static void main(String[] args) {
        String s = "MyAjayA";
        String n = "";
        
        
        // String space = "";
        for(int i=0;i<s.length();i++)
        {
            boolean found = false;
            
            for(int j=0;j<n.length();j++)
            {
                if(s.charAt(i) == n.charAt(j))
                {
                   found = true;
                   break;
                    
                }
            }
        
        if(!found)
        {
            n += s.charAt(i);
        }
        }
        System.out.print(n);
    }
}

frequency count

class Main {
    public static void main(String[] args) {
        String s = "programmingaaa";
        
        for(int i=0;i<s.length();i++)
        {
            boolean found = false;
            for(int j=0;j<i;j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                int count = 1;
                for(int j = i+1;j<s.length();j++)
                {
                    if(s.charAt(i) == s.charAt(j))
                        count++;
                }
                System.out.println(s.charAt(i)+"="+count);
            }
        }
    }
}


rotate

class Main {
    public static void main(String[] args) {
        String s = "Programm";
        int k = 5;
        
        for(int i=k;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(s.charAt(i));
        }
    }
}



largest word in sentence

class Main {
    public static void main(String[] args) {
        String s = "Java is a Programming language";
        
        String word ="";
        String longest = "";
        
        for(int i=0;i<=s.length();i++)
        {
            if(i == s.length() || s.charAt(i) == ' ')
            {
                if(word.length() > longest.length())
                {
                    longest = word;
                    
                }
                word = "";
            } else
                {
                    word += s.charAt(i);
                }
            
        }
        System.out.println(longest);
        
    }
}



string compression

class Main {
    public static void main(String[] args) {
        String s = "aaabbcd";
        
        int count = 1;
        
        for(int i=0;i<s.length();i++)
        {
            if(i < s.length() - 1 && s.charAt(i) == s.charAt(i+1))
            {
                count++;
            }
            else
            {
                System.out.print(s.charAt(i));
                System.out.print(count);
                count = 1;
            }
        }
        
        
        
    }
}


anagram or not 



class Main {
    public static void main(String[] args) {
        String s = "earth";
        String n = "heart";
        
        if(s.length() != n.length())
        {
            System.out.println("Not Anagram");
            return;
        }
        
        int[] count = new int[256];
        
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
            count[n.charAt(i)]--;
        }
        boolean flag = true;
        for(int i=0;i<256;i++)
        {
            if(count[i] !=0)
            {
                flag = false;
                break;
            }
            
        }
        if(flag)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }
}


Longest Substring Without Repeating Characters


class Main {
    public static void main(String[] args) {
        String s = "abcabcabcd";
        
        
        int max = 0;
        
        for(int i=0;i<s.length();i++)
        {
            boolean[] visit = new boolean[256];
            int count = 0;
            for(int j=i;j<s.length();j++)
            {
                char ch = s.charAt(j);
                
                if(visit[ch])
                    break;
                    
                visit[ch] = true;
                count++;
            }
            if(count > max)
            {
                max = count;
            }
        }
        System.out.print(max);
        
        
        
    }
}







