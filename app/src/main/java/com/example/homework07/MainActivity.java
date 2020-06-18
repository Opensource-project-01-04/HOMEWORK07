package com.example.homework07;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setTitle("제일 귀여운 동물");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0,1,0,"고양이");
        menu.add(0,2,0,"멍멍이");
        menu.add(0,3,0,"펭귄");

        return true;
    }
   @Override
 public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch(item.getItemId()){
            case 1:
                ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
                imageView4.setImageResource(R.drawable.cat);
                return true;
            case 2:
                ImageView imageView5 = (ImageView)findViewById(R.id.imageView4);
                imageView5.setImageResource(R.drawable.dog);
                return true;
            case 3:
                ImageView imageView6 = (ImageView)findViewById(R.id.imageView4);
                imageView6.setImageResource(R.drawable.pan);
                return true;


        }
return true;
    }


}
