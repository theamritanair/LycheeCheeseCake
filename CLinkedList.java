
public class CLinkedList {
	
	Node head;
	
	public void addNode(int value) {  // inserts at last
		Node temp = new Node(value);
		if(head==null) {
			this.head = temp;
			temp.next = head;
		} else {
			Node p= head;
			while(p.next!=head) {
				p = p.next;
			}
			p.next = temp;
			temp.next=head;
		}
	}
	
	public void halfList(CLinkedList t){
		Node slow = head;
		Node fast = head;
		while(fast.next!=head &&fast.next.next!=head){
			fast= fast.next.next;
			slow = slow.next;
		}
		if(fast.next.next==head)
			fast = fast.next;		
		Node p = slow.next;
		Node q=slow.next;
		fast.next=slow.next;
		slow.next=head;
		while(q.next!=p){
			t.addNode(q.data);
			q=q.next;
		}
		t.addNode(q.data);
		q.next=p;
		
	}
	
	public void print() {
		Node n = head;
		while(n.next!=head){
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.print(n.data+" ");
	}
	
	public void sortCLinkedList(){
		if(head==null){
			System.out.println("Empty List");
		}
		Node abc=new Node();
		for(Node temp=head;temp.next!=head;temp=temp.next){
			for(Node temp1=head;temp1.next!=head;temp1=temp1.next){
				if(temp1.data>temp1.next.data){
					abc.data=temp1.data;
					temp1.data = temp1.next.data;
					temp1.next.data=abc.data;
				}
			}
		}
	}
	
	public void sortInsert(int value){
		sortCLinkedList();
		Node newNode = new Node(value);
		Node temp = head;
			if(temp.data>value){
				Node t = head;
				while(t.next != head)
					t = t.next;
				t.next = newNode;
				newNode.next=head;
				head= newNode;		
		}		
		else{
			while(temp.next!=head){
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
		if(temp.next==head){
			temp.next = newNode;
			newNode.next= head;
			}
		}
	}


	public void insertAtFirst(int data) {
		Node newNode = new Node(data);
		Node t = head;
		while(t.next != head)
			t = t.next;
		t.next=newNode;
		newNode.next= head;
		head = newNode;
	}

	// public void mergeLists(CLinkedList l) {
	// 		this.sortCLinkedList();
	// 		l.sortCLinkedList();
	// 		l.print();
	// 		Node temp = this.head;
	// 		Node temp1 = l.head;
	// 		while(temp1.next!=head) {
	// 			if(temp.data>temp1.data){
	// 				Node t = head;
	// 				Node newNode = new Node(temp1.data);
	// 				while(t.next != head)
	// 				t = t.next;
	// 			t.next = newNode;
	// 			newNode.next=head;
	// 			head= newNode;		
	// 		}		
	// 		else{
	// 			while(temp.next!=head){
	// 			if(temp.data<temp1.data){
	// 				if(temp.next.data<temp1.data){
	// 					temp = temp.next;
	// 				}
	// 				else if(temp.next.data>temp1.data){
	// 					Node newNode = new Node(temp1.data);
	// 					newNode.next = temp.next;
	// 					temp.next= newNode;
	// 					temp1=temp1.next;
	// 					print();
	// 					System.out.println();

	// 					break;
	// 				}
					
	// 			}
	// 		}	
	// 	}
	// }
	// 		if(temp.next==head){
	// 			Node newNode = new Node(temp1.data);
	// 			temp.next = newNode;
	// 		newNode.next= head;
	// 		}
	// 	}

		public void merge(CLinkedList c){
			Node t = this.head;
			Node p = c.head;

			while(t.next!=head){
				t = t.next;
			}
			t.next = p;
			while(t.next!=head){
				t = t.next;
			}
			t.next=head;
			
		}

		public void deleteAtPos(int num){
		if(head==null){
			System.out.println("Empty List");
		}
		else{
			Node temp = head;
			Node temp1=temp.next;
			int l=1;
			while(temp.next!=head){
				if(l==(num-1)){
					temp.next=temp1.next;
					
				}
				temp = temp.next
;				temp1=temp1.next;
				l++;
				

			}
		}

	}

	public void insertAfterNode(int n,int data){
		Node newNode = new Node(data);
		Node p = head;
		int i=1;
		while(p.next!=head){
			i++;
			if(i==(n+1)){
				newNode.next= p.next;
				p.next=newNode;
			}
		p= p.next;
		}
		if(p.next==null){
			p.next=newNode;
			newNode.next=head;
		}

	}

	public void deleteGivenData(int num){
		if(head==null){
			System.out.println("Empty List");
		}
		else{
			Node temp = head;
			Node temp1=temp.next;
			int l=1;
			while(temp.next!=head){
				if(temp.data==num){
					temp.next=temp1.next;
				}
				temp = temp.next;
				temp1=temp1.next;
				l++;
				

			}
		}

	}

	

	
	
	
	

}
