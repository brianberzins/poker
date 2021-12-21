package org.murasaki.poker;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.murasaki.poker.Strength.*;

final class Hand {
    private final Card[] cards;

    Hand(Card... cards) {
        Arrays.sort(cards);
        this.cards = cards;
    }

    Hand(String... cards) {
        this(Arrays.stream(cards).map(Card::new).toList().toArray(new Card[cards.length]));
    }

    Strength strength() {
        return HIGH_CARD;
    }

    Rank highCard() {
        return cards[cards.length - 1].rank;
    }

    @Override
    public String toString() {
        return Arrays.stream(cards).map(Card::toString).collect(Collectors.joining(" "));
    }

}
