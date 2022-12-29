package com.geektechkb.android32;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class ThirdFragment extends Fragment {
    private EditText passwordThirdFragment;
    private final String admin ="Admin";
    private EditText nameThirdFragment;
    private MaterialButton btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        passwordThirdFragment=view.findViewById(R.id.password_third_fragment);
        nameThirdFragment=view.findViewById(R.id.name_third_fragment);
        btn=view.findViewById(R.id.btn);
        click();
    }
    private void click(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=nameThirdFragment.getText().toString();
                String password = passwordThirdFragment.getText().toString();
                if (!name.equals(admin) || !password.equals(admin)){
                    if (!name.equals(admin)){
                        nameThirdFragment.setError("Не правильное имя");
                    }else if(!password.equals(admin)){
                        passwordThirdFragment.setError("Не правильный пароль");
                    }else {
            getParentFragmentManager().beginTransaction()
                    .replace(R.id.frame_layout, new FirstFragment())
                    .addToBackStack(ThirdFragment.class.getName())
                    .commit();
        }
                    } else {
                        getParentFragmentManager().beginTransaction()
                                .replace(R.id.frame_layout, new FirstFragment())
                                .addToBackStack(ThirdFragment.class.getName())
                                .commit();
                    }
                }
            });
        }
    }
