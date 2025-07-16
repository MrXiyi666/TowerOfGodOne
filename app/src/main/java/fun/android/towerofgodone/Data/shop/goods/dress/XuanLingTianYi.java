package fun.android.towerofgodone.Data.shop.goods.dress;

import android.content.Context;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;

public class XuanLingTianYi extends Goods_Object {
    public XuanLingTianYi(){
        this.name = "玄鳞天衣";
        this.shows = "龙蜕玄鳞织就，御天威镇九幽，着之如苍穹覆体，万法不侵，万劫不灭\n基础防御力 + 20";
        this.price = 2000;
        this.type="dress";
        this.Defense = 20;
        this.id=2;
    }
    @Override
    public void fun(Context context){
        Actor_Object.Dress = 2;
        Fun_File.SaveDress(context);
        fun.Mess(context, "装备成功");
    }
}
