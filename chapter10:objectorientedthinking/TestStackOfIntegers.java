public class TestStackOfIntegers{
	public static void main(String[] args){
		StackOfIntegers stack = new StackOfIntegers();

		for (int i = 0; i < 10; i++){
			stack.push(i);
		}

		System.out.println("Size after insert:" + stack.getSize());

		while (!stack.empty()){
			System.out.print(stack.pop() + " ");
		}

		System.out.println("\n");
		System.out.println("Size after pop:" + stack.getSize());
	}
}
