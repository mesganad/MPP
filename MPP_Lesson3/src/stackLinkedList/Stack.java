package stackLinkedList;


import java.util.ArrayList; //from Collections Framework

@SuppressWarnings("serial")
class Stack<T> extends ArrayList<T> {
	private int stackPointer = 0;

	public void push(T article) {
		int insertPosition = stackPointer;
		add(insertPosition, article);
		stackPointer++;
	}

	public T pop() {
		return remove(--stackPointer);
	}


	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("1");
		stack.push("2");
		//System.out.println(stack);
		//Uses base class method clear() (which does not correct stackPointer)
		stack.clear();
		//stack.stackPointer=0;

		System.out.println(stack);


		//Pushing a new element produces a strange result
		try {
			//Code will try to place "1" in position 2 of base array
			stack.push("1");
			//System.out.println(stack);
		} catch(Exception e) {
			System.out.println("Caught exception of type: " + e.getClass().getName());
			System.out.println("..error message: " + e.getMessage());
		}


	}

}
