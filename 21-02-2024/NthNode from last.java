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
		int n=sc.nextInt();
		for(int i=0;i<m;i++) 
			head=insert(sc.nextInt(),head);
		System.out.print(nthnode(head,n));
	}
	static int nthnode(Node head,int c) {
		Node head2=head;
		int n=0;
		while(head2!=null) {
			head2=head2.next;
			n++;
		}
		if(n-c+1<=0)
			return -1;
		else{
			head2=head;
		for(int i=1;i<n-c+1;i++) {
			head2=head2.next;
		}
		return (head2.data);
		}
	}
}
