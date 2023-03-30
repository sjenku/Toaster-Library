package com.example.toasterlibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class ElementView extends View {

    // defines paint and canvas
    private Paint drawPaint;
    private Canvas canvas;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.canvas = canvas;
        canvas.drawCircle(100,100,30,drawPaint);
    }

    public ElementView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        setupPaint();

        //get the attributes specified in attrs.xml using the name we included
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs,
                R.styleable.ElementView, 0, 0);




    }


    // Setup paint with color and stroke styles
    private void setupPaint() {
        drawPaint = new Paint();
        drawPaint.setColor(Color.BLUE);
        drawPaint.setAntiAlias(true);
        drawPaint.setStrokeWidth(5);
        drawPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        drawPaint.setStrokeJoin(Paint.Join.ROUND);
        drawPaint.setStrokeCap(Paint.Cap.ROUND);
    }

}
