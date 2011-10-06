package me.jesus.diaspora_android;

import greendroid.app.GDActivity;
import greendroid.widget.ActionBar;
import greendroid.widget.ActionBarItem;
import greendroid.widget.ActionBarItem.Type;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;

public class Dashboard extends Activity {
	private MenuInflater inflater = getMenuInflater();

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.dashboard);
//		getActionBar().setType(ActionBar.Type.Dashboard);
//		findViewById(R.id.button6).setEnabled(false);
//		findViewById(R.id.logo_header).setOnClickListener(
//				new OnClickListener() {
//
//					@Override
//					public void onClick(View arg0) {
//						// TODO Auto-generated method stub
//						startActivity(new Intent(Dashboard.this,
//								NewMessage.class));
//					}
//				});
		findViewById(R.id.button2).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(Dashboard.this,Contacts.class));
			}
		});
		findViewById(R.id.button3).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(Dashboard.this,
						ViewNotifications.class));
			}
		});
		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(Dashboard.this, HomeViewPager.class));
			}
		});
		findViewById(R.id.button4).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

			}
		});
		findViewById(R.id.button5).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(Dashboard.this, ViewInbox.class));
			}
		});
		//		
		// findViewById(R.id.preferences_header).setOnClickListener(new
		// OnClickListener(){
		//
		// @Override
		// public void onClick(View arg0) {
		// // TODO Auto-generated method stub
		// startActivity(new Intent(Dashboard.this,AdvancedPreferences.class));
		// }});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		inflater.inflate(R.menu.menu_vista_principal, menu);

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int a = item.getItemId();
		getMenuInflater();
		switch (a) {
		case R.id.Preferencias:
			startActivity(new Intent(this, AdvancedPreferences.class));

			break;
		case R.id.Help:
			// showViewMeasureApp();
			finish();
			break;
		case R.id.AcercaDe:

			finish();
			break;
		}

		return true;
	}

}
