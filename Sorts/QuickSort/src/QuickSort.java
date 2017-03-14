import java.util.Random;

public class QuickSort {
	Random r = new Random();
	
	public static void main( String args[] ) {
		
	}
	
	public int[] quickSort( int[] array, int a, int b ) {
		if( a < b ) {
			int q = partition( array, a, b );
			quickSort( array, a, q-1 );
			quickSort( array, q+1, b );
		}
		return array;
	}
	
	public int partition( int[] array, int a, int b ) {
		int pivot = r.nextInt(b-a)+a;		// Allocation of pivot.
		array = swap( array, pivot, b );	// Swapping of pivot and last element.
		int i = a-1;						// All elements with index < i, array[n] <= pivot.
		for( int j = a; j <= b-1; j++ ) {	// 
			if( array[j] <= array[b] ) {	// Checks if value is smaller than pivot.
				i++;						
				array = swap( array, i, j );
			}
		}
		array = swap( array, i+1, b );		// Swaps pivot and last element.
		return i+1;
	}
	
	public int[] swap( int[] array, int a, int b ) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return array;
	}
}
