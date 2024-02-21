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
   static void reverse(Node head) {
		Node temp=head;
		Stack<Integer>s=new Stack<>();
		while(temp!=null) {
			s.push(temp.data);
			temp=temp.next;
		}
		Node p=null;Node last=null;
		while(!s.isEmpty()) {
			Node t=new Node(s.pop());
			if(p==null) {
				p=t;
				last=t;
			}
			else {
				last.next=t;
				last=t;
			}
		}
		display(p);
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
