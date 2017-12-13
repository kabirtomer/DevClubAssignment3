package com.example.kabir.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int count = 0;
    public TextView countValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // If we have a saved state then we can restore it now
        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("counter", 0);
        }

        // Display the value of the counter
        countValue = (TextView) findViewById(R.id.displayVal);
        countValue.setText(String.valueOf(count));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", count);
    }

    public void add(View view) {
        count++;
        countValue.setText(String.valueOf(count));
    }

    public void subtract(View view) {
        count--;
        countValue.setText(String.valueOf(count));
    }

    public void reset(View view) {
        count=0;
        countValue.setText("0");
    }
}

