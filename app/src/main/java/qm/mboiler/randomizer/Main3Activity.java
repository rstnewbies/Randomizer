package qm.mboiler.randomizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void BackMenu(View view)
    {
        Intent myIntent = new Intent(view.getContext(), Main2Activity.class);
        startActivity(myIntent);
    }

    public void K6(View view)
    {

    }

    public void K12(View view)
    {

    }

    public void K24(View view)
    {

    }


}
