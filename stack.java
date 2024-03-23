
public class stack {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static Boolean isEmpty() {
            return head == null;
        }

        public static void Push(int data) {

            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public static int Pop(int data) {
            if (isEmpty()) {
                return -1;
            }
            // Node top = new Node(data);
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        public static void main(String[] args){

            




        }
    }
}


