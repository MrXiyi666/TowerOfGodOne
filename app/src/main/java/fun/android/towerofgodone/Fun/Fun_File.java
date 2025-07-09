package fun.android.towerofgodone.Fun;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import fun.android.towerofgodone.Data.Actor_Object;

public class Fun_File {
    
    public static String getPath(Context context){
        return Objects.requireNonNull(context.getExternalFilesDir(null)).getAbsolutePath()+"/";
    }
    public static boolean ActorSaveToExists(Context context){
        return new File(getPath(context) + "save/actor_data.txt").exists();
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

    public static boolean ReadItem(Context context){
        String data = readString(context, getPath(context) + "save/item.txt");
        if(data.isEmpty()){
            return false;
        }
        Gson gson = new Gson();
        fun.item_list = gson.fromJson(data, new TypeToken<List<String>>(){}.getType());
        return true;
    }

    public static boolean SaveItem(Context context){
        return WriteString(getPath(context) + "save/item.txt", new Gson().toJson(fun.item_list));
    }

    public static boolean Save(Context context){
        new File(getPath(context) + "save").mkdirs();
        Map<String, Object> actor = new HashMap<>();
        actor.put("HP", Actor_Object.HP);
        actor.put("Attack", Actor_Object.Attack);
        actor.put("Defense", Actor_Object.Defense);
        actor.put("Critical", Actor_Object.Critical);
        actor.put("Speed", Actor_Object.Speed);
        actor.put("img_path", Actor_Object.img_path);
        actor.put("Value", Actor_Object.Value);
        actor.put("Gold", Actor_Object.Gold);
        actor.put("Arms", Actor_Object.Arms);
        actor.put("Dress", Actor_Object.Dress);
        actor.put("Boundary", Actor_Object.Boundary);
        return WriteString(getPath(context) + "save/actor_data.txt", new Gson().toJson(actor));
    }


    public static boolean Read(Context context){
        if(!ActorSaveToExists(context)){
            return false;
        }
        String data = readString(context, getPath(context) + "save/actor_data.txt");
        if(data.isEmpty()){
            return false;
        }
        Type type = new TypeToken<Map<String, Object>>() {}.getType();
        Map<String, Object> map = new Gson().fromJson(data, type);
        if(map.isEmpty()){
            return false;
        }
        for (String key : map.keySet()) {
            switch(key){
                case "HP":
                    Actor_Object.HP = fun.toInt(map.get(key));
                    break;
                case "Attack":
                    Actor_Object.Attack = fun.toInt(map.get(key));
                    break;
                case "Defense":
                    Actor_Object.Defense = fun.toInt(map.get(key));
                    break;
                case "Critical":
                    Actor_Object.Critical = fun.toInt(map.get(key));
                    break;
                case "Speed":
                    Actor_Object.Speed = fun.toInt(map.get(key));
                    break;
                case "img_path":
                    Actor_Object.img_path = (String) map.get(key);
                    break;
                case "Value":
                    Actor_Object.Value = fun.toInt(map.get(key));
                    break;
                case "Gold":
                    Actor_Object.Gold = fun.toInt(map.get(key));
                    break;
                case "Arms":
                    Actor_Object.Arms = fun.toInt(map.get(key));
                    break;
                case "Dress":
                    Actor_Object.Dress = fun.toInt(map.get(key));
                    break;
                case "Boundary":
                    Actor_Object.Boundary = (String) map.get(key);
                    break;
            }
        }
        return true;
    }
}
