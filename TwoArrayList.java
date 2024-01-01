import java.util.Arrays; 

public class TwoArrayList{



	public String[] concantinateTwoArrayList(String[] array,String[] array1){
			String[] array2 = new String[array.length+array1.length];
			int num = array2.length-1;
			int num1 = 1;
			int num2 = 0;


			       for(int count =0;count<array.length;count++){
						array2[num2] = array[count];
						num2+=2;	
				}

				for( int counter1 =0;counter1<array1.length;counter1++){
						array2[num1] = array1[counter1];
						num1+=2;
				}
		
			return array2;					
	}

		public static void main(String[] args){
			TwoArrayList arrayList = new TwoArrayList();
			String[] name = new String[]{"a","b","c"};
			String[] name2 = new String[]{"1","2","3","4"};

			String[] name3 = arrayList.concantinateTwoArrayList(name,name2);		
	
		System.out.print(Arrays.toString(name3));
		}
}