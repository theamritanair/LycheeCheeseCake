public class DListDriver{

	public static void main(String[] args) {

		DLinkedList dl = new DLinkedList();
		dl.addNode(1);
		dl.addNode(2);
		dl.addNode(3);
		dl.addNode(4);
		dl.addNode(5);
		dl.print();
		dl.insertAtPos(5, 8);
		dl.reverseK(3);
		
		dl.print();
		
	}
}





