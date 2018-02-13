package com.taingmeng.simpletodolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mTitle;
    private Button mAdd;
    private RecyclerView mList;

    private TodosAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTitle = findViewById(R.id.add_title);
        mAdd = findViewById(R.id.add_button);
        mList = findViewById(R.id.todos_list);

        mAdapter = new TodosAdapter();
        mList.setAdapter(mAdapter);

        mAdd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                //1. Get text from mTitle

                //2. Create a new todo object with the text

                //3. Add todo object to adapter

                //4. Clear text from mTitle
            }
        });
    }
}
