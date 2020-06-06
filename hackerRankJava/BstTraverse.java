package hackerRankJava;


import java.util.*;
import java.io.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class BstTraverse{

static void levelOrder(Node root){
	
	Queue<Node> queue= new LinkedList();
	
	queue.add(root);
	
	while(!queue.isEmpty()) {
		
		Node currentNode=queue.remove();
		System.out.println(currentNode.data+" ");
		
		if(currentNode.left!=null ) {queue.add(currentNode.left);}
		if(currentNode.right!=null ) {queue.add(currentNode.right);}
	}
	
      //Write your code here
		/*
		 * int leftlevel=1; int rightlevel=1; if(leftlevel==rightlevel) {
		 * System.out.print(root.data+" "); } if(root.left!=null ) {
		 * 
		 * levelOrder(root.left); leftlevel++; }
		 * 
		 * if(root.right!=null ) {
		 * 
		 * levelOrder(root.right); rightlevel++;
		 * 
		 * }
		 */
   }

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            
            levelOrder(root);
        }	
}