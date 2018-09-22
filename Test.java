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
		System.out.println(stack.peep());
		
		


		StackInt st = new StackInt(6);
		st.push(100);
		st.push(200);
		st.push(300);
		st.push(400);
		st.push(90);
		stack.getMinElement();
		StackInt w = new StackInt();
		System.out.println();
		w =stack.copyStack();
		w.print();

		

		// st.peek();

	}
}