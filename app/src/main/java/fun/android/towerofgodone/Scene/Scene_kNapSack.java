package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import fun.android.towerofgodone.Data.shop.goods.arms.PoHuaiMoJian;
import fun.android.towerofgodone.Data.shop.goods.arms.XingBaoJian;
import fun.android.towerofgodone.Data.shop.goods.arms.YingGuangJian;
import fun.android.towerofgodone.Data.shop.goods.arms.ZhanHunDao;
import fun.android.towerofgodone.Data.shop.goods.drug.ShengMingNengLiangXiao;
import fun.android.towerofgodone.Data.shop.goods.drug.ShenMingNengLiangZhong;
import fun.android.towerofgodone.Data.shop.goods.drug.ShenMingNengLiangDa;
import fun.android.towerofgodone.Data.shop.goods.drug.ZhuGuo;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.Item.Arms_Item;
import fun.android.towerofgodone.Item.Drug_Item;
import fun.android.towerofgodone.R;

public class Scene_kNapSack extends Scene_Base{
    LinearLayout drug_linear, arms_linear, dress_linear;
    public Scene_kNapSack(Context context) {
        super(context);
        view = LayoutInflater.from(context).inflate(R.layout.scene_knapsack, null);
        LinearLayout linear = view.findViewById(R.id.linear);
        View view_drug = LayoutInflater.from(context).inflate(R.layout.scene_knapsack_drug, null);
        View view_arms = LayoutInflater.from(context).inflate(R.layout.scene_knapsack_arms, null);
        View view_dress = LayoutInflater.from(context).inflate(R.layout.scene_knapsack_dress, null);
        drug_linear = view_drug.findViewById(R.id.linear);
        arms_linear = view_arms.findViewById(R.id.linear);
        dress_linear = view_dress.findViewById(R.id.linear);
        linear.removeAllViews();
        linear.addView(view_drug);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
            fun.Map_Index = 0;
        });
        view.findViewById(R.id.button_drug).setOnClickListener(V->{
            linear.removeAllViews();
            linear.addView(view_drug);
        });
        view.findViewById(R.id.button_arms).setOnClickListener(V->{
            linear.removeAllViews();
            linear.addView(view_arms);
        });
        view.findViewById(R.id.button_dress).setOnClickListener(V->{
            linear.removeAllViews();
            linear.addView(view_dress);
        });
        drug_create(context);
        arms_create(context);
    }

    public void drug_create(Context context){
        for(String name : fun.drug_list){
            Drug_Item drugItem;
            switch(name){
                case "生命能量 小":
                    drugItem = new Drug_Item(context, new ShengMingNengLiangXiao(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
                case "生命能量 中":
                    drugItem = new Drug_Item(context, new ShenMingNengLiangZhong(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
                case "生命能量 大":
                    drugItem = new Drug_Item(context, new ShenMingNengLiangDa(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
                case "朱果":
                    drugItem = new Drug_Item(context, new ZhuGuo(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
            }
        }
    }

    public void arms_create(Context context){
        for(String name : fun.arms_list){
            Arms_Item armsItem;
            switch(name){
                case "荧光剑":
                    armsItem = new Arms_Item(context, new YingGuangJian(), drug_linear);
                    arms_linear.addView(armsItem.view);
                    break;
                case "战魂刀":
                    armsItem = new Arms_Item(context, new ZhanHunDao(), drug_linear);
                    arms_linear.addView(armsItem.view);
                    break;
                case "星爆剑":
                    armsItem = new Arms_Item(context, new XingBaoJian(), drug_linear);
                    arms_linear.addView(armsItem.view);
                    break;
                case "破坏魔剑":
                    armsItem = new Arms_Item(context, new PoHuaiMoJian(), drug_linear);
                    arms_linear.addView(armsItem.view);
                    break;

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
