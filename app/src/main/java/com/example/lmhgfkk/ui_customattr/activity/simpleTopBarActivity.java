package com.example.lmhgfkk.ui_customattr.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lmhgfkk.ui_customattr.R;

/**
 * Created by lmhgfkk on 16/10/5.
 */
public class simpleTopBarActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpletopbar);

        View view = findViewById(R.id.simpletopbar);
        if (view != null) {
            Button leftbtn = (Button) view.findViewById(R.id.leftbtn);
            Button rightbtn = (Button) view.findViewById(R.id.rightbtn);

            leftbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(simpleTopBarActivity.this,"左左左",Toast.LENGTH_SHORT).show();
                }
            });

            rightbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(simpleTopBarActivity.this,"右右右",Toast.LENGTH_SHORT).show();

                }
            });
        }
    }
}
