import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        //stack LIFO turn vertical
        //push(adaugam)doar de sus in jos
        //pop() stergem doar de sus in jos
        //peek te uiti la ultimul element

        Stack<String> stack = new Stack ();

       // System.out.println(stack.empty());
        stack.push("skyrim");
        stack.push("BD2");
        stack.push("FFVII");
    //    System.out.println(stack.peek());
       // System.out.println(stack.search("BD2"));
        String joc= stack.pop();
        System.out.println(joc);
        System.out.println(stack);


    }
}
