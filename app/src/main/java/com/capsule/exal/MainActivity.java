package com.capsule.exal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private ListView listView;
private         MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);
        adapter = new MainAdapter(buildItems());
        listView.setAdapter(adapter);
        setOnItemClickListener();

    }

    private List<String> buildItems() {
        List<String> list = new ArrayList<>();
        list.add("standard");
        list.add("singleTop");
        list.add("singleTask");
        list.add("singleInstance");
        return list;
    }

    private void setOnItemClickListener() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemName = (String) adapter.getItem(position);
                switch (itemName) {
                    case "standard":
                        startActivity(new Intent(MainActivity.this, Standard_A_Activity.class));
                        break;
//                    case "singleTop":
//                        startActivity(new Intent());
                }
            }
        });
    }
}
