package com.example.androidshop;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuItem;
import android.view.View;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener getBottomNavigationListener() {
        return new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        Intent intent11 = new Intent(Search.this, Main2Activity.class);
                        startActivity(intent11);
                        break;
                    case R.id.action_user:
                        Intent intent13 = new Intent(Search.this, MainActivity.class);
                        startActivity(intent13);
                        break;
                    case R.id.action_notification:
                        Intent intent12 = new Intent(Search.this, Notification.class);
                        startActivity(intent12);
                        break;

                }
                return true;
            }
        };


    }
}
