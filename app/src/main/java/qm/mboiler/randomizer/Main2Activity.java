package qm.mboiler.randomizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void GoDraw(View view)
    {
        Intent myIntent = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(myIntent);
    }

    public void GoOptions(View view)
    {
        Intent myIntent = new Intent(Main2Activity.this, OptionsActivity.class);
        startActivity(myIntent);
    }

    public void Exit(View view)
    {
        finish();
        System.exit(0);
    }

}
