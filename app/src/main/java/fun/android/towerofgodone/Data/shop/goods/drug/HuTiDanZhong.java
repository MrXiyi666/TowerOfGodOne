package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;

public class HuTiDanZhong extends Goods_Object {
    public HuTiDanZhong(){
        this.name="护体丹 中";
        this.shows = "永久增加 20点防御力";
        this.price = 1000;
    }

    @Override
    public void fun(Context context){
        Actor_Object.Defense = Actor_Object.Defense+20;
        Fun_File.Save(context);
    }
}
