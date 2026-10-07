package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class bo7 {
    public final String a;
    public final String b;

    public bo7(String str, String str2) {
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        this.a = str;
        this.b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public final void a(String str, String str2) {
        if (Log.isLoggable(this.a, 3)) {
            Log.d(str, f(str2));
        }
    }

    public final void b(String str, String str2) {
        if (Log.isLoggable(this.a, 6)) {
            Log.e(str, f(str2));
        }
    }

    public final void c(String str, String str2, Exception exc) {
        if (Log.isLoggable(this.a, 6)) {
            Log.e(str, f(str2), exc);
        }
    }

    public final void d(String str, String str2) {
        if (Log.isLoggable(this.a, 4)) {
            Log.i(str, f(str2));
        }
    }

    public final void e(String str, String str2) {
        if (Log.isLoggable(this.a, 5)) {
            Log.w(str, f(str2));
        }
    }

    public final String f(String str) {
        String str2 = this.b;
        return str2 == null ? str : str2.concat(str);
    }
}
