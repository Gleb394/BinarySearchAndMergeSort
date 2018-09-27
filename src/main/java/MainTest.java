import java.util.Arrays;

public class MainTest {

    public static void main(String[] args) {
        BinarySearch binarSearch = new BinarySearch();

        int[] array = {7, 8, 15, 15, 20, 0, 15, 15, 4, 6};
        int value = 15;

        System.out.println(binarSearch.searchArray(array, value));

        MergeSort mergeSort = new MergeSort();
        int[] arr = {8, 1, 2, 4, 0, 3, 6, 5, 6, 7, 10, 12, 15};
        mergeSort.mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
