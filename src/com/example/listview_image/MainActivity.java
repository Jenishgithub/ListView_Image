package com.example.listview_image;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {
	ListView list;
	String[] web = { "Google plus", "Twitter", "Facebook", "Instagram" };
	Integer[] imageID = { R.drawable.elephantass, R.drawable.elephanttrunk,
			R.drawable.cartman, R.drawable.cuboids };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		CustomList adapter = new CustomList(MainActivity.this, web, imageID);
		list = (ListView) findViewById(R.id.list);
		list.setAdapter(adapter);

	}

}
