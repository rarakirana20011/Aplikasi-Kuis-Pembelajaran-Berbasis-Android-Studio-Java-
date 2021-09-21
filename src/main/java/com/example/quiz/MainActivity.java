package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout rpl = findViewById(R.id.rpl);
        final LinearLayout multimedia = findViewById(R.id.multimedia);
        final LinearLayout tkj = findViewById(R.id.tkj);
        final LinearLayout video = findViewById(R.id.video);

        final Button start = findViewById(R.id.start);

        rpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "rpl";

                rpl.setBackgroundResource(R.drawable.stroke);

                multimedia.setBackgroundResource(R.drawable.stroke);
                tkj.setBackgroundResource(R.drawable.stroke);
                video.setBackgroundResource(R.drawable.stroke);
            }
        });

        multimedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "multimedia";

                multimedia.setBackgroundResource(R.drawable.stroke);

                rpl.setBackgroundResource(R.drawable.stroke);
                tkj.setBackgroundResource(R.drawable.stroke);
                video.setBackgroundResource(R.drawable.stroke);
            }
        });

        tkj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "tkj";

                tkj.setBackgroundResource(R.drawable.stroke);

                multimedia.setBackgroundResource(R.drawable.stroke);
                rpl.setBackgroundResource(R.drawable.stroke);
                video.setBackgroundResource(R.drawable.stroke);
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "video";

                video.setBackgroundResource(R.drawable.stroke);

                multimedia.setBackgroundResource(R.drawable.stroke);
                tkj.setBackgroundResource(R.drawable.stroke);
                rpl.setBackgroundResource(R.drawable.stroke);
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Tolong pilih Menu", Toast.LENGTH_SHORT).show();
                }
                else{

                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("MenuTerpilih", selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }
}