package fun.android.towerofgodone.Scene.Map_2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ScrollView;

import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.GuZhuaLieShou;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.HeiYaoDuJun;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.HuTouBanShouR;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.HuXian;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.KuangYanJuShou;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.LingHuXianZi;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.LongRXingZhe;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.LongRZhanShi;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.MeiDuShaSeXi;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.NiuTouR;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.ShiLiYongShi;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.ShiNu;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.ShiWei;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.XiangGuiR;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.YaLiao;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.YueYingYaoJi;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.ZhanZun;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.Scene.Scene_Base;
import fun.android.towerofgodone.Scene.Scene_Map;
import fun.android.towerofgodone.Scene.War.Scene_War;

public class Scene_LieYaHuangYuan extends Scene_Base {
    public Scene_LieYaHuangYuan(Context context) {
        super(context);
        fun.Map_Index = 8;
        fun.Scene_War_Cancel = this;
        view = LayoutInflater.from(context).inflate(R.layout.scene_lieyahuangyuan, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
            fun.scrollY = 0;
            fun.Map_Index = 0;
        });
        ScrollView scrollView = view.findViewById(R.id.scrollView);
        scrollView.post(() -> scrollView.scrollTo(0, fun.scrollY));
        ImageView enemy_1 = view.findViewById(R.id.enemy_1);
        enemy_1.setImageBitmap(fun.loadBitmapFromAssets(context, new YaLiao().img_path));
        ImageView enemy_2 = view.findViewById(R.id.enemy_2);
        enemy_2.setImageBitmap(fun.loadBitmapFromAssets(context, new ShiNu().img_path));
        ImageView enemy_3 = view.findViewById(R.id.enemy_3);
        enemy_3.setImageBitmap(fun.loadBitmapFromAssets(context, new ShiWei().img_path));
        ImageView enemy_4 = view.findViewById(R.id.enemy_4);
        enemy_4.setImageBitmap(fun.loadBitmapFromAssets(context, new GuZhuaLieShou().img_path));
        ImageView enemy_5 = view.findViewById(R.id.enemy_5);
        enemy_5.setImageBitmap(fun.loadBitmapFromAssets(context, new HeiYaoDuJun().img_path));
        ImageView enemy_6 = view.findViewById(R.id.enemy_6);
        enemy_6.setImageBitmap(fun.loadBitmapFromAssets(context, new YueYingYaoJi().img_path));
        ImageView enemy_7 = view.findViewById(R.id.enemy_7);
        enemy_7.setImageBitmap(fun.loadBitmapFromAssets(context, new LongRXingZhe().img_path));
        ImageView enemy_8 = view.findViewById(R.id.enemy_8);
        enemy_8.setImageBitmap(fun.loadBitmapFromAssets(context, new KuangYanJuShou().img_path));
        ImageView enemy_9 = view.findViewById(R.id.enemy_9);
        enemy_9.setImageBitmap(fun.loadBitmapFromAssets(context, new ZhanZun().img_path));

        enemy_1.setOnClickListener(V->{
            fun.enemy_object = new YaLiao();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_2.setOnClickListener(V->{
            fun.enemy_object = new ShiNu();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_3.setOnClickListener(V->{
            fun.enemy_object = new ShiWei();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_4.setOnClickListener(V->{
            fun.enemy_object = new GuZhuaLieShou();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_5.setOnClickListener(V->{
            fun.enemy_object = new HeiYaoDuJun();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_6.setOnClickListener(V->{
            fun.enemy_object = new YueYingYaoJi();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_7.setOnClickListener(V->{
            fun.enemy_object = new LongRXingZhe();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_8.setOnClickListener(V->{
            fun.enemy_object = new KuangYanJuShou();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_9.setOnClickListener(V->{
            fun.enemy_object = new ZhanZun();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "map/map_2/lieyahuangyuan/back_" + fun.Random(6) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();
    }

}