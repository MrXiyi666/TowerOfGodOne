package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;

public class ShenMingNengLiangDa extends Goods_Object {
    public ShenMingNengLiangDa(){
        this.name="生命能量 大";
        this.shows = "使用后立刻获得 500点能量值";
        this.price = 500;
        this.type="drug";
    }

    @Override
    public void fun(Context context){
        Actor_Object.Value = Actor_Object.Value+500;
        Fun_File.SaveValue(context);
    }
}
