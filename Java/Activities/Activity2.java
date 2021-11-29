package fst_b17;

public class Activity2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10,77,20,54,-11,10};
		int sum=0;
		
		for(int i:array) {
			if(i == 10)
				sum = sum + 10;		
		}
		
		if(sum==30)
			System.out.println("Sum of all 10s in the array is equal to 30.");
		else
			System.out.println("Sum of all 10s in the array is not equal to 30.");
		
	}

}
