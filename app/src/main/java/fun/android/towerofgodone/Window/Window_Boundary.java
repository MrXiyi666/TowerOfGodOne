package fun.android.towerofgodone.Window;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import fun.android.towerofgodone.Data.Actor_Object;
import fun.android.towerofgodone.Data.Boundary_Data;
import fun.android.towerofgodone.R;

public class Window_Boundary {
    public Window_Boundary(Context context){
        var dialog = new AlertDialog.Builder(context).create();
        var view = View.inflate(context, R.layout.window_boundary, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            dialog.dismiss();
        });
        TextView boundary_text = view.findViewById(R.id.boundary_text);
        TextView up_boundary_text = view.findViewById(R.id.up_boundary_text);
        Boundary_Data boundary_data = new Boundary_Data();
        Map<String, Integer> data = new HashMap<>();
        Map<String, Integer> up_data = new HashMap<>();
        for (Map.Entry<String, Integer> entry : boundary_data.data.entrySet()) {
            if(!up_data.isEmpty()){
                break;
            }
            if(!data.isEmpty()){
                up_data.put(entry.getKey(), entry.getValue());
            }
            if(Actor_Object.Boundary.equals(entry.getKey())){
                data.put(entry.getKey(), entry.getValue());
            }
        }


        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            boundary_text.setText(entry.getKey());
        }
        up_boundary_text.setText("最高阶");
        for (Map.Entry<String, Integer> entry : up_data.entrySet()) {
            up_boundary_text.setText(entry.getKey());
        }



        dialog.setView(view);
        dialog.setCancelable(false);
        Objects.requireNonNull(dialog.getWindow()).setGravity(Gravity.TOP);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setGravity(Gravity.CENTER);
        dialog.show();
    }
}
