package com.example.colorpicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnMessageSendListener {

    FragmentManager fg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            fg = getSupportFragmentManager();
            FragmentTransaction trans = fg.beginTransaction();
            InfoWebFragment cf = new InfoWebFragment();
            trans.add(R.id.colorFragment, cf, "colorFragment");
            TickerListFragment cl = new TickerListFragment();
            trans.add(R.id.listFragment, cl, "listFragment");

            trans.commit();
        }
    }

    @Override
    public void onMessageSend(String message) {

    }
}