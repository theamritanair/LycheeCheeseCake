public class Test{
	public static void main(String[] args) {
		StackInt si = new StackInt();
		System.out.println("Stack top is"+ si.top);
		System.out.println("Stack 1 size is "+ si.arr.length);
		StackInt si2 = new StackInt(7);
		System.out.println("Stack 2 size is "+ si2.arr.length);



		StackInt stack = new StackInt(5);
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(50);
		stack.print();
		System.out.println();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.print();
		// System.out.println();
		// System.out.println(stack.peep());

		// StackInt w = new StackInt();
		// w= stack.copyStack();
		// w.print();
		StackInt q = new StackInt();
		q= stack.reverseString("hello");
		q.print();
		
		
		

		

		

	}
}