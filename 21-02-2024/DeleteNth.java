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
		static void nthnode(Node head,int n) {
		Node prev=head;
		Node curr=head;
		int c=1;
		while(curr.next!=null){
		    prev=curr;
		    curr=curr.next;
		    if(c==n){
		        prev.next=curr.next;
		    }
		    c++;
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
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=0;i<m;i++) 
			head=insert(sc.nextInt(),head);
		nthnode(head,n);
	}
}
