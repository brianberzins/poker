package org.murasaki.poker;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.murasaki.poker.Strength.*;

record Hand(Card... cards) {
    Hand {
        Arrays.sort(cards);
    }

    Strength strength() {
        return HIGH_CARD;
    }

    Rank highCard() {
        return cards[cards.length - 1].rank();
    }

    @Override
    public String toString() {
        return Arrays.stream(cards).map(Card::toString).collect(Collectors.joining(" "));
    }
}
