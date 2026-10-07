package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class jij {
    public static final iij Companion = new iij();
    public final String a;

    public /* synthetic */ jij(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            shl.b(i, 1, hij.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jij) && cqk.d(this.a, ((jij) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("WebAppGetLaunchContextRequest(requestId=", this.a, ")");
    }
}
