class Solution {
    public static void reverseArray(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // int[] temp = new int[n];

        // for (int i = 0; i < n; i++) {
        //     temp[(i + k) % n] = nums[i];
        // }

        // // copying rotated array
        // for (int i = 0; i < n; i++) {
        //     nums[i] = temp[i];
        // }

    
    // can be optimised by not using extra space of temp array
    // will learn later ==> Reversing
    // step 1. Reverse(a[a, a+k])
    // step 2. Reverse(a[a+k, a+n])
    // step 3. Reverse(a[a, a+n])
        k = k % n;

        reverseArray(nums, 0, n - 1);      // Step 1
        reverseArray(nums, 0, k - 1);      // Step 2
        reverseArray(nums, k, n - 1);      // Step 3


    }
}