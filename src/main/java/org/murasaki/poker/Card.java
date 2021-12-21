package org.murasaki.poker;

record Card(Rank rank, Suit suit) {

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
