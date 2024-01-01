public class CheckElement{


	public  boolean checkElementInList(int[] array, int element){
			
		for(int count = 0;count<array.length;count++){
			if(array[count] != 0 && array[count]== element){
				return true;
			}
			
		}
		return false;
	}

	public static void main(String[] args){
		CheckElement elementCheck = new CheckElement();

		int[] array = {1,2,3,4,5};
		int check = 5;
		boolean condition = elementCheck.checkElementInList(array,check);
		if(condition){
			System.out.print("the element is present");
		}else{
			System.out.print("the element is not present");

		}


	}



}