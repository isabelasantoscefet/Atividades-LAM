package br.wave.androidtoolbar;

import android.support.design.widget.NavigationView;
import android.v4.app.Fragment;
import android.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.v4.widget.DrawerLayout;
import android.v4.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureNavigationDrawer();
        configureToolbar();
        Fragment f = new ViewItensFragment();

    }
}
