package com.dhc.flyabbit.my.app;

import android.app.Application;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.dhc.library.base.BaseChildApplication;


/**
 * @author 浩宸
 * @time 2017/3/24 14:42
 * @desc  这里的application只是在作为单独App是debug时使用的,初始化一些东西,但是实际开发是还是放在主工程的app中去初始化
 */
@Route(path = "/my/application2")
public class MyApp extends BaseChildApplication {


    //不要对一个 Activity Context 保持长生命周期的引用。尽量在一切可以使用应用 ApplicationContext 代替 Context 的地方进行替换。
    @Override
    public void onCreateAsLibrary(Application application) {
        super.onCreateAsLibrary(application);
    }



}
