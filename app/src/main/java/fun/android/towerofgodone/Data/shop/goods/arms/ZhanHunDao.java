package fun.android.towerofgodone.Data.shop.goods.arms;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;

public class ZhanHunDao extends Goods_Object {
    public ZhanHunDao(){
        this.name = "战魂刀";
        this.shows = "上古大巫遗落神器，刀锋所指，无坚不摧，唯有真正的勇士方能驾驭。\n基础攻击力+100\n角色攻击+15%";
        this.price = 1;
        this.type="arms";
        this.Attack = 20;
        this.Attack_Ratio=0.15f;
    }

    @Override
    public void fun(Context context) {
        super.fun(context);
        Actor_Object.Arms = "战魂刀";
        Fun_File.Save(context);
        fun.Mess(context, "装备成功");
    }
}
