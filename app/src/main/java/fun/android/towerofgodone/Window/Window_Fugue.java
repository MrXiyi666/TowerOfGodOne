package fun.android.towerofgodone.Window;

import android.content.Context;
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
import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;

public class Window_Fugue {
    int index=0;
    boolean paused_type=false;
    public Window_Fugue(Context context){
        var dialog = new AlertDialog.Builder(context).create();
        var view = View.inflate(context, R.layout.window_fugue, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            dialog.dismiss();
        });
        TextView shows = view.findViewById(R.id.shows);
        ImageView goods_img = view.findViewById(R.id.goods_img);
        goods_img.postDelayed(new Runnable() {
            @Override
            public void run() {
                switch(index){
                    case 0:
                        goods_img.setImageBitmap(fun.loadBitmapFromAssets(context, "system/fugue/Many_Gold.png"));
                        index=1;
                        break;
                    case 1:
                        goods_img.setImageBitmap(fun.loadBitmapFromAssets(context, "system/fugue/Many_Gold.png"));
                        index=2;
                        break;
                    case 2:
                        goods_img.setImageBitmap(fun.loadBitmapFromAssets(context, "system/fugue/XieXie.png"));
                        index=3;
                        break;
                    case 3:
                        goods_img.setImageBitmap(fun.loadBitmapFromAssets(context, "system/fugue/ShengMingNengLiang.png"));
                        index=4;
                        break;
                    case 4:
                        goods_img.setImageBitmap(fun.loadBitmapFromAssets(context, "system/fugue/ZhuGuo.png"));
                        index=0;
                        break;
                }
                if(!paused_type){
                    goods_img.postDelayed(this, 50);
                }


            }
        }, 50);
        AppCompatButton button_paused = view.findViewById(R.id.button_paused);
        button_paused.setOnClickListener(V->{
            paused_type=true;
            switch(index){
                case 0:
                    shows.setText("1000 个金币");
                    Actor_Object.Gold = Actor_Object.Gold+1000;
                    Fun_File.SaveGold(context);
                    break;
                case 1:
                    shows.setText("100 个金币");
                    Actor_Object.Gold = Actor_Object.Gold+100;
                    Fun_File.SaveGold(context);
                    break;
                case 2:
                    shows.setText("谢谢参与");
                    break;
                case 3:
                    shows.setText("生命能量 小");
                    fun.drug_list.add("生命能量 小");
                    Fun_File.SaveDrugList(context);
                    break;
                case 4:
                    shows.setText("朱果");
                    fun.drug_list.add("朱果");
                    Fun_File.SaveDrugList(context);
                    break;
                default:
                    shows.setText("参数错误");
            }
            button_paused.setVisibility(View.GONE);
        });
        dialog.setView(view);
        dialog.setCancelable(false);
        Objects.requireNonNull(dialog.getWindow()).setGravity(Gravity.TOP);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setGravity(Gravity.CENTER);
        dialog.show();
    }
}
