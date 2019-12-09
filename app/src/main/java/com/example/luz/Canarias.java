package com.example.luz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class Canarias extends AppCompatActivity {
private EditText nombre;
    //menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        nombre=(EditText)findViewById(R.id.nombre);
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canarias);
    }

    public void participa(View view) {
        Intent i=new Intent(Canarias.this,MasCanarias.class);
        i.putExtra("nombre",nombre.getText().toString());
        startActivity(i);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.inicio:
                Intent ii = new Intent(Canarias.this, MainActivity.class);
                startActivity(ii);
                return true;
            case R.id.ciudades:
                Intent j = new Intent(Canarias.this, Ciudades.class);
                startActivity(j);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
