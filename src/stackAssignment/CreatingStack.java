package stackAssignment;

import java.util.Stack;

public class CreatingStack {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        //Add item to Stack
        books.push("Chemistry");
        books.push("Biology");
        books.push("Physics");
        System.out.println("Stack: " + books);

        //remove item stacks
        String item = books.pop();
        System.out.println("Remove item is " + item);

        //Access elements from the top
        String Item = books.peek();
        System.out.println("The item at the top is " + Item);

        //Search an item
        int position = books.search("Biology");
        System.out.println("The position of Biology is " + position);

        //Check if stack is empty
        boolean result = books.empty();
        System.out.println("Is the stack empty? "  + result);
    }

}


