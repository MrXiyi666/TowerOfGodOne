package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ScrollView;

import fun.android.towerofgodone.Data.map_4.LongShi;
import fun.android.towerofgodone.Data.map_5.AnYeFeiHu;
import fun.android.towerofgodone.Data.map_5.BaWangLong;
import fun.android.towerofgodone.Data.map_5.DaLiJinGang;
import fun.android.towerofgodone.Data.map_5.KeMoDuoZhanZhenJuShou;
import fun.android.towerofgodone.Data.map_5.LongLang;
import fun.android.towerofgodone.Data.map_5.ShuangYiYingShi;
import fun.android.towerofgodone.Data.map_5.TianMoXie;
import fun.android.towerofgodone.Data.map_5.XueMang;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;

public class Scene_Map_5 extends Scene_Base{
    public Scene_Map_5(Context context) {
        super(context);
        fun.Map_Index = 5;

        view = LayoutInflater.from(context).inflate(R.layout.scene_map_5, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
            fun.scrollY = 0;
            fun.Map_Index = 0;
        });

        ImageView enemy_1 = view.findViewById(R.id.enemy_1);
        enemy_1.setImageBitmap(fun.loadBitmapFromAssets(context, "map_5/bawanglong.png"));
        ImageView enemy_2 = view.findViewById(R.id.enemy_2);
        enemy_2.setImageBitmap(fun.loadBitmapFromAssets(context, "map_5/longlang.png"));
        ImageView enemy_3 = view.findViewById(R.id.enemy_3);
        enemy_3.setImageBitmap(fun.loadBitmapFromAssets(context, "map_5/xuemang.png"));
        ImageView enemy_4 = view.findViewById(R.id.enemy_4);
        enemy_4.setImageBitmap(fun.loadBitmapFromAssets(context, "map_5/shuangyiyingshi.png"));
        ImageView enemy_5 = view.findViewById(R.id.enemy_5);
        enemy_5.setImageBitmap(fun.loadBitmapFromAssets(context, "map_5/anyefeihu.png"));
        ImageView enemy_6 = view.findViewById(R.id.enemy_6);
        enemy_6.setImageBitmap(fun.loadBitmapFromAssets(context, "map_5/dalijingang.png"));
        ImageView enemy_7 = view.findViewById(R.id.enemy_7);
        enemy_7.setImageBitmap(fun.loadBitmapFromAssets(context, "map_5/kemoduozhanzhenjushou.png"));
        ImageView enemy_8 = view.findViewById(R.id.enemy_8);
        enemy_8.setImageBitmap(fun.loadBitmapFromAssets(context, "map_5/tianmoxie.png"));
        ScrollView scrollView = view.findViewById(R.id.scrollView);
        scrollView.post(() -> scrollView.scrollTo(0, fun.scrollY));
        enemy_1.setOnClickListener(V->{
            fun.enemy_object = new BaWangLong();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_2.setOnClickListener(V->{
            fun.enemy_object = new LongLang();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_3.setOnClickListener(V->{
            fun.enemy_object = new XueMang();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_4.setOnClickListener(V->{
            fun.enemy_object = new ShuangYiYingShi();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_5.setOnClickListener(V->{
            fun.enemy_object = new AnYeFeiHu();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_6.setOnClickListener(V->{
            fun.enemy_object = new DaLiJinGang();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_7.setOnClickListener(V->{
            fun.enemy_object = new KeMoDuoZhanZhenJuShou();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_8.setOnClickListener(V->{
            fun.enemy_object = new TianMoXie();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });

    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "map_5/back_" + fun.Random(7) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();

    }
}
