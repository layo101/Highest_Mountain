package highestmountain.javaprograms.com.highestmountain;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {
    //create our instance variable that will hold our buttons and text view

    private Button showMeButton;
    private TextView showTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showMeButton = (Button) findViewById(R.id.buttonId);
        showTextView = (TextView) findViewById(R.id.textViewId);

        //first thing we need to do is create a array of strings
        //that will contain our mountain names

        //we make it final so we are able to use it everywhere
        final String[] mountains = {"Everest", "Kangchenjunga", "Makulu",
                "K2", "Lhotse", "Cho Oyu", "Manaslu", "Nanga Parbat",
                "Annapurna", "Himalchuli", "Ngadi Chuli", "Batura Sar",
                "Kanjut Sar", "Rakaposhi", "Dhaulagiri II", "Tirich Mir"};

        //Now we set up out button to an event listener
        showMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //handle out events
                //we are going to make a random number.
                Random rand = new Random();
                //each time we click our button it is going to create a random number
                //the range is going to be from 0 to the length of the array
                int randomNum = rand.nextInt(mountains.length);
                //now we are passing in a random integer
                //as we pass that in we are accessing the element
                //that corresponds to the random integer
                showTextView.setText(mountains[randomNum]);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
