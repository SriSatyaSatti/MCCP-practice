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
		static void delmiddle(Node head) {
		Node head2=head;
		Node temp=head;
		int c=0;
		while(head2!=null) {
			head2=head2.next;
			c++;
		}
		for(int i=1;i<c/2;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
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
		delmiddle(head);
	}
}
