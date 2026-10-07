package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jjf {
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = 0;
            f = 0;
            return;
        }
        a = 1;
        b = 2;
        c = 32;
        f = -1;
        if (i >= 30) {
            d = 64;
            e = np0.m;
        } else {
            d = 0;
            e = 0;
        }
    }
}
