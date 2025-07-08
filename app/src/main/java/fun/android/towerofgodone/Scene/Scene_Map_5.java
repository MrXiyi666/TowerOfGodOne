package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ImageView;

import fun.android.towerofgodone.Data.map_4.LongShi;
import fun.android.towerofgodone.Data.map_5.AnYeFeiHu;
import fun.android.towerofgodone.Data.map_5.BaWangLong;
import fun.android.towerofgodone.Data.map_5.DaLiJinGang;
import fun.android.towerofgodone.Data.map_5.KeMoDuoZhanZhenJuShou;
import fun.android.towerofgodone.Data.map_5.LongLang;
import fun.android.towerofgodone.Data.map_5.ShuangYiYingShi;
import fun.android.towerofgodone.Data.map_5.XueMang;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;

public class Scene_Map_5 extends Scene_Base{
    public Scene_Map_5(Context context) {
        super(context);
        fun.Map_Index = 5;
        Bitmap back = fun.loadBitmapFromAssets(context, "map_5/back_" + fun.Random(7) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
        view = LayoutInflater.from(context).inflate(R.layout.scene_map_5, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.scene = new Scene_Map(context);
            fun.scene.enable_scene();
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

        enemy_1.setOnClickListener(V->{
            fun.enemy_object = new BaWangLong();
            fun.scene = new Scene_War(context);
            fun.scene.enable_scene();
        });
        enemy_2.setOnClickListener(V->{
            fun.enemy_object = new LongLang();
            fun.scene = new Scene_War(context);
            fun.scene.enable_scene();
        });
        enemy_3.setOnClickListener(V->{
            fun.enemy_object = new XueMang();
            fun.scene = new Scene_War(context);
            fun.scene.enable_scene();
        });
        enemy_4.setOnClickListener(V->{
            fun.enemy_object = new ShuangYiYingShi();
            fun.scene = new Scene_War(context);
            fun.scene.enable_scene();
        });
        enemy_5.setOnClickListener(V->{
            fun.enemy_object = new AnYeFeiHu();
            fun.scene = new Scene_War(context);
            fun.scene.enable_scene();
        });
        enemy_6.setOnClickListener(V->{
            fun.enemy_object = new DaLiJinGang();
            fun.scene = new Scene_War(context);
            fun.scene.enable_scene();
        });
        enemy_7.setOnClickListener(V->{
            fun.enemy_object = new KeMoDuoZhanZhenJuShou();
            fun.scene = new Scene_War(context);
            fun.scene.enable_scene();
        });

    }

    @Override
    public void Release() {
        super.Release();

    }
}
