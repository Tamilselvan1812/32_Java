package aug28.tasks;

public class ArrayAdd {
    public static void main(String[] args) {
        
        int [] ar1 = {10,20,30,40};
        int [] ar2 = new int[ar1.length+1];
        int pos = 2;
        
        
        for(int i = 0;i<pos;i++)
        {
            ar2[i] = ar1[i];
        }
        
       ar2[pos] = 50;
       
       for(int i = pos;i<ar1.length;i++)
       {
           ar2[i+1] = ar1[i];
           }
          for ( int i : ar2)
        {
              System.out.print( i + " ");
        }
    }
}
