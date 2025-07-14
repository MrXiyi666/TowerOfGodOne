package fun.android.towerofgodone.Scene.System;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.Fun_Time;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.Scene.Scene_Base;
import fun.android.towerofgodone.Scene.Scene_Map;
import fun.android.towerofgodone.Window.Window_CornuCopia;
import fun.android.towerofgodone.Window.Window_Fugue;
import fun.android.towerofgodone.Window.Window_HeriTaGe;

public class Scene_System extends Scene_Base {
    public Scene_System(Context context) {
        super(context);
        view = LayoutInflater.from(context).inflate(R.layout.scene_system, null);

        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
        });

        view.findViewById(R.id.button_fugue).setOnClickListener(V->{
            //不存在直接进入
            if(!Fun_File.是否存在(context, "save/fugue_time.txt")){
                new Window_Fugue(context);
                Fun_File.WriteString(Fun_File.getPath(context) + "save/fugue_time.txt", fun.getTime());
                return;
            }
            String time = Fun_File.readString(context, Fun_File.getPath(context) + "save/fugue_time.txt");
            if(Fun_Time.经过多少秒(time) > 3600){
                new Window_Fugue(context);
                Fun_File.WriteString(Fun_File.getPath(context) + "save/fugue_time.txt", fun.getTime());
                return;
            }
            fun.Mess(context, "暂未开启\n\n剩余：" + (60 - Fun_Time.经过多少秒(time) / 60) + "分钟");
        });
        view.findViewById(R.id.button_cornucopia).setOnClickListener(V->{
            new Window_CornuCopia(context);
        });
        view.findViewById(R.id.button_heritage).setOnClickListener(V->{
            new Window_HeriTaGe(context);
        });
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "map/system/back_" + fun.Random(3) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();
    }
}
