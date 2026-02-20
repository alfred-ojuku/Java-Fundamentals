public class ArrayReverse{
	public static void main(String[] args){
		int list1[] = {1, 2, 3, 4, 5, 6};
		int list2[] = reverse(list1);

		System.out.println("List2 is {" + list2[0] + ", " + list2[1] + "}");

	}

	// array reverse method
	public static int[] reverse(int[] list){
		int result[] = new int[list.length];

		for (int i = 0, j = result.length - 1; i < list.length; i++, j--){
			result[j] = list[i];
		}

		return result;
	}
}

