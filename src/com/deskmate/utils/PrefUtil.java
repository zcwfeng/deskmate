package com.deskmate.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * preference 相关操作
 */
public class PrefUtil {
	private static final String APPLICATION_PREFERENCES = "deskmate_prefs";

	private static Editor editor;
	private static SharedPreferences pref;

	private static void initPref(Context context) {
		if (null == pref)
			pref = context.getSharedPreferences(APPLICATION_PREFERENCES,
					Context.MODE_PRIVATE);
	}

	public static void removePref(Context context, String prefKey) {
		initEditor(context);
		editor.remove(prefKey);
		editor.commit();
	}

	private static void initEditor(Context context) {
		initPref(context);
		editor = pref.edit();
	}

	/**
	 * 保存字符串Pref
	 * 
	 * @param context
	 * @param key
	 * @param value
	 */
	public static void savePref(Context context, String key, String value) {
		initEditor(context);
		editor.putString(key, value);
		editor.commit();
	}

	/**
	 * 保存布尔值Pref
	 * 
	 * @param context
	 * @param key
	 * @param value
	 */
	public static void savePref(Context context, String key, boolean value) {
		initEditor(context);
		editor.putBoolean(key, value);
		editor.commit();
	}

	/**
	 * 保存整形Pref
	 * 
	 * @param context
	 * @param key
	 * @param value
	 */
	public static void savePref(Context context, String key, int value) {
		initEditor(context);
		editor.putInt(key, value);
		editor.commit();
	}

	/**
	 * 获取pref中key对应的字符串值
	 * 
	 * @param context
	 * @param key
	 * @return
	 */
	public static String getStringPref(Context context, String key) {
		return getStringPref(context, key, "");
	}

	public static String getStringPref(Context context, String key,
			String defaultValue) {
		initPref(context);
		return pref.getString(key, defaultValue);
	}

	/**
	 * 获取pref中key对应的布尔值
	 * 
	 * @param context
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public static boolean getBooleanPref(Context context, String key,
			boolean defaultValue) {
		initPref(context);
		return pref.getBoolean(key, defaultValue);
	}

	/**
	 * 获取pref中key对应的整形
	 * 
	 * @param context
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public static int getIntPref(Context context, String key, int defaultValue) {
		initPref(context);
		return pref.getInt(key, defaultValue);
	}

}
