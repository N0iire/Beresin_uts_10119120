package com.example.beresin_uts_10119120;
/**
 * NIM : 10119120
 * NAMA : REICHAN MUHAMMAD MAULANA
 * KELAS : IF3
 * **/
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.example.beresin_uts_10119120.adapter.NotesAdapter;
import com.example.beresin_uts_10119120.database.NoteDatabase;
import com.example.beresin_uts_10119120.model.Notes;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener{
    BottomNavigationView bottomNavigationView;
    FragmentManager fragmentManager;
    List<Notes> notes;
    NotesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#f5f6fa"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setIcon(R.drawable.ic_logo);




        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.notes);

        ProfileFragment profileFragment = new ProfileFragment();
        NotesFragment notesFragment = new NotesFragment();
        AboutFragment aboutFragment = new AboutFragment();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.profile:
                        item.isEnabled();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, profileFragment).commit();
                        break;
                    case R.id.notes:
                        item.isEnabled();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, notesFragment).commit();
                        break;
                    case R.id.information:
                        item.isEnabled();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, aboutFragment).commit();
                        break;
                    default:
                        return false;
                }
                return false;
            }
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

}