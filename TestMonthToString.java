package math.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMonthToString {
	
	// Test Data
	
	String validMonthBoundaryLow, validMonthLow, validMonthMid, validMonthHigh, validMonthBoundaryHigh;
	int invalidMonthLow, invalidMonthHigh;
	MonthToString mts;
	
	@BeforeEach
	void setUp() throws Exception {
	
	validMonthBoundaryLow = "Jan";
	validMonthBoundaryHigh = "Dec";
	validMonthLow = "Mar";
	validMonthMid = "Jun";
	validMonthHigh = "Sept";
	
	invalidMonthLow = 0;
	invalidMonthHigh = 13;
	
	mts = new MonthToString();
	
	}

	@Test
	void testConvertNumericMonthToString() {
		
		assertEquals(validMonthBoundaryLow, MonthToString.convertNumericMonthToString(1));
		assertEquals(validMonthBoundaryHigh, MonthToString.convertNumericMonthToString(12));
		assertEquals(validMonthLow, MonthToString.convertNumericMonthToString(3));
		assertEquals(validMonthMid, MonthToString.convertNumericMonthToString(6));
		assertEquals(validMonthHigh, MonthToString.convertNumericMonthToString(9));
		
	}
	
	@Test 
	void testConvertNumericMonthToStringInvalidMonth() {
		
		Exception exp = assertThrows(NumberFormatException.class, () -> {
			MonthToString.convertNumericMonthToString(invalidMonthLow);
		});
		
		assertEquals("Invalid input", exp.getMessage());
		
		exp = assertThrows(NumberFormatException.class, () -> {
			MonthToString.convertNumericMonthToString(invalidMonthHigh);
		});
		
		assertEquals("Invalid input", exp.getMessage());
		
	}

}
