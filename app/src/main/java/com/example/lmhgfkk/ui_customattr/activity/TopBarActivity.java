package com.example.lmhgfkk.ui_customattr.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.lmhgfkk.ui_customattr.R;
import com.example.lmhgfkk.ui_customattr.view.TopBar;


public class TopBarActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topbar);

        TopBar topbar = (TopBar) findViewById(R.id.topbar);
        topbar.setonTopBarClickListener(new TopBar.onTopBarClickListener() {
            @Override
            public void leftClick() {
                Toast.makeText(TopBarActivity.this,"左",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void rightClick() {
                Toast.makeText(TopBarActivity.this,"右",Toast.LENGTH_SHORT).show();

            }
        });

        topbar.setLeftVisible(true);
    }
}
