package com.bjx.com.commen.mvp;

/**
 * Created by 994856229 on 2018/11/28.
 */

public class Presenter implements IPresenter {
    private IView view;
    private IModel model;
    @Override
    public void onCreate() {

    }

    @Override
    public void performOnClick() {
        model.getData(new IModel.ICallback(){
            public void onResult(String data){
                String dataFromPresenter=data+" from presenter"; //8 加工数据
                view.setData(dataFromPresenter);
            }
        });
    }

    public Presenter(IView view){
        this.view=view;
        model=new Model();
    }
}
