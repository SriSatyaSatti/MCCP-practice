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
	static void fun(Node root,int k){
	    if(k==a.get(0)){
	        System.out.print(a.get(0)+" "+a.get(0));
	        return;
	    }
	    if(k<a.get(0)){
	        System.out.print("- "+a.get(0));
	        return;
	    }
	    if(k==a.get(a.size()-1)){
	        System.out.print(a.get(a.size()-1)+" "+a.get(a.size()-1));
	        return;
	    }
	    if(k>a.get(a.size()-1)){
	        System.out.print(a.get(a.size()-1)+" -");
	        return;
	    }
	    for(int i=1;i<a.size()-1;i++){
	        if(a.get(i)==k){
	            System.out.print(a.get(i)+" "+a.get(i));
	            return;
	        }
	        else if(k>a.get(i-1) && k<a.get(i+1)){
	            System.out.print(a.get(i-1)+" "+a.get(i+1));
	            return;
	        }
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
		inorder(root);
		fun(root,35);
	}

}
