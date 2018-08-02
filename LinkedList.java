
public class LinkedList {
	Node head;
	int length;
	
	public void insertAtFirst(int data) {
		Node newNode = new Node(data);
		newNode.next= head;
		head = newNode;
		length+=1;
	}
	
	public void addNode(int value) {
		Node temp = new Node(value);
		if(head==null) {
			this.head = temp;
			temp.next = null;
		}
		Node p= head;
		while(p.next!=null) {
			p = p.next;
		}
		p.next = temp;
		temp.next=null;
		if(temp.next==null){
			length+=1;
		}
		
		
	}
	public void insertAtLast(int value) {
		Node temp = new Node(value);
		if(head==null) {
			this.head = temp;
			temp.next = null;
			length+=1;
		}
		Node p= head;
		while(p.next!=null) {
			p = p.next;
		}
		p.next = temp;
		temp.next=null;
		if(temp.next==null){
			length+=1;
		}
	}
	
	public void isEmpty() {
		Node current = head;
		if(current==null) {
		System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}
	public boolean isLastElement() {
		Node p = head;
		if(head ==null) {
			System.out.println("False. No elements found");
			return false;
		}
		else {
			while(p.next!=null) {
				p = p.next;
			}
			System.out.println("True. " + p.data+ "is the last element");
			return true;
		}
	}
	
	public void print() {
		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
	public void printLength(){
		System.out.println(length);
	}
	public void deleteAtFirst() {
		Node p = head;
		head = p.next;
		p=null;
		
	}

	public void deleteAtLast(){
		if(head==null){
			System.out.println("Empty list");
		}
		else{
			Node current = head;
			while(current.next.next!=null){
				current = current.next;
			}
			current.next=null;
			length-=1;
		}
	}
	public void deleteAtPos(int num){
		if(head==null){
			System.out.println("Empty List");
		}
		else{
			Node temp = head;
			Node temp1=temp.next;
			int l=1;
			while(temp.next!=null){
				temp = temp.next;
				temp1=temp1.next;
				l++;
				if(l==(num-1)){
					temp.next=temp1.next;
					length-=1;
				}

			}
		}

	}
	
	public void sortLinkedList(){
		if(head==null){
			System.out.println("Empty List");
		}
		Node abc=new Node();
		for(Node temp=head;temp.next!=null;temp=temp.next){
			for(Node temp1=head;temp1.next!=null;temp1=temp1.next){
				if(temp1.data>temp1.next.data){
					abc.data=temp1.data;
					temp1.data = temp1.next.data;
					temp1.next.data=abc.data;
				}
			}
		}
	}
	
	public void sortInsert(int value){
		sortLinkedList();
		Node newNode = new Node(value);
		Node temp = head;
			if(temp.data>value){
				newNode.next=temp;
				head= newNode;
		}		
		else{
			while(temp.next!=null){
			if(temp.data<value){
				if(temp.next.data<value){
					temp = temp.next;
				}
				else if(temp.next.data>value){
					newNode.next = temp.next;
					temp.next= newNode;
					break;
				}
				
			}
		}
		if(temp.next==null){
			temp.next = newNode;
		newNode.next= null;
		}
	}
		}

		public void checkPalindrome(){
			Node temp= head;
			Node temp1= head;
			while(temp.next!=null&& temp.next.next!=null){
				temp = temp.next.next;
				temp1= temp1.next;
			}


		}

		// public void findMid(){
		// 	Node temp = head;
		// 	int mid;
		// 	if(length%2!=0){
		// 		mid = (length/2)+1;
		// 	}
		// 	else{
		// 		mid = length/2;
		// 	}
		// 	mid--;
		// 	while(mid>0){
		// 		temp= temp.next;
		// 		mid-=1;
		// 	}
		// 	System.out.println(temp.data);
		// }

		public void findMiddle(){
			Node temp = head;
			Node temp1 = head;
			while(temp.next!=null &&temp.next.next!=null){
				temp= temp.next.next;
				temp1 = temp1.next;
			}
			System.out.println(temp1.data);
		}

		public void reverse(){
			Node current=head;
			Node next=null;
			Node prev =null;
			while(current!=null){
				next = current.next;
				current.next = prev;
    			prev = current;
    			current = next;
			}
			head = prev;

		}

		public void nFromEnd(int n){
			Node temp = head;
			int l = length-n;

			while(l>0){
				temp=temp.next;
				l--;
			}
			System.out.println(temp.data);

		}

		public void evenPosition(){
			Node temp = head;

		}

		// public void duplicateDeletion(){
		// 	Node temp = head;
		// 	while(temp.next!=null){
		// 		if(temp.)
		// 	}
		// }

		

		public void fun(Node head){
			if(head ==null){
				return;
			}
			fun(head.next);
			System.out.println(head.data);
		}


}
	
