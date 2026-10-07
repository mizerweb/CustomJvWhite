package defpackage;

import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tvj implements x76 {
    public static final ct8 a = new ct8(2);
    public static int b = 3;

    public static void a(String str, String str2) {
        if (f(3, str)) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (f(3, str)) {
            Log.d(str, str2, th);
        }
    }

    public static void c(String str, String str2) {
        if (f(6, str)) {
            Log.e(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (f(6, str)) {
            Log.e(str, str2, th);
        }
    }

    public static void e(String str, String str2) {
        if (f(4, str)) {
            Log.i(str, str2);
        }
    }

    public static boolean f(int i, String str) {
        return b <= i || Log.isLoggable(str, i);
    }

    public static void g(String str, String str2) {
        if (f(5, str)) {
            Log.w(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (f(5, str)) {
            Log.w(str, str2, th);
        }
    }

    public static Object j(o7j... o7jVarArr) {
        int length = o7jVarArr.length;
        Class[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        if (o7jVarArr.length <= 0) {
            return Process.class.getDeclaredMethod("isIsolated", clsArr).invoke(null, objArr);
        }
        o7j o7jVar = o7jVarArr[0];
        throw null;
    }
}
