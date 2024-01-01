import java.util.Arrays;

public  class Reverse{


public static int[] reverseList(int[] arrayNumber){
		int[] array1 = new int[arrayNumber.length];
		int number = arrayNumber.length - 1; 
	 for(int counter = 0;counter<arrayNumber.length;counter++){		
		 array1[number]=arrayNumber[counter];
		
		number-=1;
	}
		return array1;
	
	}
	public static void main(String[] arg){
		System.out.print(Arrays.toString(reverseList(new int[]{1,2,3,4,5,6,7,8,9})));

	}
}