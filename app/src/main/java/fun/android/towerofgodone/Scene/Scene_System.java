package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.LayoutInflater;

import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.Window.Window_Fugue;

public class Scene_System extends Scene_Base{
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
            if(fun.AfterToHour(time)){
                new Window_Fugue(context);
                Fun_File.WriteString(Fun_File.getPath(context) + "save/fugue_time.txt", fun.getTime());
                return;
            }
            fun.Mess(context, "暂未开启\n\n剩余：" + fun.AfterToHourAndMinute() + "分钟");

        });
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "map/back_" + fun.Random(3) + ".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    @Override
    public void Release() {
        super.Release();
    }
}
