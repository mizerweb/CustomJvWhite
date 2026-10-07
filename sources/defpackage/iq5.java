package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class iq5 implements jq5 {
    public final Uri a;
    public final dq5 b;

    public iq5(Uri uri, dq5 dq5Var) {
        this.a = uri;
        this.b = dq5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq5)) {
            return false;
        }
        iq5 iq5Var = (iq5) obj;
        return cqk.d(this.a, iq5Var.a) && this.b == iq5Var.b;
    }

    public final int hashCode() {
        Uri uri = this.a;
        return this.b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
    }

    public final String toString() {
        return "DownloadMediaCompleted(uri=" + this.a + ", cause=" + this.b + ")";
    }
}
