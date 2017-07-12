package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        paint.setColor(Color.WHITE);
        Path path = new Path();
        path.moveTo(100, 20);
        path.lineTo(100, 600);
        path.rLineTo(900, 0);
        canvas.drawPath(path, paint);

        paint.setTextSize(25);
        paint.setAntiAlias(true);
        canvas.drawText("Froyo", 120, 630, paint);
        canvas.drawText("GB", 260, 630, paint);
        canvas.drawText("ICS", 400, 630, paint);
        canvas.drawText("JB", 540, 630, paint);
        canvas.drawText("KITKAT", 640, 630, paint);
        canvas.drawText("L", 800, 630, paint);
        canvas.drawText("M", 920, 630, paint);

        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(110, 596, 200, 600, paint);

        paint.setColor(Color.parseColor("#60b100"));
        canvas.drawRect(220, 575, 320, 600, paint);
        canvas.drawRect(360, 575, 460, 600, paint);
        canvas.drawRect(500, 400, 600, 600, paint);
        canvas.drawRect(635, 200, 735, 600, paint);
        canvas.drawRect(760, 100, 860, 600, paint);
        canvas.drawRect(880, 400, 960, 600, paint);
    }
}
