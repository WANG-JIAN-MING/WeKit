package dev.ujhhgtg.wekit.constants

import dev.ujhhgtg.wekit.BuildConfig

object PackageNames {

    const val WECHAT = "com.tencent.mm"
    const val MODULE = BuildConfig.APPLICATION_ID

    // The applicationId was changed independently from the Kotlin namespace. Activities
    // embedded in WeChat still use this source namespace in their binary class names.
    private const val MODULE_SOURCE_NAMESPACE = "dev.ujhhgtg.wekit"

    fun isModuleClassName(className: String?): Boolean {
        if (className == null) return false
        return className.startsWith("$MODULE_SOURCE_NAMESPACE.") ||
            className.startsWith("$MODULE.")
    }

    @Suppress("NOTHING_TO_INLINE")
    @JvmStatic
    inline fun isWeChat(packageName: String) = packageName.startsWith(WECHAT)
}
