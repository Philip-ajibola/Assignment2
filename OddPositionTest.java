import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddPositionTest{

	@Test
	public void testForElementInOddPositionInArrayList(){
		OddPosition position = new OddPosition();
		String[] number = {"1","2","3","4","5"};
		String check ="1 3 5 ";
		String result = position.checkOddPosition(number);
			assertEquals(check,result);

	}




}
