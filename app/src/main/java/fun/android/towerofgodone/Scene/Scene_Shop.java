package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import fun.android.towerofgodone.Data.Actor_Object;
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
import fun.android.towerofgodone.Data.shop.goods.drug.ShenMingNengLiangDa;
import fun.android.towerofgodone.Data.shop.goods.drug.ShenMingNengLiangZhong;
import fun.android.towerofgodone.Data.shop.goods.drug.ShengMingNengLiangXiao;
import fun.android.towerofgodone.Data.shop.goods.drug.ZhuGuo;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.View.StrokeTextView;
import fun.android.towerofgodone.Window.Window_Shop_Buy;

public class Scene_Shop extends Scene_Base{
    View view_drug, view_arms, view_dress;
    public Scene_Shop(Context context) {
        super(context);
        view = LayoutInflater.from(context).inflate(R.layout.scene_shop, null);
        view_drug = LayoutInflater.from(context).inflate(R.layout.scene_shop_drug, null);
        view_arms = LayoutInflater.from(context).inflate(R.layout.scene_shop_arms, null);
        view_dress = LayoutInflater.from(context).inflate(R.layout.scene_shop_dress, null);
        StrokeTextView gold_text = view.findViewById(R.id.gold_text);
        LinearLayout linear = view.findViewById(R.id.linear);

        linear.addView(view_drug);
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
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
        });


        gold_text.setText(Actor_Object.Gold + "金币");
        drug_fun(context, gold_text);
    }
    public void drug_fun(Context context, StrokeTextView gold_text){
        view_drug.findViewById(R.id.item_1).setOnClickListener(V->{
            new Window_Shop_Buy(context, new ShengMingNengLiangXiao(), gold_text);
        });
        view_drug.findViewById(R.id.item_2).setOnClickListener(V->{
            new Window_Shop_Buy(context, new ShenMingNengLiangZhong(), gold_text);
        });
        view_drug.findViewById(R.id.item_3).setOnClickListener(V->{
            new Window_Shop_Buy(context, new ShenMingNengLiangDa(), gold_text);
        });
        view_drug.findViewById(R.id.item_4).setOnClickListener(V->{
            new Window_Shop_Buy(context, new ZhuGuo(), gold_text);
        });
        view_drug.findViewById(R.id.item_5).setOnClickListener(V->{
            new Window_Shop_Buy(context, new BaiNianZhuGuo(), gold_text);
        });
        view_drug.findViewById(R.id.item_6).setOnClickListener(V->{
            new Window_Shop_Buy(context, new QianNianZhuGuo(), gold_text);
        });
        view_drug.findViewById(R.id.item_7).setOnClickListener(V->{
            new Window_Shop_Buy(context, new LiLiangDanXiao(), gold_text);
        });
        view_drug.findViewById(R.id.item_8).setOnClickListener(V->{
            new Window_Shop_Buy(context, new LiLiangDanZhong(), gold_text);
        });
        view_drug.findViewById(R.id.item_9).setOnClickListener(V->{
            new Window_Shop_Buy(context, new LiLiangDanDa(), gold_text);
        });
        view_drug.findViewById(R.id.item_10).setOnClickListener(V->{
            new Window_Shop_Buy(context, new HuTiDanXiao(), gold_text);
        });
        view_drug.findViewById(R.id.item_11).setOnClickListener(V->{
            new Window_Shop_Buy(context, new HuTiDanZhong(), gold_text);
        });
        view_drug.findViewById(R.id.item_12).setOnClickListener(V->{
            new Window_Shop_Buy(context, new HuTiDanDa(), gold_text);
        });
        view_drug.findViewById(R.id.item_13).setOnClickListener(V->{
            new Window_Shop_Buy(context, new FengLingDanXiao(), gold_text);
        });
        view_drug.findViewById(R.id.item_14).setOnClickListener(V->{
            new Window_Shop_Buy(context, new FengLingDanZhong(), gold_text);
        });
        view_drug.findViewById(R.id.item_15).setOnClickListener(V->{
            new Window_Shop_Buy(context, new FengLingDanDa(), gold_text);
        });
        view_drug.findViewById(R.id.item_16).setOnClickListener(V->{
            new Window_Shop_Buy(context, new LongYinDanXiao(), gold_text);
        });
        view_drug.findViewById(R.id.item_17).setOnClickListener(V->{
            new Window_Shop_Buy(context, new LongYinDanZhong(), gold_text);
        });
        view_drug.findViewById(R.id.item_18).setOnClickListener(V->{
            new Window_Shop_Buy(context, new LongYinDanDa(), gold_text);
        });
    }
    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "map_shop/back_" + fun.Random(7) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();
    }
}
