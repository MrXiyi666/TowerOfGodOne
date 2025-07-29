package fun.android.towerofgodone.Scene.Map_1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ScrollView;

import fun.android.towerofgodone.Data.Map_1.huahaipan.ShiRGuShu;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.CiQiuGuai;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.DuWuWa;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.Feibian;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.GuZhuaLang;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.HunDunJuShou;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.JiaChongGuai;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.LeiMinNiao;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.LuZhuJing;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.SheGuai;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.ShenYuanZhangYuGuai;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.ShengMingZhiMu;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.ShiJiaChong;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.ShiKongHuanYingShou;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.ShuiJingZhiZhu;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.ShuiMuGuai;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.XiyiGuai;
import fun.android.towerofgodone.Data.Map_1.mowusenlin.Yelang;
import fun.android.towerofgodone.Data.shop.goods.drug.ShengMingNengLiangXiao;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.Scene.Scene_Base;
import fun.android.towerofgodone.Scene.Scene_Map;
import fun.android.towerofgodone.Scene.War.Scene_War;

public class Scene_MoWuSenLin extends Scene_Base {
    public Scene_MoWuSenLin(Context context) {
        super(context);
        fun.Map_Index = 1;
        fun.Scene_War_Cancel = this;
        view = LayoutInflater.from(context).inflate(R.layout.scene_mowusenlin, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
            fun.scrollY = 0;
            fun.Map_Index = 0;
        });
        ScrollView scrollView = view.findViewById(R.id.scrollView);
        scrollView.post(() -> scrollView.scrollTo(0, fun.scrollY));
        view.findViewById(R.id.enemy_1).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new LuZhuJing().img_path)));
        view.findViewById(R.id.enemy_2).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new ShiJiaChong().img_path)));
        view.findViewById(R.id.enemy_3).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new LeiMinNiao().img_path)));
        view.findViewById(R.id.enemy_4).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new DuWuWa().img_path)));
        view.findViewById(R.id.enemy_5).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new GuZhuaLang().img_path)));
        view.findViewById(R.id.enemy_6).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new ShuiJingZhiZhu().img_path)));
        view.findViewById(R.id.enemy_7).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new ShiKongHuanYingShou().img_path)));
        view.findViewById(R.id.enemy_8).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new ShenYuanZhangYuGuai().img_path)));
        view.findViewById(R.id.enemy_9).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new ShengMingZhiMu().img_path)));
        view.findViewById(R.id.enemy_10).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new HunDunJuShou().img_path)));

        view.findViewById(R.id.enemy_1).setOnClickListener(V->{
            fun.enemy_object = new LuZhuJing();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_2).setOnClickListener(V->{
            fun.enemy_object = new ShiJiaChong();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_3).setOnClickListener(V->{
            fun.enemy_object = new LeiMinNiao();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_4).setOnClickListener(V->{
            fun.enemy_object = new DuWuWa();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_5).setOnClickListener(V->{
            fun.enemy_object = new GuZhuaLang();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_6).setOnClickListener(V->{
            fun.enemy_object = new ShuiJingZhiZhu();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_7).setOnClickListener(V->{
            fun.enemy_object = new ShiKongHuanYingShou();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_8).setOnClickListener(V->{
            fun.enemy_object = new ShenYuanZhangYuGuai();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_9).setOnClickListener(V->{
            fun.enemy_object = new ShengMingZhiMu();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_10).setOnClickListener(V->{
            fun.enemy_object = new HunDunJuShou();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "map/map_1/mowusenlin/back_" + fun.Random(3) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();
    }
}
