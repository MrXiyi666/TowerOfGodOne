package fun.android.towerofgodone.Scene.System;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import fun.android.towerofgodone.Data.shop.goods.arms.PoHuaiMoJian;
import fun.android.towerofgodone.Data.shop.goods.arms.XingBaoJian;
import fun.android.towerofgodone.Data.shop.goods.arms.XuanTieZhongJian;
import fun.android.towerofgodone.Data.shop.goods.arms.YiTianJian;
import fun.android.towerofgodone.Data.shop.goods.arms.YingGuangJian;
import fun.android.towerofgodone.Data.shop.goods.arms.ZhanHunDao;
import fun.android.towerofgodone.Data.shop.goods.dress.EMoChangPao;
import fun.android.towerofgodone.Data.shop.goods.dress.HuanYingChangPao;
import fun.android.towerofgodone.Data.shop.goods.dress.XuanLingTianYi;
import fun.android.towerofgodone.Data.shop.goods.drug.BaiNianZhuGuo;
import fun.android.towerofgodone.Data.shop.goods.drug.FengLingDanDa;
import fun.android.towerofgodone.Data.shop.goods.drug.FengLingDanXiao;
import fun.android.towerofgodone.Data.shop.goods.drug.FengLingDanZhong;
import fun.android.towerofgodone.Data.shop.goods.drug.HuTiDanDa;
import fun.android.towerofgodone.Data.shop.goods.drug.HuTiDanXiao;
import fun.android.towerofgodone.Data.shop.goods.drug.HuTiDanZhong;
import fun.android.towerofgodone.Data.shop.goods.drug.LiLiangDanDa;
import fun.android.towerofgodone.Data.shop.goods.drug.LiLiangDanXiao;
import fun.android.towerofgodone.Data.shop.goods.drug.LiLiangDanZhong;
import fun.android.towerofgodone.Data.shop.goods.drug.LongYinDanDa;
import fun.android.towerofgodone.Data.shop.goods.drug.LongYinDanXiao;
import fun.android.towerofgodone.Data.shop.goods.drug.LongYinDanZhong;
import fun.android.towerofgodone.Data.shop.goods.drug.QianNianZhuGuo;
import fun.android.towerofgodone.Data.shop.goods.drug.ShengMingNengLiangXiao;
import fun.android.towerofgodone.Data.shop.goods.drug.ShenMingNengLiangZhong;
import fun.android.towerofgodone.Data.shop.goods.drug.ShenMingNengLiangDa;
import fun.android.towerofgodone.Data.shop.goods.drug.ZhuGuo;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.Item.Arms_Item;
import fun.android.towerofgodone.Item.Dress_Item;
import fun.android.towerofgodone.Item.Drug_Item;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.Scene.Scene_Base;
import fun.android.towerofgodone.Scene.Scene_Map;

public class Scene_kNapSack extends Scene_Base {
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
        dress_create(context);
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
                case "百年朱果":
                    drugItem = new Drug_Item(context, new BaiNianZhuGuo(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
                case "千年朱果":
                    drugItem = new Drug_Item(context, new QianNianZhuGuo(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
                case "力量丹 小":
                    drugItem = new Drug_Item(context, new LiLiangDanXiao(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
                case "力量丹 中":
                    drugItem = new Drug_Item(context, new LiLiangDanZhong(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
                case "力量丹 大":
                    drugItem = new Drug_Item(context, new LiLiangDanDa(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
                case "护体丹 小":
                    drugItem = new Drug_Item(context, new HuTiDanXiao(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
                case "护体丹 中":
                    drugItem = new Drug_Item(context, new HuTiDanZhong(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
                case "护体丹 大":
                    drugItem = new Drug_Item(context, new HuTiDanDa(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
                case "风灵丹 小":
                    drugItem = new Drug_Item(context, new FengLingDanXiao(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
                case "风灵丹 中":
                    drugItem = new Drug_Item(context, new FengLingDanZhong(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
                case "风灵丹 大":
                    drugItem = new Drug_Item(context, new FengLingDanDa(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
                case "龙吟丹 小":
                    drugItem = new Drug_Item(context, new LongYinDanXiao(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
                case "龙吟丹 中":
                    drugItem = new Drug_Item(context, new LongYinDanZhong(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
                case "龙吟丹 大":
                    drugItem = new Drug_Item(context, new LongYinDanDa(), drug_linear);
                    drug_linear.addView(drugItem.view);
                    break;
            }
        }
    }

    public void arms_create(Context context){
        for(String name : fun.arms_list){
            Arms_Item armsItem;
            switch(name){
                case "玄铁重剑":
                    armsItem = new Arms_Item(context, new XuanTieZhongJian(), drug_linear);
                    arms_linear.addView(armsItem.view);
                    break;
                case "倚天剑":
                    armsItem = new Arms_Item(context, new YiTianJian(), drug_linear);
                    arms_linear.addView(armsItem.view);
                    break;
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

    public void dress_create(Context context){
        for(String name : fun.dress_list){
            Dress_Item dress_item;
            switch(name){
                case "幻影长袍":
                    dress_item = new Dress_Item(context, new HuanYingChangPao());
                    dress_linear.addView(dress_item.view);
                    break;
                case "玄鳞天衣":
                    dress_item = new Dress_Item(context, new XuanLingTianYi());
                    dress_linear.addView(dress_item.view);
                    break;
                case "恶魔长袍":
                    dress_item = new Dress_Item(context, new EMoChangPao());
                    dress_linear.addView(dress_item.view);
                    break;
            }
        }
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "knapsack/back_" + fun.Random(8) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();
    }
}
