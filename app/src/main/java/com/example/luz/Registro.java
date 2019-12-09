package com.example.luz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Registro extends AppCompatActivity {
TextView nombre;
TextView mail;
TextView num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nombre=(TextView)findViewById(R.id.nombre);
        mail=(TextView)findViewById(R.id.mail);
        num=(TextView)findViewById(R.id.tlf);
    }

    public void registrado(View view) {
        // Configura el titulo.
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Registro.this);


            alertDialogBuilder.setTitle("Registro");
            // Configura el mensaje.
            alertDialogBuilder
                    .setMessage("en breves no pondremos en contacto contigo ")
                    .setCancelable(false)
                    .setPositiveButton("Ok",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {

                            Intent intent=new Intent(Registro.this,Ciudades.class);
                            startActivity(intent);

                        }
                    })
                    .setNegativeButton("cancelar",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,int id) {

                            dialog.cancel();
                        }
                    }).create().show();


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
                Intent ii = new Intent(Registro.this, MainActivity.class);
                startActivity(ii);
                return true;
            case R.id.ciudades:
                Intent j = new Intent(Registro.this, Ciudades.class);
                startActivity(j);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
