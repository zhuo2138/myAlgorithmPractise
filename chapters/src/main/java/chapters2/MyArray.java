package chapters2;

import java.lang.reflect.Array;

public class MyArray {
    private int[] array;
    private int size;

    public MyArray (int capacity) {
        this.array = new int[capacity];
        this.size = 0;
    }

    /**
     * 数组插入元素
     * @param index
     * @param element
     * @throws Exception
     */
    public void insert(int element, int index) throws Exception{
        // 判断访问下标是否超出范围
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("插入位置超出数组范围！");
        }
        // 如果实际元素达到数组容量上限，则对数据进行扩容
        if(size >= array.length) {
            resize();
        }
        // 从右向左循环，将元素逐渐向右挪1位
        for(int i = size - 1; i >= index; i--) {
            array[i+1] = array[i];
        }
            array[index] = element;
            size++;
    }

    /**
     *  删除元素
     */
    public int delete(int index) throws Exception {
        // 判断访问下标是否超标
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("删除位置超出数组范围！");
        }
        int deleteElement = array[index];
        // 从左向右循环，将元素逐个向左挪1位
        for(int i = index; i < size-1; i++){
            array[i] = array[i + 1];
        }
        size--;
        return deleteElement;
    }

    /**
     *  数组扩容
     */
    public void resize() {
        int[] newArray = new int[array.length*2];
        // 从旧数组复制到新数组
        System.arraycopy(array,0,newArray,0,array.length);
        array = newArray;
    }

    /**
     *  输出数组
     */
    public void output(){
        for(int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) throws Exception{
        MyArray myArray = new MyArray(2);
        myArray.insert(3,0);
        myArray.insert(7,1);
        myArray.insert(9,2);
        myArray.insert(5,3);
        myArray.insert(6,1);
        myArray.output();
    }
}
