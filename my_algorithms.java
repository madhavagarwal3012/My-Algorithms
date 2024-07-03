package algorithms;

import java.util.*;

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
	public static int[] arrayRotation(int [] array, int rotationSteps, String direction){
        rotationSteps = rotationSteps % array.length;
        int [] rotatedArray = new int[array.length];

        for(int index = 0; index < array.length; index++){
            int newIndex = (index + rotationSteps) % array.length;
            if(direction.toUpperCase().equals("LEFT")){
                rotatedArray[index] = array[newIndex];
            }
            else if(direction.toUpperCase().equals("RIGHT")){
                rotatedArray[newIndex] = array[index];
            }
            else{
                System.out.print("\nInvalid Direction, Cannot Rotate Beyond Left Or Right.\n");
                return array;
            }
        }
        return rotatedArray;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome To My Algorithm Portal");
		
		System.out.println("\nCurrently I Have Two Algorithms");
		System.out.println("1) Selection Sort");
		System.out.println("2) Array Rotation\n");
		int choice = 0;
		
		while(true) {
			try {
				System.out.print("Enter Choice: ");
				choice = scanner.nextInt();
				break;
			}
			catch (java.util.InputMismatchException exception) {
	            System.out.println("Invalid Input! Please Enter An Integer.\n");
	            scanner.nextLine();
			}
		}
		
		if(choice == 1) {
			System.out.println("\nSelection Sort");
			
			System.out.print("Enter Length Of Array: ");
			int length = scanner.nextInt();
			
			int array [] = new int[length];
			for(int index = 0; index < length; index++) {
				while(true) {
					try {
						System.out.print("Enter Element At Index " + index + ": ");
						array[index] = scanner.nextInt();
						break;
					}
					catch (java.util.InputMismatchException exception) {
			            System.out.println("Invalid Input! Please Enter An Integer.\n");
			            scanner.nextLine();
					}
				}
			}
			System.out.println("\nArray Before Sort");
			
			System.out.print("{");
			for(int index = 0; index < array.length-1; index++) {
				System.out.print(array[index]+" ");
			}
			System.out.print(array[array.length - 1]);
			System.out.println("}");
			
			array = selectionSortBetter(array);
			
			System.out.println("\nArray After Sort");
			System.out.print("{");
			for(int index = 0; index < array.length-1; index++) {
				System.out.print(array[index]+" ");
			}
			System.out.print(array[array.length - 1]);
			System.out.println("}");
		}
		
		else if(choice == 2) {
			System.out.println("\nArray Rotation");
			
			System.out.print("Enter Length Of Array: ");
			int length = scanner.nextInt();
			
			int array [] = new int[length];
			for(int index = 0; index < length; index++) {
				while(true) {
					try {
						System.out.print("Enter Element At Index " + index + ": ");
						array[index] = scanner.nextInt();
						break;
					}
					catch (java.util.InputMismatchException exception) {
			            System.out.println("Invalid Input! Please Enter An Integer.\n");
			            scanner.nextLine();
					}
				}
			}
			
			System.out.print("\nEnter Direction, Left Or Right: ");
			String direction = scanner.next();
			int rotationSteps = 0;
			while(true) {
				try {
					System.out.print("Enter Rotation Steps: ");
					rotationSteps = scanner.nextInt();
					break;
				}
				catch (java.util.InputMismatchException exception) {
		            System.out.println("Invalid Input! Please Enter An Integer.\n");
		            scanner.nextLine();
				}
			}
			
			System.out.println("\nArray Before Rotation");
			
			System.out.print("{");
			for(int index = 0; index < array.length-1; index++) {
				System.out.print(array[index]+" ");
			}
			System.out.print(array[array.length - 1]);
			System.out.println("}");
			
			array = arrayRotation(array, rotationSteps, direction);
					
			System.out.println("\nArray After Rotation");
			System.out.print("{");
			for(int index = 0; index < array.length-1; index++) {
				System.out.print(array[index]+" ");
			}
			System.out.print(array[array.length - 1]);
			System.out.println("}");
		}
		else {
			scanner.close();
			System.out.println("Invalid Choice");
		}

	}
}
