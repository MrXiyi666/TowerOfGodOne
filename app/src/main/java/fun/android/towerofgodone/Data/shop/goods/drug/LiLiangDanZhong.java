package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;

public class LiLiangDanZhong extends Goods_Object {
    public LiLiangDanZhong(){
        this.name="力量丹 中";
        this.shows = "永久增加 20点攻击力";
        this.price = 1000;
    }

    @Override
    public void fun(Context context){
        Actor_Object.Attack = Actor_Object.Attack+20;
        Fun_File.Save(context);
    }
}
