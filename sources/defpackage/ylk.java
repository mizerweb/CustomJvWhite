package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ylk {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
