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
		System.out.println(detectloop(head));
	}
	static boolean detectloop(Node head) {
		Node p1=head;
		Node p2=head;
		int c=0;
		while(p1!=null && p2!=null && p2.next!=null) {
			p1=p1.next;
			p2=p2.next.next;
			if(p1==p2)
				return true;
		}
		return false;
	}
}
