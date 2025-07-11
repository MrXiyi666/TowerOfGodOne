package fun.android.towerofgodone.Window;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import java.util.Objects;

import fun.android.towerofgodone.R;

public class Window_Mess {
    boolean 是否自动关闭 = true;
    public Window_Mess(Context context, String text) {
        var dialog = new AlertDialog.Builder(context).create();
        var view = View.inflate(context, R.layout.window_mess, null);
        TextView text_view = view.findViewById(R.id.text);
        text_view.setText(text);
        view.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(是否自动关闭){
                    dialog.dismiss();
                }

            }
        },2000);
        view.setOnClickListener(V->{
            是否自动关闭 = false;
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
