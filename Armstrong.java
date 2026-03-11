public class ArmstrongArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[];

        System.out.println("Armstrong numbers in array:");

        for (int num : arr) {
            int temp = num;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
