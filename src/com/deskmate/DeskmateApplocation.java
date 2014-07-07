package com.deskmate;

import android.app.Application;
import android.widget.Toast;

public class DeskmateApplocation extends Application{
	
	@Override
	public void onCreate() {
		super.onCreate();
	}
	
	public DeskmateApplocation getApplication(){
		return this;
	}
	
	public void showShortToast(int resId) {
		Toast.makeText(this, resId, Toast.LENGTH_SHORT).show();
	}
	
}
