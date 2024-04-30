package org.example.dip;

// Example demonstrating Dependency Inversion Principle (DIP)
interface TeamStrategy {
    void formulateStrategy();
}

class CricketTeam implements TeamStrategy {
    @Override
    public void formulateStrategy() {
        // Implement team strategy
    }
}

class Match {
    private final TeamStrategy teamStrategy;

    public Match(TeamStrategy teamStrategy) {
        this.teamStrategy = teamStrategy;
    }

    public void executeMatch() {
        teamStrategy.formulateStrategy();
        // Execute the match based on the strategy
    }
}

// Best practice: Match class depends on abstraction (TeamStrategy) rather than concrete implementation (CricketTeam)

