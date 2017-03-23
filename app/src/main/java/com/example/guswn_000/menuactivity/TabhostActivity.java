package com.example.guswn_000.menuactivity;

import android.app.ActivityGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

public class TabhostActivity extends ActivityGroup
{
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabhost); // 인플레이션해주는함수

        tabHost = (TabHost)findViewById(R.id.tabhost1);
        tabHost.setup(getLocalActivityManager());

        TabHost.TabSpec tab1 = tabHost.newTabSpec("A").setContent(R.id.tab1)
                .setIndicator("날짜선택"); // newtabspec은 나만알아보는 이름ㅇ 붙이는것 setcontent는 어떤탭에 연결할지 결정

        tabHost.addTab(tab1); // 탭1개 완성


        TabHost.TabSpec tab2 = tabHost.newTabSpec("B").setContent(R.id.tab2).setIndicator("시간선택");
        // newtabspec은 나만알아보는 이름ㅇ 붙이는것 setcontent는 어떤탭에 연결할지 결정

        tabHost.addTab(tab2); // 탭1개 완성

        //tabHost.addTab(tabHost.newTabSpec("B").setContent(R.id.tab2)
        //        .setIndicator("시간선택");); 이렇게해도된다 근데복잡하니 위에있는거쓰자

        TabHost.TabSpec tab3 = tabHost.newTabSpec("C").setContent(new TabHost.TabContentFactory() {
            @Override
            public View createTabContent(String tag) {
                View view = View.inflate(TabhostActivity.this,R.layout.tab3, null);

                Button btn = (Button)view.findViewById(R.id.button); // view를 붙여야 view에서 button을 찾는다.


                return view;
            }
        }).setIndicator("맹맹ㅁ");
        tabHost.addTab(tab3);



    }



}
