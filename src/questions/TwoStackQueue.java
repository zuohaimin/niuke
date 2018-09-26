package questions;

import java.util.Stack;

/**
 * @Author: 束手就擒
 * @Date: 18-9-25 下午3:47
 * @Description:
 */
public class TwoStackQueue {
    private Stack<Integer> pushStack;
    private Stack<Integer> popStack;

    public TwoStackQueue(){
        this.pushStack = new Stack<>();
        this.popStack = new Stack<>();
    }

    public void add(int pushInt){
        pushStack.add(pushInt);
    }

    private void intoQueue(){
        if (popStack.empty() && pushStack.empty()){
            throw new RuntimeException("Queue is empty");
        }else if (popStack.empty()){
            while (!pushStack.empty()){

                popStack.push(pushStack.pop());
            }
        }
    }

    public int poll(){
       intoQueue();
        return popStack.pop();
    }

    public int peek(){
       intoQueue();
        return popStack.peek();
    }
}
