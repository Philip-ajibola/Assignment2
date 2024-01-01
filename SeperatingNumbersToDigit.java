import java.util.Arrays;

public class SeperatingNumbersToDigit{




	public int[] SeperateDigitIntoArrayList(int number){
		String number1 = "" + number;
		int num = number1.length();
		int[] array = new int[num];
		int num1 = num-1;
		int divider = (int)Math.pow(10,num1);

		for(int count = 0;count<array.length;count++){
			array[count] = number/divider;
			number = number%divider;
			divider = divider/10;
		}		
	
			return array;
	}
	
	public static void main(String[] args){
		SeperatingNumbersToDigit seperateNumber = new SeperatingNumbersToDigit();
		int number = 12345;
		int[] array = seperateNumber.SeperateDigitIntoArrayList(number);
		
		System.out.print(Arrays.toString(array));

	}


}