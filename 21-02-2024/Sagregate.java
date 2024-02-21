import java.util.*;
public class MyClass {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
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
		segregate(head);
	}
	static void segregate(Node head) {
		Node temp=head;
		Node start=null;Node p=null;
		while(temp!=null) {
			if(temp.data%2==0) {
				Node t=new Node(temp.data);
				if(start==null) {
					start=t;p=t;
				}
				else {
					p.next=t;
					p=t;
				}
			}
			temp=temp.next;
		}
		temp=head;
		while(temp!=null) {
			if(temp.data%2!=0) {
				Node t=new Node(temp.data);
					p.next=t;
					p=t;
			}
			temp=temp.next;
		}
		display(start);
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
