package com.example.luz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Go extends AppCompatActivity {


    private TextView texto;
    private TextView texto1;
     private Button btn;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_go);
        texto=(TextView)findViewById(R.id.nombre);
        texto1=(TextView)findViewById(R.id.mail);

        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Go.this,Ciudades.class);
                startActivity(i);
            }
        });

        Bundle datos = this.getIntent().getExtras();
        if (datos != null) {
            String nombre = datos.getString("nombre");
            String mail = datos.getString("mail");
            texto.setText(nombre);
            texto1.setText(mail);
        }


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
                Intent ii = new Intent(Go.this, MainActivity.class);
                startActivity(ii);
                return true;
            case R.id.ciudades:
                Intent j = new Intent(Go.this, Ciudades.class);
                startActivity(j);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
