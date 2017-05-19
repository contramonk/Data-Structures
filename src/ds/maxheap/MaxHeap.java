package ds.maxheap;

public class MaxHeap {
	private int[] heap = new int[10];
	private int endPoint = 0;
	private int root;
	
	
	public void insert(int data) {
		if(heap.length - 1 == endPoint) {
			int[] temp = heap;
			heap = new int[(endPoint + 1) * 2];
			for(int i = 0; i < temp.length; i++) {
				heap[i] = temp[i];
			}
		}
		heap[endPoint] = data;
		if(endPoint == 0) {
			root = heap[endPoint];
		} else {
			int index = endPoint;
			while( index >= 0 && heap[(int)Math.floor((index - 1)/2)] < heap[index]) {
				int temp = heap[(int)Math.floor((index - 1)/2)];
				heap[(int)Math.floor((index - 1)/2)] = heap[index];
				heap[index] = temp;
				index = (int)Math.floor((index - 1)/2);
			}
			if(index == 0) {
				root = heap[0];
			}
		}
		
		endPoint++;
	}
	public int delete() {
		if(endPoint == 0) {
			System.out.println("Heap is Empty. Nothing to delete");
			return -1;
		}
		if(endPoint == 1) {
			endPoint = 0;
			return heap[endPoint];
		}
		int removed = heap[0];
		int index = 0;
		endPoint--;
		heap[index] = heap[endPoint];
		while(index < endPoint) {
			if(heap[2 * index + 1] > heap[2 * index + 2]) {
				int temp = heap[index];
				heap[index] = heap[2 * index + 1];
				heap[2 * index + 1] = temp;
				index = 2 * index + 1;
			} else if(heap[2 * index + 1] < heap[2 * index + 2]) {
				int temp = heap[index];
				heap[index] = heap[2 * index + 2];
				heap[2 * index + 2] = temp;
				index = 2 * index + 2;
			}
		}
		root = heap[0];
		
		return removed;
	}
	
	public int getRoot() {
		return root;
	}
	
	public int getMax() {
		return root;
	}
	
	public int getEndPoint() {
		return endPoint;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		for(int i = 0; i < endPoint; i++) {
			sb.append(heap[i] + " ");
		}
		sb.append("]");
		return sb.toString();
	}
}
