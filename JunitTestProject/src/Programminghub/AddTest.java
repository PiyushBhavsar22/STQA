package Programminghub;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		JunitClass junit=new JunitClass();
		int result=junit.add(300, 200);
		assertEquals(500, result);
	}

}
