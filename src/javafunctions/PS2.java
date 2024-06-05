package javafunctions;

public class PS2 extends PS3 {

	int a;

	public PS2(int i)  //Parameterized Constructor
	{
		super(i); //Parent class constructor is invoked
		this.a=i;
	}

	public int increment() {
		a = a + 1;
		return a;
	}
	
	public int decrement() {
		a = a - 1;
		return a;
	}
}
