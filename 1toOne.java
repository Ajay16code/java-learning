import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = {
            "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
        };

        String num = sc.nextLine();

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

            if (Character.isDigit(ch)) {
                System.out.print(words[ch - '0'] + " ");
            } else {
                System.out.println("Invalid Input");
                return;
            }
        }
    }
}
