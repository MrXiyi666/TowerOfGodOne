package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;

public class LongYinDanDa extends Goods_Object {
    public LongYinDanDa(){
        this.name="龙吟丹 大";
        this.shows = "增加 5暴击率";
        this.price = 2000;
        this.type="drug";
    }

    @Override
    public void fun(Context context){
        fun.critical_hoist = fun.critical_hoist + 5;
        Fun_File.SaveCriticalHoist(context);
        fun.Mess(context, "使用成功");
    }
}