package questions;

import java.util.Stack;

/**
 * @Author: 束手就擒
 * @Date: 18-9-25 下午3:23
 * @Description:
 */
public class MyStack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack1(){
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public int getMin(){
        if (this.stackMin.empty()){
            throw new RuntimeException("Your stack is empty");
        }
        return this.stackMin.peek();
    }

    public void push(int newNum){
        stackData.push(newNum);
        if (stackMin.empty()){
            this.stackMin.push(newNum);
        }else if(newNum <= this.getMin()){
            this.stackMin.push(newNum);
        }
    }

    public int pop(){
        if (stackData.empty()){
            throw new RuntimeException("Your stack is empty");
        }
        int value = this.stackData.pop();
        if (value == this.getMin()){
            this.stackMin.pop();
        }
        return value;
    }
}
