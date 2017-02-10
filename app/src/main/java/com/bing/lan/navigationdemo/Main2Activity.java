package com.bing.lan.navigationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private BottomSheetBehavior<TextView> mBottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initBottomSheetBehavior();

        CollapsingToolbarLayout viewById = (CollapsingToolbarLayout) findViewById(R.id.ctl);

        viewById.setTitle("我是标题");

        initRecyclerView();
        initLisView();
    }

    private void initBottomSheetBehavior() {

        // /**
        //  * The bottom sheet is settling.
        //  */
        // public static final int STATE_SETTLING = 2;
        //
        // /**
        //  * The bottom sheet is expanded.
        //  */
        // public static final int STATE_EXPANDED = 3;
        //
        // /**
        //  * The bottom sheet is collapsed.
        //  */
        // public static final int STATE_COLLAPSED = 4;
        FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int state = mBottomSheetBehavior.getState();
                Log.d("bingtag", "state: " + state);
                if (state == BottomSheetBehavior.STATE_EXPANDED) {
                    mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                } else if (state == BottomSheetBehavior.STATE_COLLAPSED) {
                    mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                }
            }
        });

        TextView viewById = (TextView) findViewById(R.id.bsb);
        mBottomSheetBehavior = BottomSheetBehavior.from(viewById);
    }

    private void initRecyclerView() {

        // RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // recyclerView.setHasFixedSize(true);
        // List<String> list = new ArrayList<>();
        // for (int i = 0; i < 20; i++) {
        //     list.add("我是第" + i + "个");
        // }
        // LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        // linearLayoutManager.setSmoothScrollbarEnabled(true);
        // recyclerView.setLayoutManager(linearLayoutManager);
        // ListRecyclerAdapter adapter = new ListRecyclerAdapter(list);
        // recyclerView.setAdapter(adapter);

    }

    private void initLisView() {
        // ListView lv = (ListView) findViewById(R.id.lv);
        //
        //  List<String> data = new ArrayList<>();
        //
        //  for (int i = 0; i < 30; i++) {
        //      data.add("我是listview数据" + i);
        //  }
        //
        //  lv.setAdapter(new ArrayAdapter< >(this,android.R.layout.simple_list_item_1,android.R.id.text1,data));

    }
}
