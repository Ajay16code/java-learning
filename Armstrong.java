public class ArmstrongArray {
    public static void main(String[] args) {

        int[] arr = {153, 370, 371, 407, 123, 200};

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
