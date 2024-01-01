import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;


public class SeperatingNumbersToDigitTest{


	@Test
	public void testTheFuctionInSeperatingNumberToDigitAndStoreThemInArray(){
		SeperatingNumbersToDigit seperateNumber = new SeperatingNumbersToDigit();
			
		int number = 654321;
		int[] result = seperateNumber.SeperateDigitIntoArrayList(number);
		int[] check = {6,5,4,3,2,1};
		assertEquals(Arrays.toString(check),Arrays.toString(result));






	}





}