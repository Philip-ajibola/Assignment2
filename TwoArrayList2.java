import java.util.Arrays; 

public class TwoArrayList2{



		public String[] concantinateTwoArrayList2(String[] array,String[] array1){
			String[] array2 = new String[array.length+array1.length];
			int num = array2.length-1;
			int num2 =num-array1.length;

		for(int counter =array2.length-1;counter>=0;counter--){
				if(counter>=0 && counter<array1.length){
				array2[num] = array1[counter];
				num--;
				}
			
			for(int count1 =array.length-1;count1>=0;count1--){
				if(num2!=-1){
					if(counter>array1.length && counter<array2.length){
						array2[num2] = array[count1];
						num2--;
					}
			    	}
			}
				
		}
					
			return array2;					
		}

		public static void main(String[] args){
			TwoArrayList2 arrayList = new TwoArrayList2();
			String[] name = new String[]{"a","b","c","d","e"};
			String[] name2 = new String[]{"1","2","3","4"};

			String[] name3 = arrayList.concantinateTwoArrayList2(name,name2);		
	
		System.out.print(Arrays.toString(name3));
		}
}