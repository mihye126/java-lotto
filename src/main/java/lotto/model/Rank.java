package lotto.model;

import java.util.Arrays;

public enum Rank {
    OTHER(0, 0),
    FIFTH(5000, 3),
    FOURTH(50000, 4),
    THIRD(1500000, 5),
    SECOND(30000000, 5),
    FIRST(2000000000, 6);
    private final int prize;

    private final int same;

    Rank(int prize, int same) {
        this.prize = prize;
        this.same = same;
    }
    public static Rank ranking(int count){
        return Arrays.stream(values())
            .filter(rank->rank.same==count)
            .findFirst().orElse(OTHER);
    }

}
