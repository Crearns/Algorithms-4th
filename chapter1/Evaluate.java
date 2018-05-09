package chapter1;

import java.util.Stack;
/*==============================================================
*
*name:Dijkstra双栈算术表达式求值算法
*
*input:String arithmetic fault access
*
*output:result 
*
*test:(1+((2+3)*(4*5)))
*
*test result:101.0
*===============================================================
*/
package chapter1;

import java.util.Stack;

public class Evaluate {

	public Double Dijkstra(String stdin) {
		int i = 0;
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		while(i != stdin.length()) {
			String s = String.valueOf(stdin.charAt(i));
			if     (s.equals("("))				   ;
			else if(s.equals("+")) 		ops.push(s);
			else if(s.equals("-")) 		ops.push(s);
			else if(s.equals("*")) 		ops.push(s);
			else if(s.equals("/")) 		ops.push(s);
			else if(s.equals("sqrt")) 	ops.push(s);
			else if(s.equals(")")) {
				String op = ops.pop();
				double v = vals.pop();
				if	   (op.equals("+")) 		v = vals.pop() + v;
				else if(op.equals("-"))			v = vals.pop() - v;
				else if(op.equals("*")) 		v = vals.pop() * v;
				else if(op.equals("/")) 		v = vals.pop() / v;
				else if(op.equals("sqrt")) 	v = Math.sqrt(v);
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

