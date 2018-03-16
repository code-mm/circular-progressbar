package com.example.maohuawei.circularprogressbar;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.maohuawei.circularprogressbar.widget.CustomCircleProgressBar;


public class MainActivity extends Activity {

    private CustomCircleProgressBar progressBarOne;
    private CustomCircleProgressBar progressBarTwo;
    private CustomCircleProgressBar progressBarThree;
    private CustomCircleProgressBar progressBarFour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBarOne = (CustomCircleProgressBar) findViewById(R.id.am_progressbar_one);
        progressBarTwo = (CustomCircleProgressBar) findViewById(R.id.am_progressbar_two);
        progressBarThree = (CustomCircleProgressBar) findViewById(R.id.am_progressbar_three);
        progressBarFour = (CustomCircleProgressBar) findViewById(R.id.am_progressbar_four);

        progressBarOne.setProgress(100);
        progressBarTwo.setProgress(100);
        progressBarThree.setProgress(100);
        progressBarFour.setProgress(100);

    }
}