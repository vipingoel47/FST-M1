package fst_b17;
import java.util.Arrays;
public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numList = {4,3,2,10,12,1,5,6};
		System.out.println("Unsorted number list: " + Arrays.toString(numList));
		
		int temp = 0;
		
		for(int i=0;i<numList.length;i++) {
			for(int j=i+1;j<numList.length;j++) {
				if(numList[i]>numList[j]) {
					temp=numList[i];
					numList[i] = numList[j];
					numList[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted number list: " + Arrays.toString(numList));
	}
}
