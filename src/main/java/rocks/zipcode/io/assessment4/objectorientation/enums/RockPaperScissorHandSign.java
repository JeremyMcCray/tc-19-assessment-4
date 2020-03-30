package rocks.zipcode.io.assessment4.objectorientation.enums;

import java.util.regex.Pattern;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        if (this.equals(ROCK)){
            return PAPER;
        } else if (this.equals(PAPER)){
            return SCISSOR;
        } else return ROCK;
    }

    public RockPaperScissorHandSign getLoser() {
        if (this.equals(ROCK)){
            return SCISSOR;
        } else if (this.equals(PAPER)){
            return ROCK;
        } else return PAPER;
    }
}
