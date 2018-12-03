package com.bjx.com.commen.mvp;

/**
 * Created by 994856229 on 2018/11/28.
 */

public class Model implements IModel {
    @Override
    public void getData(ICallback callback) {
                callback.onResult("hello world");
    }
}
