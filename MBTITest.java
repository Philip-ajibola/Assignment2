import java.util.Scanner;

public class MBTITest{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		MBTI myPersonalities = new MBTI();

	System.out.println("What's Your Name");
		String name = input.nextLine();
		myPersonalities.setName(name);
		myPersonalities.displayQuestionAndResult();
	}



}