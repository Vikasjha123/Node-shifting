package com.domail;

public class Node {

	private String name;
	private Node next;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	public Node(String name, Node next) {
		super();
		this.name = name;
		this.next = next;
	}
	
	
	
}
