package fun.android.towerofgodone.Window;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AlertDialog;

import java.util.Objects;

import fun.android.towerofgodone.R;

public class Window_HeriTaGe {
    public Window_HeriTaGe(Context context){
        var dialog = new AlertDialog.Builder(context).create();
        var view = View.inflate(context, R.layout.window_heritage, null);
        view.findViewById(R.id.button_cancel).setOnClickListener(V->{
            dialog.dismiss();
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
