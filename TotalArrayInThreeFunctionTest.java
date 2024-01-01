import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalArrayInThreeFunctionTest{


	@Test
	public void testAddAllElementInArrayListForTypeInt(){
			TotalArrayInThreeFunction arrayTotal = new TotalArrayInThreeFunction();
			int[] numbers = {45,60,76,89,54,23,67,80};
			int result = arrayTotal.totalForLoop(numbers);
			assertEquals(494,result);

	}
	@Test
	public void testAddAllElementInArrayListForTypeDouble(){
			TotalArrayInThreeFunction arrayTotal = new TotalArrayInThreeFunction();
			double[] numbers = {45.11,60.22,76.44,89.55,54.66,23.77,67.88,80.99};
			double result = arrayTotal.totalForLoop(numbers);
			assertEquals(498.62,result);

	}

	@Test
	public void testAddAllElementInArrayListForWhileLoopTypeInt(){
			TotalArrayInThreeFunction arrayTotal = new TotalArrayInThreeFunction();
			int[] numbers = {45,60,76,89,54,23,67,80};
			int result = arrayTotal.totalForWhile(numbers);
			assertEquals(494,result);

	}
	@Test
	public void testAddAllElementInArrayListForWhileLoopTypeDouble(){
			TotalArrayInThreeFunction arrayTotal = new TotalArrayInThreeFunction();
			double[] numbers = {45.11,60.22,76.44,89.55,54.66,23.77,67.88,80.99};
			double result = arrayTotal.totalForWhile(numbers);
			assertEquals(498.62,result);

	}
	@Test
	public void testAddAllElementInArrayListForDoWhileTypeInt(){
			TotalArrayInThreeFunction arrayTotal = new TotalArrayInThreeFunction();
			int[] numbers = {45,60,76,89,54,23,67,80};
			int result = arrayTotal.totalForDoWhile(numbers);
			assertEquals(494,result);

	}
	@Test
	public void testAddAllElementInArrayListForDoWhileTypeDouble(){
			TotalArrayInThreeFunction arrayTotal = new TotalArrayInThreeFunction();
			double[] numbers = {45.11,60.22,76.44,89.55,54.66,23.77,67.88,80.99};
			double result = arrayTotal.totalForDoWhile(numbers);
			assertEquals(498.62,result);

	}
}