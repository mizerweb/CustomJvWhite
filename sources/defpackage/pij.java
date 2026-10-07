package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class pij {
    public static final oij Companion = new oij();
    public final String a;

    public /* synthetic */ pij(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            shl.b(i, 1, nij.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pij) && cqk.d(this.a, ((pij) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("WebAppGetViewPortSizeRequest(requestId=", this.a, ")");
    }
}
