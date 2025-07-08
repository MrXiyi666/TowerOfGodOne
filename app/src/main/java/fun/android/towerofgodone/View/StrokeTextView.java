package fun.android.towerofgodone.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class StrokeTextView extends AppCompatTextView {

    public StrokeTextView(Context context) {
        super(context);
        init();
    }

    public StrokeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public StrokeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        ma = Color.alpha(getCurrentTextColor());
        mr = 255-Color.red(getCurrentTextColor());
        mg = 255-Color.green(getCurrentTextColor());
        mb = 255-Color.blue(getCurrentTextColor());
        za = Color.alpha(getCurrentTextColor());
        zr = Color.red(getCurrentTextColor());
        zg = Color.green(getCurrentTextColor());
        zb = Color.blue(getCurrentTextColor());
        getPaint().setAntiAlias(true);
        getPaint().setSubpixelText(true);
    }
    public int ma,mr,mg,mb;
    public int za,zr,zg,zb;
    @Override
    protected void onDraw(Canvas canvas) {
        getPaint().setStrokeWidth(4);
        getPaint().setStyle(Paint.Style.STROKE);
        setTextColor(Color.argb(ma, mr, mg, mb));
        super.onDraw(canvas);
        getPaint().setStyle(Paint.Style.FILL);
        setTextColor(Color.argb(za, zr, zg, zb));
        super.onDraw(canvas);
    }
}