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
	static int kl=0;
	static Node insert(int ele,Node head,int n) {
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
		if(kl==n)
		temp.next=head;
		return head;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		kl=m-1;
		for(int i=0;i<m;i++) 
			head=insert(sc.nextInt(),head,i);
		System.out.println("length of loop : "+detectloop(head));
	}
	static int detectloop(Node head) {
		Stack<Node>s=new Stack<>();
		Node temp=head;
		while(temp!=null) {
			if(s.contains(temp))
				return length(temp);
			s.add(temp);
			temp=temp.next;
		}
		return 0;
	}
	static int length(Node p1) {
		Node temp=p1.next;int c=1;
		while(temp!=p1) {
			c++;
			temp=temp.next;
		}
		return c;
	}
}
