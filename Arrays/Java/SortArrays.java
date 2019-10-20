package Arrays.Java;

public class SortArrays {

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int id = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[id]) {
                    id = j;
                }
            }
            int temp = arr[id];
            arr[id] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {101, 12, 1, 123, 54, 90, 34};
        sort(arr);
        printArray(arr);
    }
}
