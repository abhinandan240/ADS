class A3ques01
{
	Node head ;
	static class Node
	{
		int data ;
		Node next ;
		
		Node(int d)
		{
			data = d ;
			next = null ;
		}
	}
	void display()
	{
		Node n = head ;
		while(n != null)
		{
			System.out.print(n.data +"---->" );
			n=n.next ; 
		}		
	}
	void insert(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head ;
		head = new_node;
	}
	public static void main(String args[])
	{
		A3ques01 l1 = new A3ques01();
		l1.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		l1.head.next = second ;
		second.next = third ;
		
		l1.display();
		l1.insert(5);
		System.out.println();
		l1.display();
		
	}
	
}