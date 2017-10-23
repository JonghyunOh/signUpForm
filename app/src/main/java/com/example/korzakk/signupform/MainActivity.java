package com.example.korzakk.signupform;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private EditText mNameTxt = null;
    private Button mSubmit = null;
    private TextView mResultTxt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameTxt = (EditText)findViewById(R.id.nameTxtID);
        mSubmit = (Button)findViewById(R.id.submitBtnID);
        mResultTxt = (TextView)findViewById(R.id.resultTxtID);

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mResultTxt.setText(mNameTxt.getText().toString() + ", Congratuation for restration!");
            }
        });

    }
}
