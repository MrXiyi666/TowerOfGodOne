package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;

public class ShengMingNengLiangXiao extends Goods_Object {
    public ShengMingNengLiangXiao(){
        this.name="生命能量 小";
        this.shows = "使用后立刻获得 100点能量值";
        this.price = 100;
        this.type="drug";
    }

    @Override
    public void fun(Context context){
        Actor_Object.Value = Actor_Object.Value + 100;
        Fun_File.SaveValue(context);
        fun.Mess(context, "使用成功");
    }
}
