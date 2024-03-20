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
	static ArrayList<Integer> left(Node root){
	    ArrayList<Integer> a=new ArrayList<>();
	    while(root!=null){
	        a.add(root.data);
	        root=root.left;
	    }
	    return a;
	}
   static ArrayList<Integer> right(Node root){
	    ArrayList<Integer> a=new ArrayList<>();
	    while(root!=null){
	        a.add(root.data);
	        root=root.right;
	    }
	    return a;
	}
	static void topview(Node root){
	    ArrayList<Integer> a=new ArrayList<>();
	    ArrayList<Integer> b=new ArrayList<>();
	    a=left(root);
	    b=right(root);
	    Collections.reverse(a);
	    for(Integer i:a){
	        System.out.print(i+" ");
	    }
	    for(int i=1;i<b.size();i++){
	        System.out.print(b.get(i)+" ");
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
		topview(root);
	}

}
