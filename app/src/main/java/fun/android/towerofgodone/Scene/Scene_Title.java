package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;

public class Scene_Title extends Scene_Base {

    public Scene_Title(Context context){
        super(context);
        view = LayoutInflater.from(context).inflate(R.layout.scene_title, null);
        view.findViewById(R.id.open_game_button).setOnClickListener(V->{
            fun.view_transition.start(new Scene_Map(context));
        });

        Create_Game(context);
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene();
        Bitmap back = fun.loadBitmapFromAssets(context, "title/back_"+ fun.Random(2)+".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    public void Create_Game(Context context){
        if(!Fun_File.Read(context)){
            Fun_File.Save(context);
        }
        if(!Fun_File.ReadDrug(context)){
            Fun_File.SaveDrug(context);
        }
        if(!Fun_File.ReadArms(context)){
            Fun_File.SaveArms(context);
        }
    }
    @Override
    public void Release() {
        super.Release();
    }
}
