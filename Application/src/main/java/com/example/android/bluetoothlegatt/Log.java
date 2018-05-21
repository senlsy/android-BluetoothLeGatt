package com.example.android.bluetoothlegatt;

/**
 * 类描述：
 * 创建人：mark.lin
 * 创建时间：2018/5/9 14:09
 * 修改备注：
 */

public class Log {
    public static boolean isDebug = BuildConfig.DEBUG;

    public static final void v(String tag, String fromat, Object... value) {
        if (!isDebug) return;
        if (value != null && value.length > 0) {
            fromat = String.format(fromat, value);
        }
        android.util.Log.v(tag, fromat);
    }

    public static final void d(String tag, String fromat, Object... value) {
        if (!isDebug) return;
        if (value != null && value.length > 0) {
            fromat = String.format(fromat, value);
        }
        android.util.Log.d(tag, fromat);
    }

    public static final void i(String tag, String fromat, Object... value) {
        if (!isDebug) return;
        if (value != null && value.length > 0) {
            fromat = String.format(fromat, value);
        }
        android.util.Log.i(tag, fromat);
    }

    public static final void w(String tag, String fromat, Object... value) {
        if (!isDebug) return;
        if (value != null && value.length > 0) {
            fromat = String.format(fromat, value);
        }
        android.util.Log.w(tag, fromat);
    }

    public static final void e(String tag, String fromat, Object... value) {
        if (!isDebug) return;
        if (value != null && value.length > 0) {
            fromat = String.format(fromat, value);
        }
        android.util.Log.e(tag, fromat);
    }
}
