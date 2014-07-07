package com.deskmate.activity;

import com.deskmate.R;

import android.os.Bundle;


public class EditUserInfoActivity extends BaseActivity {
	
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_user_info);
		
		initView();
		
	}
	
	public void initView(){
		super.baseInitView();
		setCommonTitle("个人信息", false);
		setButtonLeft(R.drawable.button_back_selector);
	}

}
