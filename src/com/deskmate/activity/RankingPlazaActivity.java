package com.deskmate.activity;

import android.os.Bundle;

import com.deskmate.R;

/**
 * @author cl19910824-
 *校园排行榜
 */
public class RankingPlazaActivity extends BaseActivity{

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_ranking_palza);
		
		initView();
		
	}
	
	public void initView(){
		super.baseInitView();
		setCommonTitle("校园排行榜", false);
		setButtonLeft(R.drawable.button_back_selector);
		
	}
	
}
