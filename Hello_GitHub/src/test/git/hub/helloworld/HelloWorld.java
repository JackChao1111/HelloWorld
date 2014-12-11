package test.git.hub.helloworld;

public class HelloWorld implements HelloInterface {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloInterface h= new HelloWorld();
		h.sayHello();
	}

	@Override
	public void sayHello() {
		System.out.println("HelloWorld");
	}

}
