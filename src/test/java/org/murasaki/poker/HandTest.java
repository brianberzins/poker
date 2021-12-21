package org.murasaki.poker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.murasaki.poker.Rank.*;
import static org.murasaki.poker.Strength.*;

class HandTest {

    @Test
    void testHighCard() {
        Hand hand = new Hand("3D","JC","AS","7D","2H");
        assertEquals(HIGH_CARD, hand.strength());
        assertEquals(ACE, hand.highCard());
//        CombinationApprovals.verifyAllCombinations(Card::new, Rank.values(), Suit.values());
    }

}
