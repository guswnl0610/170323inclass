package com.example.guswn_000.menuactivity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        textView = (TextView) findViewById(R.id.textView);
        registerForContextMenu(textView); // 얘는 메뉴가 있는 뷰라는ㄴ뜻
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if (v == textView)
        {
            getMenuInflater().inflate(R.menu.menu1, menu);
            
        }
        //만약 뷰를 3개 만들고싶다면 이 if문이 3개면 된다
    }
    //여기에는 뷰가 더 있음(어떤뷰가 들어왔을떄 임플레이션을 할건지 따로따로 정리해줘야


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.mnuBlue:
                textView.setBackgroundColor(Color.BLUE);
                break;
        }
        return super.onContextItemSelected(item);
    }
    //    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        getMenuInflater().inflate(R.menu.menu1, menu);//menu붙이기
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == R.id.mnuYellow) {
//
//        } else if (item.getItemId() == R.id.mnuBlue) {
//
//        } else if (item.getItemId() == R.id.fontsize20) {
//            textView.setTextSize(20);
//            item.setChecked(true);
//        } else if (item.getItemId() == R.id.fontsize40) {
//            textView.setTextSize(40);
//            item.setChecked(true);
//            //라디오 버튼이니까 어차피 하나만 되니까 false는 안해도 돼
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
