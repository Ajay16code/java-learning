package Stacks;

public class ArrayStack {
	
	static final int MAX_SIZE = 30;
	int [] arr = new int[MAX_SIZE];
	int top;
	ArrayStack()
	{
		top = -1;
	}
	public void push(int val)
	{
		if(top == MAX_SIZE - 1)
			throw new IndexOutOfBoundsException("Stack");
		
		arr[++top] = val;
	}
	int pop()
	{
		return arr[top--];
	}
	int peek()
	{
		return arr[top];
	}
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack();
		ArrayStack stack1 = new ArrayStack();
		stack.push(15);
		stack.push(10);
		stack.push(21);
		stack.push(29);
		stack.push(31);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}
}
