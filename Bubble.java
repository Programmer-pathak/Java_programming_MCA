class Bubble {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // agar ek pass me koi swap nahi hua to array already sorted hai
            if (!swapped) break;
        }
    }

    // Driver code
    public static void main(String args[]) {
        Bubble bs = new Bubble();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bs.bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}