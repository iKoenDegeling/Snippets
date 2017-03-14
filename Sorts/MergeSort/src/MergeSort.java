import java.util.Random;

public class MergeSort {
	Random r = new Random();
	
	public static void main( String args[] ) {
		MergeSort m = new MergeSort();
		int[] A = new int[500];
		for( int x = 0; x < 500; x++ ) {
			A[x] = m.r.nextInt(500);
		}
		m.mergeSort( A, 0, 500 );
		for( int x : A ) {
			System.out.print( A[x] + " " );
		}
	}
	
	public int[] mergeSort( int[] array, int a, int b ) {
		if( a < b ) {
			int median = (a+b)/2;
			mergeSort( array, a, median );
			mergeSort( array, median+1, b );
			merge( array, a, median, b );
		}
		return array;
	}
	
	public void merge( int[] array, int a, int median, int b ) {
		int[] L = new int[median-a];
		for( int x = 0; x < median+1; x++ ) {
			L[x] = array[x];
		}
		L[median] = Integer.MAX_VALUE;
		int[] R = new int[b-(median)];
		for( int x = 0; x < b-median-1; x++ ) {
			R[x] = array[x];
		}
		R[b-median-1] = Integer.MAX_VALUE;
		int i = a;
		int j = median+1;
		for( int x = 0; x < array.length; x++ ) {
			if( L[i] < R[j] ) {
				array[x] = L[i];
				i++;
			} else {
				array[x] = R[j];
				j++;
			}
		}
	}
	
	
}
