package fun.android.towerofgodone.Window;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AlertDialog;

import java.util.Objects;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.Fun_Time;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.View.StrokeTextView;

public class Window_CornuCopia {
    public Window_CornuCopia(Context context){
        var dialog = new AlertDialog.Builder(context).create();
        var view = View.inflate(context, R.layout.window_cornucopia, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            dialog.dismiss();
        });
        StrokeTextView text_view = view.findViewById(R.id.text_view);
        Log.w("时间", Fun_File.ReadCornuCopiaTimer(context));
        Log.w("时间", Fun_Time.经过多少秒(Fun_File.ReadCornuCopiaTimer(context))+"");
        int index = Fun_Time.经过多少秒(Fun_File.ReadCornuCopiaTimer(context)) / 60;
        Log.w("时间", index + "");
        if(index>0){
            index = Math.min(index, 500);
            text_view.setText("获得 " + index + " 金币");
            Actor_Object.Gold = Actor_Object.Gold + index;
            Fun_File.SaveGold(context);
            Fun_File.SaveCornuCopiaTimer(context);
        }else{
            text_view.setText("空空如也");
        }


        dialog.setView(view);
        dialog.setCancelable(true);
        Objects.requireNonNull(dialog.getWindow()).setGravity(Gravity.TOP);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setGravity(Gravity.CENTER);
        dialog.show();
    }
}
