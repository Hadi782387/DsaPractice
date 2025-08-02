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
        public int size(){
            return size;
        }
        public void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        linkList ll = new linkList();

        ll.addClass(10);
        ll.addClass(20);
        ll.addClass(30);

        System.out.print("Linked List: ");
        ll.display(); // Should print: 10 20 30

        System.out.println("Size of Linked List: " + ll.size()); // Should print: 3
    }
}
