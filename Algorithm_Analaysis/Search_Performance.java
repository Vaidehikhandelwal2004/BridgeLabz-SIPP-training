import java.util.*;

public class Search_Performance
{
    // Linear search in array
    public static int linearSearch(int[] arr, int target) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    
    public static int binarySearch(int[] arr, int target) 
    {
        int l = 0, r = arr.length - 1;

        while (l <= r) 
        {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter dataset size: ");
        int n = sc.nextInt();

        int[] data = new int[n];
        Random rand = new Random();

        
        for (int i = 0; i < n; i++) 
        {
            data[i] = rand.nextInt(1_000_000);
        }

        
        System.out.print("Enter target value to search: ");
        int target = sc.nextInt();

   
        long start = System.nanoTime();
        int lResult = linearSearch(data, target);
        long lTime = System.nanoTime() - start;

        
        Arrays.sort(data);

        
        start = System.nanoTime();
        int bResult = binarySearch(data, target);
        long bTime = System.nanoTime() - start;

        System.out.println("\nLinear Search: " + (lResult != -1 ? "Found" : "Not Found") +
                           ", Time = " + lTime / 1_000_000.0 + " ms");

        System.out.println("Binary Search: " + (bResult != -1 ? "Found" : "Not Found") +
                           ", Time = " + bTime / 1_000_000.0 + " ms");

        sc.close();
    }
}