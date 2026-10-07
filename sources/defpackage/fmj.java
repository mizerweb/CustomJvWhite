package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class fmj {
    public static final emj Companion = new emj();
    public final String a;

    public /* synthetic */ fmj(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            shl.b(i, 1, dmj.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmj) && cqk.d(this.a, ((fmj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("WebAppOpenMaxLinkRequest(url=", this.a, ")");
    }
}
