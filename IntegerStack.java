package com.stackcollection;


	import java.util.Stack;

	public class IntegerStack {
	    private Stack<Integer> stack;

	    // Constructor
	    public IntegerStack() {
	        stack = new Stack<>();
	    }

	    // Method to push an element onto the stack
	    public void push(int value) {
	        stack.push(value);
	        System.out.println(value + " pushed onto stack");
	    }

	    // Method to pop an element from the stack
	    public int pop() {
	        if (stack.isEmpty()) {
	            System.out.println("Stack is empty, cannot pop");
	            return -1; // Indicating an empty stack
	        }
	        int poppedValue = stack.pop();
	        System.out.println(poppedValue + " popped from stack");
	        return poppedValue;
	    }

	    // Method to check if the stack is empty
	    public boolean isEmpty() {
	        return stack.isEmpty();
	    }

	    public static void main(String[] args) {
	        IntegerStack myStack = new IntegerStack();

	        myStack.push(5);
	        myStack.push(15);
	        myStack.push(25);

	        System.out.println("Is stack empty? " + myStack.isEmpty());

	        myStack.pop();
	        myStack.pop();
	        myStack.pop();
	        myStack.pop(); // This will show an empty stack message

	        System.out.println("Is stack empty? " + myStack.isEmpty());
	    }
	}

	
//output:
//	5 pushed onto stack
//	15 pushed onto stack
//	25 pushed onto stack
//	Is stack empty? false
//	25 popped from stack
//	15 popped from stack
//	5 popped from stack
//	Stack is empty, cannot pop
//	Is stack empty? true

