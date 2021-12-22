package org.murasaki.poker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandTest {

    static final Hand royal_flush =                             new Hand("AS KS QS JS TS");
    static final Hand straight_flush =                          new Hand("3H 4H 5H 6H 7H");
    static final Hand four_of_a_kind_fours =                    new Hand("8S 8H 8C 8D 3C");
    static final Hand four_of_a_kind_threes =                   new Hand("9S 9H 9C 9D 3C");
    static final Hand full_house_aces_over_deuces =             new Hand("AS AC AH 2C 2S");
    static final Hand full_house_sevens_over_aces =             new Hand("7S 7C 7H AC AS");
    static final Hand full_house_threes_over_jacks =            new Hand("JS JC 3H 3C 3S");
    static final Hand flush_ace_kicker =                        new Hand("AS KS 9S JS 4S");
    static final Hand flush_nine_kicker =                       new Hand("3H 4H 9H 6H 2H");
    static final Hand straight_ace_high =                       new Hand("AC KC QC JC TH");
    static final Hand straight_ace_low =                        new Hand("AC 2C 3C 4C 5C");
    static final Hand three_of_a_kind_queens =                  new Hand("QS QC QH JC 3S");
    static final Hand three_of_a_kind_threes =                  new Hand("JS QC 3H 3C 3S");
    static final Hand two_pair_aces_and_deuces =                new Hand("AS AC QH 2C 2S");
    static final Hand two_pair_aces_and_sevens =                new Hand("7S 7C QH AC AS");
    static final Hand two_pair_jacks_and_threes_queen_kicker =  new Hand("JS JC QH 3C 3S");
    static final Hand two_pair_jacks_and_threes_four_kicker =   new Hand("JS JC 4H 3C 3S");
    static final Hand pair_jacks_king_four_three =              new Hand("4D JC KH JS 3H");
    static final Hand pair_jacks_king_four_two =                new Hand("4D JC KH JS 2H");
    static final Hand ace_high_six_five_four_three =            new Hand("AC 3C 4C 5C 6S");
    static final Hand ace_high_six_five_four_deuce =            new Hand("AC 2C 4C 5C 6S");
    static final Hand nine_high_six_five_four_deuce =           new Hand("9C 2C 4C 5C 6S");

    static Hand __(String hand) {
        return new Hand(hand);
    }

    @Test
    void testFlush() {
        assertTrue(__("AS KS 9S JS 4S").isFlush());
        assertFalse(__("9C 2C 4C 5C 6S").isFlush());
    }

    @Test
    void testStraight() {
        assertTrue(__("AC 2C 3C 4C 5C").isStraight());
        assertTrue(__("AC KC QC JC TH").isStraight());
        assertTrue(__("4D 5D 6C 7D 8D").isStraight());
        assertFalse(__("9C 2C 4C 5C 6S").isStraight());
        assertFalse(__("AC KC KD JC TH").isStraight());
        assertFalse(__("AC 2C 3C 5C 5C").isStraight());
    }

}
