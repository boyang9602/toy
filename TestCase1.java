package toy;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

public class TestCase1 {

	// ADD@Test
	public void test1() {
		
	}

	// DEL@Test
	@Test
	public void test2() {
		
	}

	//DEL@Ignore
	@Ignore
	@Test
	public void test3() {
		
	}

	// CO@Test
	@Test
	public void test4() {
		
	}

	//UNCO@Test
	//@Test
	public void test5() {
		
	}

	// UNCO@Ignore
	//@Ignore
	@Test
	public void test6() {
		
	}

//	@Test
//	public void test7() {
//		
//	}
/*
	@Test
	public void test8() {
		
	}
*/
	// change @Test params, testng case
	@Test(enabled=false)
	public void test9() {
		
	}

	// DEL test case
	@Test
	public void test10() {
		
	}

	// CO test case
	@Test
	public void test11() {
		
	}

	// no change
	@Test
	public void test12() {
		
	}
	
	@Test void test14() {
		
	}
}
