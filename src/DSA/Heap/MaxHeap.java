package DSA.Heap;

public class MaxHeap {
    private int[] heap;
    private int size;

    public MaxHeap(int[] array) {
        this.heap = array;
        this.size = array.length;
        buildMaxHeap();
    }

    private void buildMaxHeap() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }

    private void heapify(int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 3, 2, 16,9,10,14,8,7};
        MaxHeap maxHeap = new MaxHeap(array);
        maxHeap.printHeap();  // Output should be a max heap
    }
}