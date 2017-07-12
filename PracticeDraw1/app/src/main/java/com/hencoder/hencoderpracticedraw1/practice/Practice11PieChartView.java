package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图


        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#f12923"));

        RectF rect = new RectF(200, 30, 700, 530);
        canvas.drawArc(rect, -180, 120, true, paint);

        paint.setColor(Color.parseColor("#ffb700"));
        canvas.drawArc(rect, -60, 60, true, paint);

        paint.setColor(Color.parseColor("#8a00a3"));
        canvas.drawArc(rect, 0, 10, true, paint);

        paint.setColor(Color.parseColor("#8c8c8c"));
        canvas.drawArc(rect, 10, 10, true, paint);


        paint.setColor(Color.parseColor("#008675"));
        canvas.drawArc(rect, 20, 70, true, paint);


        paint.setColor(Color.parseColor("#157ef4"));
        canvas.drawArc(rect, 90, 90, true, paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(30);
        paint.setStrokeWidth(10);
        canvas.drawText("Lollipop", 20, 50, paint);


        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        Path path = new Path();
        path.moveTo(150, 45);
        path.lineTo(290, 45);
        path.rLineTo(22, 22);
        canvas.drawPath(path, paint);

    }
}
