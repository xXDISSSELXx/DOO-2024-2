package co.edu.uco.crosscutting.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uco.crosscutting.helpers.ObjectHelper;

class HelpersUnitTestCase {

	@Test
	void givenWantValidateIfObjectNullWhenObjectIsNullThenResultIsTrue() {
		// Arrange: Initial Context
		String object = null;
		
		// Act: Execute action
		boolean result = ObjectHelper.isNull(object);
		
		//Assert: Validate result
		assertTrue(result);
		
	}
	@Test
	void givenWantValidateIfObjectIsNotNullWhenObjectIsNotNullThenResultIsFalse() {
		// Arrange: Initial Context
		var object = " ";
		
		// Act: Execute result 
		boolean result = ObjectHelper.isNull(object);
		
		//Assert: Validate result
		assertFalse(result);
	}
	@Test
	void givenWantGetOriginalValueWhenObjectIsNotNullThenResultIsTheSameObject() {
		// Arrange: Initial Context
		var object = "Casa";
		var defaultValue= "Default";
		
		// Act: Execute result 
		var result = ObjectHelper.getDefault(object,defaultValue);
		
		//Assert: Validate result
		assertEquals(object,result);
	}
	@Test
	void givenWantGetDefaultValueWhenObjectIsNullThenResultIsDefaultObject() {
		// Arrange: Initial Context
		String object = null;
		var defaultValue= "Default";
		
		// Act: Execute result 
		var result = ObjectHelper.getDefault(object,defaultValue);
		
		//Assert: Validate result
		assertEquals(defaultValue,result);
	}
	
	

}
