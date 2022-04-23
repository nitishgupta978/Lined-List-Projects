package com.bridgelabz.linkedlist;

public class  LikedLisUC1 {
	Node head;
	class Node{
		int data;
		Node nextRef;
		public Node(int data) {
			super();
			this.data = data;
			this.nextRef=null;
			
		}
	}
	// add first node
	public void aadFirst(int data) {
		Node newnode= new Node(data);
		if(head == null) {
			head=newnode;
			return;
		}
		newnode.nextRef=head;
		head = newnode;
		
	}
	// add last
	public void lastadd(int data) {
		Node newnode= new Node(data);
		if(head==null) {
		head=newnode;
		return;
	}
	Node currentNode =head;
	while(currentNode.nextRef !=  null) {
		currentNode=currentNode.nextRef;
	}
	currentNode.nextRef=newnode;
 }
	public void printList() {
		if (head ==null) {
			System.out.println("this list is empty");
			return;
		}
		Node currentNode=head;
		while(currentNode!=null) { // if while(currentNode.nextRef!=null) use than last node not be show 
			System.out.print(currentNode.data+" -->");
			currentNode=currentNode.nextRef;
		}
		System.out.println(" Null");
	}
	public static void main(String[] args) {
		LikedLisUC1 list= new LikedLisUC1();
		System.out.println("******uc1*****");
		list.aadFirst(70);
		list.aadFirst(30);
		list.aadFirst(56);
		list.printList();
		System.out.println("*****");
	}
}