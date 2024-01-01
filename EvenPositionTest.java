import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenPositionTest{

	@Test
	public void testForElementInOddPositionInArrayList(){

		String[] number = {"1","2","3","4","5"};
		String check ="2 4 ";
		String result = EvenPosition.checkEvenPosition(number);
			assertEquals(check,result);

	}




}
