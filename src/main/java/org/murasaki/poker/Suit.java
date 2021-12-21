package org.murasaki.poker;

enum Suit {
    HEARTS  ("H"),
    SPADES  ("S"),
    CLUBS   ("C"),
    DIAMONDS("D");

    final String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
