package com.deskmate.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.deskmate.R;

/**
 * @author cl19910824-
 *课堂
 */
public class ClassroomFragment extends Fragment {

	private ViewPager mViewPager;

	private List<Fragment> mListFragment;

	private PagerAdapter mPagerAdapter;
	private ClassroomHeadlineFragment mFragmentHeadline;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_classroom, container,
				false);

		initFragments();

		initView(view);

		addHeadLine();

		return view;
	}

	private void initFragments() {
		if (mListFragment == null) {
			mListFragment = new ArrayList<Fragment>();
			mListFragment.add(new ClassroomBlackboardFragment());
			mListFragment.add(new ClassroomSeatFragment());
			mListFragment.add(new ClassroomActionFragment());
		}
	}

	private void initView(View view) {
		mViewPager = (ViewPager) view.findViewById(R.id.viewPager_classroom);
		mPagerAdapter = new PagerAdapter(getChildFragmentManager());
		mViewPager.setAdapter(mPagerAdapter);

	}

	private void addHeadLine() {
			mFragmentHeadline = new ClassroomHeadlineFragment();
			mFragmentHeadline.setViewPager(mViewPager);
			getChildFragmentManager().beginTransaction()
			.replace(R.id.layout_headline, mFragmentHeadline).commit();

	}

	class PagerAdapter extends FragmentPagerAdapter {

		public PagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int positon) {
			return mListFragment.get(positon);
		}

		@Override
		public int getCount() {
			return mListFragment.size();
		}

	}

}
