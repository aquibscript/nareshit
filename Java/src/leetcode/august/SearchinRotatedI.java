package leetcode.august;

public class SearchinRotatedI {

    static int findPivotIndex(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] <= nums[end]) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return result;
    }

    static int binarySearch(int[] nums, int target, int left, int right) {

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return -1;
    }


    public int search(int[] nums, int target) {


        int pivot = findPivotIndex(nums);

        System.out.println("PIVOT : " + pivot);

        if (pivot < 0) {
            return -1;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot);
        }

        return binarySearch(nums, target, pivot, nums.length - 1);

    }


    static void main(String[] args) {
        System.out.println(new SearchinRotatedI().search(
                new int[]{2,0,1}, 0));
    }
}
