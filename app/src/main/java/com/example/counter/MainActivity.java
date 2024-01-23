package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counternum =0;

    Button btn;
    TextView welcome, counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         welcome=findViewById(R.id.textView);
         counter= findViewById(R.id.textView2);
         btn= findViewById(R.id.button);

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 counter.setText(""+ increment());

             }
         });

    }

    public int increment(){
        return ++counternum;
    }
}