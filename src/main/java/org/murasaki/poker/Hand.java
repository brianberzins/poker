package org.murasaki.poker;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

final class Hand implements Comparable<Hand> {

    final Card[] cards;

    Hand(Card... cards) {
        assert cards.length == 5;
        Arrays.sort(cards, Collections.reverseOrder());
        this.cards = cards;
    }

    Hand(String... cards) {
        this(Arrays.stream(cards).map(Card::new).toList().toArray(new Card[cards.length]));
    }

    Hand(String cards) {
        this(cards.split(" "));
    }

    @Override
    public String toString() {
        return Arrays.stream(cards).map(Card::toString).collect(Collectors.joining(" "));
    }

    int value() {
        return cards[0].rank.value;
    }

    @Override
    public int compareTo(Hand other) {
        return this.value() - other.value();
    }


    boolean isFlush() {
        return Arrays.stream(cards).allMatch(c -> c.suit == cards[0].suit);
    }
}
