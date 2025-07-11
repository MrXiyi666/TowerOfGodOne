package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ScrollView;

import fun.android.towerofgodone.Data.map_4.AnYan;
import fun.android.towerofgodone.Data.map_4.BingJingLong;
import fun.android.towerofgodone.Data.map_4.CuiYingLingLong;
import fun.android.towerofgodone.Data.map_4.FeiLongWang;
import fun.android.towerofgodone.Data.map_4.HuangJinSanTouLong;
import fun.android.towerofgodone.Data.map_4.JinLingShengLong;
import fun.android.towerofgodone.Data.map_4.LongShi;
import fun.android.towerofgodone.Data.map_4.XianNvLong;
import fun.android.towerofgodone.Data.map_4.YanYiMoLong;
import fun.android.towerofgodone.Data.map_4.ZuanShiLong;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;

public class Scene_Map_4 extends Scene_Base{
    public Scene_Map_4(Context context) {
        super(context);
        fun.Map_Index = 4;

        view = LayoutInflater.from(context).inflate(R.layout.scene_map_4, null);
        ImageView enemy_1 = view.findViewById(R.id.enemy_1);
        enemy_1.setImageBitmap(fun.loadBitmapFromAssets(context, "map_4/longshi.png"));
        ImageView enemy_2 = view.findViewById(R.id.enemy_2);
        enemy_2.setImageBitmap(fun.loadBitmapFromAssets(context, "map_4/yanyimolong.png"));
        ImageView enemy_3 = view.findViewById(R.id.enemy_3);
        enemy_3.setImageBitmap(fun.loadBitmapFromAssets(context, "map_4/jinlingshenglong.png"));
        ImageView enemy_4 = view.findViewById(R.id.enemy_4);
        enemy_4.setImageBitmap(fun.loadBitmapFromAssets(context, "map_4/cuiyinglinglong.png"));
        ImageView enemy_5 = view.findViewById(R.id.enemy_5);
        enemy_5.setImageBitmap(fun.loadBitmapFromAssets(context, "map_4/bingjinglong.png"));
        ImageView enemy_6 = view.findViewById(R.id.enemy_6);
        enemy_6.setImageBitmap(fun.loadBitmapFromAssets(context, "map_4/huangjinsantoulong.png"));
        ImageView enemy_7 = view.findViewById(R.id.enemy_7);
        enemy_7.setImageBitmap(fun.loadBitmapFromAssets(context, "map_4/xiannvlong.png"));
        ImageView enemy_8 = view.findViewById(R.id.enemy_8);
        enemy_8.setImageBitmap(fun.loadBitmapFromAssets(context, "map_4/zuanshilong.png"));
        ImageView enemy_9 = view.findViewById(R.id.enemy_9);
        enemy_9.setImageBitmap(fun.loadBitmapFromAssets(context, "map_4/anyan.png"));
        ImageView enemy_10 = view.findViewById(R.id.enemy_10);
        enemy_10.setImageBitmap(fun.loadBitmapFromAssets(context, "map_4/feilongwang.png"));
        ScrollView scrollView = view.findViewById(R.id.scrollView);
        scrollView.post(() -> scrollView.scrollTo(0, fun.scrollY));
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
            fun.scrollY = 0;
            fun.Map_Index = 0;
        });

        enemy_1.setOnClickListener(V->{
            fun.enemy_object = new LongShi();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_2.setOnClickListener(V->{
            fun.enemy_object = new YanYiMoLong();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_3.setOnClickListener(V->{
            fun.scrollY = scrollView.getScrollY();
            fun.enemy_object = new JinLingShengLong();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_4.setOnClickListener(V->{
            fun.scrollY = scrollView.getScrollY();
            fun.enemy_object = new CuiYingLingLong();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_5.setOnClickListener(V->{
            fun.scrollY = scrollView.getScrollY();
            fun.enemy_object = new BingJingLong();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_6.setOnClickListener(V->{
            fun.scrollY = scrollView.getScrollY();
            fun.enemy_object = new HuangJinSanTouLong();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_7.setOnClickListener(V->{
            fun.scrollY = scrollView.getScrollY();
            fun.enemy_object = new XianNvLong();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_8.setOnClickListener(V->{
            fun.scrollY = scrollView.getScrollY();
            fun.enemy_object = new ZuanShiLong();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_9.setOnClickListener(V->{
            fun.scrollY = scrollView.getScrollY();
            fun.enemy_object = new AnYan();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_10.setOnClickListener(V->{
            fun.scrollY = scrollView.getScrollY();
            fun.enemy_object = new FeiLongWang();
            fun.view_transition.start(new Scene_War(context));
        });
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "map_4/back_" + fun.Random(7) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();

    }
}
