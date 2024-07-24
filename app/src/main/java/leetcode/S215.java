package leetcode;

class S215 {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length - k;
        int lo = 0, hi = nums.length - 1;

        // when lo == hi, doing partition will cause index out of bounds.
        while (lo < hi) {
            int j = partition(nums, lo, hi);
            if (n == j) {
                break;
            } else if (n < j) {
                hi = j - 1;
            } else {
                lo = j + 1;
            }
        }

        return nums[n];
    }

    private int partition(int[] nums, int lo, int hi) {
        int i = lo, j = hi + 1;
        int val = nums[lo];

        while (true) {
            while (nums[++i] < val && i < hi) {
            }
            while (val < nums[--j] && j > lo) {
            }
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }

        swap(nums, lo, j);
        return j;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
