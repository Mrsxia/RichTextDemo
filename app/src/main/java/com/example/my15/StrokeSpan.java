package com.example.my15;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/**
 * 自定义span 文本描边
 */
public class StrokeSpan extends CharacterStyle {

    private float mStrokeWidth;
    private int mStrokeColor;

    public StrokeSpan(float strokeWidth, int strokeColor) {
        this.mStrokeWidth = strokeWidth;
        this.mStrokeColor = strokeColor;
    }

    @Override
    public void updateDrawState(TextPaint tp) {
        tp.setStyle(Paint.Style.STROKE);
        tp.setStrokeWidth(mStrokeWidth);
        tp.setColor(mStrokeColor);
    }
}