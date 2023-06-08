package Dream.Eleven;

import java.util.ArrayList;
import java.util.Scanner;

public class Best_Eleven_Team implements Cricket_Interface {

    public static final int totalPlayer = 11;
    ArrayList<String> playerList = new ArrayList<>();
    private int bowlerCount = 7;
    private int allrounderCount = 5;
    private  int wicketKeeperCount = 3;
    public int totalPlayerCount = 0;

    Scanner sc = new Scanner(System.in); // for taking user input
    // Constructor
    public Best_Eleven_Team(){
        System.out.println("Welcome to the Game !!");
        System.out.println("Please select Your Eleven Players !!");
    }
    @Override
    public void batsMan(int totalBatmanWant) {
        String[] batsman = new String[totalBatmanWant];
        if( totalBatmanWant <= 7){
            System.out.println("Enter the batsman names want to select for your team :");
            for(int i = 0; i <batsman.length; i++){
                this.totalPlayerCount++;
                if(this.totalPlayerCount > totalPlayer){
                    System.exit(0);
                }
                batsman[i] = sc.nextLine();
            }
        }
        else{
            System.out.println("Player selected out of range");
            System.exit(0);
        }

        //Storing batsman
        for (int i = 0; i < batsman.length; i++){
            String batsman1 = batsman[i];
            playerList.add(batsman1);
        }

    }

    @Override
    public void bowler(int totalBowlerWant) {
        String[] bowler = new String[totalBowlerWant];
        if( totalBowlerWant <= 7){
            System.out.println("Enter the bowler names want to select for your team :");
            for(int i = 0; i <bowler.length; i++){
                this.totalPlayerCount++;
                if(this.totalPlayerCount > totalPlayer){
                    System.exit(0);
                }
                bowler[i] = sc.nextLine();
            }
        }
        else{
            System.out.println("Player selected out of range");
            System.exit(0);
        }

        //Storing bowler
        for (int i = 0; i < bowler.length; i++){
            String bowler1 = bowler[i];
            playerList.add(bowler1);
        }
    }

    @Override
    public void wicketKeeper(int totalWicketKeeperWant) {
        String[] wicketKeeper = new String[totalWicketKeeperWant];
        if( totalWicketKeeperWant <= 3){
            System.out.println("Enter the Wicket Keeper names want to select for your team :");
            for(int i = 0; i <wicketKeeper.length; i++){
                this.totalPlayerCount++;
                if(this.totalPlayerCount > totalPlayer){
                    System.exit(0);
                }
                wicketKeeper[i] = sc.nextLine();
            }
        }
        else{
            System.out.println("Player selected out of range");
            System.exit(0);
        }

        //Storing wicketKeeper
        for (int i = 0; i < wicketKeeper.length; i++){
            String wKeeper = wicketKeeper[i];
            playerList.add(wKeeper);
        }
    }

    @Override
    public void allRounder(int totalAllRounderWant) {
        String[] allRounder = new String[totalAllRounderWant];
        if( totalAllRounderWant <= 5){
            System.out.println("Enter the AllRounder names want to select for your team :");
            for(int i = 0; i <allRounder.length; i++){
                this.totalPlayerCount++;
                if(this.totalPlayerCount > totalPlayer){
                    System.exit(0);
                }
                allRounder[i] = sc.nextLine();
            }
        }
        else{
            System.out.println("Player selected out of range");
            System.exit(0);
        }

        //Storing AllRounder
        for (int i = 0; i < allRounder.length; i++){
            String allRounder1 = allRounder[i];
            playerList.add(allRounder1);
        }
    }

    @Override
    public void elevenPlayers() {
        // Printing Players
        System.out.println("Players selected for this match are: ");
        for (int i = 0; i<playerList.size();i++){
            String val = playerList.get(i);
            System.out.println(val);
        }

    }

}
