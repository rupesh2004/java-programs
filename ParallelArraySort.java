import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ParallelArraySort {

    public static void main(String[] args) {
        int[] array = { 5, 2, 9, 1, 5, 6 };
        System.out.println("Original array: " + Arrays.toString(array));

        parallelSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    static void parallelSort(int[] array) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(new ParallelMergeSort(array, 0, array.length - 1));
    }

    static class ParallelMergeSort extends RecursiveAction {
        private final int[] array;
        private final int low;
        private final int high;

        public ParallelMergeSort(int[] array, int low, int high) {
            this.array = array;
            this.low = low;
            this.high = high;
        }

        @Override
        protected void compute() {
            if (low < high) {
                int mid = (low + high) / 2;

                // Split the task into two sub-tasks
                ParallelMergeSort leftTask = new ParallelMergeSort(array, low, mid);
                ParallelMergeSort rightTask = new ParallelMergeSort(array, mid + 1, high);

                invokeAll(leftTask, rightTask);

                // Merge the sorted sub-arrays
                merge(array, low, mid, high);
            }
        }

        private void merge(int[] array, int low, int mid, int high) {
            int[] left = Arrays.copyOfRange(array, low, mid + 1);
            int[] right = Arrays.copyOfRange(array, mid + 1, high + 1);

            int i = 0, j = 0, k = low;
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    array[k++] = left[i++];
                } else {
                    array[k++] = right[j++];
                }
            }

            while (i < left.length) {
                array[k++] = left[i++];
            }

            while (j < right.length) {
                array[k++] = right[j++];
            }
        }
    }
}
