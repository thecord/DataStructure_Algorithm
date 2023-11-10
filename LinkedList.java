
public class LinkedList { 
    private Node first;
    private Node last;

    private class Node { 
        private int value;
        private Node next;

    private Node (int value) { 
        this.value = value;
        this.next = null;
    }}
    public void addLast(int item) {
        Node number = new Node(item);
        if (first == null) {
            first = last = number;
        } else {
            last.next = number;
            last = number;
	}}
    public void addFirst(int item) {
	Node number = new Node(item);
	if (first == null){
		first = last = number;
	} else {
		number.next = first;
		first = number;
    } 
}
    public int indexOf (int item) {
        int index = 0;
        var current = first; 
        while (current !=null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    
}


