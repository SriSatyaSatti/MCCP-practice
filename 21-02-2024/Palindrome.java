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
		System.out.println(isPalindrome(head));
	}
	static boolean isPalindrome(Node head) {
		Node temp=head;
		Stack<Integer>s=new Stack<>();
		while(temp!=null) {
			s.push(
					temp.data);
			temp=temp.next;
		}
		temp=head;
		while(!s.isEmpty()) {
			if(s.pop()!=temp.data)
				return false;
			temp=temp.next;
		}
		return true;
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
