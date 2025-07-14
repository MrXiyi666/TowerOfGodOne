package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.Scene.Map_1.Scene_FeiLongGu;
import fun.android.towerofgodone.Scene.Map_1.Scene_HuaHaiPan;
import fun.android.towerofgodone.Scene.Map_1.Scene_HuiYuTianJing;
import fun.android.towerofgodone.Scene.Map_1.Scene_MoWuSenLin;
import fun.android.towerofgodone.Scene.Map_1.Scene_ShiWaiTaoYuan;
import fun.android.towerofgodone.Scene.Map_1.Scene_ShiWanDaShan;
import fun.android.towerofgodone.Scene.Map_1.Scene_YongYeMoYu;
import fun.android.towerofgodone.Scene.Map_2.Scene_LieYaHuangYuan;
import fun.android.towerofgodone.Scene.Status.Scene_Status;
import fun.android.towerofgodone.Scene.System.Scene_Shop;
import fun.android.towerofgodone.Scene.System.Scene_System;
import fun.android.towerofgodone.Scene.System.Scene_kNapSack;

public class Scene_Map extends Scene_Base{
    private View view_map;

    private ScrollView scrollView;
    private LinearLayout linear;

    public Scene_Map(Context context) {
        super(context);

        view = LayoutInflater.from(context).inflate(R.layout.scene_map, null);
        scrollView = view.findViewById(R.id.scrollView);
        linear = view.findViewById(R.id.linear);
        scrollView.post(() -> scrollView.scrollTo(0, fun.scrollY_Map));
        view.findViewById(R.id.button_status).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_Status(context));
        });
        view.findViewById(R.id.button_shop).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_Shop(context));
        });
        view.findViewById(R.id.button_knapsack).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_kNapSack(context));
        });
        view.findViewById(R.id.button_system).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_System(context));
        });
        if(fun.Map_ID == 1){
            Create_Map_1(context);
            return;
        }
        if(fun.Map_ID == 2){
            Create_Map_2(context);
            return;
        }

    }

    public void Create_Map_1(Context context){
        view_map = LayoutInflater.from(context).inflate(R.layout.scene_map_1, null);
        view_map.findViewById(R.id.map_1).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_MoWuSenLin(context));
        });
        view_map.findViewById(R.id.map_2).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_ShiWaiTaoYuan(context));
        });
        view_map.findViewById(R.id.map_3).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_HuaHaiPan(context));
        });
        view_map.findViewById(R.id.map_4).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_FeiLongGu(context));
        });
        view_map.findViewById(R.id.map_5).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_ShiWanDaShan(context));
        });
        view_map.findViewById(R.id.map_6).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_HuiYuTianJing(context));
        });
        view_map.findViewById(R.id.map_7).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_YongYeMoYu(context));
        });
        view_map.findViewById(R.id.map_8).setOnClickListener(V->{
            fun.Map_ID = 2;
            fun.scrollY_Map=0;
            fun.view_transition.start(new Scene_Map(context));
        });
        view_map.findViewById(R.id.img_1).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/map_1/mowusenling.png")
        ));
        view_map.findViewById(R.id.img_2).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/map_1/shiwaitaoyuan.png")
        ));
        view_map.findViewById(R.id.img_3).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/map_1/huahaipan.png")
        ));
        view_map.findViewById(R.id.img_4).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/map_1/feilonggu.png")
        ));

        view_map.findViewById(R.id.img_5).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/map_1/shiwandashan.png")
        ));
        view_map.findViewById(R.id.img_6).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/map_1/huiyutianjing.png")
        ));
        view_map.findViewById(R.id.img_7).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/map_1/yongyemoyu.png")
        ));
        view_map.findViewById(R.id.img_8).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/chuansongzheng.png")
        ));
        fun.Map_ID = 1;
        linear.removeAllViews();
        linear.addView(view_map);
        scrollView.post(() -> scrollView.scrollTo(0, fun.scrollY_Map));
    }

    public void Create_Map_2(Context context){
        view_map = LayoutInflater.from(context).inflate(R.layout.scene_map_2, null);
        view_map.findViewById(R.id.map_1).setOnClickListener(V->{
            fun.Map_ID = 1;
            fun.scrollY_Map=0;
            fun.view_transition.start(new Scene_Map(context));
        });
        view_map.findViewById(R.id.img_1).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/chuansongzheng.png")
        ));
        view_map.findViewById(R.id.img_2).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/map_2/lieyahuangyuan.png")
        ));
        view_map.findViewById(R.id.map_2).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_LieYaHuangYuan(context));
        });
        fun.Map_ID = 2;
        linear.removeAllViews();
        linear.addView(view_map);
        scrollView.post(() -> scrollView.scrollTo(0, fun.scrollY_Map));
    }
    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        if(fun.Map_ID == 2){
            Bitmap back = fun.loadBitmapFromAssets(context, "map/map_2/back_" + fun.Random(7) + ".png");
            fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
            return;
        }
        if(fun.Map_ID == 1){
            Bitmap back = fun.loadBitmapFromAssets(context, "map/map_1/back_" + fun.Random(7) + ".png");
            fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
            return;
        }


    }

    @Override
    public void Release() {
        super.Release();

    }
}
