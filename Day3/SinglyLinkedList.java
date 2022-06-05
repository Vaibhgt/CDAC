class SinglyLinkedList{
	
	ListNode head;
	static class ListNode{
		int data;
		ListNode next;
		ListNode(int data){
			this.data=data;
			this.next=null;
			
			
			
		}
		
		
		
	}
	public void display(){
		ListNode current=head;
		while (current!=null){
			System.out.print(current.data+"--->");
			current=current.next;
		}
		System.out.println("Null");
		
	}
	public int Length(){
		if(head==null){
			return 0;
		}
		int count=0;
		ListNode current = head;
		while(current!=null){
			count=count+1;
			current=current.next;
		}
		return count;
		
		
	}
	public void insertFirst(int value){
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
		
	}
	
	public void insert(int position, int value){
		ListNode node=new ListNode(value);
		if (position==1){
			node.next=head;
			head=node;
			
		}
		else{
			ListNode previous=head;
			int count=1;
			while (count<position-1){
				
				previous=previous.next;
				count++;
				
			}
			ListNode current=previous.next;
			previous.next=node;
			node.next=current;
			}
		
		
		
	}
	public void insertLast(int value){
		ListNode newNode=new ListNode(value);
		if (head==null){
		head=newNode;
		return;
		}
		ListNode current = head;
		while(null!=current.next){
			current=current.next;
		}
		current.next=newNode;
		
	
		
	}
	
	public ListNode DeleteFirst(){
		if (head==null){
			
			return null;
		}
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		return temp;
		
	}
	
	public void delete(int position){
		if (position==1){
			head=head.next;
		}else{
		ListNode previous=head;
		int count=1;
		while(count<position-1){
			previous=previous.next;
			count++;
		}
		ListNode current=previous.next;
		previous.next=current.next;
		}
		
		
		
	}
	public ListNode DeleteLast(){
		
		if (head==null||head.next==null){
			return null;
		}
		ListNode current=head;
		ListNode previous=null;
		while(current.next!=null){
			previous=current;
			current=current.next;
		}
		previous.next=null;
		return current;
	}
	
	
	
	
	public static void main (String args[]){
		
		SinglyLinkedList sl1=new SinglyLinkedList();
		/*
		sl1.head=new ListNode(10);
		ListNode Second=new ListNode(1);
		ListNode Third=new ListNode(8);
		ListNode Fourth=new ListNode(11);
		sl1.head.next=Second;
		Second.next=Third;
		Third.next=Fourth;
		sl1.display();
		System.out.println(sl1.Length());
		*/
		
		/*sl1.insertFirst(11);
		sl1.insertFirst(1);
		sl1.insertFirst(8);
		sl1.insertLast(11);
		sl1.insertLast(1);
		sl1.insertLast(8);
		sl1.display();*/
		
		sl1.insert(1,3);
		sl1.insert(2,5);
		sl1.insert(1,2);
		sl1.insert(2,4);
		sl1.insert(5,7);
		sl1.display();
		//System.out.println(sl1.DeleteLast().data);
		//System.out.println(sl1.DeleteLast().data);
		//sl1.display();
		sl1.delete(1);
		sl1.delete(3);
		sl1.delete(3);
		sl1.display();
		
	}
}