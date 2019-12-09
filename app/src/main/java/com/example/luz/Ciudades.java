package com.example.luz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.example.luz.R.array.ciudades;


public class Ciudades extends AppCompatActivity {
private ListView lista;

    //menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciudades);

        lista=(ListView)findViewById(R.id.lista_menu);
        //Dentro de mi lista le inserto el adapter y le indico
        //el contexto donde estoy , el array o coleccion de ciudades y el activiti donde se encuentra
        lista.setAdapter(ArrayAdapter.createFromResource(this, ciudades, android.R.layout.simple_list_item_1));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){

                    case 0:Intent i=new Intent(Ciudades.this,Madrid.class);
                    startActivity(i);break;
                    case 1:Intent intent=new Intent(Ciudades.this,Granada.class);
                        startActivity(intent);break;
                    case 2:Intent intnt=new Intent(Ciudades.this,Asturias.class);
                        startActivity(intnt);break;
                    case 3:Intent intent1=new Intent(Ciudades.this,InfoIbiza.class);
                        startActivity(intent1);break;
                    case 4:Intent intent2=new Intent(Ciudades.this,Canarias.class);
                        startActivity(intent2);break;

                }

            }
        });



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.inicio:
                Intent ii = new Intent(Ciudades.this, MainActivity.class);
                startActivity(ii);
                return true;
            case R.id.ciudades:
                Intent j = new Intent(Ciudades.this, Ciudades.class);
                startActivity(j);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


}
