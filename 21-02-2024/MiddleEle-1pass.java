import java.util.*;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
public class MyClass{
	public static Node head=null;
      static Node insert(int ele,Node head) {
		Node temp=new Node(ele);
		Node p=head;
		if(head==null)
			head=temp;
		else {
		while(p.next!=null) {
			p=p.next;
		}
		p.next=temp;
		}
		return head;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) 
			head=insert(sc.nextInt(),head);
		middle(head);
	}
	static void middle(Node head) {
		Node p1=head;
		Node p2=head;
		int c=0;
		while(p2!=null && p2.next!=null) {
			p1=p1.next;
			p2=p2.next.next;
		}
		System.out.println(p1.data);
	}
}
