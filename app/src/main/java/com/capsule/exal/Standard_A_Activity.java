package com.capsule.exal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Standard_A_Activity extends BaseActivity implements View.OnClickListener {

    private Button btn_standard;
    private Button btn_single_toop;
    private Button btn_single_task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard__a_);
        btn_standard = findViewById(R.id.btn_start_self);
        btn_single_toop = findViewById(R.id.btn_single_top_a);
        btn_single_task = findViewById(R.id.btn_single_task_a);
        btn_standard.setOnClickListener(this);
        btn_single_toop.setOnClickListener(this);
        btn_single_task.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_start_self:
                Intent intent = new Intent(Standard_A_Activity.this, Standard_A_Activity.class);
                startActivity(intent);
                break;
            case R.id.btn_single_top_a:
                Intent intent1 = new Intent(Standard_A_Activity.this, SingleTop_A_Activity.class);
                startActivity(intent1);
                break;
            case R.id.btn_single_task_a:
                Intent intent2 = new Intent(Standard_A_Activity.this, SingleTask_A_Activity.class);
                startActivity(intent2);
                break;
        }
    }
}
