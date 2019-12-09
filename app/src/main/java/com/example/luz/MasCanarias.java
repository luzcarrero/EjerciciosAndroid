package com.example.luz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TextView;

public class MasCanarias extends AppCompatActivity {
    private TextView nombre;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mas_canarias);

        Resources res = getResources();

        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Ciudad",
                res.getDrawable(android.R.drawable.ic_btn_speak_now));
        tabs.addTab(spec);

        spec=tabs.newTabSpec("Precios");

        spec.setContent(R.id.tab2);
        spec.setIndicator("Precio",
                res.getDrawable(android.R.drawable.ic_dialog_map));
        tabs.addTab(spec);


        spec=tabs.newTabSpec("Contacto");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Contacto",
                res.getDrawable(android.R.drawable.ic_dialog_map));
        tabs.addTab(spec);

        tabs.setCurrentTab(0);

        tabs.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            public void onTabChanged(String tabId) {
                Log.i("AndroidTabsDemo", "Pulsada pesta�a: " + tabId);
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
                Intent ii = new Intent(MasCanarias.this, MainActivity.class);
                startActivity(ii);
                return true;
            case R.id.ciudades:
                Intent j = new Intent(MasCanarias.this, Ciudades.class);
                startActivity(j);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}
