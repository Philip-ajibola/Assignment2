
public class OddPosition{


	public  String checkOddPosition(String[] array){
			String result = "";
		for(int count = 0;count<array.length;count+=2){
			 result += ""+array[count]+" ";
			}
		return result;
	}
	public static void main(String[] arg){
		OddPosition position = new OddPosition();
		String[] num = {"1","2","3","4","5","6","7","8","9"};
		String num2 = position.checkOddPosition(num);
			System.out.print(num2);	
		

	}

}