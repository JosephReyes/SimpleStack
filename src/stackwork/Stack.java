package stackwork;

public class Stack {
	Node top;
	Node first;
	int stackSize = 0;
	
	public void push (int value){
		if (top == null) {
			Node newNode = new Node(value, null, null);
			top = newNode;
			first = newNode;
			stackSize++;
		} else {
			top.next = new Node(value, top, null);
			top = top.next;
			if (stackSize == 1) {
				first.next = top;
			}
			stackSize++;
		}
		
	}
	
	public Node pop(){
		Node toPop;
		top = top.prev;
		toPop = top.next;
		top.next = null;
		stackSize--;
		return toPop;
	}
	
	public void printStack(){
		for (Node tempNode = first; tempNode != null; tempNode = tempNode.next){
			System.out.println(tempNode.getValue());
		}
	}
	
	public void reverseStack(){
		
		
		first.next = null;
	}
}
