package org.example.isp;

// Example demonstrating Interface Segregation Principle (ISP)
interface Batsman {
    void hitSix();
}

interface Bowler {
    void bowl();
}

class AllRounder implements Batsman, Bowler {
    @Override
    public void hitSix() {
        // Logic to hit a six
    }

    @Override
    public void bowl() {
        // Logic to bowl a delivery
    }
}

// Best practice: Interfaces are specific to roles to prevent unnecessary dependencies

