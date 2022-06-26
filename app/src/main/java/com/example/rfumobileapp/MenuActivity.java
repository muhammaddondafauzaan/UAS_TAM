package com.example.rfumobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MenuActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        bottomNavigation = findViewById(R.id.bottomNavigationView);


        getSupportFragmentManager().beginTransaction().replace(R.id.menuApp, new
                DashboardFragment()).commit();

        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch (item.getItemId()) {
                    case R.id.navigation_dashboard:
                        selectedFragment = new DashboardFragment();
                        break;
                    case R.id.navigation_events:
                        selectedFragment = new EventsFragment();
                        break;
                    case R.id.navigation_mutabaah:
                        selectedFragment = new MutabaahFragment();
                        break;
                    case R.id.navigation_setting:
                        startActivity(new Intent(MenuActivity.this, SettingFragment.class));
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.menuApp, selectedFragment).commit();
                return true;
            }
        });
    }
}