package com.deskmate.fragment;

import com.deskmate.R;
import com.deskmate.activity.ActionActivity;
import com.deskmate.activity.NoteActivity;
import com.deskmate.activity.RankingItemActivity;
import com.deskmate.activity.RankingPlazaActivity;
import com.deskmate.utils.Constants;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

/**
 * @author cl19910824-
 *广场
 */
public class PlazaFragment extends BaseFragment implements OnClickListener{
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.fragment_plaza, container,false);
		
		initView(view);
		
		return view;
	}

	private void initView(View view) {
		view.findViewById(R.id.plaza_ranking_layout).setOnClickListener(this);
		view.findViewById(R.id.plaza_ranking1_tv).setOnClickListener(this);
		view.findViewById(R.id.plaza_ranking2_tv).setOnClickListener(this);
		view.findViewById(R.id.plaza_ranking3_tv).setOnClickListener(this);
		view.findViewById(R.id.plaza_ranking4_tv).setOnClickListener(this);
		view.findViewById(R.id.plaza_seek_layout).setOnClickListener(this);
		view.findViewById(R.id.plaza_return_layout).setOnClickListener(this);
		view.findViewById(R.id.plaza_dynamic_layout).setOnClickListener(this);
		view.findViewById(R.id.plaza_action_layout).setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		Intent intent=null;
		switch (v.getId()) {
		case R.id.plaza_ranking_layout:
			startActivityWithAnimation(RankingPlazaActivity.class);
			break;
		case R.id.plaza_ranking1_tv:
			startActivityWithAnimation(RankingItemActivity.class);
			break;
		case R.id.plaza_ranking2_tv:
			startActivityWithAnimation(RankingItemActivity.class);
			break;
		case R.id.plaza_ranking3_tv:
			startActivityWithAnimation(RankingItemActivity.class);
			break;
		case R.id.plaza_ranking4_tv:
			startActivityWithAnimation(RankingItemActivity.class);
			break;
		case R.id.plaza_seek_layout:
			startActivityWithAnimation(RankingItemActivity.class);
			break;
		case R.id.plaza_return_layout:
			startActivityWithAnimation(RankingItemActivity.class);
			break;
		case R.id.plaza_dynamic_layout:
			intent=new Intent(getActivity(), NoteActivity.class);
			intent.putExtra(Constants.ACTIVITY_TITLE, getResources().getString(R.string.plaza_ranking));
			startActivityWithAnimation(intent);
			break;
		case R.id.plaza_action_layout:
			intent=new Intent(getActivity(), ActionActivity.class);
			intent.putExtra(Constants.ACTIVITY_TITLE, getResources().getString(R.string.plaza_Action));
			startActivityWithAnimation(intent);
			break;

		default:
			break;
		}
		
	}

}
