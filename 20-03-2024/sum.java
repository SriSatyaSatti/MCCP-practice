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
	static int fun(int k){
	    int l=0,r=a.size()-1;
	    while(l<r){
	        int s=a.get(l)+a.get(r);
	        if(s==k)
	        return 1;
	        if(s<k)
	        l++;
	        else if(s>k)
	        r--;
	    }
	    return 0;
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
		System.out.print(fun(31));
	}

}
