package com.bjx.com.commen.mvp;

/**IModel接口
 * Created by 994856229 on 2018/11/28.
 */

public interface IModel {
    void getData(ICallback callback);
    public interface ICallback{
        public void onResult(String data);
    }
}
