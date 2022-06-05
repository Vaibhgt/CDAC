 // Linked list Node Creation Program of int data type and string data type.
 class LinkedList{
	IntNode head;
	StringNode head1;
	 static class IntNode{
		int data;
		IntNode next;
		public IntNode (int d){
			data = d;
			next = null;
		}
	}
	void displayInt(){
		IntNode n = head;
		while(n!=null){
			System.out.println(n.data);
			n = n.next;
		}
	}
	 static class StringNode{
		String data;
		StringNode next;
		public StringNode (String d){
			data = d;
			next = null;
		}
	}
	void displayString(){
		StringNode n = head1;
		while(n!=null){
			System.out.println(n.data);
			n = n.next;
		}	
	}
}

class LinkedInt{
	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		l1.head = new LinkedList.IntNode(10);
		LinkedList.IntNode second = new LinkedList.IntNode(20);
		LinkedList.IntNode third = new LinkedList.IntNode(30);
		
		l1.head.next = second;
		second.next = third;
		l1.displayInt();
		
		//LinkedList1 l2 = new LinkedList1();
		l1.head1 = new LinkedList.StringNode("CDAC MUMBAI");
		LinkedList.StringNode Stringsecond = new LinkedList.StringNode("JUHU");
		LinkedList.StringNode Stringthird = new LinkedList.StringNode("KHARGAR");
		
		l1.head1.next = Stringsecond;
		Stringsecond.next = Stringthird;
		l1.displayString();		

	}
}
