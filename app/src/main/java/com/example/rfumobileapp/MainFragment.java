package com.example.rfumobileapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainFragment extends Fragment {

    private BottomNavigationView bottomNavigationView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        initView(view);
        initBottomNavView();

        return view;
    }

    private void initBottomNavView() {
        bottomNavigationView.setSelectedItemId(R.id.event);
        // TODO: 4/23/2020 Finish this
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.event:
                        break;
                    case R.id.dashboard:
                        Toast.makeText(getActivity(), "Search Selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mutabaah:

                        break;
                    default:
                        break;
                }
                return false;
            }
        });
    }

    private void initView(View view) {
        bottomNavigationView = view.findViewById(R.id.bottomNavView);
    }
}
