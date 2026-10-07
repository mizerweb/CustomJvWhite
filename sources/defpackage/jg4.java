package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class jg4 {
    public final Uri a;
    public final boolean b;

    public jg4(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final Uri a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jg4.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jg4 jg4Var = (jg4) obj;
        return cqk.d(this.a, jg4Var.a) && this.b == jg4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
