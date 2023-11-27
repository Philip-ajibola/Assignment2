import java.util.Scanner;

public class Factors{
	public static void main(String[] args){
	    Scanner input= new Scanner(System.in);
		
	System.out.print("Enter A Positive Integer: ");
		int number = input.nextInt();
		int count = 1;
   
       while(count<=number){
		if(number%count==0){
			System.out.print(" "+count);
		}
			count++;

	}
		System.out.print(" Are the factors of "+number);


	}


}