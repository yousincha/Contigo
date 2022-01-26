package com.example.invitation;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Write extends AppCompatActivity {

    int GET_STING = 1;
    TextView intext;
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        Toast toast = Toast.makeText(getApplicationContext(),"", Toast.LENGTH_SHORT);

        switch(item.getItemId())
        {
            case R.id.menu_item1:
                toast.setText("로그아웃");
                Intent mainIntent = new Intent(this, MainActivity.class);
                startActivity(mainIntent);
                break;
            case R.id.menu_item2:
                toast.setText("상담예약");
                Intent myIntent = new Intent(this, Consult.class);
                startActivity(myIntent);
                break;
            case R.id.menu_item3:
                toast.setText("문의하기");
                Intent callIntent = new Intent(this, Inquire.class);
                startActivity(callIntent);
                break;
        }

        toast.show();
        return super.onOptionsItemSelected(item);


    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write);

        Button btn_add = (Button) findViewById(R.id.button);
        final EditText editText = (EditText) findViewById(R.id.context_text);
        final ListView listView = (ListView) findViewById(R.id.ListView);
        final ArrayList<String> arrayList = new ArrayList<String>();
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
        btn_add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (editText.getText().toString().length() > 0) {
                    String inputStr = editText.getText().toString();
                    arrayList.add(inputStr);
                    arrayAdapter.notifyDataSetChanged();
                }
            }
        });
    }

}