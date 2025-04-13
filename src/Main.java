public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(5);
        stack.push(10);
        System.out.println("Peek: " + stack.peek()); // 10
        System.out.println("Pop: " + stack.pop());   // 10
        System.out.println("Is empty: " + stack.isEmpty()); // false

        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("hello");
        queue.enqueue("world");
        System.out.println("Dequeue: " + queue.dequeue()); // hello
    }
}
