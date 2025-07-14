package fun.android.towerofgodone;

import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.Scene.Scene_Map;
import fun.android.towerofgodone.Scene.Title.Scene_Title;
import fun.android.towerofgodone.Scene.War.Scene_War;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fun.main_back = findViewById(R.id.main_back);
        fun.view_transition = findViewById(R.id.view_transition);
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
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        fun.view_transition.start(new Scene_Title(this));
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                if(fun.scene instanceof Scene_Title){
                    startActivity(intent);
                }else if(fun.scene instanceof Scene_War){
                    ((Scene_War) fun.scene).cancel_fun(MainActivity.this);
                }else if(!(fun.scene instanceof Scene_Map)){
                    fun.scrollY = 0;
                    fun.view_transition.start(new Scene_Map(MainActivity.this));
                }else{
                    startActivity(intent);
                }
            }
        });
    }

}