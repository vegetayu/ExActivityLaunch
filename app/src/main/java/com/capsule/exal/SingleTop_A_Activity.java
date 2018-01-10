package com.capsule.exal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SingleTop_A_Activity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top__a_);
        Log.i("vegeta", "onCreate");


        Button btnSelf, btnStandard;
        btnStandard = findViewById(R.id.btn_standard_a);
        btnSelf = findViewById(R.id.btn_start_self);

        btnStandard.setOnClickListener(this);
        btnSelf.setOnClickListener(this);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("vegeta", "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("vegeta", "onStart");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("vegeta", "onNewIntent");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("vegeta", "onResume");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_standard_a:
                Intent intent = new Intent(SingleTop_A_Activity.this, Standard_A_Activity.class);
                startActivity(intent);
                break;
            case R.id.btn_start_self:
                Intent intent1 = new Intent(SingleTop_A_Activity.this, SingleTop_A_Activity.class);
                startActivity(intent1);
                break;

        }
    }
}
