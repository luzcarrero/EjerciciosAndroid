package com.example.luz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class Ibiza extends AppCompatActivity  {

    private TextView nombre;
    private TextView mail;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibiza);
        nombre=(TextView)findViewById(R.id.nombre);
        mail=(TextView)findViewById(R.id.mail);

    }


    public void avion(View view) {
        Intent intent = new Intent(this, Go.class);
            intent.putExtra("nombre",nombre.getText().toString());
            intent.putExtra("mail",mail.getText().toString());
        startActivity(intent);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.inicio:
                Intent ii = new Intent(Ibiza.this, MainActivity.class);
                startActivity(ii);
                return true;
            case R.id.ciudades:
                Intent j = new Intent(Ibiza.this, Ciudades.class);
                startActivity(j);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}
