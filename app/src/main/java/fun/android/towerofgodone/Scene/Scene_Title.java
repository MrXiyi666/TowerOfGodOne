package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;

public class Scene_Title extends Scene_Base {

    public Scene_Title(Context context){
        super(context);
        view = LayoutInflater.from(context).inflate(R.layout.scene_title, null);
        view.findViewById(R.id.open_game_button).setOnClickListener(V->{
            fun.scene = new Scene_Map(context);
            fun.scene.enable_scene();
        });
    }
    @Override
    public void Release() {
        super.Release();
    }
}
