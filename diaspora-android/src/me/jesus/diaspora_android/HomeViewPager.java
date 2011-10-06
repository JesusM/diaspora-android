package me.jesus.diaspora_android;

import greendroid.app.GDActivity;
import greendroid.widget.ActionBar;
import greendroid.widget.ActionBarItem;
import greendroid.widget.ActionBarItem.Type;

import com.jakewharton.android.viewpagerindicator.TitlePageIndicator;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;

public class HomeViewPager extends GDActivity {
	private MenuInflater inflater = getMenuInflater();
	private static final int ACTION_BAR_INFO = 0;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
//		requestWindowFeature(Window.FEATURE_NO_TITLE);
//		setContentView(R.layout.home_view_pager);
		
		setActionBarContentView(R.layout.home_view_pager);
		setTitle("Updates");
//		getActionBar().setType(ActionBar.Type.Dashboard);
        addActionBarItem(Type.Compose, ACTION_BAR_INFO);
//		ViewPagerAdapter adapter = new ViewPagerAdapter(this);
		ViewPagerAdapter adapter = new ViewPagerAdapter(this,new String [] {"Friends","All aspects","Contacts"});
		ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
		
		TitlePageIndicator indicator = (TitlePageIndicator) findViewById(R.id.indicator);
		
		pager.setAdapter(adapter);
//		pager.setCurrentItem(2);
		indicator.setViewPager(pager);
		indicator.setCurrentItem(2);
		pager.setCurrentItem(2);
//		findViewById(R.id.new_comment_header).setOnClickListener(new OnClickListener(){
//
//			@Override
//			public void onClick(View arg0) {
//				// TODO Auto-generated method stub
//				startActivity(new Intent(HomeViewPager.this,
//						VistaEscribir.class));
//			}
//			
//		});
	}
	
	@Override
	public boolean onHandleActionBarItemClick(ActionBarItem item, int position) {
		switch(item.getItemId()) {
		case ACTION_BAR_INFO:
			startActivity(new Intent(this, VistaEscribir.class));
			break;
		default:
			return super.onHandleActionBarItemClick(item, position);
		}
		return true;
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
