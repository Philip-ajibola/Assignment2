public class EvenPosition{


	public  String checkEvenPosition(String[] array){
			String result = "";
			
		for(int count =1;count<array.length;count+=2){
			 result += ""+array[count]+" ";
			
			}
		return result;
	}
	public static void main(String[] arg){
		EvenPosition positionEven = new EvenPosition();
		String[] num = {"1","2","3","4","5","6","7","8","9"};
		String num2 = positionEven.checkEvenPosition(num);
			System.out.print(num2);	
		

	}

}