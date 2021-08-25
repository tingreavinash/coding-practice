package com.avinash.java_concepts.data_structure.LinkedList;

public class LinkedList {
	Node head;
	
	public void insert (int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if (head==null) {
			head = node;
		}else {
			Node n = new Node();
			n = head;
			
			while(n.next!=null) {
				n = n.next;
			}
			n.next=node;
		}
		
	}
	
	public void show() {
		Node n =new Node();
		n = head;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}

}