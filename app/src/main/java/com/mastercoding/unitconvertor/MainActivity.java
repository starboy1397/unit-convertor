package com.mastercoding.unitconvertor;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.mastercoding.unitconvertor.databinding.ActivityMainBinding;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding viewBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(viewBinding.getRoot());

        viewBinding.button.setOnClickListener(v->{
            double kilos = Double.parseDouble(viewBinding.editTxt.getText().toString());
            double pounds = kilos * 2.205;
            viewBinding.textView.setText(String.format(Locale.getDefault(),"%.2f",pounds));
        });

    }
}