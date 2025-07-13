package fun.android.towerofgodone.Data.shop.goods.arms;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;

public class YingGuangJian extends Goods_Object {
    public YingGuangJian(){
        this.name = "荧光剑";
        this.shows = "剑身散发幽蓝光芒，轻盈锋利，夜战中如幽灵般致命，令敌人防不胜防。\n基础攻击力+10\n角色攻击+10%";
        this.price = 10000;
        this.type="arms";
        this.img_path="arms/yingguangjian.png";
        this.Attack = 10;
        this.Attack_Ratio= 0.1F;
        this.id=7;
    }

    @Override
    public void fun(Context context) {
        super.fun(context);
        Actor_Object.Arms = 7;
        Fun_File.SaveArms(context);
        fun.Mess(context, "装备成功");
    }
}
