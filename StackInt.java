public class StackInt{

	int[] arr = new int[5];
	int top = -1;

	StackInt(){
		arr = new int[3];
		top =-1;
	}

	StackInt(int size){
		arr = new int[size];
		top =-1;
	}

	public void print(){
		for(int i=0;i<=top;i++){
			System.out.print(arr[i] +"\t");
		}
	}

	public void push(int item){
		if(top>arr.length){
			System.out.println("Can't push");
		}else{
		top++;
		arr[top]= item;
		}
		
	}

	public int getTop(){
		return top;
	}

	public int pop(){
		if(top<0){
			System.out.println("Can't pop");
			return 0;
		}
		else{
			return arr[top--];
		}
	}

	public int peep(){
		int i=top;
		if(i!=0){
			return arr[i--];
		}
		else{
			return 0;
		}
	}

	public boolean equals(StackInt s){
		int flag =0;
		if(this.top==s.top){
			for(int i=0;i<=top;i++){
				if(this.arr[i]==s.arr[i]){
					flag=1;
				}
				else{
					flag =0;
				}
			}
		}
		if(flag!=0){
			return true;
		}
		else{
			return false;
		}
	}

	public void getMinElement(){
		int min =arr[0];
		for(int i=0;i<=top;i++){
			if(min>arr[i]){
				min = arr[i];
			}
		}
		System.out.println(min);
	}

	public StackInt copyStack(){
		StackInt n = new StackInt(this.arr.length);

		for(int i=0;i<=top;i++){
			n.arr[i]=this.arr[i];
		}
		return n;
	}
}