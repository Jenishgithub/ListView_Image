package com.example.listview_image;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String> {
	Activity mContext;
	String[] web;
	Integer[] imageID;

	public CustomList(Activity context, String[] web, Integer[] imgID) {
		super(context, R.layout.list_single, web);
		this.mContext = context;
		this.web = web;
		this.imageID = imgID;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = mContext.getLayoutInflater();
		View rowVIew = inflater.inflate(R.layout.list_single, null, true);
		TextView txtTitle = (TextView) rowVIew.findViewById(R.id.txt);
		ImageView imageView = (ImageView) rowVIew.findViewById(R.id.imageView1);
		txtTitle.setText(web[position]);
		imageView.setImageResource(imageID[position]);
		return rowVIew;
	}

}
