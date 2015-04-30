package com.example.david.assignment_1;

import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.david.assignment_1.R;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    String[] quotes;
    TextView quotView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("onCreate", "oncreate");
        quotes=getResources().getStringArray(R.array.quotes);
        quotView = (TextView)findViewById(R.id.quotText);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop", "onstop");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        Log.i("onCreateOptionsMenu", "Menu");
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onresume", "onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "ondestroy");
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        Log.i("onOptionsItemSelected", "optionsite selected");

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void getQuot(View view){


        Random random = new Random();
        int randomNo = random.nextInt(3);
        quotView.setText(quotes[randomNo]);
        Log.i("MyAPP", "Button pressed");


    }
}
