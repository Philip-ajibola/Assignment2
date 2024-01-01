import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CheckElementTest{

	@Test
	public void testCheckIfElementIsInTheListOfArray(){

		int[] number = {1,2,0,4,5};
		int check = 0;
		boolean checkElementExist = CheckElement.checkElementInList(number,check);
		assertTrue(checkElementExist);


		int[] number2 = {1,2,0,4,5};
		int check2 = 7;
		boolean checkElementExist1 = CheckElement.checkElementInList(number2,check2);
		assertFalse(checkElementExist1);

	}




}
