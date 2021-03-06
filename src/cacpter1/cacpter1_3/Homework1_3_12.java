package cacpter1.cacpter1_3;

import cacpter1.cacpter1_3.common.stack.FixCapacityStack;
import cacpter1.cacpter1_3.common.stack.LinkedStack;
import cacpter1.cacpter1_3.common.stack.Stack;


public class Homework1_3_12 {
    public static void main(String[]args){
        Stack<Integer>stack=new FixCapacityStack<>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack=clone(stack);
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+"\t");
        }
    }
    public static Stack<Integer>  clone(Stack<Integer> express){
        LinkedStack<Integer>stack=LinkedStack.copy(express);
        return stack;
    }
}
