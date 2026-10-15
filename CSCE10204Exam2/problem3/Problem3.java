package problem3;

public class Problem3 {

	public static void main(String[] args) {
		String str = "This is a test";
		char delim = ' ';
		String[] tokens;
		
		tokens = split(str,delim);
		showArray(tokens);
		

	}
	public static void showArray(String[] array) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<array.length;index++) {
			if(index!=0) {
				System.out.printf(",");
			}
			System.out.printf("%s", array[index]);
		}
		System.out.printf("]\n");
	}
	
	public static String[] split(String str, char delim) {
		
		int count = 1;
		for(int i =0; i< str.length(); i++) {
			if(str.charAt(i) == delim) {
				count++;
			}
		}
		String[] result = new String[count];
		int index = 0;
		String word = "";
		
		for (int i = 0; 1 < str.length(); i++) {
			if(str.charAt(i) == delim) {
				result[index] = word;
				index ++;
				word = "";
			} else {
				word = word + str.charAt(i);
				
			}
		}
		result [index] = word;
		
		return result;
	}

}
