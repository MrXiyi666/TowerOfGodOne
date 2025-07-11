package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;

public class FengLingDanZhong extends Goods_Object {
    public FengLingDanZhong(){
        this.name="风灵丹 中";
        this.shows = "增加 20点速度";
        this.price = 1000;
        this.type="drug";
    }

    @Override
    public void fun(Context context){
        Actor_Object.Speed = Actor_Object.Speed+20;

    }
}
