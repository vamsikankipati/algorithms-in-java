package com.algos.ds;

/**
 * Pointer - represent the address of a location in memory and hold the pieces of
 * linked structures together as a connection.
 */
public class LinkedList<T> {

	private Node node;

	private class Node {
		private T data;
		Node next;

		public Object getData() {
			return this.data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	public void add(T value) {
		// Implementation
		Node node = new Node();
		node.setData(value);
//		node.setNext(next);
		setNode(node);
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}
}
