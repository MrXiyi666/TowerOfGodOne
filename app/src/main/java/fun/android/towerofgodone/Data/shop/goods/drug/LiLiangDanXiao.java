package fun.android.towerofgodone.Data.shop.goods.drug;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;

public class LiLiangDanXiao extends Goods_Object {
    public LiLiangDanXiao(){
        this.name="力量丹 小";
        this.shows = "增加 10点攻击力";
        this.price = 500;
        this.type="drug";
    }

    @Override
    public void fun(Context context){
        fun.attack_hoist = fun.attack_hoist+10;
        Fun_File.SaveAttackHoist(context);
        fun.Mess(context, "使用成功");
    }
}
