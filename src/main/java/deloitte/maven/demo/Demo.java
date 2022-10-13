package deloitte.maven.demo;

interface Int1 {

	public abstract void m1();
}

public class Demo {

	public static void main(String[] args) {

		Int1 obj = () -> System.out.println("m1 implemented");

		obj.m1();

	}

}
