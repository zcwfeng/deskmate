package com.deskmate.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.deskmate.R;

/**
 * @author cl19910824-
 *收藏夹
 */
public class FavoriteActivity extends BaseActivity{

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_favorite);
		
		initView();
		
	}
	
	public void initView(){
		super.baseInitView();
		setCommonTitle("收藏夹", false);
		setButtonLeft(R.drawable.button_back_selector);
		
	}
	
}
