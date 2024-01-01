import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoArrayListTest{

	@Test
	public void testConcantinationOfTwoArrayList(){
		TwoArrayList arrayList = new TwoArrayList();

		String[] array = {"a","b","c"};
		String[] array1 = {"1","2","3"};
		String[] result = {"a","1","b","2","c","3"};
		String[] expectedResult = arrayList.concantinateTwoArrayList(array,array1); 
		assertArrayEquals(result,expectedResult);



	}




}
