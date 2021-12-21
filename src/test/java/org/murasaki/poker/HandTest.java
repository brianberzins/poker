package org.murasaki.poker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.murasaki.poker.Rank.*;
import static org.murasaki.poker.Strength.*;
import static org.murasaki.poker.Suit.*;

class HandTest {

    static Card __(Rank rank, Suit suit) {
        return new Card(rank, suit);
    }

    @Test
    void testHighCard() {
        Hand hand = new Hand(
                new Card(THREE, DIAMONDS),
                new Card(JACK, CLUBS),
                new Card(ACE, SPADES),
                new Card(SEVEN, DIAMONDS),
                new Card(DEUCE, HEARTS));
        assertEquals(HIGH_CARD, hand.strength());

//        CombinationApprovals.verifyAllCombinations(Card::new, Rank.values(), Suit.values());
    }

}
