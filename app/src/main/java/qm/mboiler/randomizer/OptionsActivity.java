package qm.mboiler.randomizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class OptionsActivity extends AppCompatActivity, {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void BackMenu(View view)
    {
        Intent myIntent = new Intent(OptionsActivity.this, Main2Activity.class);
        startActivity(myIntent);
    }
    /* Tameplate
    SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
    if (restoredText != null) {
        int idName = prefs.getInt("idName", 6); //0 is the default value.
    */
    }
    public void K6()
    {
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        if (restoredText != null) {
            int idName = prefs.putInt("idName", 6); //0 is the default value.
            }
        }

    public void K12 ()
    {
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        if (restoredText != null) {
            int idName = prefs.putInt("idName", 12); //0 is the default value.
            }
        }

    public void K24 ()
    {
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        if (restoredText != null) {
            int idName = prefs.putInt("idName", 24); //0 is the default value.
        }
    }


}
