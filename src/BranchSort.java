import java.util.Scanner;

public class BranchSort {

    void sort(int arr[])
    {
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            
            for (int j = i+1; j < n; j++)
            {
                if (arr[j] < arr[min_idx])
                {
                    min_idx = j;
                }
            }
            
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        BranchSort ob = new BranchSort();
        
        Scanner s = new Scanner(System.in);	
		System.out.println("Enter size of array:");
		int n = s.nextInt();
		
		int[] a = new int[n];
		System.out.println("Enter array elements:");
		
		for(int i = 0;i < n;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println("Array before sorting:");
		
		ob.printArray(a);
			
		System.out.println("Array after sorting:");
		
		ob.sort(a);
		ob.printArray(a);
		
    }
}
