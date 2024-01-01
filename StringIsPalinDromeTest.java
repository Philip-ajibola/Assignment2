import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StringIsPalinDromeTest{

	@Test
	public void testCheckIfStringIsPalinDrome(){
		StringIsPalinDrome checkString = new StringIsPalinDrome();
		String[] number = {"dad"};
		boolean checkStringIsPalinDrome = checkString.checkIfStringIsPalinDrome(number);
		assertTrue(checkStringIsPalinDrome);


		String[] number2 = {"mummy"};
		boolean checkStringIsPalinDrome2 = checkString.checkIfStringIsPalinDrome(number2);
		assertFalse(checkStringIsPalinDrome2);

	}




}
