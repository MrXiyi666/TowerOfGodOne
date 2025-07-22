package fun.android.towerofgodone.Scene.Map_1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ScrollView;

import fun.android.towerofgodone.Data.Map_1.feilonggu.AnYan;
import fun.android.towerofgodone.Data.Map_1.feilonggu.BingJingLong;
import fun.android.towerofgodone.Data.Map_1.feilonggu.CangQiongLieKongLong;
import fun.android.towerofgodone.Data.Map_1.feilonggu.CuiYingLingLong;
import fun.android.towerofgodone.Data.Map_1.feilonggu.FeiLongWang;
import fun.android.towerofgodone.Data.Map_1.feilonggu.FengXiaoChuLong;
import fun.android.towerofgodone.Data.Map_1.feilonggu.HuangJinSanTouLong;
import fun.android.towerofgodone.Data.Map_1.feilonggu.JinLingShengLong;
import fun.android.towerofgodone.Data.Map_1.feilonggu.JingCiFeiLong;
import fun.android.towerofgodone.Data.Map_1.feilonggu.LieEDiXingLong;
import fun.android.towerofgodone.Data.Map_1.feilonggu.LingJiaXiLong;
import fun.android.towerofgodone.Data.Map_1.feilonggu.LongShi;
import fun.android.towerofgodone.Data.Map_1.feilonggu.RongHeJiLong;
import fun.android.towerofgodone.Data.Map_1.feilonggu.XianNvLong;
import fun.android.towerofgodone.Data.Map_1.feilonggu.XingYuanShiJieLong;
import fun.android.towerofgodone.Data.Map_1.feilonggu.YanYiMoLong;
import fun.android.towerofgodone.Data.Map_1.feilonggu.YongHengCangQiongLongHuang;
import fun.android.towerofgodone.Data.Map_1.feilonggu.YouYingLongJi;
import fun.android.towerofgodone.Data.Map_1.feilonggu.ZhongYanJiMieLong;
import fun.android.towerofgodone.Data.Map_1.feilonggu.ZuanShiLong;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.Scene.Scene_Base;
import fun.android.towerofgodone.Scene.Scene_Map;
import fun.android.towerofgodone.Scene.War.Scene_War;

public class Scene_FeiLongGu extends Scene_Base {
    public Scene_FeiLongGu(Context context) {
        super(context);
        fun.Map_Index = 4;
        fun.Scene_War_Cancel = this;
        view = LayoutInflater.from(context).inflate(R.layout.scene_feilonggu, null);
        ImageView enemy_1 = view.findViewById(R.id.enemy_1);
        enemy_1.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/feilonggu/lingjiaxilong.png"));
        ImageView enemy_2 = view.findViewById(R.id.enemy_2);
        enemy_2.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/feilonggu/fengxiaochulong.png"));
        ImageView enemy_3 = view.findViewById(R.id.enemy_3);
        enemy_3.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/feilonggu/lieedixinglong.png"));
        ImageView enemy_4 = view.findViewById(R.id.enemy_4);
        enemy_4.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/feilonggu/jingcifeilong.png"));
        ImageView enemy_5 = view.findViewById(R.id.enemy_5);
        enemy_5.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/feilonggu/ronghejilong.png"));
        ImageView enemy_6 = view.findViewById(R.id.enemy_6);
        enemy_6.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/feilonggu/youyinglongji.png"));
        ImageView enemy_7 = view.findViewById(R.id.enemy_7);
        enemy_7.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/feilonggu/cangqiongliekonglong.png"));
        ImageView enemy_8 = view.findViewById(R.id.enemy_8);
        enemy_8.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/feilonggu/xingyuanshijielong.png"));
        ImageView enemy_9 = view.findViewById(R.id.enemy_9);
        enemy_9.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/feilonggu/yonghengcangqionglonghuang.png"));
        ImageView enemy_10 = view.findViewById(R.id.enemy_10);
        enemy_10.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_1/feilonggu/zhongyanjimielong.png"));
        ScrollView scrollView = view.findViewById(R.id.scrollView);
        scrollView.post(() -> scrollView.scrollTo(0, fun.scrollY));
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
            fun.scrollY = 0;
            fun.Map_Index = 0;
        });

        enemy_1.setOnClickListener(V->{
            fun.enemy_object = new LingJiaXiLong();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_2.setOnClickListener(V->{
            fun.enemy_object = new FengXiaoChuLong();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_3.setOnClickListener(V->{
            fun.scrollY = scrollView.getScrollY();
            fun.enemy_object = new LieEDiXingLong();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_4.setOnClickListener(V->{
            fun.scrollY = scrollView.getScrollY();
            fun.enemy_object = new JingCiFeiLong();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_5.setOnClickListener(V->{
            fun.scrollY = scrollView.getScrollY();
            fun.enemy_object = new RongHeJiLong();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_6.setOnClickListener(V->{
            fun.scrollY = scrollView.getScrollY();
            fun.enemy_object = new YouYingLongJi();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_7.setOnClickListener(V->{
            fun.scrollY = scrollView.getScrollY();
            fun.enemy_object = new CangQiongLieKongLong();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_8.setOnClickListener(V->{
            fun.scrollY = scrollView.getScrollY();
            fun.enemy_object = new XingYuanShiJieLong();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_9.setOnClickListener(V->{
            fun.scrollY = scrollView.getScrollY();
            fun.enemy_object = new YongHengCangQiongLongHuang();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_10.setOnClickListener(V->{
            fun.scrollY = scrollView.getScrollY();
            fun.enemy_object = new ZhongYanJiMieLong();
            fun.view_transition.start(new Scene_War(context));
        });
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "map/map_1/feilonggu/back_" + fun.Random(7) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();

    }
}
