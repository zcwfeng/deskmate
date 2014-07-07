package com.deskmate.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

import com.deskmate.R;
import com.deskmate.utils.DeviceInfoUtils;

/**
 * @author cl19910824-
 *选择专业
 */
public class SelectMajorPopupWindow extends PopupWindow {

	private Context mContext;;
	
	private View mMenuView;
	int h;
	int w;

	public SelectMajorPopupWindow(Activity context, OnClickListener itemsOnclick) {
		super(context);
		mContext=context;
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		mMenuView = inflater.inflate(R.layout.popwindow_select_major, null);
		w = DeviceInfoUtils.getWidth(context);
		h =DeviceInfoUtils.getHeight(context);
		
		initView();
		
		initBody();
	}


	private void initView() {
			
	}


	private void initBody() {
		// 设置按钮监听
		// 设置SelectPicPopupWindow的View
		this.setContentView(mMenuView);
		// 设置SelectPicPopupWindow弹出窗体的宽
		this.setWidth(w/2);
		// 设置SelectPicPopupWindow弹出窗体的高
		this.setHeight(h/2);
		// 设置SelectPicPopupWindow弹出窗体可点击
		this.setFocusable(true);
		// 设置SelectPicPopupWindow弹出窗体动画效果
		this.setAnimationStyle(R.style.SelectMajorTheme);
		// 实例化一个ColorDrawable颜色为半透明
		ColorDrawable dw = new ColorDrawable(mContext.getResources().getColor(R.color.app_title_black));
		// 设置SelectPicPopupWindow弹出窗体的背景
		this.setBackgroundDrawable(dw);
		// mMenuView添加OnTouchListener监听判断获取触屏位置如果在选择框外面则销毁弹出框
//		mMenuView.setOnTouchListener(new OnTouchListener() {
//
//			public boolean onTouch(View v, MotionEvent event) {
//
//				int height = mMenuView.findViewById(R.id.pop_layout).getTop();
//				int y = (int) event.getY();
//				if (event.getAction() == MotionEvent.ACTION_UP) {
//					if (y < height) {
//						dismiss();
//					}
//				}
//				return true;
//			}
//		});
	}
}
