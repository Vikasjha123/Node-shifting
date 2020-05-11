package com.domail;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node();
		Node temporary = head;
		head.setName("n1");
		head.setNext(new Node("n2",
				new Node("n3", new Node("n4", new Node("n5", new Node("n6", new Node("n7", new Node("n8", null))))))));
		System.out.println("Initial Status:");
		do {
			System.out.print(head.getName() + " -> ");
			head = head.getNext();
		} while (head != null);
		System.out.println("null");
		Main.rotateList(temporary, 5);
	}

	public static void rotateList(Node head, int n) {

		Node tmp = head;
		Node prev = null;
		for (int i = 0; i < n; i++) {
			//System.out.println(i);
			while (head.getNext() != null) {
				//System.out.println(head.getName());
				prev = head;
				head = head.getNext();
			}
			head.setNext(tmp);
			prev.setNext(null);
			tmp = head;
			// head.setNext(tmp);
			// head.getNext().setName(tmp.getName());

			// head = prev;
			// first = prev;
			//System.out.println("-----------");
		}
		System.out.println("Final Status:");
		do {
			System.out.print(head.getName() + " -> ");
			head = head.getNext();
		} while (head != null);
		System.out.print("null");
		// 0System.out.println(head.getName() + " " + head.getNext() + " " +
		// head.getNext().getName());

	}
}
