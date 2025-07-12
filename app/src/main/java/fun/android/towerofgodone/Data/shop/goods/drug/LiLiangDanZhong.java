package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;

public class LiLiangDanZhong extends Goods_Object {
    public LiLiangDanZhong(){
        this.name="力量丹 中";
        this.shows = "增加 20点攻击力";
        this.price = 1000;
        this.type="drug";
    }

    @Override
    public void fun(Context context){
        fun.attack_hoist = fun.attack_hoist+20;
        Fun_File.SaveAttackHoist(context);
        fun.Mess(context, "使用成功");
    }
}
