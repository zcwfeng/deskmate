package com.deskmate.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.deskmate.R;
import com.deskmate.activity.ActionActivity;
import com.deskmate.activity.FavoriteActivity;
import com.deskmate.activity.HomePgeActivity;
import com.deskmate.activity.MajorActivity;
import com.deskmate.activity.NoteActivity;
import com.deskmate.activity.StudentCardActivity;
import com.deskmate.activity.VolunteerActivity;

/**
 * @author cl19910824-
 *个人
 */
public class IFragment extends BaseFragment implements OnClickListener{
	
	private RelativeLayout mLinearLayoutIcon;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.fragment_i, container,false);
		
		initView(view);
		
		return view;
	}

	private void initView(View view) {
		mLinearLayoutIcon=(RelativeLayout) view.findViewById(R.id.layout_i_icon);
		mLinearLayoutIcon.setOnClickListener(this);
		
		view.findViewById(R.id.i_action_layout).setOnClickListener(this);
		view.findViewById(R.id.i_favorite_layout).setOnClickListener(this);
		view.findViewById(R.id.i_major_layout).setOnClickListener(this);
		view.findViewById(R.id.i_note_layout).setOnClickListener(this);
		view.findViewById(R.id.i_studentCard_layout).setOnClickListener(this);
		view.findViewById(R.id.i_volunteer_layout).setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.layout_i_icon:
			startActivityWithAnimation(HomePgeActivity.class);
			break;
		case R.id.i_action_layout:
			startActivityWithAnimation(ActionActivity.class);
			break;
		case R.id.i_favorite_layout:
			startActivityWithAnimation(FavoriteActivity.class);
			break;
		case R.id.i_major_layout:
			startActivityWithAnimation(MajorActivity.class);
			break;
		case R.id.i_note_layout:
			startActivityWithAnimation(NoteActivity.class);
			break;
		case R.id.i_studentCard_layout:
			
			startActivityWithAnimation(StudentCardActivity.class);
			break;
		case R.id.i_volunteer_layout://填报志愿
			startActivityWithAnimation( VolunteerActivity.class);
			break;

		default:
			break;
		}
		
	}


}
