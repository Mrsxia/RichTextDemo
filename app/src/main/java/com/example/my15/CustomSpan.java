package com.example.my15;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/**
 * 自定义span 文本背景颜色
 */
public class CustomSpan extends CharacterStyle {

    private int mBackgroundColor;

    public CustomSpan(int backgroundColor) {
        this.mBackgroundColor = backgroundColor;
    }

    @Override
    public void updateDrawState(TextPaint tp) {
        tp.bgColor = mBackgroundColor;
    }
}