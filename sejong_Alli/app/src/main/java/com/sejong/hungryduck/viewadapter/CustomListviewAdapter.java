package com.sejong.hungryduck.viewadapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.sejong.hungryduck.Details;
import com.sejong.hungryduck.model.CustomItem;
import com.sejong.hungryduck.sejong.R;

import java.util.ArrayList;


public class CustomListviewAdapter extends BaseAdapter{

    private Context allMenuContext = null;
    private ArrayList<CustomItem> allMenuListData = new ArrayList<CustomItem>();
    CustomItem addInfo;

    public CustomListviewAdapter(Context allMenuContext){
        super();
        this.allMenuContext = allMenuContext;
    }
    @Override
    public int getCount() {
        return allMenuListData.size();
    }

    @Override
    public Object getItem(int position) {
        return allMenuListData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void addItem(Drawable cusimage, String custitle, String cusdate){
        addInfo = new CustomItem();
        addInfo.setThumbnailImage(cusimage);
        addInfo.setTitle(custitle);
        addInfo.setRegDate(cusdate);
        allMenuListData.add(addInfo);
    }

    private class ViewHolder{
        public ImageView CusImage;
        public TextView CusTitle;
        public TextView CusDate;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
       ViewHolder cusData;
        if(convertView == null){
            cusData = new ViewHolder();

            LayoutInflater inflater = (LayoutInflater)allMenuContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custom_view,null);

            //리스트에 들어갈 데이터
            cusData.CusImage = (ImageView)convertView.findViewById(R.id.customImage);
            cusData.CusTitle = (TextView)convertView.findViewById(R.id.customTitle);
            cusData.CusDate = (TextView)convertView.findViewById(R.id.customDate);

            convertView.setTag(cusData);
        }
        else{
            cusData = (ViewHolder)convertView.getTag();
        }

        CustomItem allMenuData = allMenuListData.get(position);

        if(allMenuData.getThumbnailImage() != null){
            cusData.CusImage.setVisibility(View.VISIBLE);
            cusData.CusImage.setImageDrawable(allMenuData.getThumbnailImage());
        }
        else{
            cusData.CusImage.setVisibility(View.GONE);
        }

        cusData.CusTitle.setText(allMenuData.getTitle());
        cusData.CusDate.setText(allMenuData.getRegDate());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(allMenuContext,Details.class);
                intent.putExtra("number", position);
                allMenuContext.startActivity(intent);
            }
        });



        return convertView;
    }
}
