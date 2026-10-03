package dev.ujhhgtg.wekit.constants

import dev.ujhhgtg.wekit.BuildConfig

object PackageNames {

    const val WECHAT = "com.tencent.mm"
    const val MODULE = BuildConfig.APPLICATION_ID
    const val MODULE_CLASS_PREFIX = "dev.ujhhgtg.wekit."

    @Suppress("NOTHING_TO_INLINE")
    @JvmStatic
    inline fun isWeChat(packageName: String) = packageName.startsWith(WECHAT)
}
