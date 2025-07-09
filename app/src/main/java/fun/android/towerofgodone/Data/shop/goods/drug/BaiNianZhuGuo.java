package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;

public class BaiNianZhuGuo extends Goods_Object {
    public BaiNianZhuGuo(){
        this.name="百年朱果";
        this.shows = "使用后立刻获得 5000点能量值";
        this.price = 5000;
    }

    @Override
    public void fun(Context context){
        Actor_Object.Value = Actor_Object.Value+5000;
        Fun_File.Save(context);
    }
}
