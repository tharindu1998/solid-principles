package org.example.lsp;

// Example demonstrating Liskov Substitution Principle (LSP)
class Player {
    void performRole() {
        // Common logic for all players
    }
}

class SubstitutePlayer extends Player {
    // Specific implementation for substitute player
}

// Good practice: SubstitutePlayer can replace Player without issues
