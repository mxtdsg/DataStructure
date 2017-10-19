/*


*/

public class LinkedList {
    class Node {
        int value;
        Node next;
        Node(int integer) {
            this.value = integer;
            this.next = null;
        }
    }

    Node firstNode;
    Node lastNode;
    int size;

    public LinkedList() {
        this.size = 0;
        this.firstNode = null;
        this.lastNode = null;
    }

    public int size() {
        return size;
    }

    public void add(int i) {
        Node n = new Node(i);
        // adding the first node
        if (size == 0) {
            firstNode = n;
            lastNode = n;
        }

        lastNode.next = n;
        size += 1;
    }

    public void remove() {
        if (size == 0) {
            return;
        } else if (size == 1) {
            firstNode = null;
            lastNode = null;
        }
        Node secLast = this.get(size - 2);
        size -= 1;
    }

    public Node get(int index) {
        Node cur = firstNode;
        for (int i = 0; i < index; i++) {
            cur = firstNode.next;
        }
        return cur;
    }
}
