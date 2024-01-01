public class HighestNumber{
	
	public int highestValue(int []array){
		int maximum = array [0];
		for(int counter = 0;counter<array.length;counter++){
			if(array[counter]>maximum){
				maximum = array[counter];
			
			}	
		}


		return maximum;


	}

	public double highestValue(double []array){
		double maximum = array [0]; 
		for(int counter = 0;counter<array.length;counter++){
			if(array[counter]>maximum){
				maximum = array[counter];
			
			}	
		}


		return maximum;

	}

	public static void main(String[] arg){
		HighestNumber highest = new HighestNumber();
		System.out.print(highest.highestValue(new int[]{1,2,3,4,5,6,7,8,9}));

	}

}