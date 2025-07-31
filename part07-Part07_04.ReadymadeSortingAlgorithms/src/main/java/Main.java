
import java.util.*;


public class Main {

    public static void main(String[] args) {
        // insert test code here
  
        
                int[] intArray = {5, 3, 8, 1, 2};
        sort(intArray);
        System.out.println("Sorted int array: " + Arrays.toString(intArray));
        
        String[] strArray = {"banana", "apple", "cherry", "date"};
        sort(strArray);
        System.out.println("Sorted string array: " + Arrays.toString(strArray));
        
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2));
        sortIntegers(intList);
        System.out.println("Sorted integer list: " + intList);
        
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("banana", "apple", "cherry", "date"));
        sortStrings(strList);
        System.out.println("Sorted string list: " + strList);
    
        
        
        
        
    }


    public static void sort(int[] array){
        Arrays.sort(array);
    }
    
    public static void sort(String[] array){
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }
    
    
    
}
    



/*
public static void sort(int[] array) that sorts an array of integers.

public static void sort(String[] array) that sorts an array of strings.

public static void sortIntegers(ArrayList<Integer> integers) that sorts a list of integers.

public static void sortStrings(ArrayList<String> strings) that sorts a list of strings.
*/
