import java.util.Arrays;

public class StringIsPalinDrome{



	public  boolean checkIfStringIsPalinDrome(String[] name){
			String theName ="";
			String theName2 ="";
			int count;
			boolean condition;
		for(count =0;count<name.length;count++){
			for(int i =name[count].length()-1;i>-1;i--){
			 theName +=""+name[count].charAt(i);	
				}
				System.out.println("the reverse of the String is "+theName);
				for(int i = 0;i<name[count].length();i++){
			 theName2 +=""+name[count].charAt(i);	
				}
				System.out.println("the Actual String is "+theName2);
			break;
		}
		
		 condition = theName.equals(theName2);
		return condition;
	}
		
		public static void main(String[] args){
			StringIsPalinDrome checkStringPalindrome = new StringIsPalinDrome();
			String[] name = new String[]{"goat"};
			 boolean condition =  checkStringPalindrome.checkIfStringIsPalinDrome(name);
		if(condition){
			System.out.print("The String Is A Palindrome");
			}else{
			System.out.print("The String Is Not A Palindrome");
			}

		}


}