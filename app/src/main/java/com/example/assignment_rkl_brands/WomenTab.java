package com.example.assignment_rkl_brands;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class WomenTab extends Fragment {

    GridView gv2;
    ArrayList<SamplesArrayLoist> samplesW = new ArrayList<SamplesArrayLoist>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        samplesW.add(new SamplesArrayLoist("900", R.drawable.ws1));
        samplesW.add(new SamplesArrayLoist("950", R.drawable.ws7));
        samplesW.add(new SamplesArrayLoist("800", R.drawable.ws3));
        samplesW.add(new SamplesArrayLoist("550", R.drawable.ws4));
        samplesW.add(new SamplesArrayLoist("1050", R.drawable.ws5));
        samplesW.add(new SamplesArrayLoist("790", R.drawable.ws8));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_women_tab,container,false);

        gv2 = (GridView) view.findViewById(R.id.gridView1);
        gv2.setAdapter(new WomenImageAdapter(getContext(), samplesW)); // uses the view to get the context instead of getActivity().
        return view;
    }
}