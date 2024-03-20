import java.util.*;
public class MyClass {
	public static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
	static Node root=null;
	public static Node insert(Node root,int key)
	{
		if(root==null)
		{
			Node t=new Node(key);
			return t;
		}
		else if(root.data<key)
		{
			root.right=insert(root.right,key);
		}
		else if(root.data>key)
		{
			root.left=insert(root.left,key);
		}
		return root;
	}
	static ArrayList<Integer> a=new ArrayList<>();
	static void inorder(Node root){
	    if(root!=null){
	        inorder(root.left);
	        a.add(root.data);
	        inorder(root.right);
	    }
	}
	static int ksmallest(Node root,int k){
	    return a.get(k);
	}
	static int klargest(Node root,int k){
	    return a.get(a.size()-k);
	}
	public static void main(String[] args) {
		root=insert(root,20);
		root=insert(root,10);
		root=insert(root,40);
		root=insert(root,5);
		root=insert(root,12);
		root=insert(root,30);
		root=insert(root,60);
		inorder(root);
		System.out.println(ksmallest(root,1));
		System.out.println(klargest(root,1));
	}

}
