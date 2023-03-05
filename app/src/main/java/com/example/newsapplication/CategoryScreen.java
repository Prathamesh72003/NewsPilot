package com.example.newsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class CategoryScreen extends AppCompatActivity {

    CardView cardView1;
    CardView cardView2;
    CardView cardView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_category_screen);

        cardView1 = (CardView) findViewById(R.id.CategoryCard1);
        cardView2 = (CardView) findViewById(R.id.CategoryCard2);
        cardView3 = (CardView) findViewById(R.id.CategoryCard3);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NewsScreen.class);
                intent.putExtra("category", "business");
                startActivity(intent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NewsScreen.class);
                intent.putExtra("category", "sports");
                startActivity(intent);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NewsScreen.class);
                intent.putExtra("category", "entertainment");
                startActivity(intent);
            }
        });

    }
}