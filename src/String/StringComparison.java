package String;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		String me = "Daniel";
		String yu = "Daniel";
		String hu = new String("Daniel");
		String zu = new String("Daniel");

		if(me == yu) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		if(me.equals(yu)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		if(yu.equals(hu)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		if(zu.equals(hu)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}

		if(zu == hu) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}

	}

}
