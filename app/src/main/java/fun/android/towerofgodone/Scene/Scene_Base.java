package fun.android.towerofgodone.Scene;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import fun.android.towerofgodone.Fun.fun;

public class Scene_Base {

    public View view;

    public Scene_Base(Context context){
    }

    public View getView(){
        return view;
    }

    public void enable_scene(Context context){

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
        );
        fun.main_layout.removeAllViews();
        fun.main_layout.addView(view, params);
    }

    public void Quit(){
        this.Release();
    }

    public void Release(){

    }

}
