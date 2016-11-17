import java.io.InputStream;
import java.util.Scanner;
import java.util.Stack;

public class Balancer {


    public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
        Stack<Character> stack  = new Stack<Character>();
        String ret = "GOOD";
        String s = in.next();
        
		for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {

                stack.push(c);

            }else if(c == ']') {
                if(stack.isEmpty()) 
                	ret = "BAD";
                if(stack.pop() != '[') 
                	ret = "BAD";
                break;

            }else if(c == ')') {
                if(stack.isEmpty()) ret = "BAD";
                if(stack.pop() != '(') ret = "BAD";
                break;

            }else if(c == '}') {
                if(stack.isEmpty()) ret = "BAD";
                if(stack.pop() != '{') ret = "BAD";
                break;
            }

        }
        System.out.println(ret);
    }
}
