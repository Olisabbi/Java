package ListasPilhas;


    class Stack<T> {

        private Node<T> top;
    
        private static class Node<T> {
        
            private T data;
            private Node<T> next;
    
            public Node(T data) {
                this.data = data;
            }
        }
    
        public void push(T data) {
            Node<T> node = new Node<>(data);
            node.next = top;
            top = node;
        }
    
        public T pop() {
           if(top == null) throw new IllegalStateException("A pilha está vazia!");
           T data = top.data;
           top = top.next;
           return data;  
        }
    
        public T peek() {
            if(top == null) throw new IllegalStateException("A pilha está vazia!");
            return top.data;
        }
    
        public boolean isEmpty() {
            return top == null;
        }
    
        public void print() {
            Node<T> current = top;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
    
    
    class Queue<T> {
        private Node<T> first;
        private Node<T> last;
    
        private static class Node<T> {
        
            private T data;
            private Node<T> next;
    
            public Node(T data) {
                this.data = data;
            }
        }
    
        public void add(T item) {
            Node<T> t = new Node<>(item);
    
            if(last != null) {
                last.next = t;
            }
    
            last = t;
    
            if(first == null) {
                first = last;
            }
        }
    
        public T remove() {
            if(first == null) throw new IllegalStateException("A fila está vazia!");
            T data = first.data;
            first = first.next;
            if (first == null) {
                last = null;
            }
            return data;
        }
        
        public T peek() {
            if(first == null) throw new IllegalStateException("A fila está vazia!");
            return first.data;
        }
    
        public boolean isEmpty() {
            return first == null;
        }
    
        public void print() {
            Node<T> current = first;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    
    }
    
    
    
    public class Main {
        public static void main(String[] args) {
    
            Queue<String> strQueue = new Queue();
            strQueue.add("Maria");
            strQueue.add("Fabricio");
            strQueue.add("Henrique");
            strQueue.add("Marcos");
            strQueue.remove();
            strQueue.remove();
            
            strQueue.print();
        }
    }
    

