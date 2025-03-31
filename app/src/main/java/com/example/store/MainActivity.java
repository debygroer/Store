package com.example.store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btGame,btSetting,btInstructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btGame = findViewById(R.id.btCatalog);
        btSetting = findViewById(R.id.btsetting);
        btInstructions = findViewById(R.id.btInstructions);
        btGame.setOnClickListener(this);
        btSetting.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "on click", Toast.LENGTH_SHORT).show();
        if(view.getId() == R.id.btCatalog)
        {
            Toast.makeText(this, "Game", Toast.LENGTH_SHORT).show();
            Intent catalog = new Intent(this, CatalogActivity.class);
            startActivity(catalog);
        }
        if(view.getId() == R.id.btsetting)
        {
            Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
        }
    }

    public void InstructionButtun(View view) {
        Toast.makeText(this, "Instructions", Toast.LENGTH_SHORT).show();
    }
}