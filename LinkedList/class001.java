public class Main
{   
    public static class Node{
        int data;
        Node next;
        
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        
        public void addFirst(int val){
            Node node = new Node();
            node.data = val;

            if(size == 0){
                head = tail = node;
            }else{
                node.next = head;
                head = node;
            }
            size++;
        }
        public void addLast(int val){
            Node node = new Node();
            node.data = val;

            if(size == 0){
                head = tail = node;
            }else{
                tail.next = node;
                tail = node;
            }
            size++;
        }
        public void Display(){
            Node ptr = head;
            
            while(ptr != null){
                System.out.print(ptr.data + "->");
                ptr = ptr.next;
            }
            System.out.println(".");
        }
        public int getFirst(){
            if(size == 0) return -1;
            
            else return head.data;
        }
        public int getLast(){
            if(size == 0) return -1;
            
            else return tail.data;
        }
        public int removeFirst(){
            if(size == 0) {
                System.out.println("LinkedList is Empty");
                return -1;
            }else{
                int val = head.data;
                if(size == 1) {
                    head = tail = null;
                }else{
                    Node nbr = head.next;
                    head.next = null;
                    head = nbr;
                }
                size--;
                return val;
            }
        }
        public int removeLast(){
            if(size == 0) {
                System.out.println("LinkedList is Empty");
                return -1;
            }else{
                int val = tail.data;
                if(size == 1) {
                    head = tail = null;
                }else{
                    Node ptr = head;
                    while(ptr.next != tail){
                        ptr = ptr.next;
                    }
                    ptr.next = null;
                    tail = ptr;
                }
                size--;
                return val;
            }
        }
        
        public int getAt(int idx){
            if(idx > size){
                System.out.println("Invalid Index");
                return -1;
            }
            int i = 0;
            Node ptr = head;
            while(i++ < idx - 1){
                ptr = ptr.next;
            }
            return ptr.data;
        }
        
        public int removeAt(int idx){
            if(idx < 0 || idx > size){
                System.out.println("Invalid Index");
                return -1;
            }
            else if(idx == 0){
                return removeFirst();
            }
            else if(idx == size){
                return removeLast();
            }else{
                Node ptr = head;
                Node curr = head;
                while(idx > 0){
                    curr = ptr;
                    ptr = ptr.next;
                    idx--;
                }
                int val = ptr.data;
                
                curr.next = ptr.next;
                ptr.next = null;
                size--;
                return val;
            }
        }
    }
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.addFirst(30);
		li.addFirst(20);
		li.addFirst(10);
		li.addLast(40);
		li.addLast(50);
		li.addLast(60);
		li.addFirst(70);
		li.addLast(80);
		li.addLast(90);
		li.addLast(100);
		li.Display();
		System.out.println("First Ele " + li.getFirst());
		System.out.println("Last Ele "+ li.getLast());
		System.out.println("Remove First Ele "+li.removeFirst());
		System.out.println("Remove First Ele "+li.removeFirst());
		li.Display();
		System.out.println("Remove Last Ele "+li.removeLast());
        li.Display();
		System.out.println("Get at " + li.getAt(6));
		li.Display();
		System.out.println(li.removeAt(3));
		li.Display();
		System.out.println(li.removeAt(4));
		li.Display();
	}
}
