package com.example.proj4_motywy;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private TextView tv2;
    private RatingBar rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView2);
        tv2 = findViewById(R.id.textView3);
        rb = findViewById(R.id.ratingBar);

        // Assuming you have a RatingBar with the id "ratingBar" in your layout
        RatingBar ratingBar = findViewById(R.id.ratingBar);

        // Set up the OnRatingBarChangeListener
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                // Handle the rating change event
                float numberOfStars = (float) rating;
                // Call your function or perform any other action with the number of stars
                handleRatingUpdate(numberOfStars);
            }
        });
    }

    // Your function to handle the rating update
    private void handleRatingUpdate(float numberOfStars) {
        tv.setText("Rating = " + numberOfStars);
        tv2.setText("Num of stars = " + rb.getNumStars());
    }
}
