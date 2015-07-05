package com.example.michael.pickers;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDate(View view){
        DatePicker datePicker = new DatePicker();
        datePicker.show(getFragmentManager(), "datePicker");
    }

    public void openTime(View view){
        TimerPicker timerPicker = new TimerPicker();
        timerPicker.show(getFragmentManager(), "timePicker");
    }

}
