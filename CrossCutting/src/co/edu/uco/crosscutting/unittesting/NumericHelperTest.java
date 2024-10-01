package co.edu.uco.crosscutting.unittesting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import co.edu.uco.crosscutting.helpers.NumericHelper;

public class NumericHelperTest {
	    @Test
	    public void testIsLessThan() {
	        assertTrue(NumericHelper.isLessThan(5, 10));
	        assertFalse(NumericHelper.isLessThan(10, 5));
	    }

	    @Test
	    public void testIsGreaterThan() {
	        assertTrue(NumericHelper.isGreaterThan(10, 5));
	        assertFalse(NumericHelper.isGreaterThan(5, 10));
	    }

	    @Test
	    public void testIsInRange() {
	        assertTrue(NumericHelper.isInRange(5, 0, 10, true, false));
	        assertFalse(NumericHelper.isInRange(10, 0, 10, false, false));
	    }

	    @Test
	    public void testIsPositive() {
	        assertTrue(NumericHelper.isPositive(5));
	        assertFalse(NumericHelper.isPositive(-5));
	    }

	    @Test
	    public void testIsNegative() {
	        assertTrue(NumericHelper.isNegative(-5));
	        assertFalse(NumericHelper.isNegative(5));
	    }
}

	
