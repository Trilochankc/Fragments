package com.trilochan.fragments.FirstFragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.trilochan.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSum extends Fragment {

    private Button btncal;
    private EditText etfirst, etsecond;

    public FragmentSum() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fragment_sum, container, false);
        View view = inflater.inflate(R.layout.fragment_fragment_sum, container, false);

        etfirst = view.findViewById(R.id.edtfirst);
        etsecond = view.findViewById(R.id.edtsecond);
        btncal = view.findViewById(R.id.btncal);


        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(etfirst.getText().toString());
                int second = Integer.parseInt(etsecond.getText().toString());
                int result = first + second;
                Toast.makeText(getActivity(), "sum is: " + result, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}

