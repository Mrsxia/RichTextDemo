package com.example.my15;

import android.graphics.BlurMaskFilter;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/**
 * 自定义span 文本模糊
 */
public class BlurSpan extends CharacterStyle {

    private float mRadius;

    public BlurSpan(float radius) {
        this.mRadius = radius;
    }

    @Override
    public void updateDrawState(TextPaint tp) {
        tp.setMaskFilter(new BlurMaskFilter(mRadius, BlurMaskFilter.Blur.NORMAL));
    }
}