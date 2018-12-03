package com.bjx.com.commen.mvp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.TextView;

import com.bjx.com.commen.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by 994856229 on 2018/11/28.
 */
@EActivity(R.layout.view_mvp)
public class View extends Activity implements IView {
    @ViewById(R.id.text_mvp)
    TextView text_mvp;
    @ViewById(R.id.btn_mvp)
    Button btn_mvp;

    private IPresenter presenter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @AfterViews
    void init(){
        presenter=new Presenter(this); //2 Presenter初始化
        presenter.onCreate();
    }
    @Click(R.id.btn_mvp)
    void click_btn(){
        presenter.performOnClick();
    }

    @Override
    public void setData(final String data) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                text_mvp.setText(data);
            }
        });

    }
}
