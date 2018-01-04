package com.mars.android20180104_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

//listview教學
public class MainActivity extends AppCompatActivity {
    ListView lv ;
    String str [];
    //Listview 和 Array 之間 要使用 adapter做連結
    //Array是放所要呈現資料的地方
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.listview);
         str = new String[] { "AAA", "BBB", "CCC", "DDD"};//用陣列的方式來放內容
        //Listview 和 Array 之間 要使用 adapter做連結
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_expandable_list_item_1,
                str);//ArrayAdapter要放三個參數,activity,資料要怎麼呈現的參數(Android內建的),要顯示的內容
        //設定adapter
        lv.setAdapter(adapter);
        //讓listview 上面的item可以執行
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, str[i], Toast.LENGTH_SHORT).show();
            }
        });


    }
}
