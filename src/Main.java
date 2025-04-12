public class Main {
    public static void main(String[] args) {

        System.out.println("=== MyArrayList Test ===");
        MyList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1, 99);
        printList(arrayList);

        arrayList.remove(0);
        System.out.println("After remove index 0:");
        printList(arrayList);
        System.out.println("Element at index 1: " + arrayList.get(1));
        System.out.println("Size: " + arrayList.size());
        System.out.println();


        System.out.println("=== MyLinkedList Test ===");
        MyList<String> linkedList = new MyLinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add(1, "X");
        printList(linkedList);

        linkedList.remove(2);
        System.out.println("After remove index 2:");
        printList(linkedList);
        System.out.println("Element at index 0: " + linkedList.get(0));
        System.out.println("Size: " + linkedList.size());
        System.out.println();


        System.out.println("=== MyStack Test ===");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after push: " + stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Stack now: " + stack);
        System.out.println();


        System.out.println("=== MyQueue Test ===");
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        System.out.println("Queue after enqueue: " + queue);
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Queue now: " + queue);
        System.out.println();


        System.out.println("=== MyDeque Test ===");
        MyDeque<Character> deque = new MyDeque<>();
        deque.addFirst('X');
        deque.addLast('Y');
        deque.addFirst('Z');
        System.out.println("Deque after addFirst & addLast: " + deque);
        System.out.println("Remove first: " + deque.removeFirst());
        System.out.println("Remove last: " + deque.removeLast());
        System.out.println("Deque now: " + deque);
    }

    private static <T> void printList(MyList<T> list) {
        System.out.print("List: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
