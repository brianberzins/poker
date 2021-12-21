package org.murasaki.poker;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

class CardTest {

    @Test
    void testCards() {
        CombinationApprovals.verifyAllCombinations(Card::new, Rank.values(), Suit.values());
    }

}
