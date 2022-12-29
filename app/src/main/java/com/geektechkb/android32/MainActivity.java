package com.geektechkb.android32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
   MaterialButton btnSecondFragment;
   MaterialButton btnFirstFragment;
   FrameLayout frameLayout;
    private FirstFragment firstFragment=new FirstFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFirstFragment=findViewById(R.id.btn_first_fragment);
        btnSecondFragment=findViewById(R.id.btn_second_fragment);
        setNewfragment(firstFragment);
       btnFirstFragment.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               setNewfragment(firstFragment);
           }
       });
        btnSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragment secondFragment=new SecondFragment();
                setNewfragment(secondFragment);
            }
        });
    }
    private void setNewfragment(Fragment fragment){

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction tf=fragmentManager.beginTransaction();
        tf.replace(R.id.frame_layout,fragment);
        tf.commit();

    }
}