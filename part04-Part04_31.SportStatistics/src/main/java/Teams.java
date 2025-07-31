/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
class Teams {
private String homeTeam;
private String visitingTeam;
private int homeTeamScore;
private int visitingTeamScore;


public Teams (String team1, String team2, int score1, int score2){
    this.homeTeam = team1;
    this.visitingTeam = team2;
    this.homeTeamScore = score1;
    this.visitingTeamScore = score2;
}


    public String getHomeTeam() {
        return homeTeam;
    }

    public int getHomeScore() {
        return homeTeamScore;
    }
   
    public String getVisitingTeam() {
        return visitingTeam;
    }

    public int getVisitingScore() {
        return visitingTeamScore;
    }











    
}
