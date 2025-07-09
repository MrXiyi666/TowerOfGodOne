package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;

public class ShenMingNengLiangZhong extends Goods_Object {
    public ShenMingNengLiangZhong(){
        this.name="生命能量 中";
        this.shows = "使用后立刻获得 300点能量值";
        this.price = 300;
    }

    @Override
    public void fun(Context context){
        Actor_Object.Value = Actor_Object.Value+300;
        Fun_File.Save(context);
    }
}
