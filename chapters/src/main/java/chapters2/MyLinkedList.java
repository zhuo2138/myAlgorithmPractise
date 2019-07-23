package chapters2;

public class MyLinkedList {
    // 头节点指针
    private Node head;
    // 尾节点指针
    private Node last;
    // 链表实际长度
    private int size;

    /**
     * 链表插入元素
     * @param data
     * @param index
     * @throws Exception
     */
    public void insert(int data, int index) throws Exception{

    }

    /**
     * 链表删除元素
     * @param index
     * @return
     * @throws Exception
     */
    public Node remove(int index) throws Exception{

    }

    /**
     *  链表查找元素
     * @param index
     * @return
     * @throws Exception
     */
    public Node get(int index) throws Exception {

    }

    /**
     * 输出链表
     */
    public void output() {

    }

    /**
     *  链表节点
     */
    private static class Node {
        int data;
        Node next;
    }

    public static void main(String[] args) throws Exception{
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insert(3,0);
        myLinkedList.insert(7,1);
        myLinkedList.insert(9,2);
        myLinkedList.insert(5,3);
        myLinkedList.insert(6,1);
        myLinkedList.remove(0);
        myLinkedList.output();
    }
}
