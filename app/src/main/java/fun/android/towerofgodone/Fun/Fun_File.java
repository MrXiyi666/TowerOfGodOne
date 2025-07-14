package fun.android.towerofgodone.Fun;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

import fun.android.towerofgodone.Data.Actor_Object;

public class Fun_File {
    
    public static String getPath(Context context){
        return Objects.requireNonNull(context.getExternalFilesDir(null)).getAbsolutePath()+"/";
    }
    public static boolean ActorSaveToExists(Context context){
        return new File(getPath(context) + "save/actor_data.txt").exists();
    }

    public static boolean 是否存在(Context context, String path){
        return new File(getPath(context) + path).exists();
    }

    public static boolean WriteString(String path, String data){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(data);
        } catch (IOException e) {
            Log.w("WriteString", e);
            return false;
        }
        return true;
    }

    public static String readString(Context context, String path) {
        StringBuilder content = new StringBuilder();
        File file = new File(path);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            Log.e("ReadFileFromInternalStorage", "读取文件时出错: " + e.getMessage());
        }

        return content.toString();
    }

    public static int loadSE(Context context, String name_path){
        try {
            // 获取 AssetManager
            AssetManager assetManager = context.getAssets();
            // 打开 assets 中的音效文件
            AssetFileDescriptor assetFileDescriptor = assetManager.openFd(name_path);
            // 加载音效文件
            return fun.soundPool.load(assetFileDescriptor, 1);
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
    public static void release_SE(int soundId){
        fun.soundPool.unload(soundId);
    }

    public static boolean ReadDress(Context context){
        if(!new File(getPath(context) + "save/dress.txt").exists()){
            return false;
        }
        String data = readString(context, getPath(context) + "save/dress.txt");
        Actor_Object.Dress = fun.toInt(data);
        return true;
    }

    public static void SaveDress(Context context){
        new File(getPath(context) + "save").mkdirs();
        WriteString(getPath(context) + "save/dress.txt", String.valueOf(Actor_Object.Dress));
    }

    public static boolean ReadArms(Context context){
        if(!new File(getPath(context) + "save/arms.txt").exists()){
            return false;
        }
        String data = readString(context, getPath(context) + "save/arms.txt");
        Actor_Object.Arms = fun.toInt(data);
        return true;
    }

    public static void SaveArms(Context context){
        new File(getPath(context) + "save").mkdirs();
        WriteString(getPath(context) + "save/arms.txt", String.valueOf(Actor_Object.Arms));
    }

    public static void SaveBoundary(Context context){
        new File(getPath(context) + "save").mkdirs();
        WriteString(getPath(context) + "save/actor_Boundary.txt", String.valueOf(Actor_Object.Boundary));
    }

    public static boolean ReadBoundary(Context context){
        if(!new File(getPath(context) + "save/actor_Boundary.txt").exists()){
            return false;
        }
        String data = readString(context, getPath(context) + "save/actor_Boundary.txt");
        Actor_Object.Boundary = fun.toInt(data);
        return true;
    }

    public static boolean SaveValue(Context context){
        new File(getPath(context) + "save").mkdirs();
        return WriteString(getPath(context) + "save/value.txt", String.valueOf(Actor_Object.Value));
    }

    public static boolean ReadValue(Context context){
        if(!new File(getPath(context) + "save/value.txt").exists()){
            return false;
        }
        String data = readString(context, getPath(context) + "save/value.txt");
        Actor_Object.Value = fun.toInt(data);
        return true;
    }

    public static boolean SaveGold(Context context){
        new File(getPath(context) + "save").mkdirs();
        return WriteString(getPath(context) + "save/gold.txt", String.valueOf(Actor_Object.Gold));
    }

    public static boolean ReadGold(Context context){
        if(!new File(getPath(context) + "save/gold.txt").exists()){
            return false;
        }
        String data = readString(context, getPath(context) + "save/gold.txt");
        Actor_Object.Gold = fun.toInt(data);
        return true;
    }

    public static boolean SaveDrugList(Context context){
        new File(getPath(context) + "save").mkdirs();
        return WriteString(getPath(context) + "save/drug_list.txt", new Gson().toJson(fun.drug_list));
    }

    public static boolean ReadDrugList(Context context){
        if(!new File(getPath(context) + "save/drug_list.txt").exists()){
            return false;
        }
        String data = readString(context, getPath(context) + "save/drug_list.txt");
        fun.drug_list = new Gson().fromJson(data, new TypeToken<List<String>>(){}.getType());
        return true;
    }
    public static void SaveArmsList(Context context){
        new File(getPath(context) + "save").mkdirs();
        WriteString(getPath(context) + "save/arms_list.txt", new Gson().toJson(fun.arms_list));
    }

    public static boolean ReadArmsList(Context context){
        if(!new File(getPath(context) + "save/arms_list.txt").exists()){
            return false;
        }
        String data = readString(context, getPath(context) + "save/arms_list.txt");
        fun.arms_list = new Gson().fromJson(data, new TypeToken<List<String>>(){}.getType());
        return true;
    }

    public static boolean SaveDressList(Context context){
        new File(getPath(context) + "save").mkdirs();
        return WriteString(getPath(context) + "save/dress_list.txt", new Gson().toJson(fun.dress_list));
    }

    public static boolean ReadDressList(Context context){
        if(!new File(getPath(context) + "save/dress_list.txt").exists()){
            return false;
        }
        String data = readString(context, getPath(context) + "save/dress_list.txt");
        fun.dress_list = new Gson().fromJson(data, new TypeToken<List<String>>(){}.getType());
        return true;
    }

    public static boolean SaveAttackHoist(Context context){
        new File(getPath(context) + "save").mkdirs();
        return WriteString(getPath(context) + "save/attack_hoist.txt", String.valueOf(fun.attack_hoist));
    }

    public static boolean ReadAttackHoist(Context context){
        if(!new File(getPath(context) + "save/attack_hoist.txt").exists()){
            return false;
        }
        String data = readString(context, getPath(context) + "save/attack_hoist.txt");
        fun.attack_hoist = fun.toInt(data);
        return true;
    }

    public static boolean SaveDefenseHoist(Context context){
        new File(getPath(context) + "save").mkdirs();
        return WriteString(getPath(context) + "save/defense_hoist.txt", String.valueOf(fun.defense_hoist));
    }

    public static boolean ReadDefenseHoist(Context context){
        if(!new File(getPath(context) + "save/defense_hoist.txt").exists()){
            return false;
        }
        String data = readString(context, getPath(context) + "save/defense_hoist.txt");
        fun.defense_hoist = fun.toInt(data);
        return true;
    }

    public static boolean SaveCriticalHoist(Context context){
        new File(getPath(context) + "save").mkdirs();
        return WriteString(getPath(context) + "save/critical_hoist.txt", String.valueOf(fun.critical_hoist));
    }

    public static boolean ReadCriticalHoist(Context context){
        if(!new File(getPath(context) + "save/critical_hoist.txt").exists()){
            return false;
        }
        String data = readString(context, getPath(context) + "save/critical_hoist.txt");
        fun.critical_hoist = fun.toInt(data);
        return true;
    }
    public static boolean SaveSpeedHoist(Context context){
        new File(getPath(context) + "save").mkdirs();
        return WriteString(getPath(context) + "save/speed_hoist.txt", String.valueOf(fun.speed_hoist));
    }

    public static boolean ReadSpeedHoist(Context context){
        if(!new File(getPath(context) + "save/speed_hoist.txt").exists()){
            return false;
        }
        String data = readString(context, getPath(context) + "save/speed_hoist.txt");
        fun.speed_hoist = fun.toInt(data);
        return true;
    }

    public static void SaveCornuCopiaTimer(Context context){
        new File(getPath(context) + "save").mkdirs();
        WriteString(getPath(context) + "save/cornucopia_timer.txt", Fun_Time.getTime());
    }
    public static boolean BoolCornuCopiaTimer(Context context){
        if(!new File(getPath(context) + "save/cornucopia_timer.txt").exists()){
            return false;
        }
        return true;
    }
    public static String ReadCornuCopiaTimer(Context context){
        if(!new File(getPath(context) + "save/cornucopia_timer.txt").exists()){
            return Fun_Time.getTime();
        }
        return readString(context, getPath(context) + "save/cornucopia_timer.txt");
    }


}
