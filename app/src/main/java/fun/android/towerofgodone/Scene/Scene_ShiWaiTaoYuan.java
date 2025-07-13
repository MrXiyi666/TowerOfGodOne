package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ScrollView;
import fun.android.towerofgodone.Data.shiwaitaoyuan.BaiYu;
import fun.android.towerofgodone.Data.shiwaitaoyuan.ChuShouKuangMo;
import fun.android.towerofgodone.Data.shiwaitaoyuan.JiYaShou;
import fun.android.towerofgodone.Data.shiwaitaoyuan.JinShenZhanXing;
import fun.android.towerofgodone.Data.shiwaitaoyuan.KumuShuReng;
import fun.android.towerofgodone.Data.shiwaitaoyuan.SantouXuemoNiu;
import fun.android.towerofgodone.Data.shiwaitaoyuan.YanWeiHu;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;

public class Scene_ShiWaiTaoYuan extends Scene_Base{
    public Scene_ShiWaiTaoYuan(Context context) {
        super(context);
        fun.Map_Index = 2;

        view = LayoutInflater.from(context).inflate(R.layout.scene_shiwaitaoyuan, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
            fun.scrollY = 0;
            fun.Map_Index = 2;
        });
        ScrollView scrollView = view.findViewById(R.id.scrollView);
        scrollView.post(() -> scrollView.scrollTo(0, fun.scrollY));
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
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_2).setOnClickListener(V->{
            fun.enemy_object = new SantouXuemoNiu();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_3).setOnClickListener(V->{
            fun.enemy_object = new BaiYu();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_4).setOnClickListener(V->{
            fun.enemy_object = new ChuShouKuangMo();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_5).setOnClickListener(V->{
            fun.enemy_object = new JinShenZhanXing();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_6).setOnClickListener(V->{
            fun.enemy_object = new YanWeiHu();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_7).setOnClickListener(V->{
            fun.enemy_object = new JiYaShou();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "shiwaitaoyuan/back_" + fun.Random(2) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }
}
