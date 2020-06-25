package com.example.dream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText x = findViewById(R.id.editText2);
        final EditText y = findViewById(R.id.editText3);
        final EditText a = findViewById(R.id.editText4);
        final EditText b = findViewById(R.id.editText5);
       final Button cal = findViewById(R.id.button1);
        final Button re = findViewById(R.id.button2);
        final TextView f = findViewById(R.id.textView);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double.parseDouble(x.getText().toString());
                double n2 = Double.parseDouble(y.getText().toString());
                double n3 = Double.parseDouble(a.getText().toString());
                double  n4 = Double.parseDouble(b.getText().toString());


                double h = n1 + n2 + n3 + n4;

                if (h>=90){ f.setText('A');   }

                else if (h>=80){f.setText('B');}

                else if (h>=70){f.setText('C'); }

                else if (h>=60){  f.setText('D');}

                else {   f.setText('F'); }

            }
        });
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.setText("");
                y.setText("");
                a.setText("");
                b.setText("");
                f.setText("");
            }
        });










    }


    }
