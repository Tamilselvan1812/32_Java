package aug28.tasks;

public class ArraySort {
    public static void main(String[] args) {
        int[] ar = {5,2,9,1,7};
        
    for(int i=0;i<ar.length-1;i++)
    {
        for(int j = 0;j<ar.length-i-1;j++)
        {
            if(ar[j]>ar[j+1])
            {
                int temp = ar[j];
                ar[j] = ar[j+1];
                ar[j+1] = temp;            }
        }
    }
   
    for(int i : ar)
    {
        System.out.print(i+" ");
    }
}}