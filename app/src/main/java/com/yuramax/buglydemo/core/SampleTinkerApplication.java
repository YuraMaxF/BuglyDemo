package com.yuramax.buglydemo.core;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * 作者：weijun
 * 日期：2019/4/15
 * 作用：
 */

public class SampleTinkerApplication extends TinkerApplication {
    public SampleTinkerApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL,
                "com.yuramax.buglydemo.core.SimpleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader",
                false);
    }
}