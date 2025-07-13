package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ScrollView;

import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;

public class Scene_Map extends Scene_Base{

    public Scene_Map(Context context) {
        super(context);

        view = LayoutInflater.from(context).inflate(R.layout.scene_map, null);
        ScrollView scrollView = view.findViewById(R.id.scrollView);
        view.findViewById(R.id.map_1).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_MoWuSenLin(context));
        });
        view.findViewById(R.id.map_2).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_ShiWaiTaoYuan(context));
        });
        view.findViewById(R.id.map_3).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_HuaHaiPan(context));
        });
        view.findViewById(R.id.map_4).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_FeiLongGu(context));
        });
        view.findViewById(R.id.map_5).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_ShiWanDaShan(context));
        });
        view.findViewById(R.id.map_6).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_HuiYuTianJing(context));
        });
        view.findViewById(R.id.map_7).setOnClickListener(V->{
            fun.scrollY_Map = scrollView.getScrollY();
            fun.view_transition.start(new Scene_YongYeMoYu(context));
        });
        view.findViewById(R.id.img_1).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/mowusenling.png")
        ));
        view.findViewById(R.id.img_2).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/shiwaitaoyuan.png")
        ));
        view.findViewById(R.id.img_3).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/huahaipan.png")
        ));
        view.findViewById(R.id.img_4).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/feilonggu.png")
        ));

        view.findViewById(R.id.img_5).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/shiwandashan.png")
        ));
        view.findViewById(R.id.img_6).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/huiyutianjing.png")
        ));
        view.findViewById(R.id.img_7).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/yongyemoyu.png")
        ));

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
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "map/back_" + fun.Random(3) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();

    }
}
