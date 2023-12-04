import java.util.Scanner;

public class RaisedToPower{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
		int number1 = input.nextInt();

	System.out.print("Enter another number: ");
		int number2 = input.nextInt();
		int totalNumber1 = 1;
		int totalNumber2 = 1;
		int count = 1;
		int counter = 1;
	while(count<=number2){
		totalNumber1*=number1;
		count++;
	}
	while(counter<=number1){
		totalNumber2*=number2;
		counter++;
	}
	
		System.out.printf(" %d Raised To Power %d = %d\n",number1,number2,totalNumber1);

		System.out.printf("While %d Raised To Power %d = %d",number2,number1,totalNumber2);



	}




}