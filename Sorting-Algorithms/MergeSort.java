public class MergeSort {
    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);
            merge(prices, left, mid, right);
        }
    }

    public static void merge(int[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1, n2 = right - mid;
        int[] leftArr = new int[n1], rightArr = new int[n2];
        for (int i = 0; i < n1; i++) leftArr[i] = prices[left + i];
        for (int i = 0; i < n2; i++) rightArr[i] = prices[mid + 1 + i];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2)
            prices[k++] = (leftArr[i] <= rightArr[j]) ? leftArr[i++] : rightArr[j++];
        while (i < n1) prices[k++] = leftArr[i++];
        while (j < n2) prices[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        int[] prices = {350, 200, 500, 150, 400};
        mergeSort(prices, 0, prices.length - 1);
        for (int price : prices)
            System.out.print(price + " ");
    }
}
