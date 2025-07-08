package fun.android.towerofgodone.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;

public class Blood_View extends StrokeTextView{
    public int currentValue=0, maxValue=0;
    public Blood_View(Context context) {
        super(context);
    }

    public Blood_View(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Blood_View(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        getPaint().setColor(Color.rgb(255, 0, 0));
        // 计算当前血量条的宽度
        int currentWidth = (int) ((currentValue / (float) maxValue) * getWidth());
        canvas.drawRect(0, 0, currentWidth, getHeight(), getPaint());
        super.onDraw(canvas);
    }
}
