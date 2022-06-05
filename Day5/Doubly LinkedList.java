class DoublyLinkedList{
	ListNode head;
	ListNode Tail;
	int length;
	
	class ListNode{
		int data;
		ListNode next;
		ListNode previous;
		
		ListNode data(int data){
			this.data=data;
			
		}
		
	}
	DoublyLinkedList(){
		this.head=null;
		this.tail=null;
		this length=0;
		
		
	}
	public boolean isEmpty(){
		
		return length==0;
	}
	
	public int length(){
		return length();
	}
	
	
	
	
	
}