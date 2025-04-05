class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;        // Pointer to end of nums1's initialized part
        int j = n - 1;        // Pointer to end of nums2
        int k = m + n - 1;    // Pointer to end of nums1 (total length)

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If anything left in nums2, copy it
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        // No need to copy the rest of nums1; they're already in place
    }
}
