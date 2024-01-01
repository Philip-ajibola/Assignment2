import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoArrayList2Test{

	@Test
	public void testConcantinationOfTwoArrayList2(){
		TwoArrayList2 arrayList = new TwoArrayList2();

		String[] array = {"a","b","c"};
		String[] array1 = {"1","2","3"};
		String[] result = {"a","b","c","1","2","3"};
		String[] expectedResult = arrayList.concantinateTwoArrayList2(array,array1); 
		assertArrayEquals(result,expectedResult);



	}




}
