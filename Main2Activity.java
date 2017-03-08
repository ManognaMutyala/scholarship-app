package com.cmrit.samket.scholarshipappprototype;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.cmrit.samket.scholarshipappprototype.data.schhelper;

import static android.R.attr.label;
import static com.cmrit.samket.scholarshipappprototype.data.schcontract.dataentry.COLUMN_AGE;
import static com.cmrit.samket.scholarshipappprototype.data.schcontract.dataentry.COLUMN_CASTE;
import static com.cmrit.samket.scholarshipappprototype.data.schcontract.dataentry.COLUMN_GENDER;
import static com.cmrit.samket.scholarshipappprototype.data.schcontract.dataentry.COLUMN_NAME;
import static com.cmrit.samket.scholarshipappprototype.data.schcontract.dataentry.COLUMN_RELIGION;
import static com.cmrit.samket.scholarshipappprototype.data.schcontract.dataentry.COLUMN_handicapped;

public class Main2Activity extends AppCompatActivity {
    EditText COLUMN_NAME, COLUMN_AGE, SPORTS_QUOTA, COLUMN_CASTE;
    Spinner COLUMN_RELIGION, COLUMN_GENDER, COLUMN_handicapped;
    String column_name, column_age, column_religion, column_gender, column_HANDICAPPED, sports_quota, column_caste;

    private static Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        COLUMN_NAME = (EditText) findViewById(R.id.NameText);
        COLUMN_AGE = (EditText) findViewById(R.id.AgeText);
        COLUMN_RELIGION = (Spinner) findViewById(R.id.listReligion);

        COLUMN_GENDER = (Spinner) findViewById(R.id.Gender);

        COLUMN_handicapped = (Spinner) findViewById(R.id.Physically);
        COLUMN_CASTE = (EditText) findViewById(R.id.listCaste1);
        reg = (Button) findViewById(R.id.Submit);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                column_name=COLUMN_NAME.getText().toString();
                column_age=COLUMN_AGE.getText().toString();



            }
        });
    }


}
