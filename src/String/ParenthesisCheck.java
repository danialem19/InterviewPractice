package String;

import java.util.Stack;

public class ParenthesisCheck {
	static class Parentheis{
		int parenthesis(String str) {
			int max = 0;
			int counter = 0;
			Stack<Character> st = new Stack();
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if(st.isEmpty()) {
					max = 0;
					st.push(c);
				} else if(c != st.peek()) {
					st.pop();
					counter++;
				} else {
					st.push(c);
				} 
				if(counter > max) {
					max = counter;
				}
			}
			return max;
		}	
	}
	
	public static void main(String[] args) {
		String parenthesis = "()()()()(){{{{{}}}}}";
		Parentheis p = new Parentheis();
		System.out.println(p.parenthesis(parenthesis));
	}
}