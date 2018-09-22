public class MergeSort {

    public void mergeSort(int[] array, int start, int finish) {
        if (array.length < 2) {
            return;
        }

        if (start < finish) {
            int mid = (finish + start) / 2;

            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, finish);

            merge(array, start, mid, finish);
        }
    }

    private void merge(int[] array, int start, int mid, int finish) {
        int counter = start + 1;
        int length = finish - counter;
        int block = 0;

        if (array[mid] <= array[mid + 1]) {
            return;
        }
        for (int i = 0; i <= length; i++) {

            if (array[block] > array[counter]) {
                array[counter] += array[block];
                array[block] = array[counter] - array[block];
                array[counter] -= array[block];

                block = counter;
            }

            if (counter == finish) {

                if (array[block] == array[start]) {
                    start++;
                }

                block = start;
                counter = start;
                i = 0;
            }

            if (start >= finish) {
                return;
            }

            counter++;
        }
    }
}
