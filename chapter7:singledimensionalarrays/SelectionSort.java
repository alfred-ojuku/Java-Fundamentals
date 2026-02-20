public class SelectionSort{
	public static void main(String[] args){
		int[] list = {2, 9, 5, 4, 8, 1, 6};
		int low = 0;
		int high = list.length - 1;

		displayArray(list);

		for (int i = 0; i < list.length; i++){
			selectionSort(list, i);
		}

        displayArray(list);

	}

	/** selection sort method */
	public static void selectionSort(int[] list, int lowest_index){
		int lowest = list[lowest_index];
		int temp = 0;
		for (int i = lowest_index; i < list.length; i++){
			if (list[i] < lowest){
				temp = list[lowest_index];
				lowest = list[i];
                list[lowest_index] = lowest;
		        list[i] = temp; 
			}
		}
	}

	/** display array of int **/
	public static void displayArray(int[] list){
		for (int i = 0; i < list.length; i++){
			System.out.print(list[i] + " ");
		}
		System.out.println(" ");
	}
}
