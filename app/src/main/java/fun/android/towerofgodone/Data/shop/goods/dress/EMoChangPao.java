package fun.android.towerofgodone.Data.shop.goods.dress;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;

public class EMoChangPao extends Goods_Object {
    public EMoChangPao(){
        this.name = "恶魔长袍";
        this.shows = "长袍暗红如血，神秘而邪恶，蕴含强大的黑暗力量，能削弱敌人的意志并增强自身防御。\n基础防御力+20\n角色防御+15%\n生命值+500";
        this.price = 15000;
        this.type="dress";
        this.Defense = 20;
        this.Defense_Ratio = 0.15F;
        this.HP = 500;
        this.id=1;
    }
    @Override
    public void fun(Context context){
        Actor_Object.Dress = 7;
        Fun_File.SaveDress(context);
        fun.Mess(context, "装备成功");
    }
}
