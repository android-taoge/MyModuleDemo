package com.taoge.mymodule.app;

import com.alibaba.android.arouter.launcher.ARouter;
import com.taoge.commonlib.base.BaseApplication;

/**
 * created by：TangTao on 2019/2/14 16:03
 * <p>
 * email：xxx@163.com
 */
public class App extends BaseApplication {

    private boolean debug=true;

    @Override
    public void onCreate() {
        super.onCreate();
        initArouter();
    }


    private void initArouter(){
        if(isDebug()){
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }

    public boolean isDebug(){
        return debug;
    }

}
