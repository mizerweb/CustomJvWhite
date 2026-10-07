package defpackage;

import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class pje {
    public final Object a;
    public final Surface b;

    public pje(Object obj, Surface surface) {
        this.a = obj;
        this.b = surface;
    }

    public final Object a() {
        return this.a;
    }

    public final Surface b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        pje pjeVar = obj instanceof pje ? (pje) obj : null;
        if (pjeVar == null) {
            return false;
        }
        return cqk.d(this.a, pjeVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
