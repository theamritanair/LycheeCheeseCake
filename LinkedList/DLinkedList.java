class Node{
	int data;
	Node prev;
	Node next;

	Node(int data){
		this.data= data;
		this.next=null;
	}
}

public class DLinkedList{
	Node head;

	public void addNode(int data){
		Node temp = new Node(data);

		if(head==null){
			head=temp;
			temp.next=null;
		}else{
			Node p = head;
			while(p.next!=null){
				p = p.next;
			}
			p.next=temp;
			temp.prev=p;
			temp.next=null;
		}
	}

	public void print(){
		if(head==null){
			System.out.println("Empty list");
		}else{
			Node t = head;
			while(t.next!=null){
				System.out.print(t.data+"");
				t= t.next;
			}
			System.out.println(t.data+"");
		}
	}

	public void insertAtPos(int n,int data){
		Node newNode = new Node(data);
		Node p = head;
		int i=1;
		while(p.next!=null){
			i++;
			if(i==(n+1)){
				newNode.next= p.next;
				p.next= newNode;
				newNode.prev=p;
				newNode.next.prev=newNode;
			}
		p= p.next;
		}
		if(p.next==null){
			p.next=newNode;
		}

	}

	public void deleteGivenNode(int data){
		Node p = head;
		while(p.next!=null){
			if(p.data==data){
				if(p==head){
					head=p.next;
					break;
				}else{
				p.next.prev=p.prev;
				p.prev.next=p.next;
				break;
				}
			}else{
			p=p.next;
		}
	}
		if(p.next==null){
			p.prev.next=null;
		}

	}

	public void reverseK(int k){
    
    Node temp=head,p;
    temp=head;
    while(k-->0) {
      p=temp.prev;
      temp.prev=temp.next;
      temp.next=p;
      if(temp.prev==null) {
        head=temp;
      }
      temp=temp.prev;
      
      
    }
    if(temp!=null){
	   p=head;
	    head.next=temp;
	    head=temp.prev;
	    head.prev=null;
	    temp.prev=p;
	}
}
    
    
  
	
}