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
import fun.android.towerofgodone.Scene.Status.Scene_Status;

public class Window_Boundary {
    String up_name;
    public Window_Boundary(Context context, Scene_Status scene_status){
        var dialog = new AlertDialog.Builder(context).create();
        var view = View.inflate(context, R.layout.window_boundary, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            dialog.dismiss();

        });
        TextView boundary_text = view.findViewById(R.id.boundary_text);
        TextView up_boundary_view = view.findViewById(R.id.up_boundary_view);
        TextView up_boundary_text = view.findViewById(R.id.up_boundary_text);
        TextView up_value = view.findViewById(R.id.up_value);
        ImageView actor_img=view.findViewById(R.id.actor_img);
        TextView up_ok_text = view.findViewById(R.id.up_ok_text);
        AppCompatButton button_up_boundary = view.findViewById(R.id.button_up_boundary);

        up_ok_text.setVisibility(View.GONE);
        actor_img.setImageBitmap(fun.loadBitmapFromAssets(context, "actor/actor_true.png"));
        boundary_text.setText(Actor_Object.getBoundary());
        up_name = Actor_Object.getUPBoundary();
        if(up_name.isEmpty()){
            up_value.setVisibility(View.GONE);
            button_up_boundary.setVisibility(View.GONE);
            up_boundary_text.setVisibility(View.GONE);
            up_boundary_view.setVisibility(View.GONE);

        }
        up_boundary_text.setText(up_name);
        up_value.setText("提升所需能量值：" + Actor_Object.getUPValue()+"\n当前能量值：" + Actor_Object.Value);


        button_up_boundary.setOnClickListener(V->{
            if(Actor_Object.Value < Actor_Object.getUPValue()){
                up_ok_text.setText("能量不足");
                up_ok_text.setVisibility(View.VISIBLE);
                up_ok_text.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        up_ok_text.setVisibility(View.GONE);
                    }
                },2000);
                return;
            }
            Actor_Object.Value = Actor_Object.Value - Actor_Object.getUPValue();
            Actor_Object.Boundary = Actor_Object.Boundary+1;
            Fun_File.SaveBoundary(context);
            Fun_File.SaveValue(context);
            up_ok_text.setVisibility(View.VISIBLE);
            up_ok_text.setText("提升成功");
            up_ok_text.postDelayed(new Runnable() {
                @Override
                public void run() {
                    up_ok_text.setVisibility(View.GONE);
                }
            },2000);
            scene_status.refresh(context);
            boundary_text.setText(Actor_Object.getBoundary());
            up_name = Actor_Object.getUPBoundary();
            if(up_name.isEmpty()){
                up_value.setVisibility(View.GONE);
                button_up_boundary.setVisibility(View.GONE);
                up_boundary_text.setVisibility(View.GONE);
                up_boundary_view.setVisibility(View.GONE);
                return;
            }
            up_boundary_text.setText(up_name);
            up_value.setText("提升所需能量值：" + Actor_Object.getUPValue()+"\n当前能量值：" + Actor_Object.Value);
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
