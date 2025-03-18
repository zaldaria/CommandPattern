package org.example;

public class Main {
    public static void main(String[] args) {
        Pokemon Wartortle = new Pokemon("Wartortle","Water",40,50,40);
        Pokemon Sandslash = new Pokemon("Sandslash","Ground",50,70,60);
        Pokemon Vulpix = new Pokemon("Vulpix","Fire",30,30,30);
        Pokemon Slowpoke = new Pokemon("Slowpoke", "Water, Psychic",60,40,40);

        System.out.println(Wartortle);
        System.out.println(Sandslash);
        System.out.println(Vulpix);
        System.out.println(Slowpoke);

    }
}