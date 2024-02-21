import java.util.*;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
public class MyClass {
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
		int m=sc.nextInt();
		for(int i=0;i<m;i++) 
			head=insert(sc.nextInt(),head);
		reverse(head);
	}
	private static void reverse(Node head) {
		Node b=null;
		Node cur=head;Node f=head;
		while(f!=null && cur!=null) {
			f=cur.next;
			cur.next=b;
			b=cur;
			cur=f;
		}
		display(b);
	}
	private static void display(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
