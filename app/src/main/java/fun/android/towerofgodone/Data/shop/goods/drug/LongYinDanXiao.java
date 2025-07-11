package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;

public class LongYinDanXiao extends Goods_Object {
    public LongYinDanXiao(){
        this.name="龙吟丹 小";
        this.shows = "增加 1暴击率";
        this.price = 500;
        this.type="drug";
    }

    @Override
    public void fun(Context context){
        Actor_Object.Critical = Actor_Object.Critical+1;

    }
}
