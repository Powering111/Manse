package com.payrespect.manse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    static final int REQ_CODE = 1;
    Button button1;
    EditText idText,pwdText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.btn1);
        idText =(EditText) findViewById(R.id.idEdit);
        pwdText =(EditText) findViewById(R.id.pwEdit);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent next =getIntent();
                next.putExtra("username",idText.getText().toString());
                next.putExtra("password",pwdText.getText().toString());
                setResult(RESULT_OK,next);
                finish();

            }
        });

    }

}
