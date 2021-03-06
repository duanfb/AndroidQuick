package com.androidwind.androidquick.demo.features.architecture.segment.type2.module3;

import com.androidwind.androidquick.demo.features.architecture.segment.type2.mvp.BaseContract;

public interface Module3Contract {

    interface View extends BaseContract.BaseView {
        void toastSomething();
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void tryToPrintSomething();
    }
}
