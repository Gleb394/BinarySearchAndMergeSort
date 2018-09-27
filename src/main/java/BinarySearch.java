public class BinarySearch {

    public int searchArray(int[] array, int value) {
        return search(array, 0, array.length - 1, value);
    }

    private int search(int array[], int first, int last, int value) {

        int mid = (first + last) / 2;
        if (value == array[mid]) {
            return mid;
        }

        if (array[first] < array[mid]) {
            return value >= array[first] && value < array[mid] ?
                    search(array, first, mid - 1, value) : search(array, mid + 1, last, value);
        } else if (array[mid] < array[first]) {
            return value > array[mid] && value <= array[last] ?
                    search(array, mid + 1, last, value) : search(array, first, mid -1, value);
        } else if (array[first] == array[mid]){
            return array[mid] != array[last] ?
                    search(array, mid + 1, last, value) : search(array, first, mid - 1, value);
        }
        return -1;
    }
}