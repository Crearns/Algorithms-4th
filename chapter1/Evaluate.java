package chapter1;

import java.util.Stack;

public class Evaluate {

	public Double Dijkstra(String stdin) {
		int i = 0;
		Stack<String> ops = new Stack<>();
		Stack<Double> vals = new Stack<>();
		while(i != stdin.length()) {
			String s = String.valueOf(stdin.charAt(i));
			System.out.print(s);
			if     (s.equals("("))				   ;
			else if(s.equals("+")) 		ops.push(s);
			else if(s.equals("-")) 		ops.push(s);
			else if(s.equals("*")) 		ops.push(s);
			else if(s.equals("/")) 		ops.push(s);
			else if(s.equals("sqrt")) 	ops.push(s);
			else if(s.equals(")")) {
				String op = ops.pop();
				double v = vals.pop();
				//System.out.println(v);
				if	   (s.equals("+")) 		v = vals.pop() + v;
				else if(s.equals("-"))		v = vals.pop() - v;
				else if(s.equals("*")) 		v = vals.pop() * v;
				else if(s.equals("/")) 		v = vals.pop() / v;
				else if(s.equals("sqrt")) 	v = Math.sqrt(v);
				vals.push(v);
			}
			else {
				vals.push(Double.parseDouble(s));
			}
			i++;
		}
		return vals.pop();
	}
	public static void main(String[] args) {
		String stdin = "(1+((2+3)*(4*5)))";
		Evaluate e = new Evaluate();
		System.out.println(e.Dijkstra(stdin));
	}

}
