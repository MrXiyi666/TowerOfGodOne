package fun.android.towerofgodone.Scene.Map_1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ScrollView;

import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.AnYingMoJun;
import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.BaiYu;
import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.ChuShouKuangMo;
import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.HuiYuQue;
import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.HunDunZhiLin;
import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.JiYaShou;
import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.JinShenZhanXing;
import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.KumuShuReng;
import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.LeiTingJuYuan;
import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.LingShanShengShou;
import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.NiZhaoWaGuai;
import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.SantouXuemoNiu;
import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.ShuangYiBingXiong;
import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.YanJiaShou;
import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.YanLingHuoLong;
import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.YanWeiHu;
import fun.android.towerofgodone.Data.Map_1.shiwaitaoyuan.YouYingLang;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.Scene.Scene_Base;
import fun.android.towerofgodone.Scene.Scene_Map;
import fun.android.towerofgodone.Scene.War.Scene_War;

public class Scene_ShiWaiTaoYuan extends Scene_Base {
    public Scene_ShiWaiTaoYuan(Context context) {
        super(context);
        fun.Map_Index = 2;
        fun.Scene_War_Cancel = this;
        view = LayoutInflater.from(context).inflate(R.layout.scene_shiwaitaoyuan, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
            fun.scrollY = 0;
            fun.Map_Index = 2;
        });
        ScrollView scrollView = view.findViewById(R.id.scrollView);
        scrollView.post(() -> scrollView.scrollTo(0, fun.scrollY));
        ImageView enemy_1 = view.findViewById(R.id.enemy_1);
        enemy_1.setImageBitmap(fun.loadBitmapFromAssets(context, new HuiYuQue().img_path));
        ImageView enemy_2 = view.findViewById(R.id.enemy_2);
        enemy_2.setImageBitmap(fun.loadBitmapFromAssets(context, new NiZhaoWaGuai().img_path));
        ImageView enemy_3 = view.findViewById(R.id.enemy_3);
        enemy_3.setImageBitmap(fun.loadBitmapFromAssets(context, new YanJiaShou().img_path));
        ImageView enemy_4 = view.findViewById(R.id.enemy_4);
        enemy_4.setImageBitmap(fun.loadBitmapFromAssets(context, new YouYingLang().img_path));
        ImageView enemy_5 = view.findViewById(R.id.enemy_5);
        enemy_5.setImageBitmap(fun.loadBitmapFromAssets(context, new YanLingHuoLong().img_path));
        ImageView enemy_6 = view.findViewById(R.id.enemy_6);
        enemy_6.setImageBitmap(fun.loadBitmapFromAssets(context, new ShuangYiBingXiong().img_path));
        ImageView enemy_7 = view.findViewById(R.id.enemy_7);
        enemy_7.setImageBitmap(fun.loadBitmapFromAssets(context, new AnYingMoJun().img_path));
        ImageView enemy_8 = view.findViewById(R.id.enemy_8);
        enemy_8.setImageBitmap(fun.loadBitmapFromAssets(context, new LeiTingJuYuan().img_path));
        ImageView enemy_9 = view.findViewById(R.id.enemy_9);
        enemy_9.setImageBitmap(fun.loadBitmapFromAssets(context, new HunDunZhiLin().img_path));
        ImageView enemy_10 = view.findViewById(R.id.enemy_10);
        enemy_10.setImageBitmap(fun.loadBitmapFromAssets(context, new LingShanShengShou().img_path));
        enemy_1.setOnClickListener(V->{
            fun.enemy_object = new HuiYuQue();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_2.setOnClickListener(V->{
            fun.enemy_object = new NiZhaoWaGuai();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_3.setOnClickListener(V->{
            fun.enemy_object = new YanJiaShou();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_4.setOnClickListener(V->{
            fun.enemy_object = new YouYingLang();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_5.setOnClickListener(V->{
            fun.enemy_object = new YanLingHuoLong();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_6.setOnClickListener(V->{
            fun.enemy_object = new ShuangYiBingXiong();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_7.setOnClickListener(V->{
            fun.enemy_object = new AnYingMoJun();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_8.setOnClickListener(V->{
            fun.enemy_object = new LeiTingJuYuan();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_9.setOnClickListener(V->{
            fun.enemy_object = new HunDunZhiLin();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_10.setOnClickListener(V->{
            fun.enemy_object = new LingShanShengShou();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "map/map_1/shiwaitaoyuan/back_" + fun.Random(2) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }
}
