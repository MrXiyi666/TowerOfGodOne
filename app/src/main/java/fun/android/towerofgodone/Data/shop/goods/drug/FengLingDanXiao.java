package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;

public class FengLingDanXiao extends Goods_Object {
    public FengLingDanXiao(){
        this.name="风灵丹 小";
        this.shows = "增加 10点速度";
        this.price = 500;
        this.type="drug";
    }

    @Override
    public void fun(Context context){
        fun.speed_hoist = fun.speed_hoist + 10;
        Fun_File.SaveSpeedHoist(context);
        fun.Mess(context, "使用成功");
    }
}
