
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
    


        int index = 0;
        while (index < array.length) {
            int value = array[index];
            int stars = 0;
            while (stars < value) {
                System.out.print("*");
                stars++;
            }
            System.out.println("");
            index++;

        }

    }

}
