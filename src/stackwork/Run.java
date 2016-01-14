package stackwork;

public class Run {

	public static void main(String[] args) {
		Stack stack = new Stack();
		int[] array = {1, 2, 3, 4, 5};
		for (int i = 0; i < 5; i++){
			stack.push(array[i]);
		}
		stack.pop();
		stack.pop();
		stack.push(12);
		stack.printStack();
	}

}
