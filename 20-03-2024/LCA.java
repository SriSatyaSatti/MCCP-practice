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
	
	static int LCA(Node root,int n1,int n2){
	    if(root.data<n1 && root.data<n2)
	    return LCA(root.right,n1,n2);
	    else if(root.data>n1 && root.data>n2)
	    return LCA(root.left,n1,n2);
	    else
	    return root.data;
	}
	static ArrayList<Integer> find(Node root,int n){
	    ArrayList<Integer> a=new ArrayList<>();
	    ArrayList<Integer> b=new ArrayList<>();
	    while(root.data!=n){
	        if(root.data>n)
	        root=root.left;
	        else
	        root=root.right;
	        a.add(root.data);
	    }
	    return a;
	}
	static int LCA1(Node root,int n1,int n2){
	    ArrayList<Integer> a=new ArrayList<>();
	    ArrayList<Integer> b=new ArrayList<>();
	    a=find(root,n1);
	    b=find(root,n2);
	    Collections.reverse(a);
	    Collections.reverse(b);
	    int min=Math.min(a.size(),b.size());
	    for(int i=0;i<min;i++){
	        if(a.get(i)==b.get(i))
	        return a.get(i);
	    }
	    return -1;
	}
	public static void main(String[] args) {
		root=insert(root,20);
		root=insert(root,10);
		root=insert(root,40);
		root=insert(root,5);
		root=insert(root,12);
		root=insert(root,30);
		root=insert(root,60);
		System.out.print(LCA1(root,5,12));
	}

}
