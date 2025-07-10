package fun.android.towerofgodone.Window;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import java.util.Objects;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.View.StrokeTextView;

public class Window_Shop_Buy {

    public static void Buy_Drug(Context context, Goods_Object goods_object, StrokeTextView gold_text){
        var dialog = new AlertDialog.Builder(context).create();
        var view = View.inflate(context, R.layout.window_shop_buy, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            dialog.dismiss();
        });
        TextView text = view.findViewById(R.id.text);
        text.setText(goods_object.name + "\n价格："+goods_object.price);
        view.findViewById(R.id.button_buy).setOnClickListener(V->{
            if(Actor_Object.Gold >= goods_object.price){
                Actor_Object.Gold = Actor_Object.Gold - goods_object.price;
                fun.drug_list.add(goods_object.name);
                Fun_File.SaveDrug(context);
                Fun_File.Save(context);
                fun.Mess(context, "购买成功");
                gold_text.setText(Actor_Object.Gold + "金币");
            }else{
                fun.Mess(context, "钱不够");
            }
        });
        dialog.setView(view);
        dialog.setCancelable(false);
        Objects.requireNonNull(dialog.getWindow()).setGravity(Gravity.TOP);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setGravity(Gravity.CENTER);
        dialog.show();
    }

    public static void Buy_Arms(Context context, Goods_Object goods_object, StrokeTextView gold_text){
        var dialog = new AlertDialog.Builder(context).create();
        var view = View.inflate(context, R.layout.window_shop_buy, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            dialog.dismiss();
        });
        TextView text = view.findViewById(R.id.text);
        text.setText(goods_object.name + "\n价格："+goods_object.price);
        view.findViewById(R.id.button_buy).setOnClickListener(V->{
            if(Actor_Object.Gold >= goods_object.price){
                Actor_Object.Gold = Actor_Object.Gold - goods_object.price;
                fun.arms_list.add(goods_object.name);
                Fun_File.SaveArms(context);
                Fun_File.Save(context);
                fun.Mess(context, "购买成功");
                gold_text.setText(Actor_Object.Gold + "金币");
            }else{
                fun.Mess(context, "钱不够");
            }
        });
        dialog.setView(view);
        dialog.setCancelable(false);
        Objects.requireNonNull(dialog.getWindow()).setGravity(Gravity.TOP);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setGravity(Gravity.CENTER);
        dialog.show();
        if(fun.arms_list.contains(goods_object.name)){
            dialog.dismiss();
            fun.Mess(context, "已经拥有 无法再次购买");
        }
    }

}
