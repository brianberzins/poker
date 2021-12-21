package org.murasaki.poker;

import java.util.Arrays;
import java.util.stream.Collectors;

final class Hand implements Comparable<Hand>{

    final Card[] cards;

    Hand(Card... cards) {
        assert cards.length == 5;
        Arrays.sort(cards);
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

    @Override
    public int compareTo(Hand other) {
        return 0;
    }

    Result compare(Hand other) {
        return switch (compareTo(other)) {
            case -1 -> Result.LOSE;
            case 0 -> Result.TIE;
            case 1 -> Result.WIN;
            default -> throw new IllegalStateException();
        };
    }


}
