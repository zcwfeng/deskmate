package com.deskmate.utils;

import android.content.Context;

public class DeviceInfoUtils {
	
	/**
	 * 获取屏幕宽度
	 * @param context
	 * @return
	 */
	public static int  getWidth(Context context){
		return context.getResources().getDisplayMetrics().widthPixels;
	}
	
	/**
	 * 获取屏幕高度
	 * @param context
	 * @return
	 */
	public static int getHeight(Context context){
		return context.getResources().getDisplayMetrics().heightPixels;
	}

}
