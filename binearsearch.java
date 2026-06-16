class BinarySearchDemo {

    static int binarySearch(int[] arr, int key) {
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }

    static int recursiveBinarySearch(int[] arr, int l, int h, int key) {
        if (l <= h) {
            int mid = (l + h) / 2;

            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                return recursiveBinarySearch(arr, l, mid - 1, key);
            } else {
                return recursiveBinarySearch(arr, mid + 1, h, key);
            }
        }

        return -1;
    }

    static void display(int[] arr) {
        System.out.println("\nElements are:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 9, 16, 18, 21, 28, 32, 35};

        System.out.println("Iterative Binary Search: "
                + binarySearch(arr, 16));

        System.out.println("Recursive Binary Search: "
                + recursiveBinarySearch(arr, 0, arr.length - 1, 16));

        display(arr);
    }
}
