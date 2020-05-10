package LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

public class Palindrom {
	static class Employee {
	    private String name;

	    public Employee(final String name) {
	        this.name = name;
	    }

	    public void who() {
	        System.out.println(this.name);
	    }
	}
	static class MyConsole {
	    public void who() {
	        final Employee e = new Employee("john");
	        who(e);
	        e.who();
	    }

	    private void who(Employee e) {
	        e = new Employee("mary");
	        e.who();
	    }
	}
	
	public static void main(String[] args) {
	    final MyConsole console = new MyConsole();
	    console.who();
	}
	
}
