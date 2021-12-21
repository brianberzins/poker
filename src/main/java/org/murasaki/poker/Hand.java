package org.murasaki.poker;

import static org.murasaki.poker.Strength.*;

record Hand(Card... cards) {
    Strength strength() {
        return HIGH_CARD;
    }
}
