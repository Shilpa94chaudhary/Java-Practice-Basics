package Tree;

import java.util.ArrayList;

public class LeftViewOfBinaryTree {

	public static ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> result = new ArrayList<Integer>();
      Node temp = root;
      while(temp != null) {
    	  result.add(temp.data);
    	  temp = temp.left;
      }
      return result;
      
    }
	
	public static void main(String[] args) {
		

	}

}
