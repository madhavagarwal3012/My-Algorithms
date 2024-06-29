package algorithms;

public class my_algorithms {
	
	public static int[] selectionSortBetter(int arr[]) {
		int minimumElement = Integer.MAX_VALUE;
		int maximumElement = Integer.MIN_VALUE;
		int minimumIndex = 0;
		int maximumIndex = 0;
		int index = 0;
		int length = arr.length;
		
		while(index < length) {
			int subIndex = index;
			while(subIndex < length) {
				if(arr[subIndex] < minimumElement) {
					minimumElement = arr[subIndex];
					minimumIndex = subIndex;
				}
				if(arr[subIndex] > maximumElement) {
					maximumElement = arr[subIndex];
					maximumIndex = subIndex;
				}
				subIndex++;
			}
			if(maximumIndex == index) {
				maximumIndex = minimumIndex;
				arr[maximumIndex] = arr[length -1];
				arr[index] = minimumElement;
				arr[length - 1] = maximumElement;
			}
			else {
				arr[minimumIndex] = arr[index];
				arr[maximumIndex] = arr[length - 1];
				arr[index] = minimumElement;
				arr[length - 1] = maximumElement;
			}
			index++;
			length--;
			minimumElement = Integer.MAX_VALUE;
			maximumElement = Integer.MIN_VALUE;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {100, 92, 83, 74, 65, 56, 47, 38, 29, 20, 11, 2, 91, 82, 73, 64, 55, 46, 37, 28, 19, 10, 1, 90, 81, 72, 63, 54, 45, 36, 27, 18, 9, 0, 89, 80, 71, 62, 53, 44, 35, 26, 17, 8, 99, 88, 79, 70, 61, 52, 43, 34, 25, 16, 7, 98, 87, 78, 69, 60, 51, 42, 33, 24, 15, 6, 97, 86, 77, 68, 59, 50, 41, 32, 23, 14, 5, 96, 85, 76, 67, 58, 49, 40, 31, 22, 13, 4, 95, 84, 75, 66, 57, 48, 39, 30, 21, 12, 3, 94, 93};
		arr = selectionSortBetter(arr);
		
		System.out.print("{");
		for(int index = 0; index < arr.length-1; index++) {
			System.out.print(arr[index]+" ");
		}
		System.out.print(arr[arr.length - 1]);
		System.out.print("}");

	}
}
