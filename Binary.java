   class BinaryEx {

       int binarySearch(int array[], int element, int low, int high) {
           while (low <= high) {
               int mid = low + (high - low) / 2;

               if (array[mid] == element)
                   return mid;   // element found

               if (array[mid] < element)
                   low = mid + 1;   // search right half
               else
                   high = mid - 1;  // search left half
           }
           return -1;  // element not found
       }
   }
   public class Binary{
        public static void main(String args[]) {
            BinaryEx bs = new BinaryEx();
            int arr[] = {2, 3, 4, 10, 40};
            int target = 10;

            int result = bs.binarySearch(arr, target, 0, arr.length - 1);

            if (result == -1)
                System.out.println("Element not found");
            else
                System.out.println("Element found at index: " + result);
        }
    }