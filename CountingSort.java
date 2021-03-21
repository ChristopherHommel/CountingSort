/**
 * An implementation of the counting sort algorithm
 *
 */
public class CountingSort {

	public static void main(String[] args) {

	}
	
	public void sort(int[] array) {
		//Set new minimum and maximum values
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		//Find the maximum and minimum values inside the array
		for(int i = 0; i < array.length; i++) {
			if(array[i] < minValue) {
				minValue = array[i];
			}
			
			if(array[i] > maxValue) {
				maxValue = array[i];
			}
			
		}
		//Send the array and the recalculated maximum and minimum values
		countingSort(array, minValue, maxValue);
	}
	
	public void countingSort(int[] array, int minValue, int maxValue) {
		//Set the size for a new array
		int size = maxValue - minValue + 1;
		//Create a new array of size
		int[] temp = new int[size];
		
		//While i is less than the array length 
		//write to that array values passed in from the array in the method call
		for(int i = 0; i < array.length; i++) {
			//Set the new counted values to each position
			//Creating n index and count for each total number of 
			//Value apperances
			temp[array[i] - minValue]++;
		}
		//While i and k are less than the size of the new array
		//and decrease count at each given position by 1 until there is nothing in the temp array
		//Write the sorted values to the original array
		for(int i = 0, k = 0; i < size; i++) {
			while(temp[i]-- > 0) {
				array[k++] = i + minValue;
			}
		}
	}

}
