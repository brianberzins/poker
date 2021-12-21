package org.murasaki.poker;

import static org.murasaki.poker.Strength.*;

record Hand(Card... cards) {
    public Strength strength() {
        return HIGH_CARD;
    }
}
