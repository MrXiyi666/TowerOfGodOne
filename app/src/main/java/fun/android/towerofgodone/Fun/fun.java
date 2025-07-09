package fun.android.towerofgodone.Fun;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.Boundary_Data;
import fun.android.towerofgodone.Data.Enemy_Object;
import fun.android.towerofgodone.Data.shop.goods.Goods_Object;
import fun.android.towerofgodone.Scene.Scene_Base;
import fun.android.towerofgodone.View.View_Transition;

public class fun {
    public static RelativeLayout main_back, main_layout;
    public static Scene_Base scene;
    public static View_Transition view_transition;
    public static Enemy_Object enemy_object;
    public static List<String> item_list = new ArrayList<>();
    public static int Map_Index = 0;

    public static void Mess(Context context, String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
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
        }else{
            return 0;
        }
    }
    public static int Random( int max){
        Random random = new Random();
        return random.nextInt(max+1);
    }

    public static Integer[] 获取境界属性(String name){
        Map<String, Integer[]> data = new HashMap<>();
        for (Map.Entry<String, Integer[]> entry : new Boundary_Data().attributes.entrySet()) {
            if(name.equals(entry.getKey())){
                data.put(entry.getKey(), entry.getValue());
                break;
            }
        }
        Map<String, Integer[]> orderedData = new LinkedHashMap<>(data);
        return orderedData.values().stream().findFirst().orElse(null);
    }
    public static String 获取下一个境界名称(String name){
        Map<String, Integer> data = new HashMap<>();
        Boundary_Data boundary_data = new Boundary_Data();
        String b_name = "";
        boolean 开启 = false;
        for (Map.Entry<String, Integer> entry : boundary_data.data.entrySet()) {
            if(开启){
                data.put(entry.getKey(), entry.getValue());
                break;
            }
            if(name.equals(entry.getKey())){
                开启 = true;
            }
        }
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            b_name = entry.getKey();
            break;
        }
        return b_name;
    }

    public static int 获取下一个境界能量值(String name){
        Map<String, Integer> data = new HashMap<>();
        Boundary_Data boundary_data = new Boundary_Data();
        int b_name = 0;
        boolean 开启 = false;
        for (Map.Entry<String, Integer> entry : boundary_data.data.entrySet()) {
            if(开启){
                data.put(entry.getKey(), entry.getValue());
                break;
            }
            if(name.equals(entry.getKey())){
                开启 = true;
            }
        }
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            b_name = entry.getValue();
            break;
        }
        return b_name;
    }
}
