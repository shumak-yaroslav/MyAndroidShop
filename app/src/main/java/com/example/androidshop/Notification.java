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

public class Notification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener getBottomNavigationListener() {
        return new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        Intent intent8 = new Intent(Notification.this, Main2Activity.class);
                        startActivity(intent8);
                        break;
                    case R.id.action_user:
                        Intent intent10 = new Intent(Notification.this, MainActivity.class);
                        startActivity(intent10);
                        break;
                    case R.id.action_search:
                        Intent intent9 = new Intent(Notification.this, Search.class);
                        startActivity(intent9);
                        break;
                }
                return true;
            }
        };


    }

}
