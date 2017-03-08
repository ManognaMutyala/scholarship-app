package com.cmrit.samket.scholarshipappprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private static Button btn_gs;
    public int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickbtngs();
    }

    public void handy(View view)
    {
        boolean checked=((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.Yes:
            {
                if(checked)
                {
                    a=1;
                }
                break;
            }
            case R.id.No:
            {
                if(checked)
                {
                    a=0;
                }
                break;

            }
        }
    }

    public void onClickbtngs() {
        btn_gs = (Button) findViewById(R.id.button);
        btn_gs.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.cmrit.samket.scholarshipappprototype.Main2Activity");
                        startActivity(intent);
                    }
                }
        );
    }
}
