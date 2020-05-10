package String;

public class ReverseVowels {
	String reverse(String s) {
		String vowls = "aeiouAEIOU";
		int left = 0;
		int right = s.length() - 1;
		
		String leftString = "";
		String rightString = "";
		while(left <= right){
			if(vowls.indexOf(s.charAt(left)) < 0) {
				leftString = leftString + s.charAt(left);
				++left;
			}else if(vowls.indexOf(s.charAt(right)) < 0) {
				rightString = s.charAt(right) + rightString;
				--right;
			}else if(vowls.indexOf(s.charAt(left)) >= 0 && s.indexOf(s.charAt(right)) >= 0 && left < right) {
				leftString = leftString + s.charAt(right);
				rightString = s.charAt(left) + rightString;
				++left;
				--right;
			} else {
				rightString = s.charAt(left) + rightString;
				--right;
			}
		}
		return (leftString + rightString);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseVowels obj = new ReverseVowels();
		System.out.println("Before: " + "leetcode");
		System.out.println("After: " + obj.reverse("leetcode"));
		
		int a =  3, b = 3, c = 3;
		a-= (b-- - --c);
		System.out.println(a + " " + b + " " + c);
	}

}
