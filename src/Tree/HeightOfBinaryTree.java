package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HeightOfBinaryTree {

	public static int height(Node node) 
    {
		if(node == null) {
			return 0;
		}
		
		if(node.left == null && node.right == null) {
			return 1;
		}
		
		int heightLeft = 1 + height(node.left);
		int heightRight = 1 + height(node.right);
		
		return Math.max(heightLeft, heightRight);
    }
	
	private static Node levelwiseInput() {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root data : ");
		int data = s.nextInt();
		if(data == -1) {
			return null;
		}

		Queue<Node> queue = new LinkedList<Node>();

		Node node = new Node(data);
		queue.add(node);
		while(!queue.isEmpty()) {

			Node temp = queue.poll();

			System.out.println("Enter left of " + temp.data + " : ");
			data = s.nextInt();
			if(data == -1) {
				temp.left = null;
			}else {
				Node left = new Node(data);
				queue.add(left);
				temp.left = left;
			}

			System.out.println("Enter right of " + temp.data + " : ");
			data = s.nextInt();
			if(data == -1) {
				temp.right = null;
			}else {
				Node right = new Node(data);
				queue.add(right);
				temp.right = right;
			}
		}

		return node;
	}
	
	public static void main(String[] args) {
		
		Node root = levelwiseInput();
		System.out.println(height(root));

	}

}
