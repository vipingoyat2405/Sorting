
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={3,60,35,2,45,320,5};  
		int n = arr.length; 
		System.out.println("Array Before Bubble Sort");
		
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  

	}
         System.out.println();
         System.out.println("Array After Bubble Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " "); 
	}

}
}
