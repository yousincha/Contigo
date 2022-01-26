package com.example.invitation;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        findViewById(R.id.btn_login).setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        Intent intent_act = new Intent(getApplicationContext(), com.example.invitation.Board.class);
                        startActivity(intent_act);
                    }
                }
        );
        findViewById(R.id.btn_find).setOnClickListener(
                (v) -> {
                        Intent intent_act = new Intent(getApplicationContext(), Find.class);
                        startActivity(intent_act);
                    }
        );

    }

}
