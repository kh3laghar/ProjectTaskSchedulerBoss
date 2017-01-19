package com.asm_linksys.taskschedulerboss.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.asm_linksys.taskschedulerboss.R;

public class MainActivity extends AppCompatActivity {
    Intent gotoLoginPageIntent, gotoRegisterPageIntent;
    Button gotoLoginPageButton, gotoRegisterPageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
      /*  gotoLoginPageButton=(Button)findViewById(R.id.login_button_home_page);
        gotoLoginPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gotoLoginPageIntent=new Intent(MainActivity.this, UserLogin.class);
                startActivity(gotoLoginPageIntent);

            }
        });*/
        gotoRegisterPageButton = (Button) findViewById(R.id.register_button_home_page);
        gotoRegisterPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoRegisterPageIntent = new Intent(MainActivity.this, UserRegistration.class);
                startActivity(gotoRegisterPageIntent);
            }
        });

    }
}
