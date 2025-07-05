package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.view.LayoutInflater;

import fun.android.towerofgodone.R;

public class Scene_Map extends Scene_Base{
    public Scene_Map(Context context) {
        super(context);
        view = LayoutInflater.from(context).inflate(R.layout.scene_map, null);
    }

    @Override
    public void Release() {
        super.Release();

    }
}
