package com.example.luz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity  {
private ImageButton ver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ver=(ImageButton)findViewById(R.id.ver);

        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Ciudades.class);
                startActivity(intent);
            }
        });

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
                Intent ii = new Intent(MainActivity.this, MainActivity.class);
                startActivity(ii);
                return true;
            case R.id.ciudades:
                Intent j = new Intent(MainActivity.this, Ciudades.class);
                startActivity(j);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


}
