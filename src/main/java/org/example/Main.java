package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pokemon Wartortle = new Pokemon("Wartortle","Water",40,50,20);
        Pokemon Sandslash = new Pokemon("Sandslash","Ground",50,70,30);
        Pokemon Vulpix = new Pokemon("Vulpix","Fire",30,30,15);
        Pokemon Slowpoke = new Pokemon("Slowpoke", "Water, Psychic",60,40,20);

        System.out.println(Wartortle);
        System.out.println(Sandslash);
        System.out.println(Vulpix);
        System.out.println(Slowpoke);

        Team[] teams = new Team[2];
        teams[0] = new Team("Warslash", Wartortle, Sandslash);
        teams[1] = new Team("Slowpix", Slowpoke, Vulpix);

        System.out.println(teams[0]);
        System.out.println(teams[1]);

        SimpleGame game = new SimpleGame();

        Scanner in = new Scanner(System.in);

        System.out.println("Choose attacking team : ");
        int teamNum = in.nextInt();

        while(!teams[0].noLivePokemons() && !teams[1].noLivePokemons()){
            if (teamNum == 0) {
                System.out.println("\n~" + teams[0].teamName + "~ attack ~" + teams[1].teamName + "~");
                teamNum = 1;
            }
            else{
                System.out.println("\n~" + teams[1].teamName + "~ attack ~" + teams[0].teamName + "~");
                teamNum = 0;
            }
            System.out.println("Input an attacker number : ");
            int num1 = in.nextInt();
            System.out.println("Input a defender number : ");
            int num2 = in.nextInt();

            AttackCommand attack = new AttackCommand(teams[teamNum].members[num1], teams[teamNum^1].members[num2]);
            game.setAction(attack);
            game.doAction();

            System.out.println(teams[teamNum].members[num1]);
            System.out.println(teams[teamNum^1].members[num2]);

            System.out.println("Do you want to cancel last action? (y/n)");
            char cancel = in.next().charAt(0);
            while (cancel == 'y'){
                game.undoAction();
                System.out.println("Do you want to cancel last action? (y/n)");
                cancel = in.next().charAt(0);
            }

        }

        System.out.println("Game over!");

        in.close();

//        AttackCommand firstAttack = new AttackCommand(team1.member1, team2.member2);
//        AttackCommand secondAttack = new AttackCommand(team2.member1, team1.member2);
//        CancelAttackCommand cancelFirstAttack = new CancelAttackCommand(team1.member1, team2.member2);
//
//        game.setAction(firstAttack);
//        game.doAction();
//
//        game.setAction(cancelFirstAttack);
//        game.doAction();
//
//        game.setAction(secondAttack);
//        game.doAction();
//
//        game.undoAction();
//        game.undoAction();
//        game.undoAction();

    }
}