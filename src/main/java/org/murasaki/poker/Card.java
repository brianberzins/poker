package org.murasaki.poker;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

class Card implements Comparable<Card> {

    final Rank rank;
    final Suit suit;

    Card(String string) {
        assert string.length() == 2;
        String rankSymbol = String.valueOf(string.charAt(0));
        String suitSymbol = String.valueOf(string.charAt(1));
        Optional<Rank> rank = Arrays.stream(Rank.values()).filter(r -> r.symbol.equals(rankSymbol)).findFirst();
        Optional<Suit> suit = Arrays.stream(Suit.values()).filter(r -> r.symbol.equals(suitSymbol)).findFirst();
        assert rank.isPresent();
        assert suit.isPresent();
        this.rank = rank.get();
        this.suit = suit.get();
    }

    @Override
    public String toString() {
        return rank.toString() + suit.toString();
    }

    @Override
    public int compareTo(Card other) {
        return Integer.compare(rank.value, other.rank.value);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Card card = (Card) other;
        return rank == card.rank && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }
}
