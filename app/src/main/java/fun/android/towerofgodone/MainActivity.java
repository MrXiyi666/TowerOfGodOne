package fun.android.towerofgodone;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.Scene.Scene_Title;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fun.main_layout = findViewById(R.id.main);
        fun.main_layout.post(() -> {
            int currentHeight = fun.main_layout.getHeight();
            int statusBarHeight = fun.getStatusBarHeight(MainActivity.this);
            int newHeight = currentHeight - statusBarHeight;
            ViewGroup.LayoutParams params = fun.main_layout.getLayoutParams();
            params.height = newHeight;
            fun.main_layout.setLayoutParams(params);
            fun.main_layout.setY(statusBarHeight);
        });
        fun.scene = new Scene_Title(this);
        fun.scene.enable_scene();
    }

}