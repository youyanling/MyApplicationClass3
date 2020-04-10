package cn.edu.sdwu.android.classroom.sn170507180117;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class Ch7Activity3 extends AppCompatActivity {
private ArrayList list;
    private SimpleAdapter simpleAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch7_3);

        //准备数据
        list=new ArrayList();
        HashMap hashMap=new HashMap();
        hashMap.put("name","goodsl");
        hashMap.put("price","50");
        hashMap.put("img",R.drawable.img);
        list.add(hashMap);
         hashMap=new HashMap();
        hashMap.put("name","goods2");
        hashMap.put("price","60");
        hashMap.put("img",R.drawable.img);
         hashMap=new HashMap();
        list.add(hashMap);
        hashMap.put("name","goods3");
        hashMap.put("price","55");
        hashMap.put("img",R.drawable.img);
        list.add(hashMap);
        //实例化适配器
        simpleAdapter=new SimpleAdapter(this,list,R.layout.layout_goods,new String[]{"name","price","img"},new int[]{R.id.goods_name,R.id.goods_price,R.id.goods_img});
    //设置到listView
        ListView listView= (ListView) findViewById(R.id.ch7_3_lv);
        listView.setAdapter(simpleAdapter);
       //simpleAdapter.notifyDataSetChanged();
    }
}
