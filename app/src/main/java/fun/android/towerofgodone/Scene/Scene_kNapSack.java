package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import fun.android.towerofgodone.Data.shop.goods.drug.ShengMingNengLiangXiao;
import fun.android.towerofgodone.Data.shop.goods.drug.ShenMingNengLiangZhong;
import fun.android.towerofgodone.Data.shop.goods.drug.ShenMingNengLiangDa;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.Item.Goods_Item;
import fun.android.towerofgodone.R;

public class Scene_kNapSack extends Scene_Base{
    public Scene_kNapSack(Context context) {
        super(context);
        view = LayoutInflater.from(context).inflate(R.layout.scene_knapsack, null);

        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
            fun.Map_Index = 0;
        });

        LinearLayout linear = view.findViewById(R.id.linear);
        for(String name : fun.item_list){
            Goods_Item goodsItem = null;
            switch(name){
                case "生命能量 小":
                    goodsItem = new Goods_Item(context, new ShengMingNengLiangXiao(), linear);
                    break;
                case "生命能量 中":
                    goodsItem = new Goods_Item(context, new ShenMingNengLiangZhong(), linear);
                    break;
                case "生命能量 大":
                    goodsItem = new Goods_Item(context, new ShenMingNengLiangDa(), linear);
                    break;
            }
            if(goodsItem != null){
                linear.addView(goodsItem.view);
            }
        }

    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
    }

    @Override
    public void Release() {
        super.Release();
    }
}
