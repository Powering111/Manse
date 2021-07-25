package com.payrespect.manse;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {
    static final int REQUEST_CODE = 1;
    TextView t;
    Button button;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        t = (TextView)findViewById(R.id.mansetext);
        button = (Button)findViewById((R.id.centertext));
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent loginActivity = new Intent(NewActivity.this, MainActivity.class);
                startActivityForResult(loginActivity,REQUEST_CODE);
            }
        });


    }
    @Override
    protected void onActivityResult(int rq, int rs, Intent intent){
        super.onActivityResult(rq,rs,intent);
        if(rq==REQUEST_CODE){
            if(rs==RESULT_OK){
                String idtext = intent.getStringExtra("username");
                String pwdtext = intent.getStringExtra("password");
                t.setText(getString(R.string.ID_display)+idtext+"\n"+getString(R.string.PW_display)+pwdtext+"\n"+getString(R.string.B_display));
            }else{
                t.setText(R.string.errortext);
            }
        }
    }
}
