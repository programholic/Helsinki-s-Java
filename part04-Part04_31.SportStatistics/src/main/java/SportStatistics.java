
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

   
        System.out.println("File: ");
        String file = scan.nextLine();
        
        System.out.println("Team: ");
        String team = scan.nextLine();
       
        
        try (Scanner fileScanner = new Scanner (Paths.get(file))){
            int count = 0;
            int wins = 0;
            int losses = 0;
            
            while (fileScanner.hasNextLine()){
                
                String data = fileScanner.nextLine();
                
                String [] parts = data.split(",");
                
                if (parts.length < 4 ){
                    continue;
                }
                
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.parseInt(parts[2]);
                int visitingTeamPoints = Integer.parseInt(parts[3]);
                
                
                if ( team.equalsIgnoreCase(homeTeam) || team.equalsIgnoreCase(visitingTeam)){
                   count++;
                }  
                
                if (team.equalsIgnoreCase(homeTeam)&& homeTeamPoints > visitingTeamPoints){
                    wins++;
                } 
                if (team.equalsIgnoreCase(homeTeam) && homeTeamPoints < visitingTeamPoints) {
                    losses++;
                }
                
                if (team.equalsIgnoreCase(visitingTeam) && visitingTeamPoints > homeTeamPoints) {
                    wins++;
                } 
                if (team.equalsIgnoreCase(visitingTeam) && visitingTeamPoints < homeTeamPoints){
                    losses++;
                }
                
                
                
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
       
    
    
    
    
    
    
    
    
    
    
    
    
    }

}
