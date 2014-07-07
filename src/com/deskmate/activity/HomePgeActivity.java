package com.deskmate.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.deskmate.R;
import com.deskmate.utils.Constants;

/**
 * @author cl19910824-
 *个人主页
 */
public class HomePgeActivity extends BaseActivity{
	
	private TextView mTextViewNote;
	private TextView mTextViewStudentCard;
	private TextView mTextViewAction;

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_homepage);
		
		initView();
		
	}
	
	public void initView(){
		super.baseInitView();
		setTextViewRight("编辑资料");
		setCommonTitle("主页", false);
		setButtonLeft(R.drawable.button_back_selector);
		
		findViewById(R.id.homepage_note_tv).setOnClickListener(this);
		findViewById(R.id.homepage_studentCard_tv).setOnClickListener(this);
		findViewById(R.id.homepage_action_tv).setOnClickListener(this);
		
	}
	
	@Override
	public void onClick(View v) {
		super.onClick(v);
		Intent intent=null;
		switch (v.getId()) {
		case R.id.common_right_tv:
			startActivityWithAnimation(EditUserInfoActivity.class);
			break;
		case R.id.homepage_note_tv:
			intent=new Intent(this, NoteActivity.class);
			intent.putExtra(Constants.ACTIVITY_TITLE, getResources().getString(R.string.homepage_note));
			startActivityWithAnimation(intent);
			break;
		case R.id.homepage_studentCard_tv:
			startActivityWithAnimation(StudentCardActivity.class);
			break;
		case R.id.homepage_action_tv:
			intent=new Intent(this, ActionActivity.class);
			intent.putExtra(Constants.ACTIVITY_TITLE, getResources().getString(R.string.homepage_action));
			startActivityWithAnimation(intent);
			break;
		
		default:
			break;
		}
	}
	
}
