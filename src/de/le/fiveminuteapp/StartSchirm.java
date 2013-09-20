package de.le.fiveminuteapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class StartSchirm extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_schirm);

		String text = "Hallo\nBitte auf das Bild tippen.";
		Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();

		View meinBild = findViewById(R.id.imageView1);
		meinBild.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),
						DasSpiel.class);
				startActivity(intent);
				// Beendet die Activity damit der Zurück-Button von der
				// nachfolgenden Activity nicht zu dieser zurückkehren kann
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start_schirm, menu);
		return true;
	}

}
