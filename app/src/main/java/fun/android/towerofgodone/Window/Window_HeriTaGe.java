package fun.android.towerofgodone.Window;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;

import java.util.Objects;

import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;

public class Window_HeriTaGe {
    int index=0;
    private boolean bool_fun = false;
    public Window_HeriTaGe(Context context){
        var dialog = new AlertDialog.Builder(context).create();
        var view = View.inflate(context, R.layout.window_heritage, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            dialog.dismiss();
        });
        Bitmap attack = fun.loadBitmapFromAssets(context, "system/heritage/attack.png");
        Bitmap defense = fun.loadBitmapFromAssets(context, "system/heritage/defense.png");
        Bitmap critical = fun.loadBitmapFromAssets(context, "system/heritage/critical.png");
        Bitmap speed = fun.loadBitmapFromAssets(context, "system/heritage/speed.png");

        ImageView logo_img = view.findViewById(R.id.logo_img);
        TextView text_view = view.findViewById(R.id.text_view);
        AppCompatButton button_ok = view.findViewById(R.id.button_ok);
        logo_img.setImageBitmap(attack);
        logo_img.post(new Runnable() {
            @Override
            public void run() {
                if(bool_fun){
                    return;
                }
                logo_img.postDelayed(this, 100);
                if(index==0){
                    logo_img.setImageBitmap(attack);
                    text_view.setText("攻击");
                    index=1;
                    return;
                }
                if(index == 1){
                    logo_img.setImageBitmap(defense);
                    index=2;
                    text_view.setText("防御");
                    return;
                }
                if(index == 2){
                    logo_img.setImageBitmap(critical);
                    index=3;
                    text_view.setText("暴击");
                    return;
                }
                if(index == 3){
                    logo_img.setImageBitmap(speed);
                    index=4;
                    text_view.setText("速度");
                    return;
                }
                if(index == 4){
                    logo_img.setImageBitmap(null);
                    index=0;
                    text_view.setText("");
                    return;
                }
            }
        });

        button_ok.setOnClickListener(V->{
            button_ok.setVisibility(View.GONE);
            bool_fun = true;
            int data;
            switch (index) {
                case 0:
                    logo_img.setImageBitmap(attack);
                    data = fun.Random(100);
                    data = data==0 ? 1 : data;
                    text_view.setText("攻击提升 + " + data);
                    fun.attack_hoist = fun.attack_hoist + data;
                    Fun_File.SaveAttackHoist(context);
                    break;
                case 1:
                    logo_img.setImageBitmap(defense);
                    data = fun.Random(100);
                    data = data==0 ? 1 : data;
                    text_view.setText("防御提升 + " + data);
                    fun.defense_hoist = fun.defense_hoist + data;
                    Fun_File.SaveDefenseHoist(context);
                    break;
                case 2:
                    logo_img.setImageBitmap(critical);
                    data = fun.Random(100);
                    data = data==0 ? 1 : data;
                    text_view.setText("暴击提升 + " + data);
                    fun.critical_hoist = fun.critical_hoist + data;
                    Fun_File.SaveCriticalHoist(context);
                    break;
                case 3:
                    logo_img.setImageBitmap(speed);
                    data = fun.Random(100);
                    data = data==0 ? 1 : data;
                    text_view.setText("速度提升 + " + data);
                    fun.speed_hoist = fun.speed_hoist + data;
                    Fun_File.SaveSpeedHoist(context);
                    break;
                default:
                    logo_img.setImageBitmap(null);
                    text_view.setText("谢谢参与");
            }
        });
        dialog.setView(view);
        dialog.setCancelable(true);
        Objects.requireNonNull(dialog.getWindow()).setGravity(Gravity.TOP);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setGravity(Gravity.CENTER);
        dialog.show();
    }
}
