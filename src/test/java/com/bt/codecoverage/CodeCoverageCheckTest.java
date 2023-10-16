package com.bt.codecoverage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CodeCoverageCheckTest {


	String input1 = "noon";
	
	CodeCoverageCheck codeCoverageCheck = new CodeCoverageCheck(); 
	boolean expected = true;

	@Test
	public void isPlaindromeTest() {
		assertEquals(expected, codeCoverageCheck.isPalindrome(input1));
	}
	
	
	  @Test public void isNotPlaindromeTest() { assertEquals(false,
	  codeCoverageCheck.isPalindrome("abc")); }
	 
	
	 @Test 
	  public void isNotPlaindromeExceptionTest() {
	  assertThrows(IllegalArgumentException.class, ()->{
	  codeCoverageCheck.isPalindrome(null) ;});
	  }
	
}
