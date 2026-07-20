import java.util.Scanner;

class Main {

    static void f(int i, int n) {
        // Base condition
        if (i > n) {
            return;
        }

        System.out.println("Ajay");

        // Recursive call
        f(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        f(1, n);

        sc.close();
    }
}
