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
		int n=sc.nextInt();
		for(int i=0;i<n;i++) 
			head=insert(sc.nextInt(),head);
		pairWiseSwap(head);
	}
	static void pairWiseSwap(Node head) {
		Node p1=head;
		while(p1.next!=null) {
			int t=p1.data;
			p1.data=p1.next.data;
			p1.next.data=t;
			p1=p1.next.next;
		}
		display(head);
	}
    static void display(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
