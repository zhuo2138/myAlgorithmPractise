package chapters2;

import java.sql.SQLOutput;

public class MyQueue {
    private int[] array;
    private int front;
    private int rear;

    public MyQueue (int capacity) {
        array = new int[capacity];
    }

    /**
     *  入队
     * @param element
     * @throws Exception
     */
    public void enQueue(int element)  throws Exception{
        if((rear + 1)%array.length == front) {
            throw new Exception("队列已满");
        }
        array[rear] = element;
        rear = (rear + 1)%array.length;
    }

    /**
     *  出队
     * @return
     * @throws Exception
     */
    public int deQueue() throws Exception{
        if(front == rear) {
           throw new Exception("队列已无数据");
        }
        int deQueueElement = array[front];
        front = (front + 1)%array.length;
        return deQueueElement;
    }

    /**
     * 输出队列
     */
    public void outPut() {
        for(int i = front; i != rear; i=(i+1)%array.length) {
            System.out.println(array[i]);
        }
//        if(front > rear) {
//            for(int i = front; i < array.length; i++) {
//                System.out.println(array[i]);
//            }
//            for(int j=0; j < rear; j++) {
//                System.out.println(array[j]);
//            }
//        } else {
//            for(int i = front; i < rear; i++) {
//                System.out.println(array[i]);
//            }
//        }
    }

    public static void main(String[] args) throws Exception{
        MyQueue myQueue = new MyQueue(5);
        myQueue.enQueue(3);
        myQueue.enQueue(5);
        myQueue.enQueue(6);
        myQueue.enQueue(8);
        myQueue.enQueue(1);
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.enQueue(2);
        myQueue.enQueue(4);
        myQueue.enQueue(9);
        myQueue.outPut();
    }
}
