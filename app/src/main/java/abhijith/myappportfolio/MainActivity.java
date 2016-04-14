package abhijith.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button spotifyStreamer, scoresApp, libraryApp, buildItBigger, xyzReader, capstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initViews();
    }

    public void spotifyClick(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Spotify Streamer App", Toast.LENGTH_SHORT).show();
    }
    public void scoresClick(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Scores App", Toast.LENGTH_SHORT).show();
    }
    public void libraryClick(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Library App", Toast.LENGTH_SHORT).show();
    }
    public void builditbiggerClick(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my build It Bigger App", Toast.LENGTH_SHORT).show();
    }
    public void xyzClick(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my XYZ Reader App", Toast.LENGTH_SHORT).show();
    }
    public void capstoneClick(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Capstone App", Toast.LENGTH_SHORT).show();
    }

    private void initViews() {
        spotifyStreamer = (Button) findViewById(R.id.spotifyStreamer);
        scoresApp = (Button) findViewById(R.id.scoresApp);
        libraryApp = (Button) findViewById(R.id.libraryApp);
        buildItBigger = (Button) findViewById(R.id.buildItBigger);
        xyzReader = (Button) findViewById(R.id.xyzReader);
        capstone = (Button) findViewById(R.id.capstone);
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
