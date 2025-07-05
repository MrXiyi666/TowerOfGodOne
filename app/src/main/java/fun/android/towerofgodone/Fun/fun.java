package fun.android.towerofgodone.Fun;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.WindowInsets;
import android.widget.RelativeLayout;

import fun.android.towerofgodone.Scene.Scene_Base;

public class fun {
    public static RelativeLayout main_layout;
    public static Scene_Base scene;

    public static int getStatusBarHeight(Context context) {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }
}
