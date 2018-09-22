//Doubly Linked List
public class DLinkedList{
	DNode head;

	public void addNode(int data){
		DNode temp = new DNode(data);

		if(head==null){
			head=temp;
			temp.next=null;
		}else{
			DNode p = head;
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
			DNode t = head;
			while(t.next!=null){
				System.out.print(t.data+"");
				t= t.next;
			}
			System.out.println(t.data+"");
		}
	}

	public void insertAtPos(int n,int data){
		DNode newNode = new DNode(data);
		DNode p = head;
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
		DNode p = head;
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
    
    DNode temp=head,p;
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