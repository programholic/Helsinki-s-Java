

public class FromOneToParameter {

    public static void main(String[] args) {

        printUntilNumber(5);           

    }
    public static void printUntilNumber (int number) {
        int x = 1;
        while (x <= number) {
            System.out.println(x);
            x++;
        }
                
    }
}