package javafunctions;

import org.testng.annotations.Test;

public class PS1 extends PS {

	@Test
	public void testRun() {
		int a = 3;
		doThis(); // present in parent class PS

		PS2 ps2 = new PS2(a); //calling by creating object
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		
		//PS3 ps3 = new PS3(a); 
		System.out.println(ps2.multiplybyThree());
	}

}
