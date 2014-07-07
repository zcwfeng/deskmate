package com.deskmate.activity;

import android.os.Bundle;

import com.deskmate.R;

/**
 * @author cl19910824-
 *排行榜单
 */
public class RankingItemActivity extends BaseActivity{
	
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_ranking_item);
		
		initView();
		
	}
	
	public void initView(){
		super.baseInitView();
		setCommonTitle("**榜单", false);
		setButtonLeft(R.drawable.button_back_selector);
		
	}

}
