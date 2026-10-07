package defpackage;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class cj0 {
    public final int a;
    public final Surface b;

    public cj0(int i, Surface surface) {
        this.a = i;
        if (surface != null) {
            this.b = surface;
        } else {
            ore.n("Null surface");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cj0)) {
            return false;
        }
        cj0 cj0Var = (cj0) obj;
        return this.a == cj0Var.a && this.b.equals(cj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.a + ", surface=" + this.b + "}";
    }
}
