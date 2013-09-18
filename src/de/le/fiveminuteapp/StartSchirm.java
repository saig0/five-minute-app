package de.le.fiveminuteapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class StartSchirm extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(de.le.fiveminuteapp.R.layout.activity_start_schirm);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater()
				.inflate(de.le.fiveminuteapp.R.menu.start_schirm, menu);
		return true;
	}

}
