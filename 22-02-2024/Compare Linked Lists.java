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
	public static Node head1=null;
	public static Node head2=null;
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
			head1=insert(sc.nextInt(),head1);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) 
			head2=insert(sc.nextInt(),head2);
		System.out.println(isIdentical(head1,head2));
	}
	static boolean isIdentical(Node head1,Node head2) {
		while(head1!=null && head2!=null) {
			if(head1.data!=head2.data) {
				return false;
			}
			head1=head1.next;
			head2=head2.next;
		}
		if(head1==null && head2==null)
			return true;
		else
			return false;
	}
}
