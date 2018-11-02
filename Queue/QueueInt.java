public class QueueInt{

	int rear= -1;
	int front =-1;
	int[] arr;

	QueueInt(){
		arr = new int[5];
	}

	QueueInt(int n){
		arr = new int[n];
	}

	public void enqueue(int item){
		if(rear==(arr.length-1)){
			System.out.println("Queue is full");
		}else if(front==-1 && rear ==-1){
			front++;
			arr[++rear]= item;
			System.out.println(item+"is inserted");
		}else{
			arr[++rear]=item;
			System.out.println(item+"is inserted");
		}
	}
	public void print(){
		for(int i = front; i <= rear;i++)
           System.out.println(arr[i]);
        }



	public int dequeue(){
		if(rear==-1 && front==-1){
			System.out.println("Queue is empty");
			return 0;
		}else{
			System.out.println();
			return arr[++front];
		}
	}



	public static void main(String[] args) {
		QueueInt q = new QueueInt(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.dequeue();
		q.print();

		


	}
}