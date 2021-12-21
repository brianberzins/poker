package org.murasaki.poker;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

class HandTest {

    @Test
    void testHands() {
        Hand[] hands = new Hand[] {
                new Hand("AS KS QS JS TS"), // royal flush
                new Hand("3H 4H 5H 6H 7H"), // straight flush
                new Hand("8S 8H 8C 8D 3C"), // four of a kind, fours
                new Hand("9S 9H 9C 9D 3C"), // four of a kind, threes
                new Hand("AS AC AH 2C 2S"), // full house, aces over deuces
                new Hand("7S 7C 7H AC AS"), // full house, sevens over aces
                new Hand("JS JC 3H 3C 3S"), // full house, threes over jacks
                new Hand("AS KS 9S JS 4S"), // flush, ace kicker
                new Hand("3H 4H 9H 6H 2H"), // flush, nine kicker
                new Hand("AC KC QC JC TH"), // ace high straight
                new Hand("AC 2C 3C 4C 5C"), // ace low straight
                new Hand("QS QC QH JC 3S"), // three of a kind, queens
                new Hand("JS QC 3H 3C 3S"), // three of a kind, threes
                new Hand("AS AC QH 2C 2S"), // two pair, aces and deuces
                new Hand("7S 7C QH AC AS"), // two pair, aces and sevens
                new Hand("JS JC QH 3C 3S"), // two pair, jacks and threes, queen kicker
                new Hand("JS JC 4H 3C 3S"), // two pair, jacks and threes, four kicker
                new Hand("JC JS 6D 2H 7C"), // pair of jacks, 7 kicker
                new Hand("4D JC KH JS 3H"), // pair of jacks, King - four - three
                new Hand("4D JC KH JS 2H"), // pair of jacks, King - four - two
                new Hand("AC 2C 3C 4C 5S"), // ace high
                new Hand("9C 2C 3C 4C 5S")  // nine high
        };
        CombinationApprovals.verifyAllCombinations(Hand::compare, hands, hands);
    }

}
