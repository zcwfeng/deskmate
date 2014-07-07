package com.deskmate.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TextView;

import com.deskmate.R;
import com.deskmate.fragment.ClassroomFragment;
import com.deskmate.fragment.DynamicFragment;
import com.deskmate.fragment.IFragment;
import com.deskmate.fragment.PlazaFragment;
import com.deskmate.utils.Loger;

/**
 * @author cl19910824- 主页
 */
public class MainActivity extends BaseActivity implements OnTabChangeListener{

	private FragmentTabHost mTabHost;
	
	/** 
     * 定义数组来存放tab text
     */  
	private static final String mTxt_Array[] = { "广场", "课堂", "动态", "个人" };
	
	/** 
     * 定义数组来存放tab layout
     */  
	private static final int mIayoutViewArray[] = { R.layout.indicator_plaza,R.layout.indicator_classroom, R.layout.indicator_dynamic,R.layout.indicator_i };
	
	/** 
     * 定义数组来存放Fragment界面 
     */  
	private static final Class mFragmentArray[] = { PlazaFragment.class,ClassroomFragment.class, DynamicFragment.class, IFragment.class };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Loger.d("cyj_acativity", "onCreate");
		setContentView(R.layout.activity_main);

		initViwe();

		addTab();
		
	}

	private void initViwe() {
		super.baseInitView();
		
		mTabHost = (FragmentTabHost) findViewById(R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(),
				R.id.layout_realtabcontent);
		mTabHost.setOnTabChangedListener(this);
	}

	/**
	 * 添加标签
	 */
	private void addTab() {
		for(int i=0;i<mIayoutViewArray.length;i++){
			mTabHost.addTab(
					mTabHost.newTabSpec(mTxt_Array[i]).setIndicator(
							getIndicatorView(mTxt_Array[i], mIayoutViewArray[i])),
					mFragmentArray[i], null);
		}
	}

	private View getIndicatorView(String name, int layoutId) {
		View v = getLayoutInflater().inflate(layoutId, null);
		TextView tv = (TextView) v.findViewById(R.id.tv_tabtext);
		tv.setText(name);
		return v;
	}

	public void switchContent(Fragment fragment) {
		getSupportFragmentManager().beginTransaction()
				.replace(android.R.id.tabcontent, fragment).commit();

	}

	/* 
	 * tab切换监听器
	 */
	@Override
	public void onTabChanged(String tabId) {
		Loger.d("cyj_onTabChanged", "tabId: "+tabId);
		for (int i = 0; i < mTxt_Array.length; i++) {
			if(tabId.equals(mTxt_Array[i])){
				setCommonTitle(mTxt_Array[i],i==1);
				break;
			}
		}
	}

}
