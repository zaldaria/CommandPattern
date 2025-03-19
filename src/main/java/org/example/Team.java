package org.example;

public class Team{
    String teamName;
    Pokemon[] members = new Pokemon[2];

    public Team(String name, Pokemon m1, Pokemon m2){
        teamName = name;
        members[0] = m1;
        members[1] = m2;
    }

    public String toString() {
        return "\nTEAM ~" + teamName + "~ " + "\n1. " + members[0].name + "\n2. " + members[1].name;
    }

    public boolean noLivePokemons() {
        return members[0].health <= 0 && members[1].health <= 0;
    }
}

