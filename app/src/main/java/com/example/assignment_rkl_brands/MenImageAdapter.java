package com.example.assignment_rkl_brands;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MenImageAdapter extends ArrayAdapter<SamplesArrayLoist> {


    public MenImageAdapter(Context c, ArrayList<SamplesArrayLoist> samplesArrayLoists) {
        super(c, 0, samplesArrayLoists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.items_men, parent, false);
        }

        SamplesArrayLoist samplesArrayLoist = getItem(position);
        TextView pricesView1 = listitemView.findViewById(R.id.price_preview);
        ImageView prodImg1 = listitemView.findViewById(R.id.img_preview);
        pricesView1.setText(samplesArrayLoist.getPrices());
        prodImg1.setImageResource(samplesArrayLoist.getImgID());
        return listitemView;

    }
}
