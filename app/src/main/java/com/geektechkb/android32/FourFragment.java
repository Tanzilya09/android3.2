package com.geektechkb.android32;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.material.button.MaterialButton;

public class FourFragment extends Fragment {
    private EditText etFour;
    ImageView imageFour;
    MaterialButton btnFour;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_four, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etFour = view.findViewById(R.id.et_four);
        imageFour = view.findViewById(R.id.image_four);
        btnFour = view.findViewById(R.id.btn_four);
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = etFour.getText().toString().trim();

                if (text.isEmpty()){
                   etFour.setError("Введите текст");
                }else {}
            }
        });
    }
}