public class PeakElement {
    public static int findPeak(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            boolean leftCheck = mid == 0 || arr[mid] > arr[mid - 1];
            boolean rightCheck = mid == arr.length - 1 || arr[mid] > arr[mid + 1];
            if (leftCheck && rightCheck)
                return arr[mid];
            if (mid > 0 && arr[mid] < arr[mid - 1])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 20, 4, 1, 0};
        int peak = findPeak(nums);
        System.out.println(peak);
    }
}
