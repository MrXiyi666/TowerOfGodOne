package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ScrollView;

import fun.android.towerofgodone.Data.map_2.KumuShuReng;
import fun.android.towerofgodone.Data.map_3.CuiYuNiao;
import fun.android.towerofgodone.Data.map_3.DuFengWang;
import fun.android.towerofgodone.Data.map_3.HaiGuiYao;
import fun.android.towerofgodone.Data.map_3.HaiOuYao;
import fun.android.towerofgodone.Data.map_3.HuDieYao;
import fun.android.towerofgodone.Data.map_3.NiuYao;
import fun.android.towerofgodone.Data.map_3.QinSheYao;
import fun.android.towerofgodone.Data.map_3.ShuYao;
import fun.android.towerofgodone.Data.map_3.XueYaKuangYuan;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;

public class Scene_Map_3 extends Scene_Base{
    public Scene_Map_3(Context context) {
        super(context);
        fun.Map_Index = 3;

        view = LayoutInflater.from(context).inflate(R.layout.scene_map_3, null);
        ImageView enemy_1 = view.findViewById(R.id.enemy_1);
        enemy_1.setImageBitmap(fun.loadBitmapFromAssets(context, "map_3/hudieyao.png"));
        ImageView enemy_2 = view.findViewById(R.id.enemy_2);
        enemy_2.setImageBitmap(fun.loadBitmapFromAssets(context, "map_3/qinsheyao.png"));
        ImageView enemy_3 = view.findViewById(R.id.enemy_3);
        enemy_3.setImageBitmap(fun.loadBitmapFromAssets(context, "map_3/niuyao.png"));
        ImageView enemy_4 = view.findViewById(R.id.enemy_4);
        enemy_4.setImageBitmap(fun.loadBitmapFromAssets(context, "map_3/haiouyao.png"));
        ImageView enemy_5 = view.findViewById(R.id.enemy_5);
        enemy_5.setImageBitmap(fun.loadBitmapFromAssets(context, "map_3/haiguiyao.png"));
        ImageView enemy_6 = view.findViewById(R.id.enemy_6);
        enemy_6.setImageBitmap(fun.loadBitmapFromAssets(context, "map_3/shuyao.png"));
        ImageView enemy_7 = view.findViewById(R.id.enemy_7);
        enemy_7.setImageBitmap(fun.loadBitmapFromAssets(context, "map_3/dufengwang.png"));
        ImageView enemy_8 = view.findViewById(R.id.enemy_8);
        enemy_8.setImageBitmap(fun.loadBitmapFromAssets(context, "map_3/xueyakuangyuan.png"));
        ImageView enemy_9 = view.findViewById(R.id.enemy_9);
        enemy_9.setImageBitmap(fun.loadBitmapFromAssets(context, "map_3/cuiyuniao.png"));
        ScrollView scrollView = view.findViewById(R.id.scrollView);
        scrollView.post(() -> scrollView.scrollTo(0, fun.scrollY));
        enemy_1.setOnClickListener(V->{
            fun.enemy_object = new HuDieYao();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });

        enemy_2.setOnClickListener(V->{
            fun.enemy_object = new QinSheYao();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });

        enemy_3.setOnClickListener(V->{
            fun.enemy_object = new NiuYao();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });

        enemy_4.setOnClickListener(V->{
            fun.enemy_object = new HaiOuYao();
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
        Bitmap back = fun.loadBitmapFromAssets(context, "map_3/back_" + fun.Random(5) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();
    }
}