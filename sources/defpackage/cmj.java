package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class cmj {
    public static final bmj Companion = new bmj();
    public final String a;

    public /* synthetic */ cmj(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            shl.b(i, 1, amj.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmj) && cqk.d(this.a, ((cmj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("WebAppOpenLinkRequest(url=", this.a, ")");
    }
}
