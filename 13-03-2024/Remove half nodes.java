import java.util.*;
public class MyClass{
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
	public static Node removehalf(Node root)
	{
	    if(root==null)
	    return root;
	    root.left=removehalf(root.left);
	    root.right=removehalf(root.right);
	    if(root.left!=null && root.right!=null)
	    return root;
	    if(root.left==null)
	    return root.right;
	    if(root.right==null)
	    return root.left;
        return root;
	}
		static void traversal(Node root)
	{
		if(root!=null)
		{
			traversal(root.left);
			System.out.print(root.data+" ");
			traversal(root.right);
		}
		
	}

	public static void main(String[] args) {
		root=insert(root,20);
		root=insert(root,10);
		root=insert(root,40);
		root=insert(root,5);
		root=insert(root,12);
		root=insert(root,30);
		root=insert(root,60);
		removehalf(root);
		traversal(root);
	}
}
