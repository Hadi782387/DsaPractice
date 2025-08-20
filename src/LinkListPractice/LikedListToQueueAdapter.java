package LinkListPractice;

import java.util.LinkedList;

public class LikedListToQueueAdapter {
    public static class LinKedListToQueueAdapter1{
        LinkedList<Integer>list;
        public LinKedListToQueueAdapter1(){
            list = new LinkedList<>();
        }
        int size(){
            return list.size();
        }
        void add(int val){
            list.addLast(val);
            System.out.println("value is added: "+val);
        }
        void remove(){
            if (size()==0){
                System.out.println("Queue underflow");
            }else{
                int val = list.remove();
                System.out.println("element has removed: "+val);
            }
        }
        void peek() {
            if (size() == 0) {
                System.out.println("Queue underflow");
            } else {
                int val = list.getFirst();
                System.out.println("element of peek is: " + val);
            }
        }
    }
    public static void main(String[] args) {
        LinKedListToQueueAdapter1 queue = new LinKedListToQueueAdapter1();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        
       queue.remove();
        queue.peek();
        System.out.println("size of queue is: "+queue.size());
    }
}
