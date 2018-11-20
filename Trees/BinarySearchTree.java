public class BinarySearchTree{
	class Node{
		int data;
		Node left, right;

		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}

	Node root;
	BinarySearchTree(){
		root = null;
	}

	void insert(int data){
		root = insertNode(root,data);
	}

	Node insertNode(Node root,int key){
		Node newNode = new Node(key);
		if(root==null){
			root =newNode; 
			return root;
		}else{
			if(key<root.data){
			root.left = insertNode(root.left,key);
		}else if(key>root.data){
			root.right = insertNode(root.right,key);
		}
			return root;
		}		
	}


	void search(int k){
		System.out.println(searchNode(root, k));
	}

	boolean searchNode(Node root, int key){
		if(root==null){
			return false;
		}
		if(key>root.data){
			return searchNode(root.right, key);
		}else if(key<root.data){
			return searchNode(root.left, key);
		}else{
			return true;
		}
	
	}

	int minValue(Node root){
		int minValue = root.data;
		while(root.left!=null){
			minValue = root.left.data;
			root = root.left;
		}
		return minValue;
	}

	void delete(int key){
		deleteNode(root, key);
	}


	Node deleteNode(Node root, int key){
		if(root == null){
			return root;
		}
		if(key<root.data){
			root.left = deleteNode(root.left, key);
			}else if(key>root.data){
				root.right = deleteNode(root.right, key);
			}
		else{
			if(root.left== null){
				return root.right;
			}
			if(root.right == null){
				return root.left;
			}

			root.data = minValue(root.right);

			root.right = deleteNode(root.right,root.data);
			}
			return root;
		}

	void print(){
		printinorder(root);
	}


	 int height(Node r){
		 if(r==null)
			 return 0;
		int right=1+height(r.right);
		int left=1+height(r.left);
		if(left>right)
		{
			return left;
		}
		else
			return right;
	}


	void kthLargestUtil(Node node, int k, int c) 
	    { 
	        if (node == null || c >= k) 
	            return; 
	          

	        this.kthLargestUtil(node.right, k, c);  
	        c++; 
	          
	        if (c == k) { 
	            System.out.println(k + "th largest element is " +  
	                                                 node.data); 
	            return; 
	        } 
	          

	        this.kthLargestUtil(node.left, k, c);  
	    } 
	    void kthLargest(int k) 
	    { 
	        int c = 0;  
	        this.kthLargestUtil(this.root, k, c); 
	    } 
	    

	void printinorder(Node root){
		if(root!=null){
			printinorder(root.left);
			System.out.print(root.data+ "\t");
			printinorder(root.right);
		}
	}

	void printpreorder(){
		preorder(root);
	}


	void preorder(Node root){
	 if(root!=null){
	 	System.out.print(root.data+" \t");
	 preorder(root.left);
	 preorder(root.right);
	 }
	 
 	}

 	void printpostorder(){
 		postorder(root);
 	}
 
	void postorder(Node root){
		 if(root!=null){
		 postorder(root.left);
		 postorder(root.right);
		 System.out.print(root.data+"\t ");
		 }
	 }


	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
			bst.insert(30);
			bst.insert(35);
			bst.insert(40);
			bst.insert(50);
			bst.insert(12);
			bst.insert(17);
			bst.insert(45);
			bst.insert(90);
			bst.insert(23);
			bst.insert(56);

			bst.print();
			System.out.println();

			bst.printpreorder();
			System.out.println();

			bst.printpostorder();

			bst.search(19);
			System.out.println();
			bst.delete(23);

			bst.print();
		
	}
}