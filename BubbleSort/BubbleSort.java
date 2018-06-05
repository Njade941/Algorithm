public class BubbleSort {
	public static void printData(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println();
	}
	public static void bubbleSort(int[] data) {
		int len = data.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
				printData(data);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[] a = {4, 5, 3, 1, 2};
		bubbleSort(a);
		
		printData(a);
	}
}
