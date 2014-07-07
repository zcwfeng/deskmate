package com.deskmate.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.deskmate.R;

/**
 * @author cl19910824-
 *学生证
 */
public class StudentCardActivity extends BaseActivity{

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_student_card);
		
		initView();
		
	}
	
	public void initView(){
		super.baseInitView();
		setCommonTitle("学生证", false);
		setButtonLeft(R.drawable.button_back_selector);
		
	}
	
}
