package com.deskmate.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;

import com.deskmate.R;
import com.deskmate.utils.Constants;
import com.deskmate.view.SelectMajorPopupWindow;

public class BaseActivity extends FragmentActivity implements OnClickListener {
	private TextView mTextViewTitle;
	private TextView mTextViewRight;
	private ImageButton mButtonLeft;
	private ImageButton mButtonRight;

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	}

	public void baseInitView() {
		mTextViewTitle = (TextView) findViewById(R.id.textview_common_title);
		mTextViewTitle.setOnClickListener(this);

		mTextViewRight = (TextView) findViewById(R.id.common_right_tv);
		mTextViewRight.setOnClickListener(this);

		mButtonLeft = (ImageButton) findViewById(R.id.imagebutton_common_left);
		mButtonLeft.setOnClickListener(this);

		mButtonRight = (ImageButton) findViewById(R.id.imagebutton_common_right);
		mButtonRight.setOnClickListener(this);
	}

	/**
	 * @param title
	 *            设置title
	 */
	public void setCommonTitle(String title, boolean enabled) {
		mTextViewTitle.setText(title);
		mTextViewTitle.setEnabled(enabled);
	}

	/**
	 * @param title
	 *            设置title
	 */
	public void setCommonTitle(String title) {
		setCommonTitle(title, false);
	}

	/**
	 * @param text
	 * @param resid
	 *            设置左侧按钮
	 */
	public void setButtonLeft(int resid) {
		mButtonLeft.setVisibility(View.VISIBLE);
		mButtonLeft.setBackgroundResource(resid);
	}

	/**
	 * @param text
	 * @param resid
	 *            设置左侧按钮
	 */
	public void setButtonRight(int resid) {
		mButtonRight.setVisibility(View.VISIBLE);
		mButtonRight.setBackgroundResource(resid);
	}

	/**
	 * @param text
	 * @param resid
	 *            设置右侧文字
	 */
	public void setTextViewRight(String text) {
		mTextViewRight.setVisibility(View.VISIBLE);
		mTextViewRight.setText(text);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.textview_common_title:
			showSelectMajorPopWindow();
			break;
		case R.id.imagebutton_common_left:
			closeActivityWithAnimation();
			break;

		default:
			break;
		}
	}

	/**
	 * 选择专业弹窗
	 */
	public void showSelectMajorPopWindow() {
		SelectMajorPopupWindow popupWindow = new SelectMajorPopupWindow(this,
				null);
		int xoff = (-popupWindow.getWidth() + mTextViewTitle.getWidth()) / 2;
		popupWindow.showAsDropDown(mTextViewTitle, xoff, 0);
	}

	/**
	 * @param c
	 *            动画方式加载activity
	 */
	public void startActivityWithAnimation(Class<? extends Activity> c) {
		startActivityWithAnimation(new Intent(this, c));
	}

	/**
	 * @param c
	 *            动画方式加载activity
	 */
	public void startActivityWithAnimation(Intent intent) {
		startActivity(intent);
		overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
	}

	/**
	 * @param c
	 *            动画方式关闭activity
	 */
	public void closeActivityWithAnimation() {
		finish();
		overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
	}
	
}
