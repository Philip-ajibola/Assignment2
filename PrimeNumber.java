import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args){
	    Scanner input= new Scanner(System.in);
		
	System.out.print("Enter A Positive Integer: ");
		int num = input.nextInt();
		int count = 1;
		int factor = 0;

		if(num>0){
			while(count<=num){
				if(num%count==0){
				     factor++;
				}
				count++;
			}
				if(factor == 2){
					System.out.print(num+" Is A Prime Number ");
				}else{
					System.out.print(num+" Is Not A Prime Number");
				}
		
		}else{
			System.out.print("The Number You Enter Is A Negative Integer");

		}


	}





}