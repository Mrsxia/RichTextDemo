package com.example.my15;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.LineHeightSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView span1Tv;
    private TextView span2Tv;
    private TextView span3Tv;
    private TextView span4Tv;
    private TextView span5Tv;
    private List<RichBean.SplendidPoorMessyInnDTO.TerminalLongTravelerFortnightDTO> ht;
    private String linkWord;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        span1Tv = findViewById(R.id.span1_tv);
        span2Tv = findViewById(R.id.span2_tv);
        span3Tv = findViewById(R.id.span3_tv);
        span4Tv = findViewById(R.id.span4_tv);
        span5Tv = findViewById(R.id.span5_tv);


        String fromAssets2 = ToolUtils.getFromAssets(this, "RichText.json");
        RichBean jsonBean2 = new Gson().fromJson(fromAssets2, RichBean.class);
        ht = jsonBean2.getSplendidPoorMessyInn().getTerminalLongTravelerFortnight();

        if (ht.size() > 0 && ht != null) {
            info(ht);
        }


        SpannableStringBuilder builder1 = new SpannableStringBuilder();
        builder1.append("Hello World ! Do you like programming?"); // 添加普通文本
        builder1.setSpan(new StyleSpan(Typeface.BOLD), 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 加粗
        builder1.setSpan(new ForegroundColorSpan(Color.RED), 6, 11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 字体颜色
        builder1.setSpan(new UnderlineSpan(), 12, 17, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 下划线
        builder1.setSpan(new URLSpan("https://www.baidu.com"), 18, 28, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 超链接
        builder1.setSpan(new ImageSpan(this, R.mipmap.icon_pair_number), 29, 34, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 图片
        span1Tv.setText(builder1);

        SpannableStringBuilder builder2 = new SpannableStringBuilder();
        builder2.append("Hello World ! Do you like programming?"); // 添加普通文本
        builder2.setSpan(new StyleSpan(Typeface.ITALIC), 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 斜体
        builder2.setSpan(new StyleSpan(Typeface.BOLD_ITALIC), 6, 11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 加粗并斜体
        builder2.setSpan(new StrikethroughSpan(), 12, 17, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 删除线
        builder2.setSpan(new BackgroundColorSpan(Color.BLUE), 18, 28, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 背景颜色
        builder2.setSpan(new AbsoluteSizeSpan(88), 29, 37, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 文本大小
        span2Tv.setText(builder2);

        SpannableStringBuilder builder3 = new SpannableStringBuilder();
        builder3.append("Hello World ! Do you like programming?"); // 添加普通文本
        builder3.setSpan(new ScaleXSpan(5), 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 文本水平缩放
        builder3.setSpan(new TypefaceSpan("monospace"), 6, 11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 字体样式
        builder3.setSpan(new LineHeightSpan() {
                             @Override
                             public void chooseHeight(CharSequence text, int start, int end, int spanstartv, int v, Paint.FontMetricsInt fm) {
                                 fm.descent += 10 - fm.bottom;
                                 fm.bottom = 10;
                             }
                         }
                , 12, 17, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 行高
        builder3.setSpan(new ScaleXSpan(1), 18, 28, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 字符间距
        builder3.setSpan(new ShadowSpan(5, 2, 2, Color.YELLOW), 29, 36, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);//自定义文本阴影
        span3Tv.setText(builder3);

        SpannableStringBuilder builder4 = new SpannableStringBuilder();
        builder4.append("Hello World ! Do you like programming?"); // 添加普通文本
        builder4.setSpan(new BlurSpan(5), 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 自定义文本模糊
        builder4.setSpan(new StrokeSpan(5, Color.BLUE), 6, 11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 自定义文本描边
        builder4.setSpan(new URLSpan("https://www.baidu.com"), 18, 28, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 超链接
        builder4.setSpan(new ImageSpan(this, R.mipmap.icon_pair_number), 29, 34, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // 图片
        span4Tv.setText(builder4);


    }

    private void info(List<RichBean.SplendidPoorMessyInnDTO.TerminalLongTravelerFortnightDTO> ht) {
        if (!ht.isEmpty()) {
            if (ht.size() == 1) {
                linkWord = "我仔细阅读了" + ht.get(0).getFarAmbulanceDirtyMouthfulRealEverything();
                int index = linkWord.indexOf(ht.get(0).getFarAmbulanceDirtyMouthfulRealEverything());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(linkWord);
                spannableStringBuilder.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View widget) {
                        String electricCanadianShark = ht.get(0).getElectricCanadianShark();
                        showMsg(electricCanadianShark);
                    }

                    @Override
                    public void updateDrawState(@NonNull TextPaint ds) {
                        super.updateDrawState(ds);
                        ds.setColor(ContextCompat.getColor(MainActivity.this, R.color.red_500));
                    }
                }, index, index + ht.get(0).getFarAmbulanceDirtyMouthfulRealEverything().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                span5Tv.setText(spannableStringBuilder);
                span5Tv.setHighlightColor(Color.parseColor("#ffffff"));
            } else {
                linkWord = "我仔细阅读了" + ht.get(0).getFarAmbulanceDirtyMouthfulRealEverything() + " 和 " + ht.get(1).getFarAmbulanceDirtyMouthfulRealEverything();
                int index1 = linkWord.indexOf(ht.get(0).getFarAmbulanceDirtyMouthfulRealEverything());
                int index2 = linkWord.indexOf(ht.get(1).getFarAmbulanceDirtyMouthfulRealEverything());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(linkWord);
                spannableStringBuilder.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View widget) {
                        String electricCanadianShark = ht.get(0).getElectricCanadianShark();
                        showMsg(electricCanadianShark);
                    }

                    @Override
                    public void updateDrawState(@NonNull TextPaint ds) {
                        super.updateDrawState(ds);
                        ds.setColor(ContextCompat.getColor(MainActivity.this, R.color.red_500));
                    }
                }, index1, index1 + ht.get(0).getFarAmbulanceDirtyMouthfulRealEverything().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                spannableStringBuilder.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View widget) {
                        String electricCanadianShark = ht.get(1).getElectricCanadianShark();
                        showMsg(electricCanadianShark);
                    }

                    @Override
                    public void updateDrawState(@NonNull TextPaint ds) {
                        super.updateDrawState(ds);
                        ds.setColor(ContextCompat.getColor(MainActivity.this, R.color.purple_500));
                    }
                }, index2, index2 + ht.get(1).getFarAmbulanceDirtyMouthfulRealEverything().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                span5Tv.setText(spannableStringBuilder);
                span5Tv.setHighlightColor(Color.parseColor("#ffffff"));
            }
            span5Tv.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public void showMsg(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}