package com.example.invitation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Board extends AppCompatActivity {

    private int CURRENT_INDEX;
    private ImageView[] imageViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board);
        init();
        Button MapButton = (Button) findViewById(R.id.btn_map);
        MapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Map.class);
                startActivity(intent);
            }
        });
        Button call1 = (Button)findViewById(R.id.call1);
        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:01001234567");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });
        Button call2 = (Button)findViewById(R.id.call2);
        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:01045678910");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });



    }
    private void init(){

        ImageView imageView1 = (ImageView)findViewById( R.id.img1);
        ImageView imageView2 = (ImageView)findViewById( R.id.img2);
        ImageView imageView3 = (ImageView)findViewById( R.id.img3);
        ImageView imageView4 = (ImageView)findViewById( R.id.img4);
        ImageView imageView5 = (ImageView)findViewById( R.id.img5);
        ImageView imageView6 = (ImageView)findViewById( R.id.img6);
        ImageView imageView7 = (ImageView)findViewById( R.id.img7);
        ImageView imageView8 = (ImageView)findViewById( R.id.img8);
        ImageView imageView9 = (ImageView)findViewById( R.id.img9);
        ImageView imageView10 = (ImageView)findViewById( R.id.img10);
        ImageView imageView11 = (ImageView)findViewById( R.id.img11);


        imageViews = new ImageView[]{ imageView1, imageView2, imageView3, imageView4,
                imageView5, imageView6, imageView7, imageView8,imageView9,imageView10,imageView11};
        imageView1.setVisibility(View.VISIBLE);
        CURRENT_INDEX = 0;

        Button imageButton = (Button) findViewById(R.id.btn_go);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Write.class);
                startActivity(intent);
            }
        });

    }



    public void onClickPrev(View view){



        if( --CURRENT_INDEX < 0) {
            Toast toast = Toast.makeText(com.example.invitation.Board.this, "첫 이미지 입니다.", Toast.LENGTH_SHORT );
            toast.show();

            CURRENT_INDEX++;
        }
        else{
            for( int i = 0; i < imageViews.length; i++){
                if( i == CURRENT_INDEX){
                    imageViews[i].setVisibility(View.VISIBLE);
                }
                else{
                    imageViews[i].setVisibility(View.INVISIBLE);
                }
            }
        }
    }
    public void onClickNext(View view){

        if( ++CURRENT_INDEX > 10) {
            Toast toast = Toast.makeText(com.example.invitation.Board.this,
                    "마지막 이미지 입니다.", Toast.LENGTH_SHORT );
            toast.show();

            CURRENT_INDEX--;
        }
        else{
            for( int i = 0; i < imageViews.length; i++){
                if( i == CURRENT_INDEX){
                    imageViews[i].setVisibility(View.VISIBLE);
                }
                else{
                    imageViews[i].setVisibility(View.INVISIBLE);
                }
            }
        }
    }



}