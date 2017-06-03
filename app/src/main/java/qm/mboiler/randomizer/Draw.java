package qm.mboiler.randomizer;

import java.util.Random;

/**
 * Created by PC on 03.06.2017.
 */

public class Draw {
    public static int variable;

    {
         int variable = 6;
         Random rand = new Random();
         int number = rand.nextInt(variable)+1;
    }

}
