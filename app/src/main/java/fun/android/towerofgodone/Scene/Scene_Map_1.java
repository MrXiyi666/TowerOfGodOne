package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ScrollView;
import fun.android.towerofgodone.Data.map_1.CiQiuGuai;
import fun.android.towerofgodone.Data.map_1.Feibian;
import fun.android.towerofgodone.Data.map_1.JiaChongGuai;
import fun.android.towerofgodone.Data.map_1.SheGuai;
import fun.android.towerofgodone.Data.map_1.ShuiMuGuai;
import fun.android.towerofgodone.Data.map_1.XiyiGuai;
import fun.android.towerofgodone.Data.map_1.Yelang;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;

public class Scene_Map_1 extends Scene_Base{
    public Scene_Map_1(Context context) {
        super(context);
        fun.Map_Index = 1;
        view = LayoutInflater.from(context).inflate(R.layout.scene_map_1, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
            fun.scrollY = 0;
            fun.Map_Index = 0;
        });
        ScrollView scrollView = view.findViewById(R.id.scrollView);
        scrollView.post(() -> scrollView.scrollTo(0, fun.scrollY));
        view.findViewById(R.id.enemy_1).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new XiyiGuai().img_path)));
        view.findViewById(R.id.enemy_2).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new Yelang().img_path)));
        view.findViewById(R.id.enemy_3).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new Feibian().img_path)));
        view.findViewById(R.id.enemy_4).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new ShuiMuGuai().img_path)));
        view.findViewById(R.id.enemy_5).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new CiQiuGuai().img_path)));
        view.findViewById(R.id.enemy_5).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new CiQiuGuai().img_path)));
        view.findViewById(R.id.enemy_6).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new JiaChongGuai().img_path)));
        view.findViewById(R.id.enemy_7).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, new SheGuai().img_path)));
        view.findViewById(R.id.enemy_1).setOnClickListener(V->{
            fun.enemy_object = new XiyiGuai();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_2).setOnClickListener(V->{
            fun.enemy_object = new Yelang();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_3).setOnClickListener(V->{
            fun.enemy_object = new Feibian();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_4).setOnClickListener(V->{
            fun.enemy_object = new ShuiMuGuai();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_5).setOnClickListener(V->{
            fun.enemy_object = new CiQiuGuai();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_6).setOnClickListener(V->{
            fun.enemy_object = new JiaChongGuai();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
        view.findViewById(R.id.enemy_7).setOnClickListener(V->{
            fun.enemy_object = new SheGuai();
            fun.scrollY = scrollView.getScrollY();
            fun.view_transition.start(new Scene_War(context));
        });
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "map_1/back_" + fun.Random(3) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();
    }
}
