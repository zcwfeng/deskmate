package com.deskmate.fragment;

import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

import com.deskmate.R;
import com.deskmate.utils.DeviceInfoUtils;

/**
 * @author cl19910824-
 *课堂滚动条
 */
public class ClassroomHeadlineFragment extends Fragment {

	private ViewPager viewPager;

	private TextView textViewLine;
	private LayoutParams params;
	private int lineWidth;
	private RadioGroup radioGroup;
	private int curOption = 0;

	public void setViewPager(ViewPager viewPager) {
		this.viewPager = viewPager;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_classroom_headline, container,false);

		initView(view);

		initPageIndicator();

		return view;
	}

	private void initView(View view) {
		radioGroup = (RadioGroup) view.findViewById(R.id.radioGroup);
	
		radioGroup.setOnCheckedChangeListener(new RadioListener());

		textViewLine = (TextView) view.findViewById(R.id.textViewLine);

		viewPager.setOnPageChangeListener(new ViewPagerListener());
		curOption=viewPager.getCurrentItem();
		viewPager.setCurrentItem(curOption);
	}

	class ViewPagerListener implements OnPageChangeListener {

		@Override
		public void onPageScrollStateChanged(int arg0) {
			
		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
			Animation anim = new TranslateAnimation(0, lineWidth * arg1, 0, 0);
			anim.setDuration(0);
			textViewLine.startAnimation(anim);
			params.width = lineWidth;

			if (arg1 == 0) {
				params.setMargins((int) (lineWidth * arg0), 0, 0, 0);
			} else {
				params.setMargins((int) (lineWidth * arg0 + lineWidth * arg1),
						0, 0, 0);
			}
			textViewLine.setLayoutParams(params);

			textViewLine.clearAnimation();
		}

		@Override
		public void onPageSelected(int position) {
			// List<View> list = radioGroup.getTouchables();
			// for (View view : list) {
			//
			// }
			RadioButton radioButton = (RadioButton) radioGroup
					.getChildAt(curOption);
			radioButton.setTextColor(getActivity().getResources().getColor(R.color.text_gray));
			RadioButton curRadioButton = (RadioButton) radioGroup
					.getChildAt(position);
			curRadioButton.setTextColor(getActivity().getResources().getColor(R.color.app_emerald_green));
			
			curOption = position;

		}

	}

	class RadioListener implements OnCheckedChangeListener {

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			List<View> list = group.getTouchables();
			int i = 0;
			for (; i < list.size(); i++) {
				if (list.get(i).getId() == checkedId) {
					break;
				}
			}

			viewPager.setCurrentItem(i);
		}

	}

	public void initPageIndicator() {
		params = (LayoutParams) textViewLine.getLayoutParams();
		lineWidth =DeviceInfoUtils.getWidth(getActivity())/ radioGroup.getChildCount();
		params.width = lineWidth;
		params.setMargins((int) (lineWidth * curOption), 0, 0, 0);
		textViewLine.setLayoutParams(params);
		
		RadioButton radioButton = (RadioButton) radioGroup
				.getChildAt(curOption);
		radioButton.setTextColor(getActivity().getResources().getColor(R.color.app_emerald_green));
	}
	
	

}
