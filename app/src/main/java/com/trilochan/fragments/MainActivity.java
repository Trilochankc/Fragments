package com.trilochan.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.trilochan.fragments.FirstFragments.FirstFragment;
import com.trilochan.fragments.FirstFragments.FragmentSum;
import com.trilochan.fragments.FirstFragments.SecondFragment;

public class MainActivity extends AppCompatActivity {

   private Button btnFragment;
   private Boolean status = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragment = findViewById(R.id.btnFragment);

        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {

                    FragmentSum fragmentSum = new FragmentSum();
                    fragmentTransaction.replace(R.id.fragmentContainer,fragmentSum);
                    fragmentTransaction.commit();
                    btnFragment.setText("Load Second Fragment");
                    status = false;

                }
                else
                {
                    SecondFragment secondFragment = new SecondFragment();
                    fragmentTransaction.replace(R.id.fragmentContainer,secondFragment);
                    fragmentTransaction.commit();
                    btnFragment.setText("Load second fragment");
                    status = true;
                }


            }
        });
    }
}
