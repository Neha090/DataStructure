package achievers;

import java.util.Scanner;

public class linkedlist {
	
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	Node root;
	
	linkedlist()
	{
		root=null;
	}
	
	void insert(int num)
	{
		
		Node temp=new Node(num);
			if(root==null)
			{
				root=temp;
				return;
			}
			
		Node temp1=root;

				while(temp1.next!=null)
				{
				     temp1=temp1.next;	
				}
				
				temp1.next=temp;
			
				
	}
	
	void printMyList(Node node) {
		while(node !=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.println();
	}
	
	
	
	void remove_duplicate(Node node)
	{
		        Node first = root,  dup = null; 
		        while (first != null && first.next != null)
		        { 
		            dup = first; 
		  
		            while (dup.next != null)
		            { 
		               if (first.data == dup.next.data) 
		                           dup.next = dup.next.next; 
		               else 
		                    dup = dup.next; 
		               
		            }
		            
		            first = first.next; 
		       } 
		        
     } 
	
	public static void main(String[] args) {
		
		linkedlist obj=new linkedlist();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		
		int n=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			obj.insert(num);
			
		}
		
		System.out.println("List before removal of duplicates");
		obj.printMyList(obj.root);
		
		obj.remove_duplicate(obj.root);
		
		System.out.println("List after removal of duplicates");
		obj.printMyList(obj.root);
	}

}
