package com.example.luz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class InfoIbiza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_ibiza);
    }

    public void reservar(View view) {
        Intent i=new Intent(InfoIbiza.this,Ibiza.class);
        startActivity(i);
    }
    //menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.inicio:
                Intent ii = new Intent(InfoIbiza.this, MainActivity.class);
                startActivity(ii);
                return true;
            case R.id.ciudades:
                Intent j = new Intent(InfoIbiza.this, Ciudades.class);
                startActivity(j);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
