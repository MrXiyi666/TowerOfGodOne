package fun.android.towerofgodone.Data.shop.goods.arms;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;

public class YiTianJian extends Goods_Object {
    public YiTianJian(){
        this.name = "倚天剑";
        this.shows = "龙吟九霄 一剑断山河 万古神魔皆俯首\n基础攻击力 + 20";
        this.price = 2000;
        this.type="arms";
        this.Attack=20;
        this.id=2;
    }
    @Override
    public void fun(Context context){
        Actor_Object.Arms = 2;
        Fun_File.SaveArms(context);
        fun.Mess(context, "装备成功");
    }
}
