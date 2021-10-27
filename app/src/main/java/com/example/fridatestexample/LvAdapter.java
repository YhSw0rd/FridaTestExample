package com.example.fridatestexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.fridatestexample.lv.Lv;

import java.util.List;

public class LvAdapter extends ArrayAdapter<Lv> {

    private int resourceId;
    public LvAdapter(@NonNull Context context, int resource, @NonNull List<Lv> objects) {
        super(context, resource, objects);
        this.resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Lv lv = getItem(position);

        View lvView;
        ViewHolder lvHolder;
        if(convertView == null){
            lvView = LayoutInflater.from(getContext()).inflate(this.resourceId,parent,false);
            lvHolder = new ViewHolder();
            lvHolder.lvTextView = lvView.findViewById(R.id.lv_item_text_view_lv);
            lvHolder.lvTextView.setText(lv.getLv());
            lvHolder.nameTextView = lvView.findViewById(R.id.lv_item_text_view_name);
            lvHolder.nameTextView.setText(lv.getName());
            lvHolder.button = lvView.findViewById(R.id.lv_item_button);
            lvHolder.button.setOnClickListener(lv.getClickListener());
            lvView.setTag(lvHolder);
        }else{
            lvView = convertView;
            lvHolder = (ViewHolder)lvView.getTag();
            lvHolder.lvTextView.setText(lv.getLv());
            lvHolder.nameTextView.setText(lv.getName());
            lvHolder.button.setOnClickListener(lv.getClickListener());
        }
        return lvView;

    }

    class ViewHolder{
        public TextView lvTextView;
        public TextView nameTextView;
        public Button button;
    }
}
