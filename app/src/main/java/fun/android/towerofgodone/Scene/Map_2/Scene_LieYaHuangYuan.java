package fun.android.towerofgodone.Scene.Map_2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ScrollView;

import fun.android.towerofgodone.Data.Map_1.feilonggu.LongShi;
import fun.android.towerofgodone.Data.Map_2.LieYaHuangYuan.HuTouBanShouR;
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

        enemy_1.setOnClickListener(V->{
            fun.enemy_object = new HuTouBanShouR();
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