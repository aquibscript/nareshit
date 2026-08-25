package leetcode.august;

public class SearchinRotatedI {

    static  int findPivot (int [] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            else if(nums[mid] > nums[mid - 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }

        return -1;
    }


    public static int binarySearch(int[] nums, int target, int left, int right) {


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


        int pivot = findPivot(nums);

        int res =   binarySearch(nums, target, 0, pivot);
        if(res == -1) {
            res = binarySearch(nums, target, pivot, nums.length - 1);
        }

        return  res;

    }


    static void main(String[] args) {
        System.out.println(new SearchinRotatedI().search(new int [] {4,5,6,7,0,1,2}, 0));
    }
}
