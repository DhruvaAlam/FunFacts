package dhruva.alam.naqib.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    //Declare our view variables
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;
    private FactBook mFactBook = new FactBook(); //factbook class
    private ColourBook mColourBook = new ColourBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //assign the views from the layout file to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);



        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String fact = mFactBook.getFact();
                int colourId = mColourBook.randomColour();

                //update teh screen to show the fact
                mFactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(colourId);
                mShowFactButton.setTextColor(colourId);
            }
        };
        mShowFactButton.setOnClickListener(listener);

        //tells you when a method is called with a small popup message that lasts for LENGTH_LONG or LENGTH_SHORT
        //Toast.makeText(FunFactsActivity.this, "Success. Our Activity was created!", Toast.LENGTH_LONG).show();

        Log.d(TAG, "We're logging from the onCreate() method");


    }
}
