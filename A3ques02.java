class A3ques02
{
	Node head ;

	static class Node 
	{
			int data ;
			Node next ;
			Node prev ;
	
		Node(int d)
		{
			data = d ;
			prev = null ;
			next = null ;
	  
		}
	}
	
	void insert(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head ;
		
		if(head != null)
		{
			head.prev = new_node ;
			
		}
		head = new_node;
	}
	void display(Node n)
	{
		Node p = null ;
		System.out.println("Forward ....");
		while(n!=null)
		{
		 System.out.print(n.data + "-->");
		 p = n ;
		 n=n.next ;
		}
		System.out.println();
		System.out.println("-------------");
		
		
		System.out.println("Backward.....");
		while(p!=null)
		{
		System.out.print(p.data + "-->");
		p =p.prev ;
		}
		
		
	}
	public static void main(String args[])
	{
	A3ques02 l1 = new A3ques02();
		
		
		l1.insert(10);
		//l1.display(l1.head);
		
		System.out.println();
		
		l1.insert(5);
		//l1.display(l1.head);
		
		System.out.println();
		
		l1.insert(3);
		l1.display(l1.head);
	}
}