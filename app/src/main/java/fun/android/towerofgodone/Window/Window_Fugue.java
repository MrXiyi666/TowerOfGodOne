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
                if(paused_type){
                    return;
                }
                index++;
                if(index>9){
                    index=0;
                }
                switch(index){
                    case 0, 6, 5, 1, 9:
                        goods_img.setImageBitmap(fun.loadBitmapFromAssets(context, "system/fugue/Many_Gold.png"));
                        break;
                    case 2:
                        goods_img.setImageBitmap(fun.loadBitmapFromAssets(context, "system/fugue/ShengMingNengLiang.png"));
                        break;
                    case 3, 7:
                        goods_img.setImageBitmap(fun.loadBitmapFromAssets(context, "system/fugue/ShengMingNengLiang.png"));
                        break;
                    case 4, 8:
                        goods_img.setImageBitmap(fun.loadBitmapFromAssets(context, "system/fugue/ZhuGuo.png"));
                        break;
                }
                goods_img.postDelayed(this, 50);
            }
        }, 50);
        AppCompatButton button_paused = view.findViewById(R.id.button_paused);
        button_paused.setOnClickListener(V->{
            paused_type=true;
            int 数量;
            switch(index){
                case 0:
                    数量 = fun.Random(1000);
                    数量 = 数量 == 0 ? 1 : 数量;
                    shows.setText(数量+" 个金币");
                    Actor_Object.Gold = Actor_Object.Gold+数量;
                    Fun_File.SaveGold(context);
                    break;
                case 2:
                    数量 = fun.Random(2);
                    数量 = 数量 == 0 ? 1 : 数量;
                    shows.setText("生命能量 中 + " + 数量);
                    for(int i=0; i < 数量; i++){
                        fun.drug_list.add("生命能量 中");
                    }
                    Fun_File.SaveDrugList(context);
                    break;
                case 1, 6:
                    数量 = fun.Random(100);
                    数量 = 数量 == 0 ? 1 : 数量;
                    shows.setText(数量+" 个金币");
                    Actor_Object.Gold = Actor_Object.Gold+数量;
                    Fun_File.SaveGold(context);
                    break;
                case 3, 7:
                    数量 = fun.Random(5);
                    数量 = 数量 == 0 ? 1 : 数量;
                    shows.setText("生命能量 小 + " + 数量);
                    for(int i=0; i < 数量; i++){
                        fun.drug_list.add("生命能量 小");
                    }
                    Fun_File.SaveDrugList(context);
                    break;
                case 4, 8:
                    数量 = fun.Random(3);
                    数量 = 数量 == 0 ? 1 : 数量;
                    for(int i=0; i < 数量; i++){
                        fun.drug_list.add("朱果");
                    }
                    shows.setText("朱果 + " + 数量);
                    Fun_File.SaveDrugList(context);
                    break;
                case 5:
                    数量 = fun.Random(50);
                    数量 = 数量 == 0 ? 1 : 数量;
                    shows.setText(数量 + " 个金币");
                    Actor_Object.Gold = Actor_Object.Gold+数量;
                    Fun_File.SaveGold(context);
                    break;
                case 9:
                    数量 = fun.Random(10);
                    数量 = 数量 == 0 ? 1 : 数量;
                    shows.setText(数量 + " 个金币");
                    Actor_Object.Gold = Actor_Object.Gold+数量;
                    Fun_File.SaveGold(context);
                    break;
                default:
                    shows.setText("谢谢参与");
            }
            button_paused.setVisibility(View.GONE);
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
