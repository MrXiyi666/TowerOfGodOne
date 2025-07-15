package fun.android.towerofgodone.Data.shop.goods.arms;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;

public class PoHuaiMoJian extends Goods_Object {

    public PoHuaiMoJian(){
        this.name = "破坏魔剑";
        this.shows = "蕴含毁灭之力 吞噬万灵 一剑斩碎天道法则 永夜降临\n基础攻击力 + 100\n角色攻击 + 50%";
        this.price = 100000;
        this.type="arms";
        this.Attack=100;
        this.Attack_Ratio=0.5f;
        this.id=10;
    }
    @Override
    public void fun(Context context){
        Actor_Object.Arms = 10;
        Fun_File.SaveArms(context);
        fun.Mess(context, "装备成功");
    }
}
