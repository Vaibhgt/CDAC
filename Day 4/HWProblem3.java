import java.util.Scanner;
import java.util.Arrays;

/*
3. Search an element in a sorted and rotated array.

		Example: 

		Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};		//array is sorted but rotated at 1(index 6)
			 key = 3
		Output : Found at index 8

		Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};		//array is sorted but rotated at 1(index 6)
			 key = 30
		Output : Not found

		Input : arr[] = {30, 40, 50, 10, 20}					//array is sorted but rotated at 10(index 3)
			key = 10   
		Output : Found at index 3
		
		Here we required modified binary search........
*/

class HWProblem3{
	
	static int key;
	public static int BSearch(int arr[],int x,int left,int right){
		
		while(left <= right){
			int mid = (left + right)/2;
			
			if(key == arr[mid]){
			
				System.out.println("condition : key == arr[mid]  ==> true"); 
				return mid; 
			}
			
			//====searching in left subarray=======>
			
			else if(arr[left] < arr[mid]){ //checking left subarray is sorted or not
				
				if(key >= arr[left] && key < arr[mid]){ 
					System.out.println("condition : key >= arr[left] && key < arr[mid] ====> true");
					right = mid - 1; 
					
				}
				else
					left = mid + 1; 
			}
			
			//====searching in right subarray=======>
			
			else {
				if(key > arr[mid] && key <= arr[right]){	//checking right subarray is sorted or not
				System.out.println("condition : key > arr[mid] && key <= arr[right] ====> true");
				left = mid + 1;
				}
				else 
					right = mid - 1;
			}
		}
		return -1;
		
	}
	public static void main(String...args){
		int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};	//array is sorted but rotated at 1(index 6)
		System.out.println("Array is : "+Arrays.toString(arr));
		//key = 33;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter key to be searched : ");
		key = sc.nextInt();
		int n = arr.length - 1;
		int res = BSearch(arr,key,0,n);
		
		if(res == -1){
			System.out.println("\nResult : Element not found.");
		}
		else{
			System.out.println("\nResult : Element found at an index = "+res);
		}
	} 
}