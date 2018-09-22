
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
				if(l==(num-1)){
					temp.next=temp1.next;
					length-=1;
				}
				temp = temp.next
;				temp1=temp1.next;
				l++;
				

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
			Node temp = head;
			Node temp1= head;
			LinkedList ll = new LinkedList();
			LinkedList l = new LinkedList();
			while(temp1!=null) {
				l.insertAtLast(temp1.data);
				temp1 = temp1.next;
			}
			while(temp!=null) {
				ll.insertAtFirst(temp.data);
				temp=temp.next;
			}
			temp = l.head;
			temp1=this.head;
			while(temp.next!=null && temp1.next!=null)
			{
				if(temp.data==temp1.data) {
					temp = temp.next;
					temp1 = temp1.next;
				}
				else {
					System.out.println("Not  a palindrome");
					break;
				}
			}
			if(temp.next==null&& temp1.next==null) {
				System.out.println("It is a palindrome");
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
			while(temp.next.next!=null) {
				System.out.println(temp.data);
				temp = temp.next.next;
				
			}
			if(temp.next!=null) {
				System.out.println(temp.data);
			}
			
		}
		
		public void mergeLists(LinkedList l) {
			this.sortLinkedList();
			l.sortLinkedList();
			l.print();
			Node temp = this.head;
			Node temp1 = l.head;
			while(temp1.next!=null) {
				if(temp.data>temp1.data){
					Node newNode = new Node(temp1.data);
					newNode.next=temp;
					head= newNode;
					temp1= temp1.next;
			}		
			else{
				while(temp.next!=null){
				if(temp.data<temp1.data){
					if(temp.next.data<temp1.data){
						temp = temp.next;
					}
					else if(temp.next.data>temp1.data){
						Node newNode = new Node(temp1.data);
						newNode.next = temp.next;
						temp.next= newNode;
						temp1=temp1.next;
						print();
						System.out.println();

						break;
					}
					
				}
			}	
				
			}
				
			
		}
			if(temp.next==null){
				Node newNode = new Node(temp1.data);
				temp.next = newNode;
			newNode.next= null;
			}
			
		
		
		}

		 public void duplicateDeletion(){
		 	Node temp = head;
		 	while(temp.next!=null){
		 		if(temp.data==temp.next.data) {
		 			Node temp1= temp.next;
		 			temp.next= temp1.next;
		 			
		 		}
		 		else {
		 			temp =temp.next;
		 		}
		 	}
		 }

		 public void random(LinkedList l){
		 	Node temp = head;
		 	while(temp.next!=null){
		 		temp = temp.next;
		 	}
		 	if(temp.next==null){
		 		temp.next = l.head;
		 	}
		 	sortLinkedList();
		 }
		 public void insertAtPos(int pos,int value){
		 	Node newNode= new Node(value);
		 	Node temp= head;
		 	Node temp1=head.next;
		 	Node p=null;
		 	int l=1;
		 	while(temp.next!=null){
		 		if(l==(pos-1)){
		 			p=temp.next;
		 			temp.next=newNode;
		 			newNode.next =p;
		 			break;
		 		}
		 		temp=temp.next;
		 		temp1= temp1.next;
		 		l++;
		 	}

		 }

		 public void add(LinkedList s){
		 	Node t = head;
		 	Node r = s.head;
		 	LinkedList l3 = new LinkedList();
		 	while(t!=null&& r!=null){
		 		int d = t.data+r.data;
		 		l3.insertAtFirst(d);
		 		t = t.next;
		 		r = r.next;
		 	}
		 	Node h = l3.head;
		 	while(h!=null){
		 		System.out.println(h.data);
		 		h= h.next;
		 	}
		 }






}
	
