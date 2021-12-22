package org.murasaki.poker;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

final class Hand implements Comparable<Hand> {

    static final int hand_size = 5;
    final Card[] cards;

    Hand(Card... cards) {
        assert cards.length == hand_size;
        Arrays.sort(cards, Collections.reverseOrder());
        this.cards = cards;
    }

    Hand(String... cards) {
        this(Arrays.stream(cards).map(Card::new).toList().toArray(new Card[hand_size]));
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

    boolean isStraight() {
        int value = cards[1].rank.value;
        // check for consecutive cards 2-5
        for (int i = 2; i < hand_size; i++) {
            value = value - 1;
            if (value != cards[i].rank.value) {
                return false;
            }
        }
        // check for ace-low straight
        if (cards[0].rank == Rank.ACE && cards[hand_size - 1].rank == Rank.DEUCE) {
            return true;
        }
        // no ace, check if first card is consecutive to second
        return cards[0].rank.value == cards[1].rank.value + 1;
    }
}
