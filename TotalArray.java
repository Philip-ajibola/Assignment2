public class TotalArray{

	public  int total(int[] array){
			int total = 0;
		for(int counter = 0;counter<array.length;counter++){
		total += array[counter]; 

		}
		return total;
	}

	public  double total(double[] array){
			double total = 0;
		for(int counter = 0;counter<array.length;counter++){
		total += array[counter]; 

		}
		return total;
	}
	public static void main(String[] args){
			TotalArray arrayTotal = new TotalArray();
		int []array = {87,68,94,100,83,78,85,91,76,87};
	System.out.print(arrayTotal.total(array));	

	}
}