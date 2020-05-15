package com.example.bottomsheetdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ItemNameActivity extends AppCompatActivity {

    TextView tvitemName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_name);

        tvitemName = findViewById(R.id.itemName);

        Intent intent = getIntent();

        if(intent.getExtras() != null){
            String itemName = intent.getStringExtra("data");
            tvitemName.setText(itemName);
        }
    }
}
