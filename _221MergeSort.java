public class _221MergeSort {



        // Merges two subarrays of arr[].
        private static void merge(int arr[], int left, int middle, int right) {
            // Sizes of two subarrays
            int n1 = middle - left + 1;
            int n2 = right - middle;
    
            // Temporary arrays
            int leftArray[] = new int[n1];
            int rightArray[] = new int[n2];
    
            // Copy data to temp arrays
            for (int i = 0; i < n1; i++)
                leftArray[i] = arr[left + i];
            for (int j = 0; j < n2; j++)
                rightArray[j] = arr[middle + 1 + j];
    
            // Merge the temporary arrays
    
            // Initial indices of the subarrays
            int i = 0, j = 0;
    
            // Initial index of the merged subarray
            int k = left;
            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    arr[k] = leftArray[i];
                    i++;
                } else {
                    arr[k] = rightArray[j];
                    j++;
                }
                k++;
            }
    
            // Copy remaining elements of leftArray[] if any
            while (i < n1) {
                arr[k] = leftArray[i];
                i++;
                k++;
            }
    
            // Copy remaining elements of rightArray[] if any
            while (j < n2) {
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }
    
        // Main function that sorts arr[left...right] using merge()
        private static void sort(int arr[], int left, int right) {
            if (left < right) {
                // Find the middle point
                int middle = (left + right) / 2;
    
                // Sort first and second halves
                sort(arr, left, middle);
                sort(arr, middle + 1, right);
    
                // Merge the sorted halves
                merge(arr, left, middle, right);
            }
        }
    
        // A utility function to print array of size n
        private static void printArray(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    
        // Main method
        public static void main(String args[]) {
            int arr[] = {38, 27, 43, 3, 9, 82, 10};
    
            System.out.println("Given Array");
            printArray(arr);
    
            sort(arr, 0, arr.length - 1);
    
            System.out.println("\nSorted array");
            printArray(arr);
        }
    }
    