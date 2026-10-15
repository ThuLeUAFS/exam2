package problem2;

public class Problem2 {

	public static void main(String[] args) {
		int[] array1 = {1,1,1,1,1};
		int[] array2 = {2,2,2,2,2};
		int[] result;
		
		result = interleave(array1,array2);
		showArray(result);
		

	}
	public static void showArray(int[] array) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<array.length;index++) {
			if(index!=0) {
				System.out.printf(",");
			}
			System.out.printf("%d", array[index]);
		}
		System.out.printf("]\n");
	}
	
	public static int[] interleave(int[] array1, int[] array2) {
		int[] result = new int[array1.length + array2.length];
		int index = 0;
		for (int i = 0; 1 < array1.length; i ++) {
			result[index] = array1[i];
			index ++;
			result[index] = array2[i];
			index++;
			
		}
		return result;
		
		
	}

}
