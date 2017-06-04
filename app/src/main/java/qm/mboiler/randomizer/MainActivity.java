package qm.mboiler.randomizer;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.Button;
        import android.content.Intent;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void GoMenu(View view)
    {
        Intent myIntent = new Intent(view.getContext(), Main2Activity.class);
        startActivity(myIntent);
    }


    public void Showing(View view) {
        Draw draw = new Draw();
        TextView myText = (TextView) findViewById(R.id.textView);
        String myString = String.valueOf(draw.rand());
        myText.setText(myString);
    }






}
