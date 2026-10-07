package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class ii5 {
    public static final ifh c = new ifh(new s35(6));
    public final ThreadLocal a;
    public final Looper b;

    public ii5(ThreadLocal threadLocal) {
        this.a = threadLocal;
        Looper.prepare();
        this.b = Looper.myLooper();
    }
}
