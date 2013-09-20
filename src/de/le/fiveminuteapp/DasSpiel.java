package de.le.fiveminuteapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DasSpiel extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_das_spiel);

		View button = findViewById(R.id.button1);
		button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				EditText numberView = (EditText) findViewById(R.id.editText1);
				int guess = Integer.parseInt(numberView.getText().toString());

				TextView descriptionView = (TextView) findViewById(R.id.textView1);

				int number = (int) Math.round(5 * Math.random());
				if (number == guess) {
					descriptionView.setText("Richtig!");
				} else {
					descriptionView.setText("Leider falsch!");
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.das_spiel, menu);
		return true;
	}

}
