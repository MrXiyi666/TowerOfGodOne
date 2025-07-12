package fun.android.towerofgodone.Data.shop.goods.arms;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;

public class XingBaoJian extends Goods_Object {
    public XingBaoJian(){
        this.name = "星爆剑";
        this.shows = "凝聚星辰之力，剑光如银河炸裂，威力无穷，传说可斩断时空，唯勇者能驾驭\n基础攻击力+50\n角色攻击+30%";
        this.price = 50000;
        this.type="arms";
        this.Attack = 50;
        this.Attack_Ratio = 0.3f;
        this.id=3;
    }

    @Override
    public void fun(Context context) {
        super.fun(context);
        Actor_Object.Arms = 3;
        Fun_File.SaveArms(context);
        fun.Mess(context, "装备成功");
    }
}
