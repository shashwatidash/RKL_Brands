package com.example.assignment_rkl_brands;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WomenImageAdapter extends ArrayAdapter<SamplesArrayLoist> {

    public WomenImageAdapter(Context c, ArrayList<SamplesArrayLoist> samplesArrayList) {
        super(c, 0, samplesArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listitemView2 = convertView;
        if (listitemView2 == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView2 = LayoutInflater.from(getContext()).inflate(R.layout.items_women, parent, false);
        }

        SamplesArrayLoist samplesArrayList = getItem(position);
        TextView pricesView2 = listitemView2.findViewById(R.id.price_preview2);
        ImageView prodImg2 = listitemView2.findViewById(R.id.img_preview2);
        pricesView2.setText(samplesArrayList.getPrices());
        prodImg2.setImageResource(samplesArrayList.getImgID());
        return listitemView2;
    }
}
