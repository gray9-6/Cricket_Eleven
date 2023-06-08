package Dream.Eleven;

import java.util.Scanner;

public class Creating_team {
    Best_Eleven_Team bestElevenTeam = new Best_Eleven_Team();

    Scanner sc = new Scanner(System.in);

    public void team_Created(){
        // Batsman
        System.out.println("Enter the no. of batsman you want in your team");
        int batsmanWant = sc.nextInt();

        // Wicket Keeper
        System.out.println("Enter the no. of wicket Keeper you want in your team");
        int wicketKeeperWant = sc.nextInt();

        // AllRounder
        System.out.println("Enter the no. of AllRounder you want in your team");
        int allRounderWant = sc.nextInt();

        // Bowler
        System.out.println("Enter the no. of bowler you want in your team");
        int bowlerWant = sc.nextInt();

        if(batsmanWant + wicketKeeperWant + allRounderWant + bowlerWant == 11){
            bestElevenTeam.batsMan(batsmanWant);

            bestElevenTeam.wicketKeeper(wicketKeeperWant);


            bestElevenTeam.wicketKeeper(allRounderWant);


            bestElevenTeam.bowler(bowlerWant);

            int totalPlayer = bestElevenTeam.totalPlayerCount;
            System.out.println("Total Player Selected is - " + totalPlayer);

            bestElevenTeam.elevenPlayers();
        } else{
            System.out.println("please select 11 players");
            System.exit(0);
        }
    }

}
