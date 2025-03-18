package org.example;

public class Team{
    String teamName;
    Pokemon member1;
    Pokemon member2;

    public Team(String name, Pokemon m1, Pokemon m2){
        teamName = name;
        member1 = m1;
        member2 = m2;
    }

    public String toString() {
        return "\nTEAM ~" + teamName + "~ : " + member1.name + " & " + member2.name;
    }
}

