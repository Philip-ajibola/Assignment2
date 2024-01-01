import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseTest{

	@Test
	public void testReverseInArrayList(){
		Reverse reverse = new Reverse();

		int[] number = {1,2,3,4,5};
		int[] number1 = {5,4,3,2,1};
		int[] result = reverse.reverseList(number); 
		assertArrayEquals(number1,result);



	}




}
