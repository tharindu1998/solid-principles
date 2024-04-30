package org.example.ocp;

// Interface for a cricket player
interface Cricketer {
    void play();
}

// Batsman class implementing Cricketer interface
class Batsman implements Cricketer {
    @Override
    public void play() {
        System.out.println("Batsman is scoring runs.");
    }
}

// Bowler class implementing Cricketer interface
class Bowler implements Cricketer {
    @Override
    public void play() {
        System.out.println("Bowler is delivering the ball.");
    }
}

// Wicketkeeper class implementing Cricketer interface
class Wicketkeeper implements Cricketer {
    @Override
    public void play() {
        System.out.println("Wicketkeeper is behind the stumps.");
    }
}

// All-rounder class implementing Cricketer interface
class AllRounder implements Cricketer {
    @Override
    public void play() {
        System.out.println("All-rounder is contributing to both batting and bowling.");
    }
}

// Adding a new player position - Fielder (open for extension)
class Fielder implements Cricketer {
    @Override
    public void play() {
        System.out.println("Fielder is patrolling the field.");
    }
}

// Main class to demonstrate player positions
public class CricketTeam {
    public static void main(String[] args) {
        Cricketer batsman = new Batsman();
        Cricketer bowler = new Bowler();
        Cricketer wicketkeeper = new Wicketkeeper();
        Cricketer allRounder = new AllRounder();
        Cricketer fielder = new Fielder(); // New position - Fielder

        batsman.play();
        bowler.play();
        wicketkeeper.play();
        allRounder.play();
        fielder.play();
    }
}
