public class DoubleSelectionSort{
	public static void main(String[] args){
		double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
		int low = 0;
		int high = list.length - 1;

		displayArray(list);

		for (int i = 0; i < list.length; i++){
			DoubleSelectionSort(list, i);
		}

        displayArray(list);

	}

	/** selection sort method */
	public static void DoubleSelectionSort(double[] list, int lowest_index){
		double lowest = list[lowest_index];
		double temp = 0;
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
	public static void displayArray(double[] list){
		for (int i = 0; i < list.length; i++){
			System.out.print(list[i] + " ");
		}
		System.out.println(" ");
	}
}
