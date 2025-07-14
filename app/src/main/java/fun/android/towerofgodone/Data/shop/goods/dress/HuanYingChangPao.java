package fun.android.towerofgodone.Data.shop.goods.dress;

import android.content.Context;
import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;

public class HuanYingChangPao extends Goods_Object {
    public HuanYingChangPao(){
        this.name = "幻影长袍";
        this.shows = "雾织星纹，影遁无形，夜行千里不染尘。\n基础防御力+10";
        this.price = 1000;
        this.type="dress";
        this.Defense = 10;
        this.Defense_Ratio = 0F;
        this.id=1;
    }
    @Override
    public void fun(Context context){
        Actor_Object.Dress = 1;
        Fun_File.SaveDress(context);
        fun.Mess(context, "装备成功");
    }
}
