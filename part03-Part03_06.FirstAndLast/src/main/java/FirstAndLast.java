
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        
        int lastIndex = list.size() - 1;
        String lastValue = list.get(lastIndex);
        
        String firstValue= list.get(0);
        
        System.out.println(firstValue);
        System.out.println(lastValue);
    }
}
