public class CListDriver {
    
    public static void main(String[] args){
        
        CLinkedList cll = new CLinkedList();
        CLinkedList cll2 = new CLinkedList();
        cll.addNode(5);
        cll.addNode(2);
        cll.addNode(3);
        cll.addNode(400);
        cll.addNode(78);
        cll.addNode(20);

        cll.deleteAtPos(5);
        cll.insertAfterNode(1, 56);
        cll.deleteGivenData(400);
        cll.print();
        cll.print();
        System.out.println();
        cll.sortInsert(0);
        cll.print();
        System.out.println();
        cll.print();
        cll.halfList(cll2);
        System.out.println();
        cll.print();
        System.out.println();
        cll2.print();
        
    }
 
}