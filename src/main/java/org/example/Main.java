package org.example;

public class Main {
    public static void main(String[] args) {
        Pokemon Wartortle = new Pokemon("Wartortle","Water",40,50,4);
        Pokemon Sandslash = new Pokemon("Sandslash","Ground",50,70,6);
        Pokemon Vulpix = new Pokemon("Vulpix","Fire",30,30,3);
        Pokemon Slowpoke = new Pokemon("Slowpoke", "Water, Psychic",60,40,4);

        System.out.println(Wartortle);
        System.out.println(Sandslash);
        System.out.println(Vulpix);
        System.out.println(Slowpoke);

        Team team1 = new Team("Warslash", Wartortle, Sandslash);
        Team team2 = new Team("Slowpix", Slowpoke, Vulpix);

        System.out.println(team1);
        System.out.println(team2);

        SimpleGame game = new SimpleGame();
        AttackCommand firstAttack = new AttackCommand(team1.member1, team2.member2);
        AttackCommand secondAttack = new AttackCommand(team2.member1, team1.member2);

        game.setAction(firstAttack);
        game.doAction();

        game.setAction(secondAttack);
        game.doAction();

    }
}