public class Sort {

    public static <T extends Comparable<T>> void sort(T[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    /**
     * @param array - массив элементов для сортировки
     * @param first - индекс первого элемента
     * @param last  - индекс последнего элемента
     */
    private static <T extends Comparable<T>> void mergeSort(T[] array, int first, int last) {
        if (last - first < 1) return;

        int middle = (first + last) / 2;

        mergeSort(array, first, middle);

        mergeSort(array, middle + 1, last);

        merge(array, first, middle, last);

    }

    private static <T extends Comparable<T>> void merge(T[] array, int first, int middle, int last) {
        Object[] tempArray = new Object[last - first + 1];

        int i = first;
        int j = middle + 1;
        int k = 0;

        while ((i <= middle) && (j <= last)) {
            if (array[i].compareTo(array[j]) <= 0) {
                tempArray[k] = array[i++];
            }
            else {
                tempArray[k] = array[j++];
            }
            k++;
        }

        if ((i <= middle) && (j > last)) {
            while (i <= middle) {
                tempArray[k++] = array[i++];
            }
        } else {
            while (j <= last) {
                tempArray[k++] = array[j++];
            }
        }

        for (k = 0; k < tempArray.length; k++) {
            array[k + first] = (T) tempArray[k];
        }
    }
}
