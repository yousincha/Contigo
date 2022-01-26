package com.example.invitation;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Find extends AppCompatActivity {
    Button bt_photo;
    RadioButton bt1, bt2, bt3, bt4, bt5;
    ImageView imageView1;
    View dialogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find);

        bt_photo = findViewById(R.id.bt_photo);
        bt1 = findViewById(R.id.bt_1);
        bt2 = findViewById(R.id.bt_2);
        bt3 = findViewById(R.id.bt_3);
        bt4 = findViewById(R.id.bt_4);
        bt5 = findViewById(R.id.bt_5);

        bt_photo.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                dialogView = View.inflate(Find.this, R.layout.show_photo, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(Find.this);

                imageView1 = dialogView.findViewById(R.id.imageView1);
                dlg.setView(dialogView);

                if(bt1.isChecked()){
                   //imageView1.setImageResource(R.drawable.c1);
                    dlg.setTitle("리정혁&윤세리");
                    dlg.setMessage("\n\n\n코드: AB01\n\n\n");


                } else if(bt2.isChecked()){
                    //imageView1.setImageResource(R.drawable.c1);
                    dlg.setTitle("안정원&장겨울");
                    dlg.setMessage("\n\n\n코드: CD23\n\n\n");

                } else if(bt3.isChecked()){
                    //imageView1.setImageResource(R.drawable.c1);
                    dlg.setTitle("베르테르&롯데");
                    dlg.setMessage("\n\n\n코드: EF45\n\n\n");

                } else if(bt4.isChecked()){
                  //  imageView1.setImageResource(R.drawable.c1);
                    dlg.setTitle("완다&비전");
                    dlg.setMessage("\n\n\n코드: GH67\n\n\n");

                } else if(bt5.isChecked()){
                //imageView1.setImageResource(R.drawable.c1);
                dlg.setTitle("허윤재&성덕미");
                    dlg.setMessage("\n\n\n코드: IJ89\n\n\n");

                }
                dlg.setNegativeButton("닫기",null);
                dlg.show();
            }
        });
        Button imageButton = (Button) findViewById(R.id.bt_back);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });
    }
}