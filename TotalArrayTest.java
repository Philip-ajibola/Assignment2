import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalArrayTest{


	@Test
	public void testAddAllElementInArrayListForTypeInt(){
			TotalArray arrayTotal = new TotalArray();
			int[] numbers = {45,60,76,89,54,23,67,80};
			int result = arrayTotal.total(numbers);
			assertEquals(494,result);

	}
	@Test
	public void testAddAllElementInArrayListForTypeDouble(){
			TotalArray arrayTotal = new TotalArray();
			double[] numbers = {45.11,60.22,76.44,89.55,54.66,23.77,67.88,80.99};
			double result = arrayTotal.total(numbers);
			assertEquals(498.62,result);

	}


}