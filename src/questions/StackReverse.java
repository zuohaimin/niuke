package questions;

import java.util.Stack;

/**
 * @Author: 束手就擒
 * @Date: 18-9-25 下午4:00
 * @Description:
 */
public class StackReverse {
    /*递归输出逆序栈*/


    /*递归的思想 和栈是一个意思*/
    public static int getAndRemoveLastElement(Stack<Integer> stack){

        int value = stack.pop();
        if (stack.empty()){
            return value;
        }else {
            int last = getAndRemoveLastElement(stack);
            stack.push(value);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack){
        if (stack.empty()){
            return;
        }
        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        System.out.println(myStack);
        reverse(myStack);
        System.out.println(myStack);
    }
}
