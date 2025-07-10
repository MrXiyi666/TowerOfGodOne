package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;

public class LongYinDanDa extends Goods_Object {
    public LongYinDanDa(){
        this.name="龙吟丹 大";
        this.shows = "永久增加 5暴击率";
        this.price = 2000;
        this.type="drug";
    }

    @Override
    public void fun(Context context){
        Actor_Object.Critical = Actor_Object.Critical+5;
        Fun_File.Save(context);
    }
}