package com.example.android_tuan4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Product2Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Product2> product2List;

    public Product2Adapter(Context context, int layout, List<Product2> Product2List) {
        this.context = context;
        this.layout = layout;
        this.product2List = product2List;
    }

    @Override
    public int getCount() {
        return product2List.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHolder{
        ImageView imageView;
        TextView txtTen;
        TextView txtGiaBan;
        TextView txtGiaGiam;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view==null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder.imageView = (ImageView) view.findViewById(R.id.imgHinhAnh);
            holder.txtTen = (TextView) view.findViewById(R.id.txtTen);
            holder.txtGiaBan = (TextView) view.findViewById(R.id.txtGiaBan);
            holder.txtGiaGiam = (TextView) view.findViewById(R.id.txtGiamGia);
            view.setTag(holder);
        }
        else{
            holder = (ViewHolder) view.getTag();
        }
        Product2 product2 = product2List.get(i);
        holder.txtTen.setText(product2.getTen());
        holder.txtGiaGiam.setText(product2.getGiamGia());
        holder.txtGiaBan.setText(product2.getGiaBan());
        holder.imageView.setImageResource(product2.getHinhAnh());
        return view;
    }
}
