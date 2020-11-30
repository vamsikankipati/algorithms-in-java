package com.datastructures;

public class List<T> {

	private class Node {
		Item item;
		Node next;

		public Item getItem() {
			return item;
		}

		public void setItem(Item item) {
			this.item = item;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	private void addNode(Object value) {
		// Implementation
	}

}
