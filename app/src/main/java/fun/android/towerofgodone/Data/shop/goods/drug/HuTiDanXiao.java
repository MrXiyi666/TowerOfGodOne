package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;

public class HuTiDanXiao extends Goods_Object {
    public HuTiDanXiao(){
        this.name="护体丹 小";
        this.shows = "增加 10点防御力";
        this.price = 500;
        this.type="drug";
    }

    @Override
    public void fun(Context context){
        fun.defense_hoist = fun.defense_hoist + 10;
        Fun_File.SaveDefenseHoist(context);
        fun.Mess(context, "使用成功");
    }
}
