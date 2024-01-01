import java.util.Scanner;

public class CreditCardValidatorTest{

	public static void main(String[] args){
		CreditCardValidator1 validator = new CreditCardValidator1();
		Scanner input = new Scanner(System.in);
		
			System.out.println("Hello, Kindly Enter Card Details To Verify ");
				String theCardNumber = input.next();	
				validator.setCardNumber(theCardNumber);
				validator.setCardNumber2(theCardNumber);
				if(theCardNumber.length()==13 || theCardNumber.length()==16){
					validator.setNumber();
					validator.displayCreditCardInfo();
				
				}
				else{
					validator.displayCreditCardInfo2();
				}
	}





}