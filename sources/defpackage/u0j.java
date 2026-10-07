package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class u0j {
    public final g1j a;
    public final Handler b;

    public u0j(g1j g1jVar) {
        this.a = g1jVar;
        Looper looperMyLooper = Looper.myLooper();
        this.b = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
    }

    public final boolean equals(Object obj) {
        return this.a == obj;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
