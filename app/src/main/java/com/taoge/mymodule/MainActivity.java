package com.taoge.mymodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_find)
    TextView tvFind;
    @BindView(R.id.tv_chat)
    TextView tvChat;
    @BindView(R.id.tv_mine)
    TextView tvMine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @OnClick({R.id.tv_find,R.id.tv_chat,R.id.tv_mine})
    void click(View view){
        switch (view.getId()){
            case R.id.tv_find:
                skip("find/FindActivity");
                break;

            case R.id.tv_chat:
                skip("chat/ChatActivity");
                break;

            case R.id.tv_mine:
                skip("mine/MineActivity");
                break;
        }
    }


    private void skip(String path){
        ARouter.getInstance().build(path).navigation();
    }
}
