package com.example.a20174830.nose;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button press;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final TextView n4=(TextView)findViewById(R.id.text);
        press=(Button)findViewById(R.id.press);

        final String [] myNames={"dile te amo a cual quier chica que te pase ","toma la mochila de alguien y vete corriendo ","abraza a una persona extraña ","salta 5 veces","en voz alta di soy Gay "};

        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randon=(int)(Math.random()*5);
                n4.setText(myNames[randon]);
            }
        });

    }
}
