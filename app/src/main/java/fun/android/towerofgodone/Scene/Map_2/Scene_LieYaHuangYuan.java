package fun.android.towerofgodone.Scene.Map_2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ScrollView;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.HuTouBanShouR;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.HuXian;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.LingHuXianZi;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.LongRXingZhe;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.LongRZhanShi;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.MeiDuShaSeXi;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.NiuTouR;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.ShiLiYongShi;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.XiangGuiR;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.Scene.Scene_Base;
import fun.android.towerofgodone.Scene.Scene_Map;
import fun.android.towerofgodone.Scene.War.Scene_War;

public class Scene_LieYaHuangYuan extends Scene_Base {
    public Scene_LieYaHuangYuan(Context context) {
        super(context);
        fun.Map_Index = 8;
        fun.Scene_War_Cancel = this;
        view = LayoutInflater.from(context).inflate(R.layout.scene_lieyahuangyuan, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
            fun.scrollY = 0;
            fun.Map_Index = 0;
        });
        ScrollView scrollView = view.findViewById(R.id.scrollView);
        scrollView.post(() -> scrollView.scrollTo(0, fun.scrollY));
        ImageView enemy_1 = view.findViewById(R.id.enemy_1);
        enemy_1.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_2/lieyahuangyuan/hutoubanshour.png"));
        ImageView enemy_2 = view.findViewById(R.id.enemy_2);
        enemy_2.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_2/lieyahuangyuan/niutour.png"));
        ImageView enemy_3 = view.findViewById(R.id.enemy_3);
        enemy_3.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_2/lieyahuangyuan/linghuxianzi.png"));
        ImageView enemy_4 = view.findViewById(R.id.enemy_4);
        enemy_4.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_2/lieyahuangyuan/xiangguir.png"));
        ImageView enemy_5 = view.findViewById(R.id.enemy_5);
        enemy_5.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_2/lieyahuangyuan/shiliyongshi.png"));
        ImageView enemy_6 = view.findViewById(R.id.enemy_6);
        enemy_6.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_2/lieyahuangyuan/longrzhanshi.png"));
        ImageView enemy_7 = view.findViewById(R.id.enemy_7);
        enemy_7.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_2/lieyahuangyuan/longrxingzhe.png"));
        ImageView enemy_8 = view.findViewById(R.id.enemy_8);
        enemy_8.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_2/lieyahuangyuan/huxian.png"));
        ImageView enemy_9 = view.findViewById(R.id.enemy_9);
        enemy_9.setImageBitmap(fun.loadBitmapFromAssets(context, "map/map_2/lieyahuangyuan/meidushasexi.png"));

        enemy_1.setOnClickListener(V->{
            fun.enemy_object = new HuTouBanShouR();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_2.setOnClickListener(V->{
            fun.enemy_object = new NiuTouR();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_3.setOnClickListener(V->{
            fun.enemy_object = new LingHuXianZi();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_4.setOnClickListener(V->{
            fun.enemy_object = new XiangGuiR();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_5.setOnClickListener(V->{
            fun.enemy_object = new ShiLiYongShi();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_6.setOnClickListener(V->{
            fun.enemy_object = new LongRZhanShi();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_7.setOnClickListener(V->{
            fun.enemy_object = new LongRXingZhe();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_8.setOnClickListener(V->{
            fun.enemy_object = new HuXian();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        enemy_9.setOnClickListener(V->{
            fun.enemy_object = new MeiDuShaSeXi();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "map/map_2/lieyahuangyuan/back_" + fun.Random(6) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();
    }

}