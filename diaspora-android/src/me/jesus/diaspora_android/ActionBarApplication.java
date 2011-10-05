package me.jesus.diaspora_android;

import android.content.Intent;
import android.net.Uri;
import greendroid.app.GDApplication;

public class ActionBarApplication extends GDApplication {
	
    @Override
    public Class<?> getHomeActivityClass() {
        return Dashboard.class;
    }
    
    @Override
    public Intent getMainApplicationIntent() {
        return new Intent(this, Dashboard.class);
    }

} 