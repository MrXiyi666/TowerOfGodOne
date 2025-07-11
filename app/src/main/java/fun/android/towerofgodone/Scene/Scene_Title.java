package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.util.Log;
import android.view.LayoutInflater;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.Boundary_Data_Item;
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
        Actor_Object.Create();
        Create_Music();
        Create_Game(context);
    }

    @Override
    public void enable_scene(Context context) {
        super.enable_scene(context);
        Bitmap back = fun.loadBitmapFromAssets(context, "title/back_"+ fun.Random(2)+".png");
        fun.main_back.setBackground(new BitmapDrawable(context.getResources(), back));
    }

    public void Create_Game(Context context){
        if(!Fun_File.ReadBoundary(context)){
            Fun_File.SaveBoundary(context);
        }
        if(!Fun_File.ReadValue(context)){
            Fun_File.SaveValue(context);
        }
        if(!Fun_File.ReadDress(context)){
            Fun_File.SaveDress(context);
        }
        if(!Fun_File.ReadArms(context)){
            Fun_File.SaveArms(context);
        }
        if(!Fun_File.ReadGold(context)){
            Fun_File.SaveGold(context);
        }
        if(!Fun_File.ReadDrugList(context)){
            Fun_File.SaveDrugList(context);
        }
        if(!Fun_File.ReadArmsList(context)){
            Fun_File.SaveArmsList(context);
        }
        if(!Fun_File.ReadDressList(context)){
            Fun_File.SaveDressList(context);
        }
    }

    public void Create_Music(){


        fun.soundPool = new SoundPool.Builder()
                .setMaxStreams(2)
                .build();
    }
    @Override
    public void Release() {
        super.Release();
    }
}
