package com.linkedlist.demo;

public class SinglyLinkedList {

	//// private LinkedList head;

	/**
	 * @param head
	 */
	
	public static void display(LinkedList head) {

		if (head == null) {
			System.out.println("No data is present");
		}
		/// using while loop to traverse
		LinkedList current = head;
		while (current != null) {
			System.out.print(current.data + "--->");
			current = current.next;
		}
		System.out.println(current);

		System.out.println("while loop finished.");
	}

	/**
	 * @param head
	 * @param data
	 * @param position
	 * @return
	 */
	public static LinkedList insertNewDataGivenPosition(LinkedList head, int data, int position) {

		LinkedList newNode = new LinkedList(data);
		int size = length(head);
		if (position > size + 1 || position < 1) {
			System.out.println("invalid Position");
			return head;
		}
		int count = 1;

		LinkedList current = head;
		if (position == 1) {
			newNode.next = current;
			current = newNode;
			return current;
		}
		while (count < position - 1) {

			current = current.next;
			count++;
		newNode.next = current.next;
		}
		current.next = newNode;
		return head;

	}

	public static LinkedList deleteFirstNode(LinkedList head) {

		if (head == null) {
			return head;
		}

		LinkedList temp = head;
		head = head.next;
		temp.next = null;

		// return head;
		return temp;

	}

	public static LinkedList deleteLastNode(LinkedList head) {

		if (head == null) {
			return head;
		}

		LinkedList temp = head;
		LinkedList temp1 = null;

		while (temp != null) {
			if (temp.next == null) {
				temp1 = temp;
			}
			temp = temp.next;
		}

		// return head;
		return temp1;

	}

	public static int length(LinkedList head) {
		if (head == null) {
			return 0;
		}
		int count = 0;
		/// using while loop to traverse
		LinkedList current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	// its contain static Linked list inner class
	public static class LinkedList {
		private int data;
		private LinkedList next;

		public LinkedList(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// SinglyLinkedList singlyLinkedList= new SinglyLinkedList();

		LinkedList headNode = new LinkedList(11);
		LinkedList newList1 = new LinkedList(10);
		LinkedList newList2 = new LinkedList(8);
		LinkedList newList3 = new LinkedList(9);

		// joining the data using next.
		headNode.next = newList1;
		newList1.next = newList2;
		newList2.next = newList3;

		display(headNode);

		// length of linked list...
		System.out.println("leangth of linked list---" + length(headNode));

		// Adding new data entry at the beginning node..
		LinkedList newNode = new LinkedList(15);
		newNode.next = headNode;
		headNode = newNode;
		display(headNode);

		// Adding new data entry at the beginning node..
		LinkedList addAtLast = new LinkedList(7);

		newList3.next = addAtLast;
		display(headNode);

		/*
		 * LinkedList newNode1= insertNewDataGivenPosition(headNode,3,7);
		 * display(newNode1);
		 */

		LinkedList afterDeleteList = deleteLastNode(headNode);
		display(afterDeleteList);
		System.out.println("fsdsdsgdsdsdsd");
		System.out.println("fsdsdsgdsdsdsd");
		System.out.println("fsdsdsgdsdsdsd");
		System.out.println("fsdsdsgdsdsdsd");
		System.out.println("fsdsdsgdsdsdsd");
		System.out.println("fsdsdsgdsdsdsd");
		System.out.println("fsdsdsgdsdsdsd");
		display(headNode);

	}

}
