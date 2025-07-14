package fun.android.towerofgodone.Scene.Map_1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ScrollView;

import fun.android.towerofgodone.Data.Map_1.huiyutianjing.ChiYaoFuLeiNiYa;
import fun.android.towerofgodone.Data.Map_1.huiyutianjing.JiYuMiGa;
import fun.android.towerofgodone.Data.Map_1.huiyutianjing.LiLiSi;
import fun.android.towerofgodone.Data.Map_1.huiyutianjing.LingYu;
import fun.android.towerofgodone.Data.Map_1.huiyutianjing.LiuXiAiLanTiYa;
import fun.android.towerofgodone.Data.Map_1.huiyutianjing.XiLiSaiLaFeiEr;
import fun.android.towerofgodone.Data.Map_1.huiyutianjing.XiLing;
import fun.android.towerofgodone.Data.Map_1.huiyutianjing.XingLian;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.Scene.Scene_Base;
import fun.android.towerofgodone.Scene.Scene_Map;
import fun.android.towerofgodone.Scene.War.Scene_War;

public class Scene_HuiYuTianJing extends Scene_Base {
    public Scene_HuiYuTianJing(Context context) {
        super(context);
        fun.Map_Index = 6;
        fun.Scene_War_Cancel = this;
        view = LayoutInflater.from(context).inflate(R.layout.scene_huiyutianjing, null);
        ScrollView scrollView = view.findViewById(R.id.scrollView);
        scrollView.post(() -> scrollView.scrollTo(0, fun.scrollY));
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
            fun.scrollY = 0;
            fun.Map_Index = 0;
        });
        ImageView enemy_1 = view.findViewById(R.id.enemy_1);
        enemy_1.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huiyutianjing/xiling.png"));
        ImageView enemy_2 = view.findViewById(R.id.enemy_2);
        enemy_2.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huiyutianjing/lilisi.png"));
        ImageView enemy_3 = view.findViewById(R.id.enemy_3);
        enemy_3.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huiyutianjing/lingyu.png"));
        ImageView enemy_4 = view.findViewById(R.id.enemy_4);
        enemy_4.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huiyutianjing/xinglian.png"));
        ImageView enemy_5 = view.findViewById(R.id.enemy_5);
        enemy_5.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huiyutianjing/liuxiailantiya.png"));
        ImageView enemy_6 = view.findViewById(R.id.enemy_6);
        enemy_6.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huiyutianjing/xilisailafeier.png"));
        ImageView enemy_7 = view.findViewById(R.id.enemy_7);
        enemy_7.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huiyutianjing/jiyumiga.png"));
        ImageView enemy_8 = view.findViewById(R.id.enemy_8);
        enemy_8.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/huiyutianjing/chiyaofuleiniya.png"));


        enemy_1.setOnClickListener(V->{
            fun.enemy_object = new XiLing();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_2.setOnClickListener(V->{
            fun.enemy_object = new LiLiSi();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_3.setOnClickListener(V->{
            fun.enemy_object = new LingYu();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_4.setOnClickListener(V->{
            fun.enemy_object = new XingLian();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_5.setOnClickListener(V->{
            fun.enemy_object = new LiuXiAiLanTiYa();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_6.setOnClickListener(V->{
            fun.enemy_object = new XiLiSaiLaFeiEr();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_7.setOnClickListener(V->{
            fun.enemy_object = new JiYuMiGa();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_8.setOnClickListener(V->{
            fun.enemy_object = new ChiYaoFuLeiNiYa();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "map/map_1/huiyutianjing/back_" + fun.Random(7) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();
    }
}
