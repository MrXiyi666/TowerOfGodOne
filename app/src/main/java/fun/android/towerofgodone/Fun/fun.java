package fun.android.towerofgodone.Fun;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import fun.android.towerofgodone.Data.Enemy_Object;
import fun.android.towerofgodone.Scene.Scene_Base;
import fun.android.towerofgodone.View.View_Transition;
import fun.android.towerofgodone.Window.Window_Mess;

public class fun {
    public static RelativeLayout main_back, main_layout;
    public static Scene_Base scene, Scene_War_Cancel;
    public static View_Transition view_transition;
    public static Enemy_Object enemy_object;
    public static SoundPool soundPool;
    public static List<String> drug_list = new ArrayList<>();
    public static List<String> arms_list = new ArrayList<>();
    public static List<String> dress_list = new ArrayList<>();
    public static int attack_hoist=0;
    public static int defense_hoist=0;
    public static int critical_hoist=0;
    public static int speed_hoist=0;
    public static int Map_Index = 0; // 魔兽场景ID
    public static int Map_ID=1;      //地图ID
    public static int scrollY=0, scrollY_Map=0;


    public static void Mess(Context context, String text){
        //Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        new Window_Mess(context, text);
    }

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
        } else if (value instanceof String) {
            try {
                return Integer.parseInt(((String) value).trim());
            } catch (NumberFormatException e) {
                // 如果字符串无法解析为整数，返回 0 或抛出异常
                return 0;
            }
        } else {
            return 0;
        }
    }
    public static int Random( int max){
        Random random = new Random();
        return random.nextInt(max+1);
    }
    public static void play_SE(int id){
        fun.soundPool.play(id, 1.0f, 1.0f, 1, 0, 1.0f);
    }
    public static String getTime(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // 注意：月份从 0 开始，所以要加 1
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24 小时制
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        return year + ":" + month + ":" + day + ":" + hour + ":" + minute + ":" + second;
    }
    public static String getTimeToHour(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // 注意：月份从 0 开始，所以要加 1
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24 小时制
        return year + ":" + month + ":" + day + ":" + hour;
    }
    //是否经过一小时
    public static boolean AfterToHour(String time){
        //旧的时间
        String outTime[] = time.split(":");
        int outYear = toInt(outTime[0]);
        int outMonth = toInt(outTime[1]);
        int outDay = toInt(outTime[2]);
        int outHour = toInt(outTime[3]);
        Log.w("时间", "旧的时间" + outYear + " " + outMonth + " " + outDay + " " + outHour);
        //当前时间
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // 注意：月份从 0 开始，所以要加 1
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        Log.w("时间", "当前时间" + year + " " + month + " " + day + " " + hour);
        if(year != outYear || month != outMonth || day != outDay || hour != outHour){
            Log.w("时间", "true");
            return true;
        }
        Log.w("时间", "false");
        return false;
    }
    //一小时剩余多少分钟
    public static int AfterToHourAndMinute(){
        Calendar calendar = Calendar.getInstance();
        int minute = calendar.get(Calendar.MINUTE);
        return 60-minute;
    }

    public static void ClearImageView(ImageView imageView){
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof BitmapDrawable bitmapDrawable) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        imageView.setImageDrawable(null);
    }
    public static void ClearBitmap(Bitmap bitmap){
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
            bitmap = null;
        }
    }
}
