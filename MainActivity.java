package qm.mboiler.randomizer;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

        import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Draw(View view) {

        Random rand = new Random();
        int number = rand.nextInt(6)+1;
        TextView myText = (TextView) findViewById(R.id.textView);
        String myString = String.valueOf(number);
        myText.setText(myString);
    }
}
