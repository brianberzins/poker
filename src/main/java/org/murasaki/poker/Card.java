package org.murasaki.poker;

record Card(Rank rank, Suit suit) implements Comparable<Card> {

    @Override
    public String toString() {
        return rank.toString() + suit.toString();
    }

    @Override
    public int compareTo(Card other) {
        return Integer.compare(rank.value, other.rank.value);
    }
}
