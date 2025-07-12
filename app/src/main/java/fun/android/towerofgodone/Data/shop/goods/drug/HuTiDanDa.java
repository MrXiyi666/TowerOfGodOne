package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;

public class HuTiDanDa extends Goods_Object {
    public HuTiDanDa(){
        this.name="护体丹 大";
        this.shows = "增加 50点防御力";
        this.price = 2000;
        this.type="drug";
    }

    @Override
    public void fun(Context context){
        fun.defense_hoist = fun.defense_hoist + 50;
        Fun_File.SaveDefenseHoist(context);
        fun.Mess(context, "使用成功");
    }
}
