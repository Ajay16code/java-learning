class Solution {
    public int totalNumbers(int[] digits) {
        int arr[] = new int[10];
        int ans = 0;
        for(int i=0;i<digits.length;i++)
        {
            arr[digits[i]]++;
        }
        for(int i=100;i<=998;i=i+2)
        {
            int hun = i / 100;
            int ten = (i/10)%10;
            int one = i%10;
            arr[hun]--;
            arr[ten]--;
            arr[one]--;
            if(arr[hun]>=0 && arr[ten]>= 0 && arr[one]>=0) ans++;
                arr[hun]++;
                arr[ten]++;
                arr[one]++;
        }
        return ans;
    }
}
