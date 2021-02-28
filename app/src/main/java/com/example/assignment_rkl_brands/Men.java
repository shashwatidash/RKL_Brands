package com.example.assignment_rkl_brands;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class Men extends Fragment {

    GridView gv;
    ArrayList<SamplesArrayLoist> samplesM = new ArrayList<SamplesArrayLoist>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        samplesM.add(new SamplesArrayLoist("900", R.drawable.ms1));
        samplesM.add(new SamplesArrayLoist("950", R.drawable.ms2));
        samplesM.add(new SamplesArrayLoist("800", R.drawable.ms3));
        samplesM.add(new SamplesArrayLoist("550", R.drawable.ms4));
        samplesM.add(new SamplesArrayLoist("1050", R.drawable.ms5));
        samplesM.add(new SamplesArrayLoist("790", R.drawable.ms6));

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_men,container, false);

        gv = view.findViewById(R.id.gridView2);
        MenImageAdapter adapter = new MenImageAdapter(getContext(), samplesM);
        gv.setAdapter(adapter);
        return view;
    }
}