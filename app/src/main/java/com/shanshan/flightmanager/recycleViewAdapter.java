package com.shanshan.flightmanager;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class recycleViewAdapter extends RecyclerView.Adapter<MyViewHolder>{

    private LayoutInflater mInflater;
    private Context mContext;
    private List<testData> mDatas;

    public recycleViewAdapter(Context context, List<testData> Datas){
        this.mContext = context;
        this.mDatas = Datas;
        mInflater = LayoutInflater.from(context);
    }

    /*创建ViewHolder*/
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = mInflater.inflate(R.layout.item_flight_view, parent , false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    /*绑定ViewHolder*/
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.dwhereFrom.setText( mDatas.get(position).getWhereFrom());
        holder.dwhereTo.setText( mDatas.get(position).getWhereTo());
        holder.dtimeBegin.setText( mDatas.get(position).getTimeBegin());
        holder.dtimeEnd.setText( mDatas.get(position).getTimeEnd());
        holder.dtransCity.setText( mDatas.get(position).getTransCity());
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }
}


class MyViewHolder extends RecyclerView.ViewHolder{

    /**/
    TextView dwhereFrom;
    TextView dwhereTo ;
    TextView dtimeBegin ;
    TextView dtimeEnd ;
    TextView dtransCity ;

    public MyViewHolder(View itemView) {
        super(itemView);

        dwhereFrom = (TextView) itemView.findViewById(R.id.where_from);
        dwhereTo = (TextView) itemView.findViewById(R.id.where_to);
        dtimeBegin = (TextView) itemView.findViewById(R.id.time_begin);
        dtimeEnd = (TextView) itemView.findViewById(R.id.time_end);
        dtransCity = (TextView) itemView.findViewById(R.id.trans_city);
    }
}