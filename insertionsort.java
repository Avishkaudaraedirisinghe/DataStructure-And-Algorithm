package InsertionSort;

public class insertionsort {



		    public static void main(String[] args) {
		        // Initialize the array
		        int arr[] = {5, 4, 3, 2, 1};
		        
		      
		        insertionSort(arr);
	
		        for (int i = 0; i < arr.length; i++) {
		            System.out.print(arr[i] + " ");
		        }
		    }
		    
	
		    public static void insertionSort(int[] arr) {
		        int n = arr.length;
		        for (int i = 1; i < n; ++i) {
		            int key = arr[i];
		            int j = i - 1;
		            
		       
		            while (j >= 0 && arr[j] > key) {
		                arr[j + 1] = arr[j];
		                j = j - 1;
		            }
		            arr[j + 1] = key;
		        }
		    }
	

	}

