package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;

public class HuTiDanXiao extends Goods_Object {
    public HuTiDanXiao(){
        this.name="护体丹 小";
        this.shows = "永久增加 10点防御力";
        this.price = 500;
    }

    @Override
    public void fun(Context context){
        Actor_Object.Defense = Actor_Object.Defense+10;
        Fun_File.Save(context);
    }
}
