package com.example.joshuarose.projectzero;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyButton = (Button)findViewById(R.id.spotifyAppButton);
        Button scoresButton = (Button)findViewById(R.id.scoresAppButton);
        Button libraryButton = (Button)findViewById(R.id.libraryAppButton);
        Button biggerButton = (Button)findViewById(R.id.biggerAppButton);
        Button xyzButton = (Button)findViewById(R.id.xyzAppButton);
        Button capstoneButton = (Button)findViewById(R.id.capstoneAppButton);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.button_launch_string) + ((Button) v).getText(), Toast.LENGTH_SHORT).show();
            }
        };

        spotifyButton.setOnClickListener(clickListener);
        scoresButton.setOnClickListener(clickListener);
        libraryButton.setOnClickListener(clickListener);
        biggerButton.setOnClickListener(clickListener);
        xyzButton.setOnClickListener(clickListener);
        capstoneButton.setOnClickListener(clickListener);
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
