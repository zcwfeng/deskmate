package com.deskmate.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.deskmate.R;
import com.deskmate.utils.Constants;

/**
 * @author cl19910824-
 *活动
 */
public class ActionActivity extends BaseActivity{

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_action);
		
		initView();
		
	}
	
	public void initView(){
		super.baseInitView();
		String title=getIntent().getStringExtra(Constants.ACTIVITY_TITLE);
		setCommonTitle(title);
		setButtonLeft(R.drawable.button_back_selector);
		
	}
	
}
