package fun.android.towerofgodone.Data.shop.goods.arms;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;

public class XuanTieZhongJian extends Goods_Object {
    public XuanTieZhongJian(){
        this.name = "玄铁重剑";
        this.shows = "基础攻击力+10";
        this.price = 1000;
        this.type="arms";
        this.Attack=10;
        this.id=1;
    }
    @Override
    public void fun(Context context){
        Actor_Object.Arms = 1;
        Fun_File.SaveArms(context);
        fun.Mess(context, "装备成功");
    }
}
