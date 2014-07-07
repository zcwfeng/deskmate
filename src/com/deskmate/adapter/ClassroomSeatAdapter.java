package com.deskmate.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.deskmate.R;

/**
 * @author cl19910824-
 *课堂座位适配器
 */
public class ClassroomSeatAdapter extends BaseAdapter{
	private Context mContext;
	private LayoutInflater mInflater;
	
	public ClassroomSeatAdapter(Context context) {
		super();
		this.mContext = context;
		mInflater=LayoutInflater.from(mContext);
	}

	@Override
	public int getCount() {
		return 12;
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder=new ViewHolder();
		if(convertView==null){
			convertView=mInflater.inflate(R.layout.item_classroom_seat, null);
			convertView.setTag(holder);
		}else{
			holder=(ViewHolder) convertView.getTag();
		}
		return convertView;
	}
	
	class ViewHolder {
		
	}

}
