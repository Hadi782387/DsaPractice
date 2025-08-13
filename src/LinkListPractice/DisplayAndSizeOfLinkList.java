package LinkListPractice;

public class DisplayAndSizeOfLinkList {
    public static class Node{
        int data;
        Node next;
    }
    public static class linkList{
        Node head ,tail;
        int size;

        void addClass(int val){
            Node temp = new Node();
            temp.data=val;
            temp.next=null;
            if (size==0){
                head = tail = temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public void removeFirst(){
            if(size==0){
                System.out.println("empty");
            }else if(size==1){
                head=tail=null;
                size=0;
            }else{
                head=head.next;
                size--;
            }
        }
        public int size(){
            return size;
        }
        public void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp =  temp.next;
            }
            System.out.println();
        }
        public int getFirst(){
            if (size==0){
                System.out.println("List is empty");
                return -1;
            }else{
                return head.data;
            }
        }

        public int getLast(){
            if (size==0){
                System.out.println("List is empty");
                return -1;
            }else{
                return tail.data;
            }
        }

        public int getAt(int idx){
            if (size==0){
                System.out.println("List is empty");
                return -1;
            }else if (idx<0 || idx>=size){
                System.out.println("invalid arguments");
                return -1;
            }else{
                Node temp = head;
                for (int i =0;i<idx;i++){
                    temp=temp.next;
                }
               return temp.data;
            }
        }
        public void addFirst(int val){
            Node temp = new Node();
            temp.data=val;
            temp.next=head;
            head=temp;
            if (size==0){
                tail=temp;
            }
            size++;
        }
        public void addLast(int val) {
            Node temp = new Node(); // Create a new node
            temp.data=val;
            // Update tail to the new node
            if (size == 0) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;

            size++;
        }

        public void addAt(int idx,int val){
            if (idx<0 || idx>size) System.out.println("invalid");
            else if (size==0) addFirst(val);
            else if(idx==size) addLast(val);
            else{
                Node node = new Node();
                node.data=val;
                Node temp = head;
                for (int i =0 ;i<idx-1;i++){
                    temp=temp.next;
                }
                node.next=temp.next;
                temp.next=node;
                size++;
            }


        }
    }
    public static void main(String[] args) {
        linkList ll = new linkList();

        ll.addClass(10);
        ll.addClass(20);
        ll.addClass(30);

        System.out.print("Linked List: ");
        ll.display();
        System.out.println("Size of Linked List: " + ll.size());

        ll.removeFirst();
        System.out.print("After removeFirst(): ");
        ll.display();
        System.out.println("Size of Linked List: " + ll.size());

        // Calling additional methods
        System.out.println("First Element: " + ll.getFirst());
        System.out.println("Last Element: " + ll.getLast());
        System.out.println("Element at index 1: " + ll.getAt(1)); // assuming size > 1
        ll.addFirst(10);
        ll.display();
        ll.addAt(1,10);
        ll.display();
    }
}
