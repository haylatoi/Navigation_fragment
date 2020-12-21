package com.example.navigation_fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNv = findViewById(R.id.buttom_nv);

        bottomNv.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        toolbar1 = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.buttom_nv);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        loadFragment(new Fragment_Home() );


        Fragment_me fragmentMe = new Fragment_me();
        FragmentManager fm = getSupportFragmentManager();
       // fm.beginTransaction().add(R.id.mainLayout,fragmentMe).commit();


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.draw_menu,menu);
        return true;}


    public boolean onNavigationItemSelected(MenuInflater item){
        return true;
    }




    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }




//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
//                || super.onSupportNavigateUp();
//    }
    // }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.bt_home:
                    fragment = new Fragment_Home();
                    loadFragment(fragment);
                    return true;
              case R.id.bt_dh:
                   fragment = new Fragment_dh();
                   loadFragment(fragment);
                  return true;
               case R.id.bt_saved:
                   fragment = new Fragment_saved();
                  loadFragment(fragment);
                    return true;
               case R.id.bt_noti:
                   fragment = new Fragment_noti();
                   loadFragment(fragment);
                   return true;
                case R.id.bt_me:
                    fragment = new Fragment_me();
                    loadFragment(fragment);
                    return true;

            }
            return false;
        }


    };




}