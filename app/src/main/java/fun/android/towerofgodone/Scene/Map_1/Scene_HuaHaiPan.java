package fun.android.towerofgodone.Scene.Map_1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ScrollView;
import fun.android.towerofgodone.Data.Map_1.huahaipan.CuiYuNiao;
import fun.android.towerofgodone.Data.Map_1.huahaipan.DuFengWang;
import fun.android.towerofgodone.Data.Map_1.huahaipan.HaiGuiYao;
import fun.android.towerofgodone.Data.Map_1.huahaipan.LieKongHaiYao;
import fun.android.towerofgodone.Data.Map_1.huahaipan.HuanCaiYouDie;
import fun.android.towerofgodone.Data.Map_1.huahaipan.XuanJiaWoHuang;
import fun.android.towerofgodone.Data.Map_1.huahaipan.BiLingSheHuang;
import fun.android.towerofgodone.Data.Map_1.huahaipan.ShuYao;
import fun.android.towerofgodone.Data.Map_1.huahaipan.XueYaKuangYuan;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.Scene.Scene_Base;
import fun.android.towerofgodone.Scene.Scene_Map;
import fun.android.towerofgodone.Scene.War.Scene_War;

public class Scene_HuaHaiPan extends Scene_Base {
    public Scene_HuaHaiPan(Context context) {
        super(context);
        fun.Map_Index = 3;
        fun.Scene_War_Cancel = this;
        view = LayoutInflater.from(context).inflate(R.layout.scene_huahaipan, null);
        ImageView enemy_1 = view.findViewById(R.id.enemy_1);
        enemy_1.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huahaipan/HuanCaiYouDie.png"));
        ImageView enemy_2 = view.findViewById(R.id.enemy_2);
        enemy_2.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huahaipan/BiLingSheHuang.png"));
        ImageView enemy_3 = view.findViewById(R.id.enemy_3);
        enemy_3.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huahaipan/XuanJiaWoHuang.png"));
        ImageView enemy_4 = view.findViewById(R.id.enemy_4);
        enemy_4.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huahaipan/LieKongHaiYao.png"));
        ImageView enemy_5 = view.findViewById(R.id.enemy_5);
        enemy_5.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huahaipan/haiguiyao.png"));
        ImageView enemy_6 = view.findViewById(R.id.enemy_6);
        enemy_6.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huahaipan/shuyao.png"));
        ImageView enemy_7 = view.findViewById(R.id.enemy_7);
        enemy_7.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huahaipan/dufengwang.png"));
        ImageView enemy_8 = view.findViewById(R.id.enemy_8);
        enemy_8.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huahaipan/xueyakuangyuan.png"));
        ImageView enemy_9 = view.findViewById(R.id.enemy_9);
        enemy_9.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huahaipan/cuiyuniao.png"));
        ScrollView scrollView = view.findViewById(R.id.scrollView);
        scrollView.post(() -> scrollView.scrollTo(0, fun.scrollY));
        enemy_1.setOnClickListener(V->{
            fun.enemy_object = new HuanCaiYouDie();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });

        enemy_2.setOnClickListener(V->{
            fun.enemy_object = new BiLingSheHuang();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });

        enemy_3.setOnClickListener(V->{
            fun.enemy_object = new XuanJiaWoHuang();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });

        enemy_4.setOnClickListener(V->{
            fun.enemy_object = new LieKongHaiYao();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });

        enemy_5.setOnClickListener(V->{
            fun.enemy_object = new HaiGuiYao();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });

        enemy_6.setOnClickListener(V->{
            fun.enemy_object = new ShuYao();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });

        enemy_7.setOnClickListener(V->{
            fun.enemy_object = new DuFengWang();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });

        enemy_8.setOnClickListener(V->{
            fun.enemy_object = new XueYaKuangYuan();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_9.setOnClickListener(V->{
            fun.enemy_object = new CuiYuNiao();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });

        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
            fun.scrollY = 0;
            fun.Map_Index = 0;
        });
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "map/map_1/huahaipan/back_" + fun.Random(5) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();
    }
}