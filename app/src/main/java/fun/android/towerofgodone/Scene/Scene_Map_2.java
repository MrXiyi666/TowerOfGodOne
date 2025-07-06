package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.LayoutInflater;

import fun.android.towerofgodone.Data.map_1.XiyiGuai;
import fun.android.towerofgodone.Data.map_2.BaiYu;
import fun.android.towerofgodone.Data.map_2.ChuShouKuangMo;
import fun.android.towerofgodone.Data.map_2.JiYaShou;
import fun.android.towerofgodone.Data.map_2.JinShenZhanXing;
import fun.android.towerofgodone.Data.map_2.KumuShuReng;
import fun.android.towerofgodone.Data.map_2.SantouXuemoNiu;
import fun.android.towerofgodone.Data.map_2.YanWeiHu;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;

public class Scene_Map_2 extends Scene_Base{
    public Scene_Map_2(Context context) {
        super(context);
        fun.Map_Index = 2;
        Bitmap back = fun.loadBitmapFromAssets(context, "map_2/back_" + fun.Random(2) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
        view = LayoutInflater.from(context).inflate(R.layout.scene_map_2, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.scene = new Scene_Map(context);
            fun.scene.enable_scene();
        });
        view.findViewById(R.id.enemy_1).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new KumuShuReng().img_path)));
        view.findViewById(R.id.enemy_2).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new SantouXuemoNiu().img_path)));
        view.findViewById(R.id.enemy_3).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new BaiYu().img_path)));
        view.findViewById(R.id.enemy_4).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new ChuShouKuangMo().img_path)));
        view.findViewById(R.id.enemy_5).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new JinShenZhanXing().img_path)));
        view.findViewById(R.id.enemy_6).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new YanWeiHu().img_path)));
        view.findViewById(R.id.enemy_7).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new JiYaShou().img_path)));

        view.findViewById(R.id.enemy_1).setOnClickListener(V->{
            fun.enemy_object = new KumuShuReng();
            fun.scene = new Scene_War(context);
            fun.scene.enable_scene();
        });
        view.findViewById(R.id.enemy_2).setOnClickListener(V->{
            fun.enemy_object = new SantouXuemoNiu();
            fun.scene = new Scene_War(context);
            fun.scene.enable_scene();
        });
        view.findViewById(R.id.enemy_3).setOnClickListener(V->{
            fun.enemy_object = new BaiYu();
            fun.scene = new Scene_War(context);
            fun.scene.enable_scene();
        });
        view.findViewById(R.id.enemy_4).setOnClickListener(V->{
            fun.enemy_object = new ChuShouKuangMo();
            fun.scene = new Scene_War(context);
            fun.scene.enable_scene();
        });
        view.findViewById(R.id.enemy_5).setOnClickListener(V->{
            fun.enemy_object = new JinShenZhanXing();
            fun.scene = new Scene_War(context);
            fun.scene.enable_scene();
        });
        view.findViewById(R.id.enemy_6).setOnClickListener(V->{
            fun.enemy_object = new YanWeiHu();
            fun.scene = new Scene_War(context);
            fun.scene.enable_scene();
        });
        view.findViewById(R.id.enemy_7).setOnClickListener(V->{
            fun.enemy_object = new JiYaShou();
            fun.scene = new Scene_War(context);
            fun.scene.enable_scene();
        });
    }
}
