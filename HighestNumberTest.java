import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestNumberTest{


	@Test
	public void testHighestNumberInListOfArray(){
		HighestNumber highest = new HighestNumber();
		int[] biggest = {-10,56,-70,-89,23,-67,-34,-87,-55,-78};
		int maximum = highest.highestValue(biggest); 
		assertEquals(56,maximum);
				
	}

	@Test
	public void testHighestNumberInTheListOfArrayForTypeDouble(){
		HighestNumber highest = new HighestNumber();
		double[] biggest = {11.23,45.6,67.8,99.7,67.8,89.5};
		double maximum = highest.highestValue(biggest);
		assertEquals(99.7,maximum);
	}



}