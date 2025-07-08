package fun.android.towerofgodone.Window;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;
import java.util.Objects;
import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Fun.Fun_File;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.R;
import fun.android.towerofgodone.Scene.Scene_Status;

public class Window_Boundary {
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
        AppCompatButton button_up_boundary = view.findViewById(R.id.button_up_boundary);

        boundary_text.setText(Actor_Object.Boundary);
        String up_name = fun.获取下一个境界名称(Actor_Object.Boundary);
        int up_value_data = fun.获取下一个境界能量值(Actor_Object.Boundary);
        up_value.setText("提升所需能量值：" + up_value_data+"\n当前能量值：" + Actor_Object.Value);
        up_boundary_text.setText(up_name);
        Integer[] Attribute_Value = fun.获取境界属性(up_name);
        if(up_value_data==0){
            up_value.setVisibility(View.GONE);
            button_up_boundary.setVisibility(View.GONE);
            up_boundary_text.setVisibility(View.GONE);
            up_boundary_view.setVisibility(View.GONE);
        }

        button_up_boundary.setOnClickListener(V->{

            if(Actor_Object.Value<up_value_data){
                fun.Mess(context, "能量值不足");
                return;
            }

            Actor_Object.Boundary = up_name;
            Actor_Object.HP = Attribute_Value[0];
            Actor_Object.Attack = Attribute_Value[1];
            Actor_Object.Defense = Attribute_Value[2];
            Actor_Object.Critical = Attribute_Value[3];
            Actor_Object.Speed = Attribute_Value[4];
            Actor_Object.Value = Actor_Object.Value - up_value_data;
            Fun_File.Save(context);
            dialog.dismiss();
            scene_status.refresh();
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
