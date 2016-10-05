package com.example.lmhgfkk.ui_customattr.view;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.lmhgfkk.ui_customattr.R;


public class TopBar extends RelativeLayout {

    private Button leftbutton;
    private Button rightbutton;
    private TextView title;

    private String lefttext;
    private int leftcolor;
    private Drawable leftbackgroud;

    private String righttext;
    private int rightcolor;
    private Drawable rightbackgroud;

    private String titletext;
    private int titlecolor;
    private float titlesize;

    private LayoutParams leftParams;
    private LayoutParams rightParams;
    private LayoutParams titleParams;

    public TopBar(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray ta=context.obtainStyledAttributes(attrs, R.styleable.TopBar);

        lefttext=ta.getString(R.styleable.TopBar_leftText);
        leftcolor=ta.getColor(R.styleable.TopBar_leftTextColor,0);
        leftbackgroud=ta.getDrawable(R.styleable.TopBar_leftBackground);

        righttext=ta.getString(R.styleable.TopBar_rightText);
        rightcolor=ta.getColor(R.styleable.TopBar_rightTextColor,0);
        rightbackgroud=ta.getDrawable(R.styleable.TopBar_rightBackground);

        titletext=ta.getString(R.styleable.TopBar_titleText);
        titlecolor=ta.getColor(R.styleable.TopBar_titleTextColor,0);
        titlesize=ta.getDimension(R.styleable.TopBar_titleTextSize,0);

        leftbutton=new Button(context);
        rightbutton=new Button(context);
        title=new TextView(context);

        leftbutton.setText(lefttext);
        leftbutton.setTextColor(leftcolor);
        leftbutton.setBackground(leftbackgroud);

        rightbutton.setText(righttext);
        rightbutton.setTextColor(rightcolor);
        rightbutton.setBackground(rightbackgroud);

        title.setText(titletext);
        title.setTextColor(titlecolor);
        title.setTextSize(titlesize);
        title.setGravity(Gravity.CENTER);

        setBackgroundColor(0xD673F2A4);

        leftParams=new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        leftParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT,TRUE);
        addView(leftbutton,leftParams);

        rightParams=new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        rightParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT,TRUE);
        addView(rightbutton,rightParams);

        titleParams=new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);
        titleParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        addView(title,titleParams);


        leftbutton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.leftClick();
            }
        });

        rightbutton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.rightClick();
            }
        });
    }

    private onTopBarClickListener listener;
    public interface onTopBarClickListener{
        void leftClick();
        void rightClick();
    }
    public void setonTopBarClickListener(onTopBarClickListener l){
        listener=l;
    }
    public void setLeftVisible(boolean flag){
        if(flag){
            leftbutton.setVisibility(View.VISIBLE);
        }else {
            leftbutton.setVisibility(View.GONE);
        }
    }


}
