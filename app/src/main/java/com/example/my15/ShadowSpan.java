package com.example.my15;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/**
 * 自定义span 文本阴影
 */
public class ShadowSpan extends CharacterStyle {

    private float mRadius;
    private float mDx;
    private float mDy;
    private int mShadowColor;

    public ShadowSpan(float radius, float dx, float dy, int shadowColor) {
        this.mRadius = radius;
        this.mDx = dx;
        this.mDy = dy;
        this.mShadowColor = shadowColor;
    }

    @Override
    public void updateDrawState(TextPaint tp) {
        tp.setShadowLayer(mRadius, mDx, mDy, mShadowColor);
    }
}