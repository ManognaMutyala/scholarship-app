package com.cmrit.samket.scholarshipappprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import static com.cmrit.samket.scholarshipappprototype.data.schcontract.dataentry.COLUMN_CASTE;
import static com.cmrit.samket.scholarshipappprototype.data.schcontract.dataentry.SPORTS_QUOTA;

public class Main3Activity extends AppCompatActivity {
    EditText SPORTS_QUOTA;
    Spinner COLUMN_CASTE;
    String sports_quota,column_caste;
    Button reg;

    private static Button btn_nxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        COLUMN_CASTE=(Spinner)findViewById(R.id.listCaste1);
        reg=(Button)findViewById(R.id.Submit);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                column_caste=COLUMN_CASTE.getText().toString;



            }
        });

        }
    }









