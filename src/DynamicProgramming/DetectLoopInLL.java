package DynamicProgramming;

public class DetectLoopInLL {

	public static boolean detectLoop(Node head){
		if(head == null) {
			return false;
		}
		Node slow = head;
		Node fast = head;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {


	}

}

class Node{
	int data;
	Node next;
	
	Node(int d) {
		data = d; next = null; 
	}
}
