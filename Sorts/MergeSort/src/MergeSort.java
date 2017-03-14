import java.lang.reflect.Array;
import java.util.Random;

public class MergeSort {
	Random r = new Random();
	
	public static void main( String args[] ) {

	}
	
	public int[] mergeSort(int[] array) {
		if(array.length==1) {
                    return array;
                } else {
                    int[] left = new int[array.length/2+1];
                    System.arraycopy(array, 0, left, 0, array.length/2+1);
                    int[] right = new int[(array.length/2)];
                    System.arraycopy(array, array.length/2+1, right, 0, array.length/2);
                    left = mergeSort(left);
                    right = mergeSort(right);
                    return merge(left, right);
                }
	}
	
	public int[] merge(int[] left, int[] right) {
            int i = 0, j = 0;
            
            while(i+j < left.length+right.length) {
                
            }
            return null;
	}
	
	
}
