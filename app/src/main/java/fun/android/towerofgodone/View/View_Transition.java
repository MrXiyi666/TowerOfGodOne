package fun.android.towerofgodone.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import fun.android.towerofgodone.Fun.fun;
import fun.android.towerofgodone.Scene.Scene_Base;

public class View_Transition extends View {
    private Scene_Base scene_base;
    private Context context;
    private int alpha=0;
    private int index=0;
    private RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
    public View_Transition(Context context) {
        super(context);
        this.context = context;
    }

    public View_Transition(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public View_Transition(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }
    public void start(Scene_Base sceneBase){
        this.scene_base = sceneBase;
        index=0;
        alpha=0;
        buffer_index=0;
        this.setVisibility(View.VISIBLE);
        invalidate();
    }
    int buffer_index=0;
    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);

        switch(index){
            case 0:
                if(alpha<250){
                    alpha = alpha + 25;
                }else{
                    index=1;
                    alpha=250;
                    fun.scene = scene_base;
                    fun.scene.enable_scene(context);
                }
                invalidate();
                break;
            case 1:
                if(buffer_index>10){
                    index=2;
                }
                buffer_index++;
                invalidate();
                break;
            case 2:
                if(alpha>0){
                    alpha = alpha - 25;
                }else{
                    alpha=0;
                    index=3;
                    this.setVisibility(View.GONE);
                }
                invalidate();
                break;
            default:
        }
        canvas.drawColor(Color.argb(alpha, 0, 0, 0));
    }

}
