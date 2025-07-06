package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;

public class Scene_Map extends Scene_Base{

    public Scene_Map(Context context) {
        super(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "map/back_" + fun.Random(3) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
        view = LayoutInflater.from(context).inflate(R.layout.scene_map, null);
        view.findViewById(R.id.map_1).setOnClickListener(V->{
            fun.scene = new Scene_Map_1(context);
            fun.scene.enable_scene();
        });
        view.findViewById(R.id.map_2).setOnClickListener(V->{
            fun.scene = new Scene_Map_2(context);
            fun.scene.enable_scene();
        });
        view.findViewById(R.id.map_3).setOnClickListener(V->{

        });
        view.findViewById(R.id.map_4).setOnClickListener(V->{

        });
        view.findViewById(R.id.img_1).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/mowusenling.png")
        ));
        view.findViewById(R.id.img_2).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/shiwaitaoyuan.png")
        ));
        view.findViewById(R.id.img_3).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/huahaipan.png")
        ));
        view.findViewById(R.id.img_4).setBackground(new BitmapDrawable(context.getResources(),
                fun.loadBitmapFromAssets(context, "map/feilonggu.png")
        ));
    }

    @Override
    public void Release() {
        super.Release();

    }
}
