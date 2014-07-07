package com.deskmate.fragment;

import com.deskmate.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author cl19910824-
 *课堂——活动
 */
public class ClassroomActionFragment extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.fragment_classroom_action, container,false);
		return view;
	}
	
}
