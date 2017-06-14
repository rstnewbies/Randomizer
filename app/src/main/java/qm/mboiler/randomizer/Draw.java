package qm.mboiler.randomizer;

import java.util.Random;

/**
 * Created by PC on 03.06.2017.
 */

public class Draw {

    public Draw() {
    }
        public int rand(){
            // MY_PREFS_NAME - a static String variable like:
            //public static final String MY_PREFS_NAME = "MyPrefsFile";
            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
            editor.getInt("idName", 6);
            int variable = 6;
            Random rand = new Random();
            int number = rand.nextInt(variable)+1;

            return number;
        }
    {


}
