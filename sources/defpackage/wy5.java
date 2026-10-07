package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class wy5 implements zy5 {
    public final Uri a;
    public final boolean b;

    public wy5(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy5)) {
            return false;
        }
        wy5 wy5Var = (wy5) obj;
        return cqk.d(this.a, wy5Var.a) && this.b == wy5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InitialEditing(uri=" + this.a + ", isCancelled=" + this.b + ")";
    }
}
