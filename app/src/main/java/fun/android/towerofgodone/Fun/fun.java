package fun.android.towerofgodone.Fun;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.RelativeLayout;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import fun.android.towerofgodone.Data.Enemy_Object;
import fun.android.towerofgodone.Scene.Scene_Base;

public class fun {
    public static RelativeLayout main_back, main_layout;
    public static Scene_Base scene;
    public static Enemy_Object enemy_object;
    public static int Map_Index = 0;

    public static int getStatusBarHeight(Context context) {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    public static Bitmap loadBitmapFromAssets(Context context, String fileName) {
        Bitmap bitmap = null;
        try {
            // 获取AssetManager
            InputStream inputStream = context.getAssets().open(fileName);
            // 使用BitmapFactory解码为Bitmap
            bitmap = BitmapFactory.decodeStream(inputStream);
            // 关闭输入流
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;
    }
    public static int toInt(Object value) {
        if (value instanceof Integer) {
            return (int) value;
        } else if (value instanceof Double) {
            return ((Double) value).intValue();
        } else if (value instanceof Float) {
            return ((Float) value).intValue();
        }else{
            return 0;
        }
    }
    public static int Random( int max){
        Random random = new Random();
        return random.nextInt(max+1);
    }
}
