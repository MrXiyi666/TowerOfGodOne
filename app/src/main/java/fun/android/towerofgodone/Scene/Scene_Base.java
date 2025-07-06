package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import fun.android.towerofgodone.Fun.Data_Item;
import fun.android.towerofgodone.Fun.fun;

public class Scene_Base {

    public View view;

    public Scene_Base(Context context){
        List<Data_Item> itemList = new ArrayList<>();
        Data_Item data_item = new Data_Item();
        data_item.setName("HP");
        data_item.setData("1000");
        itemList.add(data_item);
        data_item = new Data_Item();
        data_item.setName("Attack");
        data_item.setData("200");
        itemList.add(data_item);
        data_item = new Data_Item();
        data_item.setName("Defense");
        data_item.setData("150");
        itemList.add(data_item);
        data_item = new Data_Item();
        data_item.setName("Critical");
        data_item.setData("5");
        itemList.add(data_item);
        data_item = new Data_Item();
        data_item.setName("Speed");
        data_item.setData("300");
        itemList.add(data_item);
        //Log.w("json", new Gson().toJson(itemList));
    }


    public View getView(){
        return view;
    }

    public void enable_scene(){
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
        );
        fun.main_layout.removeAllViews();
        fun.main_layout.addView(view, params);

    }
    public void Quit(){

        this.Release();
    }

    public void Release(){

    }

}
