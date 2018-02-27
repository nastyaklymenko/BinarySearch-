
package binarysearch;


public class BinarySearch {

    
    public static int binarySearch(int array[], int left, int right, int x)
    {
        if (right>=left)
        {
            int middle = left + (right-left)/2;
            if (array[middle] == x)
               return middle;

            if (array[middle] > x)
               return binarySearch(array, left, middle-1, x);
            
            if (array[middle] < x)
               return binarySearch(array, middle+1, right, x);
        }
 
        
        return -1;
    }
    
    public static void main(String[] args) {
        
       
        int arr[] = {10,15,33,41,56,78,92,153};
        int size = arr.length;
        int x = 1;
        
        if (binarySearch(arr,0,size-1,x)== -1)
            System.out.println("There is no such element in this array");
        else
            System.out.println("Element was found at index " + binarySearch(arr,0,size-1,x));
        
    }
    
}
