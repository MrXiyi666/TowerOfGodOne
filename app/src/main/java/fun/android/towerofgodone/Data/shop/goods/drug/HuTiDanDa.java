package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;

public class HuTiDanDa extends Goods_Object {
    public HuTiDanDa(){
        this.name="护体丹 大";
        this.shows = "永久增加 50点防御力";
        this.price = 2000;
    }

    @Override
    public void fun(Context context){
        Actor_Object.Defense = Actor_Object.Defense+50;
        Fun_File.Save(context);
    }
}
