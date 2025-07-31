
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        
        
        
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};

        System.out.println(Arrays.toString(numbers));

        MainProgram.sort(numbers);
        
        System.out.println(Arrays.toString(numbers));
        
    }

    public static int smallest(int[] array){
         
        int smallest = array[0];
                    
        for (int i = 1; i < array.length; i++) {

            if (array[i] < smallest) {
                
                smallest = array[i];
            }

        }
        return smallest;
  
}
    
    public static int indexOfSmallest(int[] array) {

        int smallest = MainProgram.smallest(array);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int findSmallest = array[i];
            if (smallest == findSmallest) {
                index = i;
            }
        }

        return index;

    }
    
   public static int indexOfSmallestFrom(int[] array, int startIndex) {
 
     
       
       int smallest = array[startIndex];

       for (int i = startIndex; i < array.length; i++) {

           if (array[i] < smallest) {

               smallest = array[i];
           }

       }
       

       int index = 0;
       
       
       for (int i = startIndex; i < array.length; i++) {
           int findSmallest = array[i];
           if (smallest == findSmallest) {
               index = i;
           }
       }

       return index;

} 
   
   
   public static void swap(int[] array, int index1, int index2) {

       int temp = array[index1];
       array[index1] = array[index2];
       array[index2] = temp;  
}
  
  public static void sort(int[] array) {
      System.out.println(Arrays.toString(array));
      
      
      for (int i = 0; i < array.length; i++) {

          int indexOfSmallest = MainProgram.indexOfSmallestFrom(array, i);
          
          MainProgram.swap(array, i, indexOfSmallest);
          System.out.println(Arrays.toString(array));

      }   
}
   
   
}
