package chapters2;

// 先入后出
public class MyStack {
    Object[] stack;
    Integer top;
    Integer size;

    MyStack(Integer citycape) {
        this.stack = new Object[citycape];
        this.size = citycape;
        this.top = 0;
    }
    public void push(Object data) throws Exception{
        if(top >= size) {
            resize();
        }
        stack[top] = data;
        top++;
    }
    public Object pop() throws Exception{
        if(top == 0) {
            throw new Exception("栈内无数据");
        }
        Object outPop = stack[top-1];
        top--;
        return outPop;
    }
    public void resize() {
        this.size *= 2;
        Object[] newStack = new Object[this.size];
        System.arraycopy(this.stack,0,newStack,0,this.stack.length);
        this.stack = newStack;
    }
    public void outPut () {
        for(int i = 0; i < top; i++) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) throws Exception{
        MyStack myStack = new MyStack(4);
        myStack.push("a");
        myStack.push("b");
        myStack.push("c");
        myStack.push("d");
        myStack.push("e");
        myStack.push("f");
        myStack.outPut();
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
    }
}
