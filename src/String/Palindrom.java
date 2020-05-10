package String;

public class Palindrom {
	
	boolean isPalindrom(String str, int left, int right) {
		
		if(left >= right) {
			return true;
		}
		
		if(str.charAt(left) != str.charAt(right)) {
			return false;
		}
		
		return isPalindrom(str, ++left, --right);
	}
	
	
	public static void main(String[] args) {
		Palindrom p = new Palindrom();
		System.out.println(p.isPalindrom("asdasd", 0, 5));
		System.out.println(p.isPalindrom("asRsa", 0, 4));
	}
}
