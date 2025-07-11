package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;

public class ZhuGuo extends Goods_Object {
    public ZhuGuo(){
        this.name="朱果";
        this.shows = "使用后立刻获得 1000点能量值";
        this.price = 1000;
        this.type="drug";
    }

    @Override
    public void fun(Context context){
        Actor_Object.Value = Actor_Object.Value+1000;
        Fun_File.SaveValue(context);
    }
}
