class LinkedList3{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data=d;
			this.next=null;
			
			
		}
		
		
		
	}
	void display(){
		
		Node n=head;
		while (n !=null)
		{
			System.out.print(n.data+"---->");
			n=n.next;
			
		}
		
	}
	
	void insert(int new_data){
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
		
		
	}
	void insertAfter(Node prev,int new_data){
		if (prev==null)
		{
			
			System.out.println("Insertion is not possible");
			return;
			
		}
		Node new_node=new Node(new_data);
		new_node.next=prev.next;
		
	}
	void append(int new_data)
	{
		Node new_node=new Node(new_data);
		if(head==null){
			head=new_node;
			return;
			
		}
		new_node.next=null;
		Node n=head;
		while(n.next!=null){
			n=n.next;
		}
		n.next=new_node;
		return;
	}
	public static void main(String args[]){
	LinkedList3 l1=new LinkedList3();
	l1.append(33);
	l1.insert(10);
	l1.insert(20);
	l1.insert(30);
	l1.insert(40);
	l1.display();
	
	
	
}
}