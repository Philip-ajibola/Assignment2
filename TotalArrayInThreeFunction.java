public class TotalArrayInThreeFunction{

	public  int totalForLoop(int[] array){
			int total = 0;
		for(int counter = 0;counter<array.length;counter++){
		total += array[counter]; 

		}
		return total;
	}

	public  double totalForLoop(double[] array){
			double total = 0;
		for(int counter = 0;counter<array.length;counter++){
		total += array[counter]; 

		}
		return total;
	}
		public  int totalForWhile(int[] array){
			int total = 0;
			int count = 0;
		while(count<array.length){
		total += array[count]; 
		count++;
		}
		return total;
	}

	public  double totalForWhile(double[] array){
			double total = 0;
			int count = 0;
		while(count<array.length){
		total += array[count]; 
		count++;
		}
		return total;
	}

	public  int totalForDoWhile(int[] array){
			int total = 0;
			int count = 0;
		do {
		total += array[count]; 
		count++;
		}while(count<array.length);
		return total;
	}

	public  double totalForDoWhile(double[] array){
			double total = 0;
			int count = 0;
				do {
		total += array[count]; 
		count++;
		}while(count<array.length);
		return total;
	}


	public static void main(String[] args){
			TotalArrayInThreeFunction arrayTotal = new TotalArrayInThreeFunction();
		int []array = {87,68,94,100,83,78,85,91,76,87};
	System.out.println(arrayTotal.totalForLoop(array));
		int []array1 = {87,68,94,100,83,78};
	System.out.println(arrayTotal.totalForWhile(array1));	
		int []array2 = {87,68,94,100,83,78,85,91};
	System.out.println(arrayTotal.totalForDoWhile(array2));	
		double []array3 = {87.1,68.2,94.3,100.4,83.5,78.6,85.7,91.8};
	System.out.printf("%.1f",arrayTotal.totalForDoWhile(array3));	

	

	}
}