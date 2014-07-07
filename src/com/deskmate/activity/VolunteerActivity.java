package com.deskmate.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.deskmate.R;

/**
 * @author cl19910824-
 *填报志愿
 */
public class VolunteerActivity extends BaseActivity{

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_volunteer);
		
		initView();
		
	}
	
	public void initView(){
		super.baseInitView();
		setCommonTitle("填报志愿", false);
		setButtonLeft(R.drawable.button_back_selector);
		
	}
	
}
