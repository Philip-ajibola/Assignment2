import java.util.Scanner;
public class TotalPositiveTotalNegativeAndTotalZero{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);




		int totalPositive = 0;
		int totalNegative = 0;
		int totalZero= 0;
		int count = 0;
		System.out.println();
	System.out.print("Enter a number, enter any alphabet to end input ");
	while(input.hasNextInt()){
		int number = input.nextInt();
		if( number>0){
			totalPositive+=1;
		}
		else if(number<0){
			totalNegative+=1;
		}
		else if(number==0){
			totalZero +=1;
		}
			System.out.print("Enter a number, enter any alphabet to end input ");
				
			count++;
				}
	
	 	if(count!=0){
		System.out.printf("The Total Positive Number You Inputed is %d%n",totalPositive);
		System.out.printf("The Total  Negative Number You Inputed is %d%n",totalNegative);
		System.out.printf("The Total   Zero Number You Inputed is %d%n",totalZero);
		}
		
		if(count==0){
			System.out.println("No Values Was Entered ");
			System.out.println();
			}
		
		
		}

	}


