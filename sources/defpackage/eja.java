package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class eja implements Serializable {
    public final dja a;
    public final int b;

    public eja(dja djaVar, int i) {
        this.a = djaVar;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final dja b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eja)) {
            return false;
        }
        eja ejaVar = (eja) obj;
        return this.a.equals(ejaVar.a) && this.b == ejaVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.b + ':' + this.a.b;
    }
}
