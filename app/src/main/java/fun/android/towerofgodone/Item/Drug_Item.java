package fun.android.towerofgodone.Item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;

public class Drug_Item {
    public View view;
    public Drug_Item(Context context, Goods_Object goods_object, LinearLayout linear){
        view = LayoutInflater.from(context).inflate(R.layout.goods_item, null);
        TextView name = view.findViewById(R.id.name);
        TextView shows = view.findViewById(R.id.shows);
        shows.setText(goods_object.shows);
        name.setText(goods_object.getName());
        view.setOnClickListener(V->{
            goods_object.fun(context);
            linear.removeView(view);
            fun.drug_list.remove(goods_object.name);
            Fun_File.SaveDrug(context);
        });
    }
}
