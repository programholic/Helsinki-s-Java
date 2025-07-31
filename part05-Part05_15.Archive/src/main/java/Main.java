
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Archive> archives = new ArrayList<>();
        
       while (true){
           System.out.println("Identifier? (empty will stop)");
           String code = scanner.nextLine();
           
           if (code.isEmpty()){
               break;
           }
           
           System.out.println("Name? (empty will stop)");
           String name = scanner.nextLine();
           if (name.isEmpty()){
               break;
           }
           
           Archive archive = new Archive(code,name);
           
            if (!archives.contains(archive)) {
                archives.add(archive);
            }


           }
           
        System.out.println("==Items==");
        for (Archive arch : archives) {
            System.out.println(arch);
        }

        
        //  the output was expected to contain the string: "identifier: item5"

    }
}
