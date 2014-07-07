package com.deskmate.fragment;

import com.deskmate.R;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;

public class BaseFragment extends Fragment implements OnClickListener{

	/**
	 * @param c
	 * 动画方式加载activity
	 */
	public void startActivityWithAnimation(Class<? extends Activity> c ) {
		startActivityWithAnimation(new Intent(getActivity(), c));
	}
	
	/**
	 * @param c
	 * 动画方式加载activity
	 */
	public void startActivityWithAnimation(Intent intent ) {
		getActivity().startActivity(intent);
		getActivity().overridePendingTransition(R.anim.slide_in_left,
				R.anim.slide_out_left);
	}

	@Override
	public void onClick(View v) {
		
	}
	
}
