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

    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

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
        mPaint.setColor(Color.WHITE);
        canvas.drawLine(200,100,200,800,mPaint);
        canvas.drawLine(200,800,1000,800,mPaint);
        mPaint.setColor(Color.BLUE);
        canvas.drawRect(210,700,310,800,mPaint);
        canvas.drawRect(360,600,460,800,mPaint);

        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(50);
        canvas.drawText("直方图",600,900,mPaint);
    }
}
