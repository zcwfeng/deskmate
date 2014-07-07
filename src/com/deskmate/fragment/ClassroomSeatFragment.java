package com.deskmate.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.deskmate.R;
import com.deskmate.adapter.ClassroomSeatAdapter;

/**
 * @author cl19910824-
 *课堂——活动
 */
public class ClassroomSeatFragment extends Fragment{
	private GridView mGridView;
	
	private ClassroomSeatAdapter mAdapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.fragment_classroom_seat, container,false);
		
		initView(view);
		
		return view;
	}

	private void initView(View view) {
		mGridView=(GridView) view.findViewById(R.id.classroom_seat_gridView);
		mAdapter=new ClassroomSeatAdapter(getActivity());
		mGridView.setAdapter(mAdapter);
	}
}
